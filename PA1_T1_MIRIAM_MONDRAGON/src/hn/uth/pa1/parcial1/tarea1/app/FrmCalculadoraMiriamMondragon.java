/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.tarea1.app;

import hn.uth.pa1.parcial1.tarea1.app.objetos.OperacionMiriamMondragon;
import javax.swing.JOptionPane;

/**
 *
 * @author Miriam
 */
public class FrmCalculadoraMiriamMondragon extends javax.swing.JFrame {

    /**
     * Creates new form FrmCalculadora
     */
    public FrmCalculadoraMiriamMondragon() {
        initComponents();
        FrmBienvenidaMiriamMondragon frameBienvenida = new FrmBienvenidaMiriamMondragon();
        lblNombre.setText(frameBienvenida.nombre);
        actualizarHistorial();
        lblCalulosRealizados.setText(String.valueOf(operacionControllerMiriamMondragon.tamanoLista()));
    }
    
    public static double a = 0.0;
    public static double b = 0.0;
    public static double resultado = 0.0;
    OperacionMiriamMondragon operacionActual;
    public static int filaSeleccionada = -1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCalculos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblCalulosRealizados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();
        btnQuitar = new javax.swing.JButton();
        lblA = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        lblHistorial = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSumar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        lblOperaciones = new javax.swing.JLabel();
        lblSaludo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setTitle("Calculador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCalculos.setText("Calculos Realizados:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora");

        lblCalulosRealizados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCalulosRealizados.setForeground(new java.awt.Color(0, 153, 102));
        lblCalulosRealizados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalulosRealizados.setText(" ");

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        tblHistorial.setForeground(new java.awt.Color(102, 102, 102));
        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Operación:", "Resultado", "Signo:"
            }
        ));
        tblHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblHistorial.setGridColor(new java.awt.Color(153, 153, 153));
        tblHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHistorialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHistorial);

        btnQuitar.setBackground(new java.awt.Color(153, 153, 153));
        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        lblA.setText("A:");

        lblResultado.setText("Resultado:");

        lblRespuesta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRespuesta.setForeground(new java.awt.Color(0, 153, 102));
        lblRespuesta.setText(" ");

        lblHistorial.setText("Historial: ");

        lblB.setText("B:");

        btnActualizar.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(153, 153, 153));
        btnSumar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(153, 153, 153));
        btnDividir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(153, 153, 153));
        btnRestar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(153, 153, 153));
        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnPotencia.setBackground(new java.awt.Color(153, 153, 153));
        btnPotencia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPotencia.setText("^");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        lblOperaciones.setText("Operaciones:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblOperaciones)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblOperaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblA)
                    .addComponent(lblB)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResultado)
                        .addGap(18, 18, 18)
                        .addComponent(lblRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtA)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHistorial)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lblCalculos))
                                            .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(lblCalulosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblA)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblB)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultado)
                            .addComponent(lblRespuesta)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnQuitar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCalculos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCalulosRealizados))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        lblSaludo.setText("Buen día ");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 153, 102));
        lblNombre.setText(" ");

        btnRegresar.setBackground(new java.awt.Color(153, 153, 153));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblSaludo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(42, 42, 42))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(lblNombre)
                    .addComponent(lblSaludo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        if(comprobacion(txtA.getText(), txtB.getText()) == true){
            a = Double.parseDouble(txtA.getText());
            b = Double.parseDouble(txtB.getText());
            resultado = a + b;
            lblRespuesta.setText(String.valueOf(resultado));
            
            operacionActual = new OperacionMiriamMondragon(a, b, "+", resultado);
        }else {
            lblRespuesta.setText("");
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        // TODO add your handling code here:
        if(comprobacion(txtA.getText(), txtB.getText()) == true){
            a = Double.parseDouble(txtA.getText());
            b = Double.parseDouble(txtB.getText());
            resultado = a - b;
            lblRespuesta.setText(String.valueOf(resultado));
            
            operacionActual = new OperacionMiriamMondragon(a, b, "-", resultado);
        }else {
            lblRespuesta.setText("");
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
        if(comprobacion(txtA.getText(), txtB.getText()) == true){
            a = Double.parseDouble(txtA.getText());
            b = Double.parseDouble(txtB.getText());
            if(b != 0){
                resultado = a / b;
                lblRespuesta.setText(String.valueOf(resultado));
                
                operacionActual = new OperacionMiriamMondragon(a, b, "/", resultado);
            }else{
                lblRespuesta.setText("No Definido");
            }
        }else {
            lblRespuesta.setText("");
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
       if(comprobacion(txtA.getText(), txtB.getText()) == true){
            a = Double.parseDouble(txtA.getText());
            b = Double.parseDouble(txtB.getText());
            resultado = a * b;
            lblRespuesta.setText(String.valueOf(resultado));
            
            operacionActual = new OperacionMiriamMondragon(a, b, "*", resultado);
        }else {
            lblRespuesta.setText("");
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        // TODO add your handling code here:
        if(comprobacion(txtA.getText(), txtB.getText()) == true){
            a = Double.parseDouble(txtA.getText());
            b = Double.parseDouble(txtB.getText());
            resultado = Math.pow(a, b);
            lblRespuesta.setText(String.valueOf(resultado));
            
            operacionActual = new OperacionMiriamMondragon(a, b, "^", resultado);
        }else {
            lblRespuesta.setText("");
        }
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void tblHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHistorialMouseClicked
        // TODO add your handling code here:
        filaSeleccionada = tblHistorial.getSelectedRow();
        //System.out.println(filaSeleccionada);
    }//GEN-LAST:event_tblHistorialMouseClicked

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // TODO add your handling code here:
        operacionControllerMiriamMondragon.borrarOperacion(filaSeleccionada);
        filaSeleccionada = -1;
        actualizarHistorial();
        lblCalulosRealizados.setText(String.valueOf(operacionControllerMiriamMondragon.tamanoLista()));
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if(filaSeleccionada == -1 && operacionActual != null){
            operacionControllerMiriamMondragon.agregarOperacionLista(operacionActual);
            actualizarHistorial();
        }else{
            operacionControllerMiriamMondragon.reescribirOperacion(filaSeleccionada, operacionActual);
            filaSeleccionada = -1;
            actualizarHistorial();
        }
        lblCalulosRealizados.setText(String.valueOf(operacionControllerMiriamMondragon.tamanoLista()));
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculadoraMiriamMondragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadoraMiriamMondragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadoraMiriamMondragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadoraMiriamMondragon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadoraMiriamMondragon().setVisible(true);
            }
        });
    }
    
    private boolean comprobacion(String texto1, String texto2){
        boolean esNumero = false;
        try {
            Double.parseDouble(texto1);
            Double.parseDouble(texto2);
            esNumero = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Debe ingresar un número en cada campo");
        }
        return esNumero;
    }
    
    private void actualizarHistorial(){
        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            operacionControllerMiriamMondragon.getListaOperacionesComoArreglo(),
            new String [] {
                "Operación", "Resultado", "Signo"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblCalculos;
    private javax.swing.JLabel lblCalulosRealizados;
    private javax.swing.JLabel lblHistorial;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblHistorial;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    // End of variables declaration//GEN-END:variables
}
