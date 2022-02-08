/*
 * Created by JFormDesigner on Tue Jun 22 16:45:03 CST 2021
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;

/**
 * @author 1
 */
public class MForm extends JFrame {
    public MForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        num_panel = new JPanel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        textField9 = new JTextField();
        textField10 = new JTextField();
        textField11 = new JTextField();
        textField12 = new JTextField();
        textField13 = new JTextField();
        textField14 = new JTextField();
        textField15 = new JTextField();
        textField16 = new JTextField();
        textField17 = new JTextField();
        textField18 = new JTextField();
        textField19 = new JTextField();
        textField20 = new JTextField();
        textField21 = new JTextField();
        textField22 = new JTextField();
        textField23 = new JTextField();
        textField24 = new JTextField();
        textField25 = new JTextField();
        textField26 = new JTextField();
        textField27 = new JTextField();
        textField28 = new JTextField();
        textField29 = new JTextField();
        textField30 = new JTextField();
        textField31 = new JTextField();
        textField32 = new JTextField();
        textField33 = new JTextField();
        textField34 = new JTextField();
        textField35 = new JTextField();
        textField36 = new JTextField();
        textField37 = new JTextField();
        textField38 = new JTextField();
        textField39 = new JTextField();
        textField40 = new JTextField();
        textField41 = new JTextField();
        textField42 = new JTextField();
        textField43 = new JTextField();
        textField44 = new JTextField();
        textField45 = new JTextField();
        textField46 = new JTextField();
        textField47 = new JTextField();
        textField48 = new JTextField();
        textField49 = new JTextField();
        textField50 = new JTextField();
        textField51 = new JTextField();
        textField52 = new JTextField();
        textField53 = new JTextField();
        textField54 = new JTextField();
        textField55 = new JTextField();
        textField56 = new JTextField();
        textField57 = new JTextField();
        textField58 = new JTextField();
        textField59 = new JTextField();
        textField60 = new JTextField();
        textField61 = new JTextField();
        textField62 = new JTextField();
        textField63 = new JTextField();
        textField64 = new JTextField();
        textField65 = new JTextField();
        textField66 = new JTextField();
        textField67 = new JTextField();
        textField68 = new JTextField();
        textField69 = new JTextField();
        textField70 = new JTextField();
        textField71 = new JTextField();
        textField72 = new JTextField();
        textField73 = new JTextField();
        textField74 = new JTextField();
        textField75 = new JTextField();
        textField76 = new JTextField();
        textField77 = new JTextField();
        textField78 = new JTextField();
        textField79 = new JTextField();
        textField80 = new JTextField();
        textField81 = new JTextField();
        newgame_button = new JButton();
        restart_button = new JButton();
        pause_button = new JButton();
        clear_button = new JButton();
        undo_button = new JButton();
        prompt_button = new JButton();
        time_lable = new JLabel();



        JPanel j=(JPanel)this.getContentPane();
        j.setOpaque(false);
        num_panel.setOpaque(false);

        ImageIcon icon=new ImageIcon("preview.jpg");
        JLabel label=new JLabel(icon);

        label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
        this.getContentPane().add(label); // 将组件添加到面板中


        //======== this ========
        var contentPane = getContentPane();

        //======== num_panel ========
        {
            num_panel.setFont(new Font("\u5b8b\u4f53", Font.PLAIN, 12));
            num_panel.setLayout(new GridLayout(9, 9, 0, 0));
            num_panel.setOpaque(false);

            time_lable.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
            time_lable.setHorizontalAlignment(SwingConstants.CENTER);

            TextInit(textField1);
            TextInit(textField2);
            TextInit(textField3);
            TextInit(textField4);
            TextInit(textField5);
            TextInit(textField6);
            TextInit(textField7);
            TextInit(textField8);
            TextInit(textField9);
            TextInit(textField10);
            TextInit(textField11);
            TextInit(textField12);
            TextInit(textField13);
            TextInit(textField14);
            TextInit(textField15);
            TextInit(textField16);
            TextInit(textField17);
            TextInit(textField18);
            TextInit(textField19);
            TextInit(textField20);
            TextInit(textField21);
            TextInit(textField22);
            TextInit(textField23);
            TextInit(textField24);
            TextInit(textField25);
            TextInit(textField26);
            TextInit(textField27);
            TextInit(textField28);
            TextInit(textField29);
            TextInit(textField30);
            TextInit(textField31);
            TextInit(textField32);
            TextInit(textField33);
            TextInit(textField34);
            TextInit(textField35);
            TextInit(textField36);
            TextInit(textField37);
            TextInit(textField38);
            TextInit(textField39);
            TextInit(textField40);
            TextInit(textField41);
            TextInit(textField42);
            TextInit(textField43);
            TextInit(textField44);
            TextInit(textField45);
            TextInit(textField46);
            TextInit(textField47);
            TextInit(textField48);
            TextInit(textField49);
            TextInit(textField50);
            TextInit(textField51);
            TextInit(textField52);
            TextInit(textField53);
            TextInit(textField54);
            TextInit(textField55);
            TextInit(textField56);
            TextInit(textField57);
            TextInit(textField58);
            TextInit(textField59);
            TextInit(textField60);
            TextInit(textField61);
            TextInit(textField62);
            TextInit(textField63);
            TextInit(textField64);
            TextInit(textField65);
            TextInit(textField66);
            TextInit(textField67);
            TextInit(textField68);
            TextInit(textField69);
            TextInit(textField70);
            TextInit(textField71);
            TextInit(textField72);
            TextInit(textField73);
            TextInit(textField74);
            TextInit(textField75);
            TextInit(textField76);
            TextInit(textField77);
            TextInit(textField78);
            TextInit(textField79);
            TextInit(textField80);
            TextInit(textField81);
        }

