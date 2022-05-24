package AppMath;

import MiMath.MetMath;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

public class Pitagoras extends javax.swing.JFrame {

    MetMath m=new MetMath();
    ButtonGroup RadioBoton =new ButtonGroup();
    
    public Pitagoras() {
        super("Teorema de Pitagoras");
        initComponents();
        
        this.setContentPane(pnl);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
        RadioBoton.add(opC);
        RadioBoton.add(opA);
        RadioBoton.add(opB);
        
        lbCateto1.setVisible(false);
        lbCateto2.setVisible(false);
        lbHip.setVisible(false);
        lbRes.setVisible(false);
        txtCateto1.setVisible(false);
        txtCateto2.setVisible(false);
        btnCalcular.setVisible(false);
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        miTitulo1 = new miSwing.miTitulo();
        jLabel1 = new javax.swing.JLabel();
        opC = new javax.swing.JRadioButton();
        opA = new javax.swing.JRadioButton();
        opB = new javax.swing.JRadioButton();
        lbCateto1 = new javax.swing.JLabel();
        lbCateto2 = new javax.swing.JLabel();
        lbHip = new javax.swing.JLabel();
        btnCalcular = new miSwing.btnCalcular();
        lbRes = new miSwing.miEtiqueta();
        txtCateto1 = new javax.swing.JTextField();
        txtCateto2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setBackground(new java.awt.Color(255, 255, 255));
        pnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        miTitulo1.setText("Teorema de Pitagoras");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\triRec.jpg")); // NOI18N

        opC.setBackground(new java.awt.Color(255, 255, 255));
        opC.setText("c² = a² + b²");
        opC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCActionPerformed(evt);
            }
        });

        opA.setBackground(new java.awt.Color(255, 255, 255));
        opA.setText("a² = c² - b²");
        opA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAActionPerformed(evt);
            }
        });

        opB.setBackground(new java.awt.Color(255, 255, 255));
        opB.setText("b² = c² - a²");
        opB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBActionPerformed(evt);
            }
        });

        lbCateto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCateto1.setText("Cateto a :");

        lbCateto2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCateto2.setText("Cateto b :");

        lbHip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbHip.setText("Hipotenusa :");

        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtCateto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCateto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opC)
                            .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(opA)
                                .addComponent(opB)))
                        .addGap(48, 48, 48)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCateto2)
                            .addComponent(lbHip)
                            .addComponent(lbCateto1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbRes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCateto1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtCateto2))))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(miTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCateto1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCateto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCateto2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCateto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHip, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(opC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opB)))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCActionPerformed
        lbCateto1.setText("Cateto a :");
        lbCateto2.setText("Cateto b :");
        lbHip.setText("Hipotenusa :");
        
        lbCateto1.setVisible(true);
        lbCateto2.setVisible(true);
        lbHip.setVisible(true);
        txtCateto1.setVisible(true);
        txtCateto2.setVisible(true);
        btnCalcular.setVisible(true);
    }//GEN-LAST:event_opCActionPerformed

    private void opAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAActionPerformed
        lbCateto1.setText("Cateto b :");
        lbCateto2.setText("Hipotenusa :");
        lbHip.setText("Cateto a :");
        
        lbCateto1.setVisible(true);
        lbCateto2.setVisible(true);
        lbHip.setVisible(true);
        txtCateto1.setVisible(true);
        txtCateto2.setVisible(true);
        btnCalcular.setVisible(true);
    }//GEN-LAST:event_opAActionPerformed

    private void opBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBActionPerformed
        lbCateto1.setText("Cateto a :");
        lbCateto2.setText("Hipotenusa :");
        lbHip.setText("Cateto b :");
        
        lbCateto1.setVisible(true);
        lbCateto2.setVisible(true);
        lbHip.setVisible(true);
        txtCateto1.setVisible(true);
        txtCateto2.setVisible(true);
        btnCalcular.setVisible(true);
    }//GEN-LAST:event_opBActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(opC.isSelected() == true){
            double a,b,c,res;
            
            a=Double.parseDouble(txtCateto1.getText());
            b=Double.parseDouble(txtCateto2.getText());
            
            c=((m.Potencia(a, 2))+(m.Potencia(b, 2)));
            
            res=m.Raiz(c);
            lbRes.setText(Double.toString(res));
            lbRes.setVisible(true);
        }else {
            double a,b,c,res;
            
            b=Double.parseDouble(txtCateto1.getText());
            c=Double.parseDouble(txtCateto2.getText());
            
            a=((m.Potencia(c, 2)) - (m.Potencia(b, 2)));
            
            res=m.Raiz(a);
            lbRes.setText(Double.toString(res));
            lbRes.setVisible(true);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtCateto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCateto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCateto1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pitagoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private miSwing.btnCalcular btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCateto1;
    private javax.swing.JLabel lbCateto2;
    private javax.swing.JLabel lbHip;
    private miSwing.miEtiqueta lbRes;
    private miSwing.miTitulo miTitulo1;
    private javax.swing.JRadioButton opA;
    private javax.swing.JRadioButton opB;
    private javax.swing.JRadioButton opC;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtCateto1;
    private javax.swing.JTextField txtCateto2;
    // End of variables declaration//GEN-END:variables
}
