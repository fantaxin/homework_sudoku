package com.company;

import java.util.List;

public class Solve {

    public Solve(){};

    private static List<SudokuNum> board;

    public List<SudokuNum> getBoard() {
        return board;
    }

    public void setBoard(List<SudokuNum> board) {
        Solve.board = board;
    }

    public boolean solveSudoku() {
        return backtrack(0, 0);
    }

    private static boolean backtrack(int r, int l) {
        if (l == 9)
            return backtrack(r + 1, 0);
        if (r == 9)
            return true;
        if (!board.get(r*9+l).isPrimary())
            return backtrack(r, l + 1);

        for (char newval = '1'; newval <= '9'; newval++)
        {
            if (!check(r, l, newval))
                continue;
            board.get(r*9+l).setValue(newval);
            if (backtrack(r, l + 1))
                return true;
            board.get(r*9+l).setValue('.');
        }
        return false;
    }
    private static boolean check(int row, int line, char n) {
        for (int i = 0; i < 9; i++)
        {
            if (board.get(row*9+i).getValue() == n)
                return false;
            if (board.get(i*9+line).getValue()  == n)
                return false;
            if (board.get((i / 3 + (row / 3) * 3) * 9 + (i % 3 + (line / 3) * 3)).getValue() == n)
                return false;
        }
        return true;
    }
}
