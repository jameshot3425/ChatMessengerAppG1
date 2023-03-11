package org.example;

import org.example.view.BlockView;
import org.example.view.LogInView;
import org.example.view.RegisterView;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {

        LogInView loginView = new LogInView();

        loginView.setContentPane(new LogInView().getContentPane());
        loginView.setPreferredSize(new Dimension(750, 450));
        loginView.setTitle("Login");
        loginView.setLocationRelativeTo(loginView);
        loginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginView.pack();
        loginView.setVisible(true);



        RegisterView registerView = new RegisterView();

        registerView.setContentPane(new RegisterView().getContentPane());
        registerView.setPreferredSize(new Dimension(750, 510));
        registerView.setTitle("Register");
        registerView.setLocationRelativeTo(registerView);
        registerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerView.pack();
        registerView.setVisible(true);



        BlockView blockView = new BlockView();

        blockView.setContentPane(new BlockView().getContentPane());
        blockView.setPreferredSize(new Dimension(648, 550));
        blockView.setTitle("ChatApplication");
        blockView.setLocationRelativeTo(blockView);
        blockView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blockView.pack();
        blockView.setVisible(true);




    }
}