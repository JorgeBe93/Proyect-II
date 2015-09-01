/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

/**
 *
 * @author Jorge
 */
public class MenuAdminHotel extends javax.swing.JFrame {
    public static int opcion=0;

    /**
     * Creates new form MenuAdminHotel
     */
    public MenuAdminHotel() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menu_CategHabitacion = new javax.swing.JMenu();
        mItem_crearCH = new javax.swing.JMenuItem();
        mItem_editarCH = new javax.swing.JMenuItem();
        mItem_eliminarCH = new javax.swing.JMenuItem();
        mItem_buscar = new javax.swing.JMenuItem();
        menu_Habitacion = new javax.swing.JMenu();
        mItem_crearHabit = new javax.swing.JMenuItem();
        mItem_editarHabit = new javax.swing.JMenuItem();
        mItem_eliminarHabit = new javax.swing.JMenuItem();
        mItem_buscarHabit = new javax.swing.JMenuItem();
        menu_CategPS = new javax.swing.JMenu();
        mItem_crearCategPS = new javax.swing.JMenuItem();
        mItem_editarCategPS = new javax.swing.JMenuItem();
        mItem_eliminarCategPS = new javax.swing.JMenuItem();
        mItem_buscarCategPS = new javax.swing.JMenuItem();
        menu_PS = new javax.swing.JMenu();
        mItem_crearPS = new javax.swing.JMenuItem();
        mItem_editarPS = new javax.swing.JMenuItem();
        mItem_eliminarPS = new javax.swing.JMenuItem();
        mItem_buscarPS = new javax.swing.JMenuItem();
        menu_informePO = new javax.swing.JMenu();
        menu_empleado = new javax.swing.JMenu();
        mItem_crearEmpleado = new javax.swing.JMenuItem();
        mItem_editarEmpleado = new javax.swing.JMenuItem();
        mItem_eliminarEmpleado = new javax.swing.JMenuItem();
        mItem_buscarEmpleado = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menu_CategHabitacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_CategHabitacion.setText("Categoría de Habitación");

