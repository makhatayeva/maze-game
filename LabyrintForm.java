package Maze_Game_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Teacher S. Shamiluulu
 * Student S. Makhatayeva
 * Group: 1EN03_C
 */
public class LabyrintForm extends JFrame {

    /**
     * Creates new form LabyrintForm
     */
    public LabyrintForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
        private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new DrawPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jCheckBox1 = new JCheckBox();
        jTextField3 = new JTextField();
        jButton10 = new JButton();
        jPanel4 = new JPanel();
        jButton5 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jPanel5 = new JPanel();
        jButton3 = new JButton();
        jButton2 = new JButton();
        jButton1 = new JButton();
        jButton9 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton12 = new JButton();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jButton11 = new JButton();
        jButton8 = new JButton();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Labyrinth");
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1,BorderLayout.CENTER);

        jPanel2.setLayout(new GridBagLayout());

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.LINE_AXIS));

        jCheckBox1.setText("Limit the range of vision");
        jCheckBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jPanel3.add(jCheckBox1);

        jTextField3.setText("2");
        jTextField3.setEnabled(false);
        jPanel3.add(jTextField3);

        jButton10.setText("Apply");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new BorderLayout());

        jButton5.setText("Down");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, BorderLayout.PAGE_END);

        jButton4.setText("Up");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, BorderLayout.PAGE_START);

        jButton6.setText("Left");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, BorderLayout.LINE_START);

        jButton7.setText("Right");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, BorderLayout.LINE_END);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jPanel4, gridBagConstraints);

        jButton3.setText("Start");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Solution");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("New maze");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setText("Random movement");
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton13.setText("Save maze");
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Load maze");
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton12.setText("Stop the game");
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField1.setText("35");

        jLabel1.setText("No. of boxes:");

        jButton11.setText("Stop random movement");
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton8.setText("Hide solution");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setText("Size of 1 box:");

        jTextField2.setText("20");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jButton11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton14)
                                .addContainerGap())
        );

        jPanel5Layout.linkSize(SwingConstants.VERTICAL, new Component[] {jButton13, jButton14, jButton2, jButton8});

        jPanel2.add(jPanel5, new GridBagConstraints());

        getContentPane().add(jPanel2, BorderLayout.LINE_START);

        pack();
    }

    private void formWindowOpened(WindowEvent evt) {
        // TODO add your handling code here:
        jPanel1.newMaze();
    }

    private void jButton8ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        jPanel1.hidePath();
        jPanel1.requestFocus();
    }

    private void jButton11ActionPerformed(ActionEvent evt) {
        jPanel1.stoptimer();
        jPanel1.requestFocus();
    }

    private void jButton12ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        jCheckBox1.setSelected(false);
        jPanel1.stopgame();
    }

    private void jButton14ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        if (jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            jPanel1.loadFromFile(jf.getSelectedFile());
        }
        jPanel1.requestFocus();
    }

    private void jButton13ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        if (jf.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            jPanel1.saveToFile(jf.getSelectedFile());
        }
        jPanel1.requestFocus();
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
        jPanel1.starttimer();
        jPanel1.requestFocus();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        try {
            int d = Integer.valueOf(jTextField1.getText());
            int scale = Integer.valueOf(jTextField2.getText());
            if ((d > 1) && (scale > 4)) {
                jPanel1.newMaze(d, scale);
                jCheckBox1.setSelected(false);
            }
            else if(d<=1){
                JOptionPane.showMessageDialog(null, "The number of boxes must be greater than 1");
            }
            else if(scale<=4){
                JOptionPane.showMessageDialog(null, "The size of a box must be greater than 4");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    private void jButton2ActionPerformed(ActionEvent evt) {
        jPanel1.enablepath();
        jPanel1.requestFocus();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        jPanel1.startplayer(0, 0);
        jPanel1.requestFocus();
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        jPanel1.moveright();
        jPanel1.requestFocus();
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        jPanel1.moveleft();
        jPanel1.requestFocus();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        jPanel1.moveup();
        jPanel1.requestFocus();
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        jPanel1.movedown();
        jPanel1.requestFocus();
    }

    private void jButton10ActionPerformed(ActionEvent evt) {
        try {
            jPanel1.setViewport(Integer.valueOf(jTextField3.getText()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        jPanel1.requestFocus();
    }

    private void jCheckBox1ItemStateChanged(ItemEvent evt) {
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            jTextField3.setEnabled(true);
            jButton10.setEnabled(true);
            jPanel1.requestFocus();
        } else {
            jTextField3.setEnabled(false);
            jButton10.setEnabled(false);
            jPanel1.setViewport(-1);
            jPanel1.requestFocus();
        }
    }

    public static void main(String args[]) {
       try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LabyrintForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LabyrintForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LabyrintForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LabyrintForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        /**
        * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabyrintForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JCheckBox jCheckBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private DrawPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}