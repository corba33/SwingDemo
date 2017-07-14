package com.swing.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


/**
 * Created by cchen on 7/14/2017.
 */
public class SwingDemo1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("登录");
        JLabel label = new JLabel();
        JLabel labelText = new JLabel("欢迎来到登录界面哈！！！");
        label.setIcon(new ImageIcon("e:\\1.jpg"));
        frame.add(label, BorderLayout.NORTH);
        Box user = Box.createHorizontalBox();
        Box pwd = Box.createHorizontalBox();
        Box btn = Box.createHorizontalBox();
        JLabel userLabel = new JLabel("用户名：");
        JLabel pwdLabel = new JLabel("密 码：");
        JTextField username = new JTextField(17);
        JTextField password = new JTextField(17);
        Font font = new Font("微软雅黑", Font.PLAIN, 20);
        userLabel.setFont(font);
        pwdLabel.setFont(font);
        username.setFont(font);
        username.setToolTipText("请输入您的用户名...");
        username.setMargin(new Insets(5, 5, 5, 5));
        password.setFont(font); password.setToolTipText("请输入您的密码...");
        password.setMargin(new Insets(5, 5, 5, 5));
        user.add(Box.createHorizontalStrut(10));
        user.add(userLabel); user.add(username);
        user.add(Box.createHorizontalStrut(10));
        pwd.add(Box.createHorizontalStrut(10));
        pwd.add(pwdLabel); pwd.add(password);
        pwd.add(Box.createHorizontalStrut(10));
        JButton login = new JButton("登录");
        JButton cancel = new JButton("取消");
        login.setFont(font);
        cancel.setFont(font);
        ActionListener action = e->
        { switch (e.getActionCommand())
        { case "登录":
            if ("admin".equals(username.getText()) && "123456".equals(password.getText()))
            {
                JOptionPane.showMessageDialog(frame, "登陆成功啦！", "恭喜", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(frame, "用户名或密码错误！", "很遗憾", JOptionPane.ERROR_MESSAGE);
            }
            break;
          case "取消":
            int type = JOptionPane.showConfirmDialog(frame, "您确定取消吗？", "确认", JOptionPane.OK_CANCEL_OPTION);
            if (type == 0)
            {
                JOptionPane.showMessageDialog(frame, "很抱歉，即便您确定取消也取消不了哦！", "温馨提示", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(frame, "您居然这么机智，为什么要选取消呢？", "温馨提问", JOptionPane.QUESTION_MESSAGE);
            }
            break;
        }
        };
        login.addActionListener(action);
        cancel.addActionListener(action);
        btn.add(Box.createHorizontalStrut(55));
        btn.add(login);
        btn.add(Box.createHorizontalStrut(10));
        btn.add(cancel);
        Box box = Box.createVerticalBox();
        labelText.setFont(font);
        box.add(labelText);
        box.add(Box.createVerticalStrut(20));
        box.add(user);
        box.add(Box.createVerticalStrut(10));
        box.add(pwd);
        box.add(Box.createVerticalStrut(20));
        box.add(btn);
        box.add(Box.createVerticalStrut(20));
        frame.add(box);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);


    }

}