        mItem_crearCH.setText("Crear Categoría");
        mItem_crearCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearCHActionPerformed(evt);
            }
        });
        menu_CategHabitacion.add(mItem_crearCH);

        mItem_editarCH.setText("Editar Categoría");
        mItem_editarCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarCHActionPerformed(evt);
            }
        });
        menu_CategHabitacion.add(mItem_editarCH);

        mItem_eliminarCH.setText("Eliminar Categoría");
        mItem_eliminarCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarCHActionPerformed(evt);
            }
        });
        menu_CategHabitacion.add(mItem_eliminarCH);

        mItem_buscar.setText("Buscar Categoría");
        mItem_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarActionPerformed(evt);
            }
        });
        menu_CategHabitacion.add(mItem_buscar);

        jMenuBar1.add(menu_CategHabitacion);

        menu_Habitacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_Habitacion.setText("Habitación");
        menu_Habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_HabitacionActionPerformed(evt);
            }
        });

        mItem_crearHabit.setText("Crear Habitación");
        mItem_crearHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearHabitActionPerformed(evt);
            }
        });
        menu_Habitacion.add(mItem_crearHabit);

        mItem_editarHabit.setText("Editar Habitación");
        mItem_editarHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarHabitActionPerformed(evt);
            }
        });
        menu_Habitacion.add(mItem_editarHabit);

        mItem_eliminarHabit.setText("Eliminar Habitación");
        mItem_eliminarHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarHabitActionPerformed(evt);
            }
        });
        menu_Habitacion.add(mItem_eliminarHabit);

        mItem_buscarHabit.setText("Buscar Habitación");
        mItem_buscarHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarHabitActionPerformed(evt);
            }
        });
        menu_Habitacion.add(mItem_buscarHabit);

        jMenuBar1.add(menu_Habitacion);

        menu_CategPS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_CategPS.setText(" Categoría de P/S");

        mItem_crearCategPS.setText("Crear Categoría P/S");
        mItem_crearCategPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearCategPSActionPerformed(evt);
            }
        });
        menu_CategPS.add(mItem_crearCategPS);

        mItem_editarCategPS.setText("Modificar Categoría P/S");
        mItem_editarCategPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarCategPSActionPerformed(evt);
            }
        });
        menu_CategPS.add(mItem_editarCategPS);

        mItem_eliminarCategPS.setText("Eliminar Categoría P/S");
        mItem_eliminarCategPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarCategPSActionPerformed(evt);
            }
        });
        menu_CategPS.add(mItem_eliminarCategPS);

        mItem_buscarCategPS.setText("Buscar Categoría P/S");
        mItem_buscarCategPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mItem_buscarCategPSMouseClicked(evt);
            }
        });
        mItem_buscarCategPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarCategPSActionPerformed(evt);
            }
        });
        menu_CategPS.add(mItem_buscarCategPS);

        jMenuBar1.add(menu_CategPS);

        menu_PS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_PS.setText("Producto/Servicio");

        mItem_crearPS.setText("Registrar P/S");
        mItem_crearPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearPSActionPerformed(evt);
            }
        });
        menu_PS.add(mItem_crearPS);

        mItem_editarPS.setText("Editar P/S");
        mItem_editarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarPSActionPerformed(evt);
            }
        });
        menu_PS.add(mItem_editarPS);

        mItem_eliminarPS.setText("Eliminar P/S");
        mItem_eliminarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarPSActionPerformed(evt);
            }
        });
        menu_PS.add(mItem_eliminarPS);

        mItem_buscarPS.setText("Buscar P/S");
        mItem_buscarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarPSActionPerformed(evt);
            }
        });
        menu_PS.add(mItem_buscarPS);

        jMenuBar1.add(menu_PS);

        menu_informePO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_informePO.setText("Generar Informe  PO");
        menu_informePO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_informePOMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_informePO);

        menu_empleado.setText("Empleado");

        mItem_crearEmpleado.setText("Registrar Empleado");
        mItem_crearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearEmpleadoActionPerformed(evt);
            }
        });
        menu_empleado.add(mItem_crearEmpleado);

        mItem_editarEmpleado.setText("Editar Empleado");
        mItem_editarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarEmpleadoActionPerformed(evt);
            }
        });
        menu_empleado.add(mItem_editarEmpleado);

        mItem_eliminarEmpleado.setText("Eliminar Empleado");
        mItem_eliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarEmpleadoActionPerformed(evt);
            }
        });
        menu_empleado.add(mItem_eliminarEmpleado);

        mItem_buscarEmpleado.setText("Buscar Empleado");
        mItem_buscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarEmpleadoActionPerformed(evt);
            }
        });
        menu_empleado.add(mItem_buscarEmpleado);

        jMenuBar1.add(menu_empleado);

        menu_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_salir.setText("Cerrar Sesión");
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItem_crearCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearCHActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Crear Categoría de Habitación";
        CategHabitCreate.main(args);
    }//GEN-LAST:event_mItem_crearCHActionPerformed

    private void mItem_editarCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarCHActionPerformed
        // TODO add your handling code here:
        opcion=1;
        String args[]=new String[1];
        args[0]="Buscar Categoría de Habitación";
        CategHabitBuscar.main(args); 
    }//GEN-LAST:event_mItem_editarCHActionPerformed

    private void mItem_eliminarCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarCHActionPerformed
        // TODO add your handling code here:
        opcion=2;
        String args[]=new String[1];
        args[0]="Buscar Categoría de Habitación";
        CategHabitBuscar.main(args);
    }//GEN-LAST:event_mItem_eliminarCHActionPerformed

    private void mItem_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarActionPerformed
        // TODO add your handling code here:
        opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Categoría de Habitación";
        CategHabitBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarActionPerformed

    private void menu_HabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_HabitacionActionPerformed
     
    }//GEN-LAST:event_menu_HabitacionActionPerformed

    private void mItem_buscarHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarHabitActionPerformed
        // TODO add your handling code here:
        opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Habitación";
        HabitacionBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarHabitActionPerformed

    private void mItem_crearHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearHabitActionPerformed
        // TODO add your handling code here:
       
        String args[]=new String[1];
        args[0]="Crear Habitación";
        HabitacionCreate.main(args);
    }//GEN-LAST:event_mItem_crearHabitActionPerformed

    private void mItem_editarHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarHabitActionPerformed
        // TODO add your handling code here:
        opcion=1;
        String args[]=new String[1];
        args[0]="Buscar Habitación";
        HabitacionBuscar.main(args);
    }//GEN-LAST:event_mItem_editarHabitActionPerformed

    private void mItem_eliminarHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarHabitActionPerformed
        // TODO add your handling code here:
         opcion=2;
        String args[]=new String[1];
        args[0]="Buscar Habitación";
        HabitacionBuscar.main(args);
                                     
    }//GEN-LAST:event_mItem_eliminarHabitActionPerformed

    private void mItem_crearCategPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearCategPSActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Crear Categoría P/S";
        CategPSCreate.main(args);
    }//GEN-LAST:event_mItem_crearCategPSActionPerformed

    private void mItem_buscarCategPSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mItem_buscarCategPSMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mItem_buscarCategPSMouseClicked

    private void mItem_editarCategPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarCategPSActionPerformed
        // TODO add your handling code here:
         opcion=1;
        String args[]=new String[1];
        args[0]="Buscar Categoría P/S";
        CategPSBuscar.main(args);
    }//GEN-LAST:event_mItem_editarCategPSActionPerformed

    private void mItem_eliminarCategPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarCategPSActionPerformed
        // TODO add your handling code here:
         opcion=2;
        String args[]=new String[1];
        args[0]="Buscar Categoría P/S";
        CategPSBuscar.main(args);
    }//GEN-LAST:event_mItem_eliminarCategPSActionPerformed

    private void mItem_buscarCategPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarCategPSActionPerformed
        // TODO add your handling code here:
         opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Categoría P/S";
        CategPSBuscar.main(args);
     
    }//GEN-LAST:event_mItem_buscarCategPSActionPerformed

    private void mItem_crearPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearPSActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Registrar Producto/Servicio";
        ProdSerCreate.main(args);
        
    }//GEN-LAST:event_mItem_crearPSActionPerformed

    private void mItem_editarPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarPSActionPerformed
        // TODO add your handling code here:
        opcion=1;
        String args[]=new String[1];
        args[0]="Buscar Producto/Servicio";
        ProdSerBuscar.main(args);
    }//GEN-LAST:event_mItem_editarPSActionPerformed

    private void mItem_eliminarPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarPSActionPerformed
        // TODO add your handling code here:
        opcion=2;
        String args[]=new String[1];
        args[0]="Buscar Producto/Servicio";
        ProdSerBuscar.main(args);
    }//GEN-LAST:event_mItem_eliminarPSActionPerformed

    private void mItem_buscarPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarPSActionPerformed
        // TODO add your handling code here:
        opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Producto/Servicio";
        ProdSerBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarPSActionPerformed

    private void menu_informePOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_informePOMouseClicked
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Generar Informe de Pérdida de  Oportunidades";
        PerdidaOportunidades.main(args);
    }//GEN-LAST:event_menu_informePOMouseClicked

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
        // TODO add your handling code here:
        EntityManagerFactory fact=Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema= fact.createEntityManager();
        ema.getTransaction().begin();
        //registramos los datos necesarios para la auditoria
        AuditoriaSistema as=new AuditoriaSistema();
        as.setAccion("Cerro Sesion");
        as.setTabla("Ninguna");
        //trabajamos con la fecha
        Date fecha=new Date();
        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        as.setFechaHora(formato.format(fecha));
        as.setUsuario(LoginView.nombreUsuario);
        ema.persist(as);
        ema.getTransaction().commit();
        ema.close();
        this.dispose();
        String args[]=new String[1];
        args[0]="Ingreso al sistema";
        LoginView.main(args);
    }//GEN-LAST:event_menu_salirMouseClicked

    private void mItem_crearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearEmpleadoActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Registrar Empleado";
        EmpleadoRegistrar.main(args);
    }//GEN-LAST:event_mItem_crearEmpleadoActionPerformed

    private void mItem_editarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarEmpleadoActionPerformed
        // TODO add your handling code here:
        opcion=1;
        String args[]=new String[1];
        args[0]="Buscar Empleado";
        EmpleadoBuscar.main(args);
    }//GEN-LAST:event_mItem_editarEmpleadoActionPerformed

    private void mItem_eliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarEmpleadoActionPerformed
        // TODO add your handling code here:
        opcion=2;
        String args[]=new String[1];
        args[0]="Buscar Empleado";
        EmpleadoBuscar.main(args);
    }//GEN-LAST:event_mItem_eliminarEmpleadoActionPerformed

    private void mItem_buscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarEmpleadoActionPerformed
        // TODO add your handling code here:
        opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Empleado";
        EmpleadoBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdminHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new MenuAdminHotel();
                frame.setTitle("Menu Administrador del Hotel");
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mItem_buscar;
    private javax.swing.JMenuItem mItem_buscarCategPS;
    private javax.swing.JMenuItem mItem_buscarEmpleado;
    private javax.swing.JMenuItem mItem_buscarHabit;
    private javax.swing.JMenuItem mItem_buscarPS;
    private javax.swing.JMenuItem mItem_crearCH;
    private javax.swing.JMenuItem mItem_crearCategPS;
    private javax.swing.JMenuItem mItem_crearEmpleado;
    private javax.swing.JMenuItem mItem_crearHabit;
    private javax.swing.JMenuItem mItem_crearPS;
    private javax.swing.JMenuItem mItem_editarCH;
    private javax.swing.JMenuItem mItem_editarCategPS;
    private javax.swing.JMenuItem mItem_editarEmpleado;
    private javax.swing.JMenuItem mItem_editarHabit;
    private javax.swing.JMenuItem mItem_editarPS;
    private javax.swing.JMenuItem mItem_eliminarCH;
    private javax.swing.JMenuItem mItem_eliminarCategPS;
    private javax.swing.JMenuItem mItem_eliminarEmpleado;
    private javax.swing.JMenuItem mItem_eliminarHabit;
    private javax.swing.JMenuItem mItem_eliminarPS;
    private javax.swing.JMenu menu_CategHabitacion;
    private javax.swing.JMenu menu_CategPS;
    private javax.swing.JMenu menu_Habitacion;
    private javax.swing.JMenu menu_PS;
    private javax.swing.JMenu menu_empleado;
    private javax.swing.JMenu menu_informePO;
    private javax.swing.JMenu menu_salir;
    // End of variables declaration//GEN-END:variables
}
