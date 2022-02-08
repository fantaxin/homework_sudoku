package com.company;


import javax.swing.*;
import java.util.List;

public class Operate {
    private String pre;
    private String after;
    private JTextField tf ;

    private boolean clear;
    private List<Integer> nums;
    private List<String> values;

    public Operate(JTextField tf, String pre, String after){
        this.pre = pre;
        this.after = after;
        this.tf = tf;
        this.clear = false;
        if(Main.mForm.order.size()>50)
            Main.mForm.order.removeFirst();
        Main.mForm.order.addLast(this);
    }

    public Operate(List<Integer> nums, List<String> values) {
        this.clear = true;
        this.nums = nums;
        this.values = values;
        if(Main.mForm.order.size()>50)
            Main.mForm.order.removeFirst();
        Main.mForm.order.addLast(this);
    }


    public String getPre() {
        return pre;
    }

    public String getAfter() {
        return after;
    }

    public JTextField getJTextField() {
        return tf;
    }

    public boolean isClear() {
        return clear;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public List<String> getValues() {
        return values;
    }
}
