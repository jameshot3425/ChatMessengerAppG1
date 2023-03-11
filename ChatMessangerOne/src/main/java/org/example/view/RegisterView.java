/*
 * Created by JFormDesigner on Tue Mar 07 16:46:32 IRST 2023
 */

package org.example.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


/**
 * @author UserNet
 */
public class RegisterView extends JFrame {
    public RegisterView() {
        initComponents();
        add(Register);
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - shihab
        Register = new JPanel();
        label2 = new JLabel();
        inputUserNameRegister = new JTextField();
        label3 = new JLabel();
        inputPasswordRegister = new JTextField();
        hSpacer1 = new JPanel(null);
        label4 = new JLabel();
        inputConfirmPassword = new JTextField();
        label5 = new JLabel();
        registerButton = new JButton();
        linkToLogin = new JLabel();
        vSpacer1 = new JPanel(null);

        //======== Register ========
        {
            Register.setBackground(Color.white);
            Register.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
            0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
            . BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
            red) ,Register. getBorder( )) ); Register. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
            beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            Register.setLayout(null);

            //---- label2 ----
            label2.setText("UserName :");
            label2.setForeground(new Color(0x333333));
            label2.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            Register.add(label2);
            label2.setBounds(240, 95, 100, 30);

            //---- inputUserNameRegister ----
            inputUserNameRegister.setBorder(null);
            inputUserNameRegister.setBackground(new Color(0xe5e5ef));
            inputUserNameRegister.setForeground(Color.black);
            inputUserNameRegister.setToolTipText("Input_User_Name");
            inputUserNameRegister.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            Register.add(inputUserNameRegister);
            inputUserNameRegister.setBounds(240, 130, 240, 40);

            //---- label3 ----
            label3.setText("Password :");
            label3.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            label3.setForeground(new Color(0x333333));
            Register.add(label3);
            label3.setBounds(245, 180, 95, label3.getPreferredSize().height);

            //---- inputPasswordRegister ----
            inputPasswordRegister.setBackground(new Color(0xe5e5ef));
            inputPasswordRegister.setBorder(null);
            inputPasswordRegister.setForeground(Color.black);
            inputPasswordRegister.setToolTipText("Input_Password");
            Register.add(inputPasswordRegister);
            inputPasswordRegister.setBounds(245, 210, 240, 40);
            Register.add(hSpacer1);
            hSpacer1.setBounds(new Rectangle(new Point(690, 200), hSpacer1.getPreferredSize()));

            //---- label4 ----
            label4.setText("Confirm :");
            label4.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            label4.setForeground(new Color(0x333333));
            Register.add(label4);
            label4.setBounds(250, 260, 95, 24);

            //---- inputConfirmPassword ----
            inputConfirmPassword.setBackground(new Color(0xe5e5ef));
            inputConfirmPassword.setBorder(null);
            inputConfirmPassword.setForeground(Color.black);
            inputConfirmPassword.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            inputConfirmPassword.setToolTipText("Input_Confirm_Password");
            Register.add(inputConfirmPassword);
            inputConfirmPassword.setBounds(245, 285, 240, 40);

            //---- label5 ----
            label5.setText("Create_Account");
            label5.setFont(new Font("Segoe UI", Font.ITALIC, 19));
            label5.setForeground(new Color(0x333333));
            Register.add(label5);
            label5.setBounds(280, 25, 145, 40);

            //---- registerButton ----
            registerButton.setText("Register");
            registerButton.setBackground(new Color(0x7a7ae8));
            registerButton.setForeground(Color.white);
            registerButton.setBorder(null);
            registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            registerButton.setFont(new Font("Verdana", Font.ITALIC, 14));
            Register.add(registerButton);
            registerButton.setBounds(320, 360, 101, 36);

            //---- linkToLogin ----
            linkToLogin.setText("I already have a membership");
            linkToLogin.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            linkToLogin.setForeground(new Color(0xff9999));
            linkToLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            Register.add(linkToLogin);
            linkToLogin.setBounds(265, 420, linkToLogin.getPreferredSize().width, 40);

            //---- vSpacer1 ----
            vSpacer1.setBackground(Color.white);
            vSpacer1.setForeground(Color.white);
            Register.add(vSpacer1);
            vSpacer1.setBounds(440, 450, 0, 20);

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
    private JPanel hSpacer1;
    private JLabel label4;
    private JTextField inputConfirmPassword;
    private JLabel label5;
    private JButton registerButton;
    private JLabel linkToLogin;
    private JPanel vSpacer1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
