package AppMath;

import MiMath.MetMath;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {
    MetMath m=new MetMath();
    double[] FG=new double[3];
    
    public App() {
        super("MateFacil ");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setContentPane(pnl);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnFormGen = new javax.swing.JButton();
        btnCombinacion = new javax.swing.JButton();
        btnPermutacion = new javax.swing.JButton();
        btnMedidas = new javax.swing.JButton();
        btnDistancia = new javax.swing.JButton();
        btnLeySenos = new javax.swing.JButton();
        btnPitagoras = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnTablas = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("      Mate Facil");
        jLabel2.setToolTipText("");

        btnFormGen.setBackground(new java.awt.Color(255, 255, 255));
        btnFormGen.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\Formula1.jpg")); // NOI18N
        btnFormGen.setToolTipText("");
        btnFormGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormGenActionPerformed(evt);
            }
        });
        btnFormGen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnFormGenKeyReleased(evt);
            }
        });

        btnCombinacion.setBackground(new java.awt.Color(255, 255, 255));
        btnCombinacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\Combinacion1.jpg")); // NOI18N
        btnCombinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombinacionActionPerformed(evt);
            }
        });

        btnPermutacion.setBackground(new java.awt.Color(255, 255, 255));
        btnPermutacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\Permutacion1.jpg")); // NOI18N
        btnPermutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermutacionActionPerformed(evt);
            }
        });

        btnMedidas.setBackground(new java.awt.Color(255, 255, 255));
        btnMedidas.setText("Medidas de Tendencia Central");
        btnMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedidasActionPerformed(evt);
            }
        });

        btnDistancia.setBackground(new java.awt.Color(255, 255, 255));
        btnDistancia.setText("Distancia Entre Puntos");
        btnDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistanciaActionPerformed(evt);
            }
        });

        btnLeySenos.setBackground(new java.awt.Color(255, 255, 255));
        btnLeySenos.setText("Ley de Senos y Cosenos");
        btnLeySenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeySenosActionPerformed(evt);
            }
        });

        btnPitagoras.setBackground(new java.awt.Color(255, 255, 255));
        btnPitagoras.setText("Teorema de Pitagoras");
        btnPitagoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPitagorasActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos Notables");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnTablas.setBackground(new java.awt.Color(255, 255, 255));
        btnTablas.setText("Tablas de Verdad");
        btnTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTablas)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFormGen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLeySenos))
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btnDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnPitagoras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProductos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnCombinacion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnPermutacion))))
                    .addComponent(btnMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPermutacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCombinacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFormGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeySenos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPitagoras, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFormGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormGenActionPerformed
        FormulaGeneral frmG=new FormulaGeneral();
        frmG.setVisible(true);
    }//GEN-LAST:event_btnFormGenActionPerformed

    private void btnFormGenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFormGenKeyReleased
    }//GEN-LAST:event_btnFormGenKeyReleased

    private void btnCombinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombinacionActionPerformed
        Combinacion Comb=new Combinacion();
    }//GEN-LAST:event_btnCombinacionActionPerformed

    private void btnPermutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermutacionActionPerformed
        Permutacion perm=new Permutacion();
    }//GEN-LAST:event_btnPermutacionActionPerformed

    private void btnMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedidasActionPerformed
        Medidad medidas=new Medidad();
    }//GEN-LAST:event_btnMedidasActionPerformed

    private void btnLeySenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeySenosActionPerformed
        Senos seno=new Senos();
    }//GEN-LAST:event_btnLeySenosActionPerformed

    private void btnPitagorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPitagorasActionPerformed
        Pitagoras pita=new Pitagoras();
    }//GEN-LAST:event_btnPitagorasActionPerformed

    private void btnDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistanciaActionPerformed
        Distancia dist=new Distancia();
    }//GEN-LAST:event_btnDistanciaActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Productos prod=new Productos();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablasActionPerformed
        TablasVerdad tab=new TablasVerdad();
    }//GEN-LAST:event_btnTablasActionPerformed

    
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCombinacion;
    private javax.swing.JButton btnDistancia;
    private javax.swing.JButton btnFormGen;
    private javax.swing.JButton btnLeySenos;
    private javax.swing.JButton btnMedidas;
    private javax.swing.JButton btnPermutacion;
    private javax.swing.JButton btnPitagoras;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
