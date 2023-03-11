package org.example;

import org.example.view.BlockView;
import org.example.view.LogInView;
import org.example.view.RegisterView;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {

        // Design using swing java ...
//        RegisterViews registerViews = new RegisterViews();
//        registerViews.initializeRegister(null);


        // Design using Extensions JFormDesigner |Login| ...
//        LogInView loginView = new LogInView();
//        loginView.setContentPane(new LogInView().getContentPane());
//        loginView.setPreferredSize(new Dimension(750, 500));
//        loginView.setTitle("Login");
//        loginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        loginView.pack();
//        loginView.setVisible(true);

//         Design using Extensions JFormDesigner |Register| ...
//        RegisterView registerViews = new RegisterView();
//        RegisterView registerView = new RegisterView();
//        registerView.setContentPane(new RegisterView().getContentPane());
//        registerView.setPreferredSize(new Dimension(750, 550));
//        registerView.setTitle("Register");
//        registerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        registerView.pack();
//        registerView.setVisible(true);

        // Design using Extensions JFormDesigner |chatting| ...
        BlockView blockView = new BlockView();
        blockView.setContentPane(new BlockView().getContentPane());
        blockView.setPreferredSize(new Dimension(640, 530));
        blockView.setTitle("ChatApplications");
        blockView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blockView.pack();
        blockView.setVisible(true);


    }
}