/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;
import java.awt.*;
/**
 *
 * @author Kyle
 */
public class TrackerCardGUI extends javax.swing.JFrame {

    /**
     * Creates new form TrackerCardGUI
     */
    public TrackerCardGUI() {
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

        mainPanel = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        addStudentButton = new javax.swing.JButton();
        loadStudentButton = new javax.swing.JButton();
        newStudentPanel = new javax.swing.JPanel();
        newStudentInfoLabel = new javax.swing.JLabel();
        newStudentNameField = new javax.swing.JTextField();
        newStudentIdField = new javax.swing.JTextField();
        newStudentGpaField = new javax.swing.JTextField();
        newStudentEarnedField = new javax.swing.JTextField();
        newStudentNeededField = new javax.swing.JTextField();
        createStudentButton = new javax.swing.JButton();
        loadStudentPanel = new javax.swing.JPanel();
        loadStudentInfoLabel = new javax.swing.JLabel();
        studentCardButton = new javax.swing.JButton();
        courseCardButton = new javax.swing.JButton();
        calculatorCardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Tracker");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        mainPanel.setLayout(new java.awt.CardLayout());

        addStudentButton.setText("Add Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        loadStudentButton.setText("Load Student");
        loadStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(addStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(98, 98, 98))
        );

        mainPanel.add(defaultPanel, "panelOne");

        newStudentInfoLabel.setText("Enter student information");

        newStudentNameField.setText("Name");
        newStudentNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newStudentNameFieldFocusGained(evt);
            }
        });
        newStudentNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentNameFieldActionPerformed(evt);
            }
        });

        newStudentIdField.setText("ID");
        newStudentIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newStudentIdFieldFocusGained(evt);
            }
        });
        newStudentIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentIdFieldActionPerformed(evt);
            }
        });

        newStudentGpaField.setText("GPA");
        newStudentGpaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newStudentGpaFieldFocusGained(evt);
            }
        });

        newStudentEarnedField.setText("Credits Earned");
        newStudentEarnedField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newStudentEarnedFieldFocusGained(evt);
            }
        });

        newStudentNeededField.setText("Credits Needed");
        newStudentNeededField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newStudentNeededFieldFocusGained(evt);
            }
        });

        createStudentButton.setText("Create Student");
        createStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newStudentPanelLayout = new javax.swing.GroupLayout(newStudentPanel);
        newStudentPanel.setLayout(newStudentPanelLayout);
        newStudentPanelLayout.setHorizontalGroup(
            newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStudentPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(newStudentInfoLabel)
                .addGap(91, 91, 91))
            .addGroup(newStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newStudentGpaField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newStudentIdField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newStudentNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newStudentNeededField, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addComponent(newStudentEarnedField))
                    .addComponent(createStudentButton))
                .addGap(83, 83, 83))
        );
        newStudentPanelLayout.setVerticalGroup(
            newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newStudentInfoLabel)
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newStudentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newStudentEarnedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newStudentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newStudentNeededField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newStudentGpaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createStudentButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        mainPanel.add(newStudentPanel, "panelTwo");

        loadStudentInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadStudentInfoLabel.setText("Load Student");

        javax.swing.GroupLayout loadStudentPanelLayout = new javax.swing.GroupLayout(loadStudentPanel);
        loadStudentPanel.setLayout(loadStudentPanelLayout);
        loadStudentPanelLayout.setHorizontalGroup(
            loadStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadStudentPanelLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(loadStudentInfoLabel)
                .addGap(166, 166, 166))
        );
        loadStudentPanelLayout.setVerticalGroup(
            loadStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadStudentInfoLabel)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        mainPanel.add(loadStudentPanel, "panelThree");

        studentCardButton.setText("Student");
        studentCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCardButtonActionPerformed(evt);
            }
        });

        courseCardButton.setText("Courses");

        calculatorCardButton.setText("Calculator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentCardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(courseCardButton)
                .addGap(83, 83, 83)
                .addComponent(calculatorCardButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentCardButton)
                    .addComponent(courseCardButton)
                    .addComponent(calculatorCardButton))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCardButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelOne");
    }//GEN-LAST:event_studentCardButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelTwo");
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void loadStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadStudentButtonActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "panelThree");
    }//GEN-LAST:event_loadStudentButtonActionPerformed

    private void newStudentNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newStudentNameFieldActionPerformed

    private void newStudentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newStudentIdFieldActionPerformed

    private void createStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStudentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createStudentButtonActionPerformed

    private void newStudentNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newStudentNameFieldFocusGained
        newStudentNameField.setText("");
    }//GEN-LAST:event_newStudentNameFieldFocusGained

    private void newStudentIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newStudentIdFieldFocusGained
        newStudentIdField.setText("");
    }//GEN-LAST:event_newStudentIdFieldFocusGained

    private void newStudentGpaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newStudentGpaFieldFocusGained
        newStudentGpaField.setText("");
    }//GEN-LAST:event_newStudentGpaFieldFocusGained

    private void newStudentEarnedFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newStudentEarnedFieldFocusGained
        newStudentEarnedField.setText("");
    }//GEN-LAST:event_newStudentEarnedFieldFocusGained

    private void newStudentNeededFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newStudentNeededFieldFocusGained
        newStudentNeededField.setText("");
    }//GEN-LAST:event_newStudentNeededFieldFocusGained

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TrackerCardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrackerCardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrackerCardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrackerCardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrackerCardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton calculatorCardButton;
    private javax.swing.JButton courseCardButton;
    private javax.swing.JButton createStudentButton;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JButton loadStudentButton;
    private javax.swing.JLabel loadStudentInfoLabel;
    private javax.swing.JPanel loadStudentPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField newStudentEarnedField;
    private javax.swing.JTextField newStudentGpaField;
    private javax.swing.JTextField newStudentIdField;
    private javax.swing.JLabel newStudentInfoLabel;
    private javax.swing.JTextField newStudentNameField;
    private javax.swing.JTextField newStudentNeededField;
    private javax.swing.JPanel newStudentPanel;
    private javax.swing.JButton studentCardButton;
    // End of variables declaration//GEN-END:variables
}
