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
public class Helicopter extends javax.swing.JFrame implements Observer{
    
    
    private int isSelectedValue=1;
    
    public Helicopter() {
        initComponents();
        setVisible(true);
        btnSend.setForeground(Color.white);
        btnSend.setBackground(Color.green);
	btnSend.setOpaque(true);
        
        lblAreaClearMassege.setBackground(Color.black);
        lblAreaClearMassege.setOpaque(true);
        btnshoot.setEnabled(false);
        btnlaser.setEnabled(false);
        btnmisslie.setEnabled(false);
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
        lblName = new javax.swing.JLabel();
        lblAreaClearMassege = new javax.swing.JLabel();
        chkPosition = new javax.swing.JCheckBox();
        btnlaser = new javax.swing.JButton();
        btnmisslie = new javax.swing.JButton();
        btnshoot = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        massageBox.setBackground(new java.awt.Color(204, 204, 255));
        massageBox.setColumns(20);
        massageBox.setRows(5);
        jScrollPane1.setViewportView(massageBox);

        textBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(0, 255, 0));
        btnSend.setForeground(new java.awt.Color(255, 0, 51));
        btnSend.setText("SEND >");
        btnSend.setFocusable(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(51, 102, 0));
        lblName.setText("Helicopter");

        lblAreaClearMassege.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAreaClearMassege.setForeground(new java.awt.Color(255, 51, 51));
        lblAreaClearMassege.setText("Area Not Cleared");

        chkPosition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkPosition.setForeground(new java.awt.Color(0, 0, 255));
        chkPosition.setText("Position");
        chkPosition.setFocusable(false);
        chkPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPositionActionPerformed(evt);
            }
        });

        btnlaser.setBackground(new java.awt.Color(102, 255, 255));
        btnlaser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlaser.setText("Lase Operation");
        btnlaser.setFocusable(false);
        btnlaser.setRolloverEnabled(false);

        btnmisslie.setBackground(new java.awt.Color(102, 255, 255));
        btnmisslie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmisslie.setText("Misslie Operation");
        btnmisslie.setFocusable(false);
        btnmisslie.setRolloverEnabled(false);

        btnshoot.setBackground(new java.awt.Color(102, 255, 255));
        btnshoot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnshoot.setText("Shoot");
        btnshoot.setFocusable(false);
        btnshoot.setRolloverEnabled(false);
        btnshoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshootActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("   Fuel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAreaClearMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlaser, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(10, 10, 10)
                        .addComponent(btnmisslie)
                        .addGap(18, 92, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSend))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaClearMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPosition)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmisslie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlaser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        
        Observerble.getinstace().setMassage(textBox.getText(),lblName.getText());
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

    private void btnshootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshootActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        Observerble.getinstace().setJsliderFuelValue(jSlider1.getValue(),lblName.getText());
    }//GEN-LAST:event_jSlider1StateChanged

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnlaser;
    private javax.swing.JButton btnmisslie;
    private javax.swing.JButton btnshoot;
    private javax.swing.JCheckBox chkPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblAreaClearMassege;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextArea massageBox;
    private javax.swing.JTextField textBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(String mg,String name){
        if(name.equals("Defanses Branch")){
            massageBox.append(name+"  :  "+mg+"\n\n");
        }else if(name.equals(lblName.getText())){
             massageBox.append(">>>"+mg+"\n\n");
        }
        System.out.println("Heli "+mg);
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
        System.out.println("Helicopter > "+value); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateJsliderValue(int value) {
        //this.value=value; //To change body of generated methods, choose Tools | Templates.
        if(isSelectedValue==1){
            btnshoot.setEnabled(false);
            btnlaser.setEnabled(false);
            btnmisslie.setEnabled(false);
        }else if(value < 20 && isSelectedValue==0){
            btnshoot.setEnabled(false);
        }
        if(value > 20 && isSelectedValue==0){
            btnshoot.setEnabled(true);
        }
        if(value > 30 && isSelectedValue==0){
            btnlaser.setEnabled(true);
        }else{
            btnlaser.setEnabled(false);
        }
        if(value > 40 && isSelectedValue==0){
            btnmisslie.setEnabled(true);
        }else{
            btnmisslie.setEnabled(false);
        }
    }   



    @Override
    public void updateJsliderFuelValue(int value, String name) {
         //To change body of generated methods, choose Tools | Templates.
    }
}