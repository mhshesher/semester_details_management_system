/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page1;

import javax.swing.JOptionPane;

/**
 *
 * @author Team Two Square
 */

public class optionsAfterLogin extends javax.swing.JFrame {

    /**
     * Creates new form optionsAfterLogin
     */
    public optionsAfterLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profleButton = new javax.swing.JButton();
        FMButton = new javax.swing.JButton();
        resltsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        wlcText = new javax.swing.JLabel();
        FMButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profleButton.setBackground(new java.awt.Color(102, 0, 51));
        profleButton.setForeground(new java.awt.Color(204, 204, 255));
        profleButton.setText("Profile");
        profleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profleButtonActionPerformed(evt);
            }
        });

        FMButton.setBackground(new java.awt.Color(102, 0, 51));
        FMButton.setForeground(new java.awt.Color(204, 204, 255));
        FMButton.setText("Faculty Members");
        FMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMButtonActionPerformed(evt);
            }
        });

        resltsButton.setBackground(new java.awt.Color(102, 0, 51));
        resltsButton.setForeground(new java.awt.Color(204, 204, 255));
        resltsButton.setText("Results");
        resltsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resltsButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        wlcText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wlcText.setForeground(new java.awt.Color(204, 204, 255));
        wlcText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wlcText.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wlcText, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wlcText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        FMButton1.setBackground(new java.awt.Color(102, 0, 51));
        FMButton1.setForeground(new java.awt.Color(204, 204, 255));
        FMButton1.setText("Exit");
        FMButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profleButton)
                        .addGap(43, 43, 43)
                        .addComponent(resltsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FMButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(FMButton1)))))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resltsButton)
                    .addComponent(profleButton))
                .addGap(30, 30, 30)
                .addComponent(FMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FMButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profleButtonActionPerformed
        this.dispose();
        profile profle=new profile();
        profle.setVisible(true);
    }//GEN-LAST:event_profleButtonActionPerformed

    private void resltsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resltsButtonActionPerformed
        this.dispose();
        result0 reslt=new result0();
        this.dispose();
        reslt.setVisible(true);
    }//GEN-LAST:event_resltsButtonActionPerformed

    private void FMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMButtonActionPerformed
        faculty f=new faculty();
        this.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_FMButtonActionPerformed

    private void FMButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FMButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(optionsAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(optionsAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(optionsAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(optionsAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new optionsAfterLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FMButton;
    private javax.swing.JButton FMButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profleButton;
    private javax.swing.JButton resltsButton;
    private javax.swing.JLabel wlcText;
    // End of variables declaration//GEN-END:variables
}
