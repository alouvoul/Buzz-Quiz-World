/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz.GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author alouvoul
 */
public class playerSelection extends MainGUI {

    /**
     * Creates new form playerSelection
     */
    public playerSelection() {
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

        nameTextField1 = new javax.swing.JTextField();
        nameTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        onePlayerRadioButton = new javax.swing.JRadioButton();
        twoPlayerRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("How many players?");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        onePlayerRadioButton.setSelected(true);
        onePlayerRadioButton.setText("1 Player");
        onePlayerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePlayerRadioButtonActionPerformed(evt);
            }
        });

        twoPlayerRadioButton.setText("2 Players");
        twoPlayerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayerRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(nameTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OKButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twoPlayerRadioButton)
                    .addComponent(onePlayerRadioButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onePlayerRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoPlayerRadioButton)
                .addGap(25, 25, 25)
                .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OKButton)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        String name1 = nameTextField1.getText();
        String name2 = nameTextField2.getText();
        if(twoPlayerRadioButton.isVisible() && name2.equals(""))
            JOptionPane.showMessageDialog(this,"You have to choose a name!");
        else if(name1.equals("") || name1.equals(name2))
            JOptionPane.showMessageDialog(this,"You have to choose a name!");
        else{
            String names[];
            if(twoPlayerRadioButton.isVisible()){
                names = new String[2];
                names[0] = nameTextField1.getText();
                names[1] = nameTextField2.getText();
            }
            else{
                names = new String[1];
                names[0] = nameTextField1.getText();
            }
            game.setPlayers(names);
             
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    private void onePlayerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePlayerRadioButtonActionPerformed
        nameTextField2.setVisible(false);
        twoPlayerRadioButton.setSelected(false);
    }//GEN-LAST:event_onePlayerRadioButtonActionPerformed

    private void twoPlayerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayerRadioButtonActionPerformed
        nameTextField2.setVisible(true);
        onePlayerRadioButton.setSelected(false);
    }//GEN-LAST:event_twoPlayerRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JTextField nameTextField2;
    private javax.swing.JRadioButton onePlayerRadioButton;
    private javax.swing.JRadioButton twoPlayerRadioButton;
    // End of variables declaration//GEN-END:variables
}
