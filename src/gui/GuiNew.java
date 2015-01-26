/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import cipher.Cipher;
import cipher.VigenereExtended;
import cipher.VigenereStandard;
import cipher.VigenereVariant;
import helpers.StringHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yafithekid
 */
public class GuiNew extends javax.swing.JApplet {

    /**
     * Initializes the applet GuiNew
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(GuiNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        options = new javax.swing.ButtonGroup();
        source = new javax.swing.ButtonGroup();
        fileType = new javax.swing.ButtonGroup();
        cipherType = new javax.swing.ButtonGroup();
        keyTextField = new javax.swing.JTextField();
        sourceLabel = new javax.swing.JLabel();
        vigenereLabel = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JLabel();
        keyLabel = new javax.swing.JLabel();
        optionLabel = new javax.swing.JLabel();
        cipherLabel = new javax.swing.JLabel();
        filePathLabel = new javax.swing.JLabel();
        sourceTextButton = new javax.swing.JRadioButton();
        sourceFileButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filePathTextPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        plainTextArea = new javax.swing.JTextArea();
        jScrollPane = new javax.swing.JScrollPane();
        cipherTextArea = new javax.swing.JTextArea();
        encryptTextButton = new javax.swing.JButton();
        decryptTextButton = new javax.swing.JButton();
        optionPlainButton = new javax.swing.JRadioButton();
        optionFiveLettersButton = new javax.swing.JRadioButton();
        optionNoSpacesButton = new javax.swing.JRadioButton();
        fileLoadButton = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        encryptSaveButton = new javax.swing.JButton();
        decryptSaveButton = new javax.swing.JButton();
        plainTextPaneLabel1 = new javax.swing.JLabel();
        plainTextPaneLabel = new javax.swing.JLabel();
        fileTypePlainFileButton = new javax.swing.JRadioButton();
        fileTypecipherFileButton = new javax.swing.JRadioButton();
        standardCipherButton = new javax.swing.JRadioButton();
        extendedCipherButton = new javax.swing.JRadioButton();
        variantCipherButton = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(240, 240, 240));
        setPreferredSize(new java.awt.Dimension(1024, 506768));

        sourceLabel.setText("Source");

        vigenereLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vigenereLabel.setText("Vigenere Cipher");

        copyrightLabel.setText("(c) Muhammad Yafi");

        keyLabel.setText("Key");

        optionLabel.setText("Option");

        cipherLabel.setText("Cipher");

        filePathLabel.setText("File Path");

        source.add(sourceTextButton);
        sourceTextButton.setSelected(true);
        sourceTextButton.setText("Text");

        source.add(sourceFileButton);
        sourceFileButton.setText("File");

        jScrollPane1.setViewportView(filePathTextPane);

        plainTextArea.setColumns(20);
        plainTextArea.setRows(5);
        jScrollPane2.setViewportView(plainTextArea);

        cipherTextArea.setColumns(20);
        cipherTextArea.setRows(5);
        jScrollPane.setViewportView(cipherTextArea);

        encryptTextButton.setText("Encrypt");
        encryptTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptTextButtonActionPerformed(evt);
            }
        });

        decryptTextButton.setText("Decrypt");
        decryptTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptTextButtonActionPerformed(evt);
            }
        });

        options.add(optionPlainButton);
        optionPlainButton.setSelected(true);
        optionPlainButton.setText("Plain");

        options.add(optionFiveLettersButton);
        optionFiveLettersButton.setText("5 Letters");
        optionFiveLettersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionFiveLettersButtonActionPerformed(evt);
            }
        });

        options.add(optionNoSpacesButton);
        optionNoSpacesButton.setText("No Spaces");

        fileLoadButton.setText("Load");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sourceFileButton, org.jdesktop.beansbinding.ELProperty.create("${selected}"), fileLoadButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        fileLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileLoadButtonActionPerformed(evt);
            }
        });

        encryptSaveButton.setText("Save");

        decryptSaveButton.setText("Save");

        plainTextPaneLabel1.setText("Cipher Text");

        plainTextPaneLabel.setText("Plain Text");

        fileType.add(fileTypePlainFileButton);
        fileTypePlainFileButton.setSelected(true);
        fileTypePlainFileButton.setText("Plain File");

        fileType.add(fileTypecipherFileButton);
        fileTypecipherFileButton.setText("Cipher File");
        fileTypecipherFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTypecipherFileButtonActionPerformed(evt);
            }
        });

        cipherType.add(standardCipherButton);
        standardCipherButton.setSelected(true);
        standardCipherButton.setText("Standard");

        cipherType.add(extendedCipherButton);
        extendedCipherButton.setText("Extended");

        cipherType.add(variantCipherButton);
        variantCipherButton.setText("Variant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(optionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionNoSpacesButton)
                            .addComponent(optionFiveLettersButton)
                            .addComponent(optionPlainButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(filePathLabel)
                                        .addGap(7, 7, 7)
                                        .addComponent(copyrightLabel))
                                    .addComponent(cipherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(vigenereLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(keyLabel)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sourceLabel)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(sourceTextButton)
                                                .addGap(26, 26, 26)
                                                .addComponent(sourceFileButton))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fileLoadButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fileTypePlainFileButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fileTypecipherFileButton))
                                    .addComponent(extendedCipherButton)
                                    .addComponent(variantCipherButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(standardCipherButton, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plainTextPaneLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(decryptTextButton)
                                    .addGap(38, 38, 38)
                                    .addComponent(decryptSaveButton)
                                    .addGap(110, 110, 110))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(plainTextPaneLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(encryptTextButton)
                                    .addGap(40, 40, 40)
                                    .addComponent(encryptSaveButton)
                                    .addGap(108, 108, 108)))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vigenereLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyrightLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyLabel)
                    .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sourceTextButton)
                            .addComponent(sourceFileButton)
                            .addComponent(sourceLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filePathLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fileLoadButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileTypePlainFileButton)
                    .addComponent(fileTypecipherFileButton))
                .addGap(31, 31, 31)
                .addComponent(standardCipherButton)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cipherLabel)
                    .addComponent(extendedCipherButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(variantCipherButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionPlainButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optionNoSpacesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optionFiveLettersButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(optionLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(plainTextPaneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptTextButton)
                    .addComponent(encryptSaveButton)
                    .addComponent(plainTextPaneLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decryptTextButton)
                    .addComponent(decryptSaveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptTextButtonActionPerformed
        String plainText = plainTextArea.getText();
        String key = keyTextField.getText();
        if (optionNoSpacesButton.isSelected()){
            plainText = StringHelper.clearSpaces(plainText);
        } else if (optionFiveLettersButton.isSelected()){
            plainText = StringHelper.fiveSpaces(plainText);
        }
        Cipher cipher;
        if (standardCipherButton.isSelected()){
            cipher = new VigenereStandard();
        } else if (extendedCipherButton.isSelected()){
            cipher = new VigenereExtended();
        } else {
            cipher = new VigenereVariant();
        }
        cipherTextArea.setText(cipher.encrypt(plainText,key));
    }//GEN-LAST:event_encryptTextButtonActionPerformed

    private void decryptTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptTextButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decryptTextButtonActionPerformed

    private void optionFiveLettersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionFiveLettersButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionFiveLettersButtonActionPerformed

    private void fileLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileLoadButtonActionPerformed
        String filePath = filePathTextPane.getText();
        FileReader fr;
        try {
            fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder text = new StringBuilder();
            try {
                String s = br.readLine();
                while (s != null){
                    text.append(s);
                    s = br.readLine();
                }
                if (fileTypePlainFileButton.isSelected()){
                    plainTextArea.setText(text.toString());
                } else {
                    plainTextArea.setText(text.toString());
                }
            } catch (IOException ex) {
                message.setText(ex.getMessage());
                ex.printStackTrace();
            }
        } catch (FileNotFoundException e){
            message.setText("File "+filePath+" not found");
        }
    }//GEN-LAST:event_fileLoadButtonActionPerformed

    private void fileTypecipherFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTypecipherFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileTypecipherFileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cipherLabel;
    private javax.swing.JTextArea cipherTextArea;
    private javax.swing.ButtonGroup cipherType;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JButton decryptSaveButton;
    private javax.swing.JButton decryptTextButton;
    private javax.swing.JButton encryptSaveButton;
    private javax.swing.JButton encryptTextButton;
    private javax.swing.JRadioButton extendedCipherButton;
    private javax.swing.JButton fileLoadButton;
    private javax.swing.JLabel filePathLabel;
    private javax.swing.JTextPane filePathTextPane;
    private javax.swing.ButtonGroup fileType;
    private javax.swing.JRadioButton fileTypePlainFileButton;
    private javax.swing.JRadioButton fileTypecipherFileButton;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JTextField keyTextField;
    private javax.swing.JLabel message;
    private javax.swing.JRadioButton optionFiveLettersButton;
    private javax.swing.JLabel optionLabel;
    private javax.swing.JRadioButton optionNoSpacesButton;
    private javax.swing.JRadioButton optionPlainButton;
    private javax.swing.ButtonGroup options;
    private javax.swing.JTextArea plainTextArea;
    private javax.swing.JLabel plainTextPaneLabel;
    private javax.swing.JLabel plainTextPaneLabel1;
    private javax.swing.ButtonGroup source;
    private javax.swing.JRadioButton sourceFileButton;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JRadioButton sourceTextButton;
    private javax.swing.JRadioButton standardCipherButton;
    private javax.swing.JRadioButton variantCipherButton;
    private javax.swing.JLabel vigenereLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