        ButtonListener buttonListener = new ButtonListener();
        //---- newgame_button ----
        newgame_button.setText("\u65b0\u6e38\u620f");
        newgame_button.addActionListener(buttonListener);

        //---- restart_button ----
        restart_button.setText("\u91cd\u73a9");
        restart_button.addActionListener(buttonListener);

        //---- pause_button ----
        pause_button.setText("暂停");
        pause_button.addActionListener(buttonListener);

        //---- clear_button ----
        clear_button.setText("\u6e05\u9664");
        clear_button.addActionListener(buttonListener);

        //---- undo_button ----
        undo_button.setText("\u64a4\u9500");
        undo_button.addActionListener(buttonListener);

        //---- prompt_button ----
        prompt_button.setText("\u63d0\u793a");
        prompt_button.addActionListener(buttonListener);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(num_panel, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(newgame_button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pause_button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restart_button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prompt_button, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                        .addComponent(undo_button, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear_button, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                        .addComponent(time_lable, GroupLayout.DEFAULT_SIZE, 69,Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(newgame_button)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pause_button)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(restart_button)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(prompt_button)
                            .addGap(5, 5, 5)
                            .addComponent(undo_button)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clear_button)
                            .addComponent(time_lable))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(num_panel, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private  void TextInit(JTextField tf){
        tf.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 26));
        tf.setHorizontalAlignment(SwingConstants.CENTER);
        tf.setDocument(new TFOnlyNumber());
        tf.addFocusListener(new MForm.MyListener());
        tf.addKeyListener(new KeyboardListener());
        tf.setEditable(false);
        all.add(tf);
        num_panel.add(tf);
    }
    int hh = 0;
    int mm = 0;
    int ss = 0;
    List<SudokuNum> answer;
    char [][] vec = new char[9][];
    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Sudoku sudoku = new Sudoku();
            int num = -1;
            if (e.getSource() == newgame_button) {
                hh = 0;
                mm = 0;
                ss = 0;
                timer.start();
                //导入数独资源
                vec = Sudoku.vec1;
                answer = sudoku.InitTextField(MForm.this, vec);
            }
            else if (e.getSource() == timer) {
                time_lable.setText(hh + ":" + mm + ":" + ss);
                ss++;
                if (ss >= 60) {
                    mm++;
                    ss = 0;
                    if (mm >= 60) {
                        hh++;
                        mm = 0;
                    }
                }
            }
            else if(e.getSource() == pause_button){
                if(pause_button.getText().equals("暂停")) {
                    timer.stop();
                    pause_button.setText("继续");
                }
                else{
                    timer.start();
                    pause_button.setText("暂停");
                }
            }
            else if(e.getSource() == restart_button){
                if(vec==null||vec[0]==null)
                    return;
                hh = 0;
                mm = 0;
                ss = 0;
                timer.start();
                //导入数独资源
                answer = sudoku.InitTextField(MForm.this, vec);
            }
            else if(e.getSource() == prompt_button){
                boolean noError = true;
                boolean isfull = true;
                if(answer==null||answer.isEmpty())
                    return;
                for(int i=all.size()-1;i>=0;i--){
                    if(all.get(i).isEditable()&&!all.get(i).getText().isEmpty()){//如果这个编辑框不是空的并且可以编辑
                        if(all.get(i).getText().equals(answer.get(i).getValue()+""))
                            continue;
                        noError = false;
                        all.get(i).setForeground(Color.red);
                    }
                    if(all.get(i).getText().isEmpty())
                    {isfull = false;num=i;}
                }
                //
                //全满，提示完成
                //未全满，提示最前面一格
                if(noError){
                    if(isfull) {
                        //提示完成游戏
                        return;
                    }
                    if(!Integer.valueOf(num).equals(-1)){
                        all.get(num).setText(answer.get(num).getValue()+"");
                        //创建操作并加入顺序数组
                        Operate operate = new Operate(all.get(num),"",answer.get(num).getValue()+"");
                    }
                }
            }
            else if(e.getSource() == undo_button){
                if(order.size()<=0)
                    return;
                Operate operate = order.removeLast();
                if(operate.isClear()){
                    List<Integer> nums = operate.getNums();
                    List<String> values = operate.getValues();
                    for(int i=0;i<nums.size();i++){
                        all.get(nums.get(i)).setForeground(Color.black);
                        all.get(nums.get(i)).setText(values.get(i));
                    }
                }
                else{
                    operate.getJTextField().setForeground(Color.black);
                    operate.getJTextField().setText(operate.getPre());
                }
            }
            else if(e.getSource() == clear_button){
                List<Integer> nums = new ArrayList<>();
                List<String> values = new ArrayList<>();
                boolean isfull = true;
                for(int i=0;i<all.size();i++){
                    if(all.get(i).isEditable()&&!all.get(i).getText().isEmpty()){
                        nums.add(i);
                        values.add(all.get(i).getText());
                        all.get(i).setText("");
                        isfull = false;
                    }
                }
                if(!isfull) {
                    Operate operate = new Operate(nums,values);
                }
            }


        }
    }

    private class KeyboardListener implements KeyListener{

        String pre;
        @Override
        public void keyTyped(KeyEvent e) {
            pre = ((JTextField)e.getSource()).getText();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            String after = ((JTextField)e.getSource()).getText();
            if(!pre.equals(after)){
                ((JTextField)e.getSource()).setForeground(Color.black);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    private class MyListener implements FocusListener{

        String text1;
        String text2;
        @Override
        public void focusGained(FocusEvent e) {
            text1 = ((JTextField)e.getSource()).getText();
        }

        int i;
        @Override
        //失去焦点
        public void focusLost(FocusEvent e) {
            text2 = ((JTextField)e.getSource()).getText();
            //失去焦点并且更改了内容
            if(!text2.equals(text1)){
                ((JTextField)e.getSource()).setForeground(Color.black);
                //创建操作并加入顺序数组
                Operate operate = new Operate((JTextField)e.getSource() ,text1,text2);
            }
        }
    }
    private static class TFOnlyNumber extends PlainDocument{
        public TFOnlyNumber(){
            super();
        }
        public void insertString(int offset, String str, AttributeSet attr)
                throws javax.swing.text.BadLocationException {
            if (str == null) {
                return;
            }
            //只能输入一位数字
            if(super.getLength()>0){
                return;
            }
            char[] s = str.toCharArray();
            int length = 0;
            // 过滤非数字
            for (int i = 0; i < s.length; i++) {
                if ((s[i] >= '0') && (s[i] <= '9')) {
                    s[length++] = s[i];
                }
                // 插入内容
                super.insertString(offset, new String(s, 0, length), attr);
            }
        }
    }

    public List<JTextField> all = new ArrayList<>();
    public java.util.Deque<Operate> order = new LinkedList<>();

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private static JPanel num_panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField26;
    private JTextField textField27;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JTextField textField31;
    private JTextField textField32;
    private JTextField textField33;
    private JTextField textField34;
    private JTextField textField35;
    private JTextField textField36;
    private JTextField textField37;
    private JTextField textField38;
    private JTextField textField39;
    private JTextField textField40;
    private JTextField textField41;
    private JTextField textField42;
    private JTextField textField43;
    private JTextField textField44;
    private JTextField textField45;
    private JTextField textField46;
    private JTextField textField47;
    private JTextField textField48;
    private JTextField textField49;
    private JTextField textField50;
    private JTextField textField51;
    private JTextField textField52;
    private JTextField textField53;
    private JTextField textField54;
    private JTextField textField55;
    private JTextField textField56;
    private JTextField textField57;
    private JTextField textField58;
    private JTextField textField59;
    private JTextField textField60;
    private JTextField textField61;
    private JTextField textField62;
    private JTextField textField63;
    private JTextField textField64;
    private JTextField textField65;
    private JTextField textField66;
    private JTextField textField67;
    private JTextField textField68;
    private JTextField textField69;
    private JTextField textField70;
    private JTextField textField71;
    private JTextField textField72;
    private JTextField textField73;
    private JTextField textField74;
    private JTextField textField75;
    private JTextField textField76;
    private JTextField textField77;
    private JTextField textField78;
    private JTextField textField79;
    private JTextField textField80;
    private JTextField textField81;
    private JButton newgame_button;
    private JButton restart_button;
    private JButton pause_button;
    private JButton clear_button;
    private JButton undo_button;
    private JButton prompt_button;
    private JLabel time_lable;
    private Timer timer = new Timer(1000,new ButtonListener());
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
