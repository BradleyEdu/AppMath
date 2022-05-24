package AppMath;

import MiMath.MetMath;
import javax.swing.JFrame;

public class Distancia extends javax.swing.JFrame {
    MetMath m=new MetMath();
    
    public Distancia() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lbRDis.setVisible(false);
        lbRespuesta.setVisible(false);
        this.setVisible(true);
        btnBorrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl = new javax.swing.JPanel();
        lbDistancia = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();
        lbPrimerP = new javax.swing.JLabel();
        lbSegundoP = new javax.swing.JLabel();
        lbX = new javax.swing.JLabel();
        lbY = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        txtY1 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtY2 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lbRDis = new javax.swing.JLabel();
        lbRespuesta = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Distancia Entre Puntos");
        setResizable(false);

        pnl.setBackground(new java.awt.Color(255, 255, 255));

        lbDistancia.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbDistancia.setForeground(new java.awt.Color(0, 51, 51));
        lbDistancia.setText("Distancia Entre Puntos");

        lbImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\hqdefault (1).jpg")); // NOI18N
        lbImagen.setText("jLabel1");

        lbPrimerP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPrimerP.setText("Primer Punto:");

        lbSegundoP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSegundoP.setText("Segundo Punto:");

        lbX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbX.setText("X");

        lbY.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbY.setText("Y");

        txtX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX1ActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(51, 255, 0));
        btnCalcular.setText("Calcular Distancia");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbRDis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbRDis.setForeground(new java.awt.Color(0, 0, 255));
        lbRDis.setText("Distancia:");

        lbRespuesta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbRespuesta.setText("jLabel2");

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lbDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lbX)
                        .addGap(47, 47, 47)
                        .addComponent(lbY))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbSegundoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbPrimerP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnCalcular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRDis)
                            .addComponent(lbRespuesta))
                        .addGap(68, 68, 68))
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbX)
                    .addComponent(lbY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrimerP)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRDis))
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbRespuesta)
                        .addGap(5, 5, 5)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSegundoP)
                            .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar))))
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

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int x1,x2,y1,y2;
        double d,suma;
        
        x1=Integer.parseInt(txtX1.getText());
        y1=Integer.parseInt(txtY1.getText());
        x2=Integer.parseInt(txtX2.getText());
        y2=Integer.parseInt(txtY2.getText());
        
        suma = (m.Potencia((x2-x1), 2)) + (m.Potencia((y2-y1), 2));
        d=m.Raiz(suma);
        
        lbRespuesta.setText(Double.toString(d));
        lbRDis.setVisible(true);
        lbRespuesta.setVisible(true);
        btnBorrar.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX1ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        lbRDis.setVisible(false);
        lbRespuesta.setVisible(false);
        txtX1.setText("");
        txtY1.setText("");
        txtX2.setText("");
        txtY2.setText("");
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
            java.util.logging.Logger.getLogger(Distancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Distancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Distancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Distancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Distancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDistancia;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbPrimerP;
    private javax.swing.JLabel lbRDis;
    private javax.swing.JLabel lbRespuesta;
    private javax.swing.JLabel lbSegundoP;
    private javax.swing.JLabel lbX;
    private javax.swing.JLabel lbY;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    // End of variables declaration//GEN-END:variables
}
