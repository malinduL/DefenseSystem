/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defensesystem;

import java.awt.Color;

/**
 *
 * @author User
 */
public class Tank extends javax.swing.JFrame implements Observer{

    private int isSelectedValue=1;
    
    public Tank() {
        initComponents();
        setVisible(true);
        btnSend.setForeground(Color.white);
        btnSend.setBackground(Color.green);
	btnSend.setOpaque(true);
        
        lblAreaClearMassege.setBackground(Color.black);
        lblAreaClearMassege.setOpaque(true);
        
        btnShoot.setEnabled(false);
        btnMissile.setEnabled(false);
        btnRedar.setEnabled(false);
        btnRotate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        massageBox = new javax.swing.JTextArea();
        textBox = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        lblTank = new javax.swing.JLabel();
        lblAreaClearMassege = new javax.swing.JLabel();
        chkPosition = new javax.swing.JCheckBox();
        btnRedar = new javax.swing.JButton();
        btnRotate = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnShoot = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        massageBox.setColumns(20);
        massageBox.setRows(5);
        jScrollPane1.setViewportView(massageBox);

        textBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(51, 255, 51));
        btnSend.setForeground(new java.awt.Color(51, 255, 51));
        btnSend.setText("SEND >");
        btnSend.setFocusable(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblTank.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTank.setForeground(new java.awt.Color(51, 102, 0));
        lblTank.setText("Tank");

        lblAreaClearMassege.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAreaClearMassege.setForeground(new java.awt.Color(255, 51, 51));
        lblAreaClearMassege.setText("Area Not Cleared");

        chkPosition.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        chkPosition.setForeground(new java.awt.Color(0, 0, 204));
        chkPosition.setText("Position");
        chkPosition.setFocusable(false);
        chkPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPositionActionPerformed(evt);
            }
        });

        btnRedar.setBackground(new java.awt.Color(0, 255, 255));
        btnRedar.setText("Redar Oparation");
        btnRedar.setFocusable(false);

        btnRotate.setBackground(new java.awt.Color(0, 255, 255));
        btnRotate.setText("Rotete Shooting");
        btnRotate.setFocusable(false);

        btnMissile.setBackground(new java.awt.Color(0, 255, 255));
        btnMissile.setText("Missile Oparation");
        btnMissile.setFocusable(false);

        btnShoot.setBackground(new java.awt.Color(0, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.setFocusable(false);
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        jSlider1.setBackground(new java.awt.Color(51, 255, 255));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("   Fuel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblAreaClearMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkPosition))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRedar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTank, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRotate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTank)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaClearMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPosition)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRedar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        
        Observerble.getinstace().setMassage(textBox.getText(),lblTank.getText());
        textBox.setText(null);
    }//GEN-LAST:event_btnSendActionPerformed

    private void textBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBoxActionPerformed

    private void chkPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPositionActionPerformed
        if(chkPosition.isSelected()){
            this.isSelectedValue=0;
        }else{
            this.isSelectedValue=1;
        }
    }//GEN-LAST:event_chkPositionActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShootActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        Observerble.getinstace().setJsliderFuelValue(jSlider1.getValue(), lblTank.getText());
    }//GEN-LAST:event_jSlider1StateChanged

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnRedar;
    private javax.swing.JButton btnRotate;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox chkPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblAreaClearMassege;
    private javax.swing.JLabel lblTank;
    private javax.swing.JTextArea massageBox;
    private javax.swing.JTextField textBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(String mg,String name){
        if(name.equals("Defanses Branch")){
            massageBox.append(name+"  :  "+mg+"\n\n");
        }else if(name.equals(lblTank.getText())){
             massageBox.append(">>>"+mg+"\n\n");
        }
        System.out.println("Tank"+mg);
    }

    @Override
    public void updateAreaClear(int value) {
        if(value==0){
            lblAreaClearMassege.setText("Area Clear");
            lblAreaClearMassege.setForeground(Color.green);
            lblAreaClearMassege.setBackground(Color.black);
            lblAreaClearMassege.setOpaque(true);
        }else{
            lblAreaClearMassege.setText("Area Not Clear");
            lblAreaClearMassege.setForeground(Color.red);
            lblAreaClearMassege.setBackground(Color.black);
            lblAreaClearMassege.setOpaque(true);
        }
        System.out.println("Tank > "+value); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateJsliderValue(int value) {
        if(isSelectedValue==1){
            btnShoot.setEnabled(false);
            btnMissile.setEnabled(false);
            btnRedar.setEnabled(false);
            btnRotate.setEnabled(false);
        }else if(value < 20 && isSelectedValue==0){
            btnShoot.setEnabled(false);
        }
        if(value > 20 && isSelectedValue==0){
            btnShoot.setEnabled(true);
        }
        if(value > 30 && isSelectedValue==0){
            btnMissile.setEnabled(true);
        }else{
            btnMissile.setEnabled(false);
        }
        if(value > 40 && isSelectedValue==0){
            btnRedar.setEnabled(true);
        }else{
            btnRedar.setEnabled(false);
        } 
        if(value > 50 && isSelectedValue==0){
            btnRotate.setEnabled(true);
        }else{
            btnRotate.setEnabled(false);
        }
    }

    @Override
    public void updateJsliderFuelValue(int value, String name) {
         //To change body of generated methods, choose Tools | Templates.
    }
}
