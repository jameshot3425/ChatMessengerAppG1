/*
 * Created by JFormDesigner on Fri Mar 10 10:43:55 IRST 2023
 */

package org.example.view;

import java.awt.*;
import javax.swing.*;

/**
 * @author UserNet
 */
public class RegisterView extends JFrame  {

    public RegisterView() {
        initComponents(null);
        add(Register);
    }
    private void initComponents(JFrame parent) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - shihab
        Register = new JPanel();
        label2 = new JLabel();
        inputUserNameRegister = new JTextField();
        label3 = new JLabel();
        inputPasswordRegister = new JTextField();
        label1 = new JLabel();
        hSpacer1 = new JPanel(null);
        label4 = new JLabel();
        inputConfirmPassword = new JTextField();
        label5 = new JLabel();
        registerButton = new JButton();
        linkToLogin = new JLabel();
        vSpacer1 = new JPanel(null);
        hSpacer2 = new JPanel(null);

        //======== Register ========
        {
            Register.setBackground(Color.white);
            Register.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
            swing.border.EmptyBorder(0,0,0,0), "",javax.swing.border
            .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font(""
            ,java.awt.Font.BOLD,12),java.awt.Color.red),Register. getBorder
            ()));Register. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
            .beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException
            ();}});
            Register.setLayout(null);

            //---- label2 ----
            label2.setText("UserName :");
            label2.setForeground(new Color(0x333333));
            label2.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            Register.add(label2);
            label2.setBounds(375, 90, 100, 30);

            //---- inputUserNameRegister ----
            inputUserNameRegister.setBorder(null);
            inputUserNameRegister.setForeground(Color.black);
            inputUserNameRegister.setToolTipText("Input_User_Name");
            inputUserNameRegister.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            inputUserNameRegister.setBackground(new Color(0xe5e5ef));
            Register.add(inputUserNameRegister);
            inputUserNameRegister.setBounds(375, 125, 240, 40);

            //---- label3 ----
            label3.setText("Password :");
            label3.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            label3.setForeground(new Color(0x333333));
            Register.add(label3);
            label3.setBounds(375, 175, 95, label3.getPreferredSize().height);

            //---- inputPasswordRegister ----
            inputPasswordRegister.setBorder(null);
            inputPasswordRegister.setForeground(Color.black);
            inputPasswordRegister.setToolTipText("Input_Password");
            inputPasswordRegister.setBackground(new Color(0xe5e5ef));
            Register.add(inputPasswordRegister);
            inputPasswordRegister.setBounds(375, 205, 240, 40);

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/org/example/view/images/240_F_339709048_ZITR4wrVsOXCKdjHncdtabSNWpIhiaR7.jpg")));
            Register.add(label1);
            label1.setBounds(5, -35, label1.getPreferredSize().width, 480);
            Register.add(hSpacer1);
            hSpacer1.setBounds(new Rectangle(new Point(690, 200), hSpacer1.getPreferredSize()));

            //---- label4 ----
            label4.setText("Confirm :");
            label4.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            label4.setForeground(new Color(0x333333));
            Register.add(label4);
            label4.setBounds(375, 255, 95, 24);

            //---- inputConfirmPassword ----
            inputConfirmPassword.setBackground(new Color(0xe5e5ef));
            inputConfirmPassword.setBorder(null);
            inputConfirmPassword.setForeground(Color.black);
            inputConfirmPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            inputConfirmPassword.setToolTipText("Input_Confirm_Password");
            Register.add(inputConfirmPassword);
            inputConfirmPassword.setBounds(375, 285, 240, 40);

            //---- label5 ----
            label5.setText("Create_Account");
            label5.setFont(new Font("Segoe UI", Font.ITALIC, 19));
            label5.setForeground(new Color(0x333333));
            Register.add(label5);
            label5.setBounds(435, 15, 145, 40);

            //---- registerButton ----
            registerButton.setText("Register");
            registerButton.setBackground(new Color(0x7a7ae8));
            registerButton.setForeground(Color.white);
            registerButton.setBorder(null);
            registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            registerButton.setFont(new Font("Verdana", Font.ITALIC, 14));
            Register.add(registerButton);
            registerButton.setBounds(445, 350, 101, 36);

            //---- linkToLogin ----
            linkToLogin.setText("I already have a membership");
            linkToLogin.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            linkToLogin.setForeground(new Color(0xff9999));
            linkToLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            Register.add(linkToLogin);
            linkToLogin.setBounds(390, 405, linkToLogin.getPreferredSize().width, 40);

            //---- vSpacer1 ----
            vSpacer1.setBackground(Color.white);
            vSpacer1.setForeground(Color.white);
            Register.add(vSpacer1);
            vSpacer1.setBounds(440, 450, 0, 20);
            Register.add(hSpacer2);
            hSpacer2.setBounds(375, 65, 275, hSpacer2.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Register.getComponentCount(); i++) {
                    Rectangle bounds = Register.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Register.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Register.setMinimumSize(preferredSize);
                Register.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - shihab
    private JPanel Register;
    private JLabel label2;
    private JTextField inputUserNameRegister;
    private JLabel label3;
    private JTextField inputPasswordRegister;
    private JLabel label1;
    private JPanel hSpacer1;
    private JLabel label4;
    private JTextField inputConfirmPassword;
    private JLabel label5;
    private JButton registerButton;
    private JLabel linkToLogin;
    private JPanel vSpacer1;
    private JPanel hSpacer2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
