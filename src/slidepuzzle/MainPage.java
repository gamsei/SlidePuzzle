/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slidepuzzle;

import javax.swing.JOptionPane;

/**
 *
 * @author ABHICRUISER
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    String name=null;
    int count=0;
    public MainPage() {
        initComponents();
    }
    public MainPage(String ss) {
        initComponents();
        name=ss;
        label_name.setText(name);
        
    }

    public boolean Check() {
        String s1=null,s2=null,s3=null,s4=null,s5=null,s6=null,s7=null,s8=null,s9=null;
        s1=label_1.getText();
        s2=label_2.getText();
        s3=label_3.getText();
        s4=label_4.getText();
        s5=label_5.getText();
        s6=label_6.getText();
        s7=label_7.getText();
        s8=label_8.getText();
        s9=label_9.getText();
        if(s1.equals("1") && s2.equals("2") && s3.equals("3") && s4.equals("4") && s5.equals("5") && s6.equals("6") && s7.equals("7") && s8.equals("8")) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_3 = new javax.swing.JLabel();
        label_1 = new javax.swing.JLabel();
        label_2 = new javax.swing.JLabel();
        label_6 = new javax.swing.JLabel();
        label_4 = new javax.swing.JLabel();
        label_5 = new javax.swing.JLabel();
        label_9 = new javax.swing.JLabel();
        label_7 = new javax.swing.JLabel();
        label_8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        label_count = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));
        setPreferredSize(new java.awt.Dimension(450, 500));
        setSize(new java.awt.Dimension(4000, 3000));
        getContentPane().setLayout(null);

        label_3.setBackground(new java.awt.Color(0, 102, 102));
        label_3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_3.setText("2");
        label_3.setOpaque(true);
        label_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_3MouseClicked(evt);
            }
        });
        getContentPane().add(label_3);
        label_3.setBounds(270, 180, 80, 80);

        label_1.setBackground(new java.awt.Color(0, 102, 102));
        label_1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_1.setText("3");
        label_1.setOpaque(true);
        label_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_1MouseClicked(evt);
            }
        });
        getContentPane().add(label_1);
        label_1.setBounds(90, 180, 80, 80);

        label_2.setBackground(new java.awt.Color(0, 102, 102));
        label_2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_2.setText("5");
        label_2.setOpaque(true);
        label_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_2MouseClicked(evt);
            }
        });
        getContentPane().add(label_2);
        label_2.setBounds(180, 180, 80, 80);

        label_6.setBackground(new java.awt.Color(0, 102, 102));
        label_6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_6.setText("6");
        label_6.setOpaque(true);
        label_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_6MouseClicked(evt);
            }
        });
        getContentPane().add(label_6);
        label_6.setBounds(270, 270, 80, 80);

        label_4.setBackground(new java.awt.Color(0, 102, 102));
        label_4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_4.setOpaque(true);
        label_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_4MouseClicked(evt);
            }
        });
        getContentPane().add(label_4);
        label_4.setBounds(90, 270, 80, 80);

        label_5.setBackground(new java.awt.Color(0, 102, 102));
        label_5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_5.setText("7");
        label_5.setOpaque(true);
        label_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_5MouseClicked(evt);
            }
        });
        getContentPane().add(label_5);
        label_5.setBounds(180, 270, 80, 80);

        label_9.setBackground(new java.awt.Color(0, 102, 102));
        label_9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_9.setText("8");
        label_9.setOpaque(true);
        label_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_9MouseClicked(evt);
            }
        });
        getContentPane().add(label_9);
        label_9.setBounds(270, 360, 80, 80);

        label_7.setBackground(new java.awt.Color(0, 102, 102));
        label_7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_7.setText("4");
        label_7.setOpaque(true);
        label_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_7MouseClicked(evt);
            }
        });
        getContentPane().add(label_7);
        label_7.setBounds(90, 360, 80, 80);

        label_8.setBackground(new java.awt.Color(0, 102, 102));
        label_8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_8.setText("1");
        label_8.setOpaque(true);
        label_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_8MouseClicked(evt);
            }
        });
        getContentPane().add(label_8);
        label_8.setBounds(180, 360, 80, 80);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Slide Puzzle");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 270, 60);

        label_name.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        getContentPane().add(label_name);
        label_name.setBounds(30, 110, 170, 50);

        label_count.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        label_count.setText("0");
        label_count.setToolTipText("");
        getContentPane().add(label_count);
        label_count.setBounds(240, 110, 200, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 153));
        jLabel4.setText("Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 90, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 153));
        jLabel5.setText("No Of Moves:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 90, 80, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean f1=true,f2=true,f3=true,f4=false,f5=true,f6=true,f7=true,f8=true,f9=true;
    private void label_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_3MouseClicked
        // TODO add your handling code here:
        //label_1.setOpaque(true);
        if(!f2) {
            label_2.setText(label_3.getText());
            f3=false;
            f2=true;
            label_2.setVisible(f2);
            label_3.setVisible(f3);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f6) {
            label_6.setText(label_3.getText());
            f3=false;
            f6=true;
            label_6.setVisible(f6);
            label_3.setVisible(f3);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_3MouseClicked

    private void label_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_1MouseClicked
        // TODO add your handling code here:
        if(!f2) {
            label_2.setText(label_1.getText());
            f1=false;
            f2=true;
            label_2.setVisible(f2);
            label_1.setVisible(f1);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f4) {
            label_4.setText(label_1.getText());
            f1=false;
            f4=true;
            label_4.setVisible(f4);
            label_1.setVisible(f1);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_1MouseClicked

    private void label_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_2MouseClicked
        // TODO add your handling code here:
        if(!f1) {
            label_1.setText(label_2.getText());
            f2=false;
            f1=true;
            label_1.setVisible(f1);
            label_2.setVisible(f2);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f3) {
            label_3.setText(label_2.getText());
            f2=false;
            f3=true;
            label_3.setVisible(f3);
            label_2.setVisible(f2);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f5) {
            label_5.setText(label_2.getText());
            f2=false;
            f5=true;
            label_5.setVisible(f5);
            label_2.setVisible(f2);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_2MouseClicked

    private void label_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_6MouseClicked
        // TODO add your handling code here:
        if(!f3) {
            label_3.setText(label_6.getText());
            f6=false;
            f3=true;
            label_3.setVisible(f3);
            label_6.setVisible(f6);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f5) {
            label_5.setText(label_6.getText());
            f6=false;
            f5=true;
            label_5.setVisible(f5);
            label_6.setVisible(f6);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f9) {
            label_9.setText(label_6.getText());
            f6=false;
            f9=true;
            label_9.setVisible(f9);
            label_6.setVisible(f6);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_6MouseClicked

    private void label_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_4MouseClicked
        // TODO add your handling code here:
        if(!f1) {
            label_1.setText(label_4.getText());
            f4=false;
            f1=true;
            label_1.setVisible(f1);
            label_4.setVisible(f4);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f5) {
            label_5.setText(label_4.getText());
            f4=false;
            f5=true;
            label_5.setVisible(f5);
            label_4.setVisible(f4);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f7) {
            label_7.setText(label_4.getText());
            f4=false;
            f7=true;
            label_7.setVisible(f7);
            label_4.setVisible(f4);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_4MouseClicked

    private void label_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_5MouseClicked
        // TODO add your handling code here:
        if(!f2) {
            label_2.setText(label_5.getText());
            f5=false;
            f2=true;
            label_2.setVisible(f2);
            label_5.setVisible(f5);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f4) {
            label_4.setText(label_5.getText());
            f5=false;
            f4=true;
            label_4.setVisible(f4);
            label_5.setVisible(f5);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f6) {
            label_6.setText(label_5.getText());
            f5=false;
            f6=true;
            label_6.setVisible(f6);
            label_5.setVisible(f5);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f8) {
            label_8.setText(label_5.getText());
            f5=false;
            f8=true;
            label_8.setVisible(f8);
            label_5.setVisible(f5);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_label_5MouseClicked

    private void label_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_9MouseClicked
        // TODO add your handling code here:
        if(!f6) {
            label_6.setText(label_9.getText());
            f9=false;
            f6=true;
            label_6.setVisible(f6);
            label_9.setVisible(f9);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f8) {
            label_8.setText(label_9.getText());
            f9=false;
            f8=true;
            label_8.setVisible(f8);
            label_9.setVisible(f9);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_9MouseClicked

    private void label_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_7MouseClicked
        // TODO add your handling code here:
        if(!f4) {
            label_4.setText(label_7.getText());
            f7=false;
            f4=true;
            label_4.setVisible(f4);
            label_7.setVisible(f7);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f8) {
            label_8.setText(label_7.getText());
            f7=false;
            f8=true;
            label_8.setVisible(f8);
            label_7.setVisible(f7);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_7MouseClicked

    private void label_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_8MouseClicked
        // TODO add your handling code here:
        if(!f7) {
            label_7.setText(label_8.getText());
            f8=false;
            f7=true;
            label_7.setVisible(f7);
            label_8.setVisible(f8);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f5) {
            label_5.setText(label_8.getText());
            f8=false;
            f5=true;
            label_5.setVisible(f5);
            label_8.setVisible(f8);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
        if(!f9) {
            label_9.setText(label_8.getText());
            f8=false;
            f9=true;
            label_9.setVisible(f9);
            label_8.setVisible(f8);
            count++;
            label_count.setText(count+"");
            if(Check()) {
                JOptionPane.showMessageDialog(null, "CONGRATS YOU COMPLETED THE PUZZLE IN : "+ count);
                dispose();
                FrontPage fp=new FrontPage();
                fp.setVisible(true);
            }
        }
    }//GEN-LAST:event_label_8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        MainPage mp=new MainPage();
        mp.label_4.setVisible(false);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_1;
    private javax.swing.JLabel label_2;
    private javax.swing.JLabel label_3;
    private javax.swing.JLabel label_4;
    private javax.swing.JLabel label_5;
    private javax.swing.JLabel label_6;
    private javax.swing.JLabel label_7;
    private javax.swing.JLabel label_8;
    private javax.swing.JLabel label_9;
    private javax.swing.JLabel label_count;
    private javax.swing.JLabel label_name;
    // End of variables declaration//GEN-END:variables
}
