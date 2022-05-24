package AppMath;

import MiMath.MetMath;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;

public class Senos extends javax.swing.JFrame {

    MetMath m=new MetMath();
    ButtonGroup RadioBoton =new ButtonGroup();
    
    public Senos() {
        super("Ley de senos y Cosenos");
        initComponents();
        this.setContentPane(pnl);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
        RadioBoton.add(opA);
        RadioBoton.add(opB);
        RadioBoton.add(opC);
        
        lbCosLado1.setVisible(false);
        lbCosLado2.setVisible(false);
        lbCosAngulo.setVisible(false);
        txtLado1.setVisible(false);
        txtLado2.setVisible(false);
        txtAngulo.setVisible(false);
        lbRes.setVisible(false);
        lbResu.setVisible(false);
        btnCalcularCos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pnl = new javax.swing.JPanel();
        lbSeno = new javax.swing.JLabel();
        lbTrianguloImag = new javax.swing.JLabel();
        lbFormImag = new javax.swing.JLabel();
        lbSen1 = new javax.swing.JLabel();
        lbSenA = new javax.swing.JLabel();
        lbSen2 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtSenA = new javax.swing.JTextField();
        btnCalcularSen = new javax.swing.JButton();
        btnCalcularCos = new javax.swing.JButton();
        txtB = new javax.swing.JTextField();
        lbSen6 = new javax.swing.JLabel();
        lbSenB = new javax.swing.JLabel();
        txtSenB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opA = new javax.swing.JRadioButton();
        opB = new javax.swing.JRadioButton();
        opC = new javax.swing.JRadioButton();
        lbCosLado1 = new javax.swing.JLabel();
        lbCosLado2 = new javax.swing.JLabel();
        lbCosAngulo = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtAngulo = new javax.swing.JTextField();
        lbRes = new javax.swing.JLabel();
        lbResu = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setBackground(new java.awt.Color(255, 255, 255));

        lbSeno.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbSeno.setForeground(new java.awt.Color(0, 51, 51));
        lbSeno.setText("Ley de Senos y Cosenos");

        lbTrianguloImag.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\triangulo.png")); // NOI18N

        lbFormImag.setIcon(new javax.swing.ImageIcon("C:\\Users\\bradl\\OneDrive\\Documentos\\NetBeansProjects\\TopicosUnidad2\\src\\Imagenes\\Ley-de-senos-2.png")); // NOI18N

        lbSen1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSen1.setText("--------------");

        lbSenA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSenA.setText("sen");

        lbSen2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSen2.setText("=");

        txtA.setText("40");

        txtSenA.setText("42");

        btnCalcularSen.setBackground(new java.awt.Color(0, 204, 204));
        btnCalcularSen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCalcularSen.setText("Calcular");
        btnCalcularSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularSenActionPerformed(evt);
            }
        });

        btnCalcularCos.setBackground(new java.awt.Color(0, 204, 204));
        btnCalcularCos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCalcularCos.setText("Calcular");
        btnCalcularCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCosActionPerformed(evt);
            }
        });

        txtB.setText("52");

        lbSen6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSen6.setText("--------------");

        lbSenB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSenB.setText("sen");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("Ley de Senos");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("Ley de Cosenos");

        opA.setBackground(new java.awt.Color(255, 255, 255));
        opA.setText("a² = b² + c² -2bcCosA");
        opA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAActionPerformed(evt);
            }
        });

        opB.setBackground(new java.awt.Color(255, 255, 255));
        opB.setText("b² = a² + c² -2acCosB");
        opB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBActionPerformed(evt);
            }
        });

        opC.setBackground(new java.awt.Color(255, 255, 255));
        opC.setText("c² = a² + b² -2abCosC");
        opC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCActionPerformed(evt);
            }
        });

        lbCosLado1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCosLado1.setText("Lado1");

        lbCosLado2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCosLado2.setText("Lado2");

        lbCosAngulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCosAngulo.setText("Angulo");

        txtLado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado1ActionPerformed(evt);
            }
        });

        txtLado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado2ActionPerformed(evt);
            }
        });

        txtAngulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnguloActionPerformed(evt);
            }
        });

        lbRes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbRes.setText("Res");

        lbResu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResu.setText("Resu");

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lbFormImag, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbSen1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lbSen2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbSenA)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbSen6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addComponent(lbSenB)
                                .addGap(18, 18, 18)
                                .addComponent(txtSenB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(opB)
                                .addComponent(opA)
                                .addComponent(opC))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCosLado1)
                                    .addComponent(lbCosLado2)
                                    .addComponent(lbCosAngulo))
                                .addGap(18, 18, 18)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(121, 121, 121)
                        .addComponent(lbTrianguloImag, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCalcularSen)
                        .addGap(128, 128, 128)
                        .addComponent(lbRes)
                        .addGap(18, 18, 18)
                        .addComponent(lbResu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcularCos)
                .addGap(347, 347, 347))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lbSeno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addComponent(lbFormImag, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSen1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbSen2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSenA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSenA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(lbSen6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSenB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCosLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCosLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCosAngulo)
                                    .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcularSen)
                            .addComponent(lbRes)
                            .addComponent(lbResu))
                        .addGap(6, 6, 6))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTrianguloImag, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(opA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opC)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnCalcularCos)
                .addContainerGap(125, Short.MAX_VALUE))
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

    private void btnCalcularSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularSenActionPerformed
        double a,b,sA,sB;
        String angulo,medida;
        
        if( (!txtA.getText().equals("")) && (!txtB.getText().equals("")) ){
            a=Double.parseDouble(txtA.getText());
            b=Double.parseDouble(txtB.getText());
            
            if(!txtSenA.getText().equals("")){
                sA=Double.parseDouble(txtSenA.getText());
                double senA=m.Seno(sA);
                double senB= (senA*b) / a;
                //JOptionPane.showMessageDialog(null, senB);
                System.out.println(senB);
                sB=m.ArcSeno(senB);
                //JOptionPane.showMessageDialog(null, sB);
                angulo=Double.toString(sB).substring(0, 6);
                txtSenB.setText(angulo);
                
            }else if(!txtSenB.getText().equals("")){
                sB=Double.parseDouble(txtSenB.getText());
                double senB=m.Seno(sB);
                double senA= (senB*a) / b;
                //JOptionPane.showMessageDialog(null, senB);
                System.out.println(senA);
                sA=m.ArcSeno(senA);
                //JOptionPane.showMessageDialog(null, sB);
                angulo=Double.toString(sA).substring(0, 6);
                txtSenA.setText(angulo);
            }
            
        }else if( (!txtSenA.getText().equals("")) && (!txtSenB.getText().equals("")) ){
            sA=Double.parseDouble(txtSenA.getText());
            sB=Double.parseDouble(txtSenB.getText());
            
            if( !txtA.getText().equals("") ){
                a=Double.parseDouble(txtA.getText());
                b= (m.Seno(sB)*a) / m.Seno(sA);
                medida=Double.toString(b).substring(0,4);
                txtB.setText(medida);
                
            }else if( !txtB.getText().equals("") ){
                b=Double.parseDouble(txtB.getText());
                a= (m.Seno(sA)*b) / m.Seno(sB);
                medida=Double.toString(a).substring(0,4);
                txtA.setText(medida);
            }
        }
    }//GEN-LAST:event_btnCalcularSenActionPerformed

    private void opAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAActionPerformed
        lbCosLado1.setText("b : ");
        lbCosLado2.setText("c : ");
        lbCosAngulo.setText("A : ");
        lbRes.setText("a :");
        lbCosLado1.setVisible(true);
        lbCosLado2.setVisible(true);
        lbCosAngulo.setVisible(true);
        txtLado1.setVisible(true);
        txtLado2.setVisible(true);
        txtAngulo.setVisible(true);
        btnCalcularCos.setVisible(true);
    }//GEN-LAST:event_opAActionPerformed

    private void opBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBActionPerformed
        lbCosLado1.setText("a : ");
        lbCosLado2.setText("c : ");
        lbCosAngulo.setText("B : ");
        lbRes.setText("b :");
        lbCosLado1.setVisible(true);
        lbCosLado2.setVisible(true);
        lbCosAngulo.setVisible(true);
        txtLado1.setVisible(true);
        txtLado2.setVisible(true);
        txtAngulo.setVisible(true);
        btnCalcularCos.setVisible(true);
    }//GEN-LAST:event_opBActionPerformed

    private void opCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCActionPerformed
        lbCosLado1.setText("a : ");
        lbCosLado2.setText("b : ");
        lbCosAngulo.setText("C : ");
        lbRes.setText("c :");
        lbCosLado1.setVisible(true);
        lbCosLado2.setVisible(true);
        lbCosAngulo.setVisible(true);
        txtLado1.setVisible(true);
        txtLado2.setVisible(true);
        txtAngulo.setVisible(true);
        btnCalcularCos.setVisible(true);
    }//GEN-LAST:event_opCActionPerformed

    private void txtLado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLado1ActionPerformed

    private void txtLado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLado2ActionPerformed

    private void txtAnguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnguloActionPerformed

    private void btnCalcularCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCosActionPerformed
        double b,c,A,resp,res;
        b=Double.parseDouble(txtLado1.getText());
        c=Double.parseDouble(txtLado2.getText());
        A=Double.parseDouble(txtAngulo.getText());

        res= (m.Potencia(b, 2)) + (m.Potencia(c, 2)) - ((2*b*c)*m.Coseno(A));
        resp=m.Raiz(res);

        lbRes.setVisible(true);
        lbResu.setText(Double.toString(resp));
        lbResu.setVisible(true);

    }//GEN-LAST:event_btnCalcularCosActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Senos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCos;
    private javax.swing.JButton btnCalcularSen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCosAngulo;
    private javax.swing.JLabel lbCosLado1;
    private javax.swing.JLabel lbCosLado2;
    private javax.swing.JLabel lbFormImag;
    private javax.swing.JLabel lbRes;
    private javax.swing.JLabel lbResu;
    private javax.swing.JLabel lbSen1;
    private javax.swing.JLabel lbSen2;
    private javax.swing.JLabel lbSen6;
    private javax.swing.JLabel lbSenA;
    private javax.swing.JLabel lbSenB;
    private javax.swing.JLabel lbSeno;
    private javax.swing.JLabel lbTrianguloImag;
    private javax.swing.JRadioButton opA;
    private javax.swing.JRadioButton opB;
    private javax.swing.JRadioButton opC;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAngulo;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtSenA;
    private javax.swing.JTextField txtSenB;
    // End of variables declaration//GEN-END:variables

}
