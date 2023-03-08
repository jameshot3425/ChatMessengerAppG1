/*
 * Created by JFormDesigner on Tue Mar 07 16:45:43 IRST 2023
 */

package org.example.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
import net.miginfocom.swing.*;

/**
 * @author UserNet
 */
public class BlockView {
    public BlockView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - shihab
        ChatApplication = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        inputMessage = new JTextField();
        scrollPane1 = new JScrollPane();
        textFromServer = new JTextArea();
        sendButton = new JButton();
        vSpacer1 = new JPanel(null);
        hSpacer1 = new JPanel(null);
        hSpacer2 = new JPanel(null);

        //======== ChatApplication ========
        {
            ChatApplication.setBackground(Color.white);
            ChatApplication.setForeground(Color.white);
            ChatApplication.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
            new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn"
            , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
            , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 )
            ,java . awt. Color .red ) ,ChatApplication. getBorder () ) ); ChatApplication. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
            ;} } );
            ChatApplication.setLayout(null);

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x5757b1));
                panel2.setLayout(null);

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/org/example/view/images/user(5).png")));
                label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                panel2.add(label1);
                label1.setBounds(30, 15, label1.getPreferredSize().width, 40);

                //---- label2 ----
                label2.setText("User");
                label2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                label2.setForeground(Color.white);
                panel2.add(label2);
                label2.setBounds(new Rectangle(new Point(70, 15), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("Online");
                label3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                label3.setForeground(Color.white);
                panel2.add(label3);
                label3.setBounds(70, 35, 55, 20);

                //---- label4 ----
                label4.setIcon(new ImageIcon(getClass().getResource("/org/example/view/images/more.png")));
                label4.setToolTipText("Settings");
                label4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                panel2.add(label4);
                label4.setBounds(580, 20, 15, 24);

                //---- label5 ----
                label5.setIcon(new ImageIcon(getClass().getResource("/org/example/view/images/check.png")));
                panel2.add(label5);
                label5.setBounds(115, 35, label5.getPreferredSize().width, 20);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            ChatApplication.add(panel2);
            panel2.setBounds(0, -5, 635, 60);

            //---- inputMessage ----
            inputMessage.setBorder(new LineBorder(new Color(0x5252af), 1, true));
            inputMessage.setForeground(new Color(0x333333));
            inputMessage.setBackground(new Color(0xefeff5));
            inputMessage.setToolTipText("inputText");
            ChatApplication.add(inputMessage);
            inputMessage.setBounds(25, 435, 545, 35);

            //======== scrollPane1 ========
            {

                //---- textFromServer ----
                textFromServer.setBorder(null);
                textFromServer.setFocusable(false);
                textFromServer.setMargin(new Insets(0, 0, 0, 0));
                textFromServer.setDisabledTextColor(Color.white);
                textFromServer.setSelectedTextColor(Color.white);
                textFromServer.setSelectionColor(Color.white);
                textFromServer.setForeground(Color.white);
                textFromServer.setBackground(new Color(0xefeff5));
                scrollPane1.setViewportView(textFromServer);
            }
            ChatApplication.add(scrollPane1);
            scrollPane1.setBounds(23, 75, 585, 350);

            //---- sendButton ----
            sendButton.setIcon(new ImageIcon(getClass().getResource("/org/example/view/images/right-arrow-solid-square-button(1).png")));
            sendButton.setBackground(Color.white);
            sendButton.setBorder(null);
            sendButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            sendButton.setToolTipText("Send");
            ChatApplication.add(sendButton);
            sendButton.setBounds(565, 425, 50, 55);
            ChatApplication.add(vSpacer1);
            vSpacer1.setBounds(90, 470, 0, 20);
            ChatApplication.add(hSpacer1);
            hSpacer1.setBounds(new Rectangle(new Point(625, 310), hSpacer1.getPreferredSize()));

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < ChatApplication.getComponentCount(); i++) {
                    Rectangle bounds = ChatApplication.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = ChatApplication.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                ChatApplication.setMinimumSize(preferredSize);
                ChatApplication.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - shihab
    private JPanel ChatApplication;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField inputMessage;
    private JScrollPane scrollPane1;
    private JTextArea textFromServer;
    private JButton sendButton;
    private JPanel vSpacer1;
    private JPanel hSpacer1;
    private JPanel hSpacer2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
