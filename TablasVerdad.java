package AppMath;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TablasVerdad extends javax.swing.JFrame {
    
    DefaultTableModel dtm=new DefaultTableModel();
    String[] vector=new String[20];
    String[] oper={"^","v","->","<->"};
    String parentesis;
    int cont=0;
    
    public TablasVerdad() {
        super("Tablas de Verdad");
        initComponents();
        
        this.setContentPane(pnl);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
        btnBorrar.setVisible(false);
        miTabla.setModel(dtm);
        miTabla.setBackground(Color.white);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        miTitulo1 = new miSwing.miTitulo();
        btnP = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        miEtiqueta1 = new miSwing.miEtiqueta();
        miEtiqueta2 = new miSwing.miEtiqueta();
        lbEcu = new javax.swing.JLabel();
        btnConjuncion = new javax.swing.JButton();
        btnDisyuncion = new javax.swing.JButton();
        btnBi = new javax.swing.JButton();
        btnNegacion = new javax.swing.JButton();
        btnConcicional = new javax.swing.JButton();
        btnRealizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setBackground(new java.awt.Color(255, 255, 255));

        miTitulo1.setText("Tablas de Verdad");

        btnP.setText("P");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btnQ.setText("q");
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(miTabla);

        miEtiqueta1.setText("Argumentos");

        miEtiqueta2.setText("Operadores");

        lbEcu.setBackground(new java.awt.Color(255, 255, 255));
        lbEcu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbEcu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConjuncion.setBackground(new java.awt.Color(51, 153, 255));
        btnConjuncion.setText("^");
        btnConjuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConjuncionActionPerformed(evt);
            }
        });

        btnDisyuncion.setBackground(new java.awt.Color(51, 153, 255));
        btnDisyuncion.setText("v");
        btnDisyuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisyuncionActionPerformed(evt);
            }
        });

        btnBi.setBackground(new java.awt.Color(51, 153, 255));
        btnBi.setText("<->");
        btnBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiActionPerformed(evt);
            }
        });

        btnNegacion.setBackground(new java.awt.Color(51, 153, 255));
        btnNegacion.setText("¬");
        btnNegacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegacionActionPerformed(evt);
            }
        });

        btnConcicional.setBackground(new java.awt.Color(51, 153, 255));
        btnConcicional.setText("- >");
        btnConcicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcicionalActionPerformed(evt);
            }
        });

        btnRealizar.setText("Realizar");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
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

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(miTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(miEtiqueta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(miEtiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConcicional, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConjuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnDisyuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBorrar)
                                    .addComponent(btnRealizar))))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEcu, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(miTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEcu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(miEtiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQ)
                            .addComponent(btnP))
                        .addGap(43, 43, 43)
                        .addComponent(miEtiqueta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConjuncion)
                            .addComponent(btnDisyuncion)
                            .addComponent(btnNegacion))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBi)
                            .addComponent(btnConcicional))
                        .addGap(27, 27, 27)
                        .addComponent(btnRealizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNegacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegacionActionPerformed
        lbEcu.setText(lbEcu.getText()+"¬");
        btnBi.setVisible(false);
        btnConcicional.setVisible(false);
        btnConjuncion.setVisible(false);
        btnDisyuncion.setVisible(false);
    }//GEN-LAST:event_btnNegacionActionPerformed

    private void btnConjuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConjuncionActionPerformed
        String pri=lbEcu.getText().substring(0, 1);
        
        lbEcu.setText(lbEcu.getText()+"^");
        btnBi.setVisible(false);
        btnConcicional.setVisible(false);
        btnDisyuncion.setVisible(false);
        btnNegacion.setVisible(false);
    }//GEN-LAST:event_btnConjuncionActionPerformed

    private void btnDisyuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisyuncionActionPerformed
        String pri=lbEcu.getText().substring(0, 1);
        
        lbEcu.setText(lbEcu.getText()+"v");
        btnBi.setVisible(false);
        btnConcicional.setVisible(false);
        btnConjuncion.setVisible(false);
        btnNegacion.setVisible(false);
    }//GEN-LAST:event_btnDisyuncionActionPerformed

    private void btnConcicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcicionalActionPerformed
        String pri=lbEcu.getText().substring(0, 1);
        
        lbEcu.setText(lbEcu.getText()+"->");
        btnBi.setVisible(false);
        btnConjuncion.setVisible(false);
        btnDisyuncion.setVisible(false);
        btnNegacion.setVisible(false);
    }//GEN-LAST:event_btnConcicionalActionPerformed

    private void btnBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiActionPerformed
        String pri=lbEcu.getText().substring(0, 1);
        
        lbEcu.setText(lbEcu.getText()+"<->");
        btnConcicional.setVisible(false);
        btnConjuncion.setVisible(false);
        btnDisyuncion.setVisible(false);
        btnNegacion.setVisible(false);
    }//GEN-LAST:event_btnBiActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        lbEcu.setText(lbEcu.getText()+"p");
        dtm.addColumn("p");
        cont++;
        
        if(cont == 1){
            String[] dat={"V"};
            dtm.addRow(dat);
            dat[0]="F";
            dtm.addRow(dat);
        }else if(cont == 2){
            dtm.removeRow(0);
            dtm.removeRow(1);
            String[] dat=new String[2];
            
            for(int i=0;i<4;i++){
                switch(i){
                    case 0:
                        dat[0]="V";
                        dat[1]="V";
                        dtm.addRow(dat);
                    break;
                    case 1:
                        dat[0]="V";
                        dat[1]="F";
                        dtm.addRow(dat);
                    break;
                    case 2:
                        dat[0]="F";
                        dat[1]="V";
                        dtm.addRow(dat);
                    break;
                    case 3:
                        dat[0]="F";
                        dat[1]="F";
                        dtm.addRow(dat);
                    break;
                    
                }
            }
        }
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        lbEcu.setText(lbEcu.getText()+"q");
        dtm.addColumn("q");
        cont++;
        
        if(cont == 1){
            String[] dat={"V"};
            dtm.addRow(dat);
            dat[0]="F";
            dtm.addRow(dat);
        }else if(cont == 2){
            dtm.removeRow(0);
            dtm.removeRow(0);
            String[] dat=new String[2];
            
            for(int i=0;i<4;i++){
                switch(i){
                    case 0:
                        dat[0]="V";
                        dat[1]="V";
                        dtm.addRow(dat);
                    break;
                    case 1:
                        dat[0]="V";
                        dat[1]="F";
                        dtm.addRow(dat);
                    break;
                    case 2:
                        dat[0]="F";
                        dat[1]="V";
                        dtm.addRow(dat);
                    break;
                    case 3:
                        dat[0]="F";
                        dat[1]="F";
                        dtm.addRow(dat);
                    break;
                    
                }
            }
        }
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        String ecu=lbEcu.getText();
        btnBorrar.setVisible(true);
        String[] dat=new String[3];
        String[] dos=new String[2];
        
        switch(ecu){
            case "¬p":
                dtm.addColumn("¬p");
                dtm.removeRow(0);
                dtm.removeRow(0);
                for(int i=0;i<2;i++){
                    switch(i){
                        case 0:
                            dos[0]="V";
                            dos[1]="F";
                            dtm.addRow(dos);
                        break;
                        case 1:
                            dos[0]="F";
                            dos[1]="V";
                            dtm.addRow(dos);
                        break;
                    }
                }
                break;
            case "¬q":
                    dtm.addColumn("¬q");
                    dtm.removeRow(0);
                    dtm.removeRow(0);
                for(int i=0;i<2;i++){
                    switch(i){
                        case 0:
                            dos[0]="V";
                            dos[1]="F";
                            dtm.addRow(dos);
                        break;
                        case 1:
                            dos[0]="F";
                            dos[1]="V";
                            dtm.addRow(dos);
                        break;
                    }
                }
                break;
            case "p^q":
                    dtm.addColumn("p^q");
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                for(int i=0;i<4;i++){
                    switch(i){
                        case 0:
                            dat[0]="V";
                            dat[1]="V";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                        case 1:
                            dat[0]="V";
                            dat[1]="F";
                            dat[2]="F";
                            dtm.addRow(dat);
                        break;
                        case 2:
                            dat[0]="F";
                            dat[1]="V";
                            dat[2]="F";
                            dtm.addRow(dat);
                        break;
                        case 3:
                            dat[0]="F";
                            dat[1]="F";
                            dat[2]="F";
                            dtm.addRow(dat);
                        break;
                    }
                }
                break;
            case "pvq":
                dtm.addColumn("pvq");
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                for(int i=0;i<4;i++){
                    switch(i){
                        case 0:
                            dat[0]="V";
                            dat[1]="V";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                        case 1:
                            dat[0]="V";
                            dat[1]="F";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                        case 2:
                            dat[0]="F";
                            dat[1]="V";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                        case 3:
                            dat[0]="F";
                            dat[1]="F";
                            dat[2]="F";
                            dtm.addRow(dat);
                        break;
                    }
                }
                break;    
            case "p->q":
                dtm.addColumn("p->q");
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                for(int i=0;i<4;i++){
                    switch(i){
                        case 0:
                            dat[0]="V";
                            dat[1]="V";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                        case 1:
                            dat[0]="V";
                            dat[1]="F";
                            dat[2]="F";
                            dtm.addRow(dat);
                        break;
                        case 2:
                            dat[0]="F";
                            dat[1]="V";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                        case 3:
                            dat[0]="F";
                            dat[1]="F";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                    }
                }
                break;
            case "p<->q":
                dtm.addColumn("p<->q");
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                dtm.removeRow(0);
                for(int i=0;i<4;i++){
                    switch(i){
                        case 0:
                            dat[0]="V";
                            dat[1]="V";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                        case 1:
                            dat[0]="V";
                            dat[1]="F";
                            dat[2]="F";
                            dtm.addRow(dat);
                        break;
                        case 2:
                            dat[0]="F";
                            dat[1]="V";
                            dat[2]="F";
                            dtm.addRow(dat);
                        break;
                        case 3:
                            dat[0]="F";
                            dat[1]="F";
                            dat[2]="V";
                            dtm.addRow(dat);
                        break;
                    }
                }
                break;    
                
        }
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        lbEcu.setText("");
        
        btnBi.setVisible(true);
        btnConcicional.setVisible(true);
        btnConjuncion.setVisible(true);
        btnDisyuncion.setVisible(true);
        btnNegacion.setVisible(true);
        
        btnBorrar.setVisible(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablasVerdad().setVisible(true);
            }
        });
    }
    
    public void guardar(String cero,String uno,String dos,String tres,String cuatro){
        vector[0]=cero;
        vector[1]=uno;
        vector[2]=dos;
        vector[3]=tres;
        vector[4]=cuatro;
        dtm.addRow(vector);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBi;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConcicional;
    private javax.swing.JButton btnConjuncion;
    private javax.swing.JButton btnDisyuncion;
    private javax.swing.JButton btnNegacion;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEcu;
    private miSwing.miEtiqueta miEtiqueta1;
    private miSwing.miEtiqueta miEtiqueta2;
    private javax.swing.JTable miTabla;
    private miSwing.miTitulo miTitulo1;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
