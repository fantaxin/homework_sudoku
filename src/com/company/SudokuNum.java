package com.company;

public class SudokuNum {
    private int num;
    private char value = '.';//代表为空
    private boolean primary;//是否是可变的

    public SudokuNum() {
    }

    public SudokuNum(int num, char value, boolean primary) {
        this.num = num;
        this.value = value;
        this.primary = primary;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}
