package com.swing.demo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by cchen on 7/14/2017.
 */
public class SwingDemo3 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("PASSWORD");

        //1 . 先做一个Panel,里面用GridLayout 4行4列，组件水平、垂直间距均为3
        JPanel p=new JPanel(new GridLayout(4,4,3,3));


        //2.1 定义1个Box,一个文本框，一个label
        Box box = Box.createHorizontalBox();
        JTextArea t=new JTextArea();
        JLabel label = new JLabel("your password：");
        box.add(label);
        box.add(t);

        ActionListener action = e-> {
            String command = e.getActionCommand();
            if(t.getText()!= null && !"".equals(t.getText())) {
                String txt = t.getText();
                t.setText(txt + command);
            } else {
                t.setText(command); 
            }

            System.out.println(command);
        };

        //3. 定义按钮，放入panel中
        String str[]={"1","2","3","/","4","5","6","*","7","8","9","<","ABC","0"," ","O"};
        JButton btn[];//声明按钮数组
        btn=new JButton[str.length];//创建按钮数组
        for(int i=0;i<str.length;i++){
            btn[i]=new JButton(str[i]);
            btn[i].addActionListener(action);
            p.add(btn[i]);
        }

        //4.布局
        //4.1 把box框放到North位置
        frame.add(box,BorderLayout.NORTH);
        //4.2 把按钮放到Center位置
        frame.add(p,BorderLayout.CENTER);




        //5. frame参数设置
        //frame.setSize(1000,1000);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

    }
}
