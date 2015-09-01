/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Presupuesto;
import bean.Reserva;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class EliminarPresupuesto extends javax.swing.JFrame {
    private int resp;

    /**
     * Creates new form EliminarPresupuesto
     */
    public EliminarPresupuesto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_eliminarC = new javax.swing.JPanel();
        lbl_EliminarC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_in = new javax.swing.JLabel();
        tf_cliente = new javax.swing.JTextField();
        tf_out = new javax.swing.JTextField();
        tf_reserva = new javax.swing.JTextField();
        lbl_total = new javax.swing.JLabel();
        lbl_reserva = new javax.swing.JLabel();
        tf_in = new javax.swing.JTextField();
        lbl_out = new javax.swing.JLabel();
        tf_total = new javax.swing.JTextField();
        tf_numero = new javax.swing.JTextField();
        lbl_cliente = new javax.swing.JLabel();
        lbl_numero = new javax.swing.JLabel();
        tf_fecha = new javax.swing.JTextField();
        lbl_estado = new javax.swing.JLabel();
        tf_estado = new javax.swing.JTextField();
        tf_cedula = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_eliminarC.setBackground(new java.awt.Color(0, 153, 255));
        panel_eliminarC.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_EliminarC.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_EliminarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EliminarC.setText("Eliminar Presupuesto");

        javax.swing.GroupLayout panel_eliminarCLayout = new javax.swing.GroupLayout(panel_eliminarC);
        panel_eliminarC.setLayout(panel_eliminarCLayout);
        panel_eliminarCLayout.setHorizontalGroup(
            panel_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarCLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(lbl_EliminarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_eliminarCLayout.setVerticalGroup(
            panel_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_EliminarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_fecha.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_fecha.setText("Fecha Emisión:");

        lbl_in.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_in.setText("Check In:");

        tf_cliente.setEnabled(false);

        tf_out.setEnabled(false);

        tf_reserva.setEnabled(false);

        lbl_total.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_total.setText("Total Gs.:");

        lbl_reserva.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_reserva.setText("Reserva:");

        tf_in.setEnabled(false);

        lbl_out.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_out.setText("Check Out:");

        tf_total.setEnabled(false);

        tf_numero.setEnabled(false);

        lbl_cliente.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_cliente.setText("Cliente:");

        lbl_numero.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_numero.setText("Número de  Presupuesto:");

        tf_fecha.setEnabled(false);

        lbl_estado.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_estado.setText("Estado de Confirmación:");

        tf_estado.setEnabled(false);

        tf_cedula.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_numero)
                        .addGap(18, 18, 18)
                        .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(lbl_estado)
                                .addGap(18, 18, 18)
                                .addComponent(tf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(279, 279, 279)
                                    .addComponent(lbl_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_cedula)
                                    .addGap(19, 19, 19)
                                    .addComponent(tf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbl_reserva)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_in)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_in, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_out)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_out, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_total)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numero)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cliente)
                    .addComponent(tf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fecha)
                    .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estado)
                    .addComponent(tf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_reserva)
                    .addComponent(tf_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_in)
                    .addComponent(tf_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_out)
                    .addComponent(tf_out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_eliminar)
                .addGap(47, 47, 47)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_eliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_eliminarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panel_eliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        Date fecha=new Date();
        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String valor;
         resp=  JOptionPane.showConfirmDialog(null,"Desea eliminar el presupuesto?", "Confirmar Eliminar",JOptionPane.YES_NO_OPTION );
              if (resp==JOptionPane.YES_OPTION){
                  EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
                  EntityManager ema = fact.createEntityManager();
                  //eliminamos la reserva
                  Reserva r=ema.find(Reserva.class, Integer.parseInt(tf_reserva.getText()));
                  valor=r.toString();
                  ema.getTransaction().begin();
                  ema.remove(r);
                  ema.flush();
                  //auditoria de sistema para reserva
                   AuditoriaSistema as=new AuditoriaSistema();
                   as.setAccion("Eliminación");
                   as.setTabla("Reserva");
                   as.setAntes(valor);
                   as.setDespues("No hay cambios");
                   as.setFechaHora((formato.format(fecha)));
                   as.setUsuario("nadie");
                   ema.persist(as);
                   ema.flush();
                   valor=" ";
                  //eliminamos el presupuesto
                   Presupuesto p=ema.find(Presupuesto.class, Integer.parseInt(tf_numero.getText()));
                   valor=p.toString();
                   ema.remove(p);
                   ema.flush();
                   //auditoria de sistema para presupuesto
                   AuditoriaSistema a=new AuditoriaSistema();
                   a.setAccion("Eliminación");
                   a.setTabla("Presupuesto");
                   a.setAntes(valor);
                   a.setDespues("No hay cambios");
                   a.setFechaHora((formato.format(fecha)));
                   a.setUsuario("nadie");
                   ema.persist(a);
                   ema.getTransaction().commit();
                   ema.close();
                   JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
              }
              this.dispose();
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new EliminarPresupuesto();
                frame.setVisible(true);
                frame.setTitle("Eliminar Presupuesto");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_EliminarC;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_in;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_out;
    private javax.swing.JLabel lbl_reserva;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JPanel panel_eliminarC;
    public static javax.swing.JTextField tf_cedula;
    public static javax.swing.JTextField tf_cliente;
    public static javax.swing.JTextField tf_estado;
    public static javax.swing.JTextField tf_fecha;
    public static javax.swing.JTextField tf_in;
    public static javax.swing.JTextField tf_numero;
    public static javax.swing.JTextField tf_out;
    public static javax.swing.JTextField tf_reserva;
    public static javax.swing.JTextField tf_total;
    // End of variables declaration//GEN-END:variables
}
