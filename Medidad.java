package AppMath;

import MiMath.MetMath;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Medidad extends javax.swing.JFrame {
    MetMath m=new MetMath();
    
    public Medidad() {
        super("Medidas de Tendencia Central");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lbRMedia.setVisible(false);
        lbRMediana.setVisible(false);
        lbRModa.setVisible(false);
        this.setVisible(true);
        btnBorrar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbMedidas = new javax.swing.JLabel();
        lbNumeros = new javax.swing.JLabel();
        txtNumeros = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lbMedia = new javax.swing.JLabel();
        lbMediana = new javax.swing.JLabel();
        lbModa = new javax.swing.JLabel();
        lbRMedia = new javax.swing.JLabel();
        lbRMediana = new javax.swing.JLabel();
        lbRModa = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lbMedidas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbMedidas.setForeground(new java.awt.Color(0, 51, 51));
        lbMedidas.setText("Medidas de Tendencia Central");

        lbNumeros.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNumeros.setText("Ingrese el numero de datos:");

        txtNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerosActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(102, 102, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbMedia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMedia.setText("Media");

        lbMediana.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbMediana.setText("Mediana");

        lbModa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbModa.setText("Moda");

        lbRMedia.setText("jLabel1");

        lbRMediana.setText("jLabel2");

        lbRModa.setText("jLabel3");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(lbMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lbNumeros)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnCalcular)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMedia)
                            .addComponent(lbRMedia))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMediana)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbRMediana)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbModa)
                            .addComponent(lbRModa))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBorrar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMedia)
                    .addComponent(lbMediana)
                    .addComponent(lbModa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRMedia)
                    .addComponent(lbRMediana)
                    .addComponent(lbRModa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnBorrar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int n=Integer.parseInt(txtNumeros.getText());
        double[] datos=new double[n];
        
        for (int i = 0 ; i < datos.length;i++){
            datos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato: "+(i+1)));
        }
        
        m.Ordenamiento(datos);
        System.out.println("Ordenamiento:");
        for(int i=0;i<datos.length;i++){
            System.out.println(datos[i]);
        }
        
        lbRMedia.setText(Double.toString(m.Media(datos)));
        lbRMediana.setText(Double.toString(m.Mediana(datos)));
        lbRModa.setText(Double.toString(m.Moda(datos)));
        
        lbRMedia.setVisible(true);
        lbRMediana.setVisible(true);
        lbRModa.setVisible(true);
        
        btnBorrar.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        lbRMedia.setVisible(false);
        lbRMediana.setVisible(false);
        lbRModa.setVisible(false);
        
        txtNumeros.setText("");
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
            java.util.logging.Logger.getLogger(Medidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lbMedia;
    private javax.swing.JLabel lbMediana;
    private javax.swing.JLabel lbMedidas;
    private javax.swing.JLabel lbModa;
    private javax.swing.JLabel lbNumeros;
    private javax.swing.JLabel lbRMedia;
    private javax.swing.JLabel lbRMediana;
    private javax.swing.JLabel lbRModa;
    private javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
}
