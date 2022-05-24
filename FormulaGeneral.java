package AppMath;

import MiMath.MetMath;
import javax.swing.JFrame;

public class FormulaGeneral extends javax.swing.JFrame {

    MetMath m=new MetMath();
    
    public FormulaGeneral() {
        super("Formula General");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        lbResultado.setVisible(false);
        lbRA.setVisible(false);
        lbRB.setVisible(false);
        lbRC.setVisible(false);
        lbX1.setVisible(false);
        lbX2.setVisible(false);
        btnBorrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbA = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lbC = new javax.swing.JLabel();
        lbB = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        lbRA = new javax.swing.JLabel();
        lbRB = new javax.swing.JLabel();
        lbRC = new javax.swing.JLabel();
        lbX1 = new javax.swing.JLabel();
        lbX2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Formula General");

        lbA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbA.setText("a:");

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\FrameForm.jpg")); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(255, 51, 102));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbC.setText("c:");

        lbB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbB.setText("b:");

        lbResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbResultado.setForeground(new java.awt.Color(0, 153, 51));
        lbResultado.setText("Resultado");

        lbRA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRA.setText("jLabel3");

        lbRB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRB.setText("jLabel4");

        lbRC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRC.setText("jLabel7");

        lbX1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbX1.setText("jLabel8");

        lbX2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbX2.setText("jLabel9");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbX1)
                .addGap(34, 34, 34)
                .addComponent(lbX2)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbA)
                    .addComponent(lbC)
                    .addComponent(lbB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(txtB)
                            .addComponent(txtC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbRA)
                        .addGap(34, 34, 34)
                        .addComponent(lbRB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(73, 73, 73)
                        .addComponent(lbResultado)))
                .addGap(18, 18, 18)
                .addComponent(lbRC)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbA)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbB))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbC)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbResultado)
                            .addComponent(btnCalcular))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRA)
                            .addComponent(lbRB)
                            .addComponent(lbRC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbX1)
                            .addComponent(lbX2))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        lbRA.setText("a: "+txtA.getText());
        lbRB.setText("b: "+txtB.getText());
        lbRC.setText("c: "+txtC.getText());
        
        double a,b,c;
        a=Double.parseDouble(txtA.getText());
        b=Double.parseDouble(txtB.getText());
        c=Double.parseDouble(txtC.getText());
        lbX1.setText("X1: "+Double.toString(m.FormGen(a,b,c)));
        lbX2.setText("X2: "+Double.toString(m.FormGen1(a,b,c)));
        lbResultado.setVisible(true);
        lbRA.setVisible(true);
        lbRB.setVisible(true);
        lbRC.setVisible(true);
        lbX1.setVisible(true);
        lbX2.setVisible(true);
        btnBorrar.setVisible(true);
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        lbResultado.setVisible(false);
        lbRA.setVisible(false);
        lbRB.setVisible(false);
        lbRC.setVisible(false);
        lbX1.setVisible(false);
        lbX2.setVisible(false);
        
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        btnBorrar.setVisible(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(FormulaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulaGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbRA;
    private javax.swing.JLabel lbRB;
    private javax.swing.JLabel lbRC;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbX1;
    private javax.swing.JLabel lbX2;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    // End of variables declaration//GEN-END:variables
}
