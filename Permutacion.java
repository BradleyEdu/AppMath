package AppMath;

import MiMath.MetMath;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Permutacion extends javax.swing.JFrame {

    MetMath m=new MetMath();
    public Permutacion() {
        super("Permutación");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lbRespuesta.setVisible(false);
        lbResultado.setVisible(false);
        lbRN.setVisible(false);
        lbRR.setVisible(false);
        lbRC.setVisible(false);
        this.setVisible(true);
        btnBorrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        lbPermutacion = new javax.swing.JLabel();
        lbRespuesta = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        lbIzquierda = new javax.swing.JLabel();
        lbRN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbRR = new javax.swing.JLabel();
        lbArriba = new javax.swing.JLabel();
        lbRC = new javax.swing.JLabel();
        lbAbajo = new javax.swing.JLabel();
        lbN = new javax.swing.JLabel();
        lbR = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtR = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalcular.setBackground(new java.awt.Color(51, 0, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbPermutacion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbPermutacion.setForeground(new java.awt.Color(0, 51, 51));
        lbPermutacion.setText("Permutación");

        lbRespuesta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRespuesta.setText("jLabel3");

        lbResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbResultado.setForeground(new java.awt.Color(0, 153, 51));
        lbResultado.setText("Resultado");

        lbIzquierda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbIzquierda.setText("nPr=");

        lbRN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRN.setText("jLabel3");

        jLabel2.setText("----------------------");

        lbRR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRR.setText("jLabel4");

        lbArriba.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbArriba.setText("n!");

        lbRC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRC.setText("jLabel7");

        lbAbajo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbAbajo.setText("( n - r )!");

        lbN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbN.setText("n:");

        lbR.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbR.setText("r:");

        txtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtR))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addComponent(btnCalcular))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lbRN)
                        .addGap(43, 43, 43)
                        .addComponent(lbRR)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultado)
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPermutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIzquierda)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lbArriba))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbAbajo))
                                    .addComponent(jLabel2))))
                        .addGap(18, 18, 18)
                        .addComponent(lbRespuesta)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbRC)
                        .addGap(86, 86, 86))
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPermutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lbIzquierda))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbArriba)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbRespuesta))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAbajo)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbN)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbR)
                            .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbResultado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(lbRN)
                            .addComponent(lbRR))))
                .addComponent(lbRC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnBorrar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        lbRN.setText("n: "+txtN.getText());
        lbRR.setText("r: "+txtR.getText());

        int n,r;
        n=Integer.parseInt(txtN.getText());
        r=Integer.parseInt(txtR.getText());
        //JOptionPane.showMessageDialog(null, "Vamos bien");
        lbRC.setText("C: "+Integer.toString(m.Permutacion(n,r)));
        //JOptionPane.showMessageDialog(null, " bien");
        lbIzquierda.setText(n+"P"+r+" = ");
        lbArriba.setText(n+"!");
        lbAbajo.setText("("+n+" - "+r+" )! ");
        lbRespuesta.setText("= "+Integer.toString(m.Permutacion(n,r)));
        lbRespuesta.setVisible(true);
        lbResultado.setVisible(true);
        lbRN.setVisible(true);
        lbRR.setVisible(true);
        lbRC.setVisible(true);
        
        btnBorrar.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        lbIzquierda.setText("nPr=");
        lbArriba.setText("n!");
        lbAbajo.setText("( n - r )! ");
        lbRespuesta.setVisible(false);
        lbResultado.setVisible(false);
        lbRN.setVisible(false);
        lbRR.setVisible(false);
        lbRC.setVisible(false);
        txtN.setText("");
        txtR.setText("");
        
        btnBorrar.setVisible(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Permutacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Permutacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Permutacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Permutacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Permutacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbAbajo;
    private javax.swing.JLabel lbArriba;
    private javax.swing.JLabel lbIzquierda;
    private javax.swing.JLabel lbN;
    private javax.swing.JLabel lbPermutacion;
    private javax.swing.JLabel lbR;
    private javax.swing.JLabel lbRC;
    private javax.swing.JLabel lbRN;
    private javax.swing.JLabel lbRR;
    private javax.swing.JLabel lbRespuesta;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtR;
    // End of variables declaration//GEN-END:variables
}
