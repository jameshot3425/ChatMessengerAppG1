/*
 * Created by JFormDesigner on Tue Mar 07 16:46:15 IRST 2023
 */

package org.example.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import net.miginfocom.swing.*;

/**
 * @author UserNet
 */
public class LogInView extends JFrame {
    public LogInView() {
        initComponents();
        add(Login);

    }



    private void initComponents() {


        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - shihab
        Login = new JPanel();
        label2 = new JLabel();
        inputUserNameLogin = new JTextField();
        label3 = new JLabel();
        inputPasswordLogin = new JTextField();
        hSpacer1 = new JPanel(null);
        label5 = new JLabel();
        loginButton = new JButton();
        linkToRegister = new JLabel();
        vSpacer1 = new JPanel(null);
        vSpacer2 = new JPanel(null);

        //======== Login ========
        {
            Login.setBackground(Color.white);
            Login.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,Login. getBorder( )) ); Login. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            Login.setLayout(null);

            //---- label2 ----
            label2.setText("UserName :");
            label2.setForeground(new Color(0x333333));
            label2.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            Login.add(label2);
            label2.setBounds(240, 95, 100, 30);

            //---- inputUserNameLogin ----
            inputUserNameLogin.setBorder(null);
            inputUserNameLogin.setBackground(new Color(0xe5e5ef));
            inputUserNameLogin.setForeground(Color.black);
            inputUserNameLogin.setToolTipText("Input_User_Name");
            inputUserNameLogin.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            Login.add(inputUserNameLogin);
            inputUserNameLogin.setBounds(240, 130, 240, 40);

            //---- label3 ----
            label3.setText("Password :");
            label3.setFont(new Font("Segoe UI", Font.ITALIC, 17));
            label3.setForeground(new Color(0x333333));
            Login.add(label3);
            label3.setBounds(245, 180, 95, label3.getPreferredSize().height);

            //---- inputPasswordLogin ----
            inputPasswordLogin.setBackground(new Color(0xe5e5ef));
            inputPasswordLogin.setBorder(null);
            inputPasswordLogin.setForeground(Color.black);
            inputPasswordLogin.setToolTipText("Input_Password");
            Login.add(inputPasswordLogin);
            inputPasswordLogin.setBounds(240, 210, 240, 40);
            Login.add(hSpacer1);
            hSpacer1.setBounds(new Rectangle(new Point(690, 200), hSpacer1.getPreferredSize()));

            //---- label5 ----
            label5.setText("Sing_in");
            label5.setFont(new Font("Segoe UI", Font.ITALIC, 22));
            label5.setForeground(new Color(0x333333));
            Login.add(label5);
            label5.setBounds(315, 25, 95, 40);

            //---- loginButton ----
            loginButton.setText("Login");
            loginButton.setBackground(new Color(0x7a7ae8));
            loginButton.setForeground(Color.white);
            loginButton.setBorder(null);
            loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            loginButton.setFont(new Font("Verdana", Font.ITALIC, 14));
            Login.add(loginButton);
            loginButton.setBounds(315, 290, 101, 36);

            //---- linkToRegister ----
            linkToRegister.setText("I already have a membership");
            linkToRegister.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            linkToRegister.setForeground(new Color(0xff9999));
            linkToRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            Login.add(linkToRegister);
            linkToRegister.setBounds(260, 355, linkToRegister.getPreferredSize().width, 40);

            //---- vSpacer1 ----
            vSpacer1.setBackground(Color.white);
            vSpacer1.setForeground(Color.white);
            Login.add(vSpacer1);
            vSpacer1.setBounds(440, 450, 0, 20);
            Login.add(vSpacer2);
            vSpacer2.setBounds(new Rectangle(new Point(360, 460), vSpacer2.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Login.getComponentCount(); i++) {
                    Rectangle bounds = Login.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Login.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Login.setMinimumSize(preferredSize);
                Login.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - shihab
    private JPanel Login;
    private JLabel label2;
    private JTextField inputUserNameLogin;
    private JLabel label3;
    private JTextField inputPasswordLogin;
    private JPanel hSpacer1;
    private JLabel label5;
    private JButton loginButton;
    private JLabel linkToRegister;
    private JPanel vSpacer1;
    private JPanel vSpacer2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
