package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
    public static final char[][] vec1 = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'} };

    private List<SudokuNum> list = new ArrayList<>();

    private void InitSudoku(char[][] vec) {
        int num = 0;
        for (char[] a : vec) {
            for (char c : a) {
                SudokuNum e = new SudokuNum();
                e.setNum(num);
                e.setValue(c);
                if (c != '.')
                    e.setPrimary(false);
                else
                    e.setPrimary(true);
                list.add(e);
                num++;
            }
        }
        Solve s = new Solve();
        s.setBoard(list);
        s.solveSudoku();
        String line = "";
        for (int i = 0; i < list.size(); i++) {
            line += list.get(i).getValue();
            if ((i + 1) % 9 == 0 && i != 1) {
                System.out.println(line);
                line = "";
            }
        }
    }

    public List<SudokuNum> InitTextField(MForm m, char[][] vec){
        InitSudoku(vec);
        while(!m.order.isEmpty()){
            m.order.remove();
        }
        for(int i=0;i<list.size();i++){
            if(!list.get(i).isPrimary()) {
                m.all.get(i).setText(list.get(i).getValue()+"");
                m.all.get(i).setEditable(false);
            }
            else {
                m.all.get(i).setText("");
                m.all.get(i).setEditable(true);
            }
        }
        return list;
    }
}
