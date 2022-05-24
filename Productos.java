package AppMath;

import MiMath.MetMath;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

public class Productos extends javax.swing.JFrame {
    
    MetMath m=new MetMath();
    ButtonGroup RadioBoton =new ButtonGroup();
    
    public Productos() {
        super("Productos Notables");
        initComponents();
        
        this.setContentPane(pnl);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
        lbM.setVisible(false);
        lbN.setVisible(false);
        txtM.setVisible(false);
        txtN.setVisible(false);
        lbEcu.setVisible(false);
        lbRes.setVisible(false);
        
        RadioBoton.add(op1);
        RadioBoton.add(op2);
        RadioBoton.add(op3);
        RadioBoton.add(op4);
        RadioBoton.add(op5);
        
        op1.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        miTitulo1 = new miSwing.miTitulo();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        op5 = new javax.swing.JRadioButton();
        lbA = new miSwing.miEtiqueta();
        lbB = new miSwing.miEtiqueta();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        lbM = new miSwing.miEtiqueta();
        lbN = new miSwing.miEtiqueta();
        txtM = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        btnCalcular1 = new miSwing.btnCalcular();
        lbEcu = new miSwing.miEtiqueta();
        lbRes = new miSwing.miEtiqueta();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setBackground(new java.awt.Color(255, 255, 255));

        miTitulo1.setText("Productos Notables");

        op1.setBackground(new java.awt.Color(255, 255, 255));
        op1.setText("( a ± b )²");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setBackground(new java.awt.Color(255, 255, 255));
        op2.setText("( a + b  )³");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(255, 255, 255));
        op3.setText("( x + a ) ( x + b )");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setBackground(new java.awt.Color(255, 255, 255));
        op4.setText("( mx + a ) ( nx + b )");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        op5.setBackground(new java.awt.Color(255, 255, 255));
        op5.setText("( a² - b² )");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        lbA.setText("a :");

        lbB.setText("b :");

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        lbM.setText("m :");

        lbN.setText("n :");

        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addComponent(op3)
                        .addContainerGap())
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op1)
                            .addComponent(op2)
                            .addComponent(op4)
                            .addComponent(op5))
                        .addGap(85, 85, 85)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlLayout.createSequentialGroup()
                                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtM, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(txtN)))
                                    .addGroup(pnlLayout.createSequentialGroup()
                                        .addComponent(lbB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtB)))
                                .addGap(94, 94, 94)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addComponent(lbA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                        .addComponent(btnCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                        .addComponent(miTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(miTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op1)
                    .addComponent(lbA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op2)
                    .addComponent(lbB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op4)
                    .addComponent(lbM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op5)
                    .addComponent(lbN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        lbM.setVisible(true);
        lbN.setVisible(true);
        txtM.setVisible(true);
        txtN.setVisible(true);
    }//GEN-LAST:event_op4ActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        double a,b,M,n,res;
        if( op1.isSelected() == true){
            a=Double.parseDouble(txtA.getText());
            b=Double.parseDouble(txtB.getText());
            
            res=((m.Potencia(a, 2))+(2*a*b)+(m.Potencia(b, 2)));
            lbEcu.setText(Double.toString(m.Potencia(a, 2))+" + "+Double.toString((2*a*b)) + " + "+(Double.toString(m.Potencia(b,2))));
            lbRes.setText("Resultado: "+Double.toString(res));
            
            lbEcu.setVisible(true);
            lbRes.setVisible(true);
        }else if( op2.isSelected() == true ){
            a=Double.parseDouble(txtA.getText());
            b=Double.parseDouble(txtB.getText());
            
            res=((m.Potencia(a,3))+(3 *m.Potencia(a, 2)* b)+(3*a*m.Potencia(b,2))+(m.Potencia(b,3)));
            lbEcu.setText(Double.toString(m.Potencia(a,3))+" + "+Double.toString((3 *m.Potencia(a, 2)* b)) + " + "
                    + (Double.toString(3*a*m.Potencia(b,2))+" + "+(Double.toString(m.Potencia(b,3)))));
            lbRes.setText("Resultado: "+Double.toString(res));
            
            lbEcu.setVisible(true);
            lbRes.setVisible(true);
        }else if( op3.isSelected() == true ){
            a=Double.parseDouble(txtA.getText());
            b=Double.parseDouble(txtB.getText());
            
            lbEcu.setText("x² + "+Double.toString((a+b)) + "x + "+(Double.toString(a*b)));
            
            lbEcu.setVisible(true);
        }else if( op4.isSelected() == true ){
            a=Double.parseDouble(txtA.getText());
            b=Double.parseDouble(txtB.getText());
            M=Double.parseDouble(txtM.getText());
            n=Double.parseDouble(txtN.getText());
            
            lbEcu.setText(Double.toString(M*n)+"x² + "+Double.toString(b*M) + "x + "+(Double.toString(a*n))+"x + "+
                    (Double.toString(a*b)));
            
            lbEcu.setVisible(true);
        }else if( op5.isSelected() == true ){
            a=Double.parseDouble(txtA.getText());
            b=Double.parseDouble(txtB.getText());
            
            double a1,b1;
            a1=m.Raiz(a);
            b1=m.Raiz(b);
            lbEcu.setText( "("+a1+" - "+b1+") "+" ("+a1+" + "+b1+")" );
            
            lbEcu.setVisible(true);
        }
        
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        txtM.setVisible(false);
        txtN.setVisible(false);
        lbM.setVisible(false);
        lbN.setVisible(false);
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
        txtM.setVisible(false);
        txtN.setVisible(false);
        lbM.setVisible(false);
        lbN.setVisible(false);
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
        txtM.setVisible(false);
        txtN.setVisible(false);
        lbM.setVisible(false);
        lbN.setVisible(false);
    }//GEN-LAST:event_op3ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        // TODO add your handling code here:
        txtM.setVisible(false);
        txtN.setVisible(false);
        lbM.setVisible(false);
        lbN.setVisible(false);
    }//GEN-LAST:event_op5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private miSwing.btnCalcular btnCalcular1;
    private miSwing.miEtiqueta lbA;
    private miSwing.miEtiqueta lbB;
    private miSwing.miEtiqueta lbEcu;
    private miSwing.miEtiqueta lbM;
    private miSwing.miEtiqueta lbN;
    private miSwing.miEtiqueta lbRes;
    private miSwing.miTitulo miTitulo1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
