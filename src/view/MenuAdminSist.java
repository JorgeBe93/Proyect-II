/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuAdminSist.java
 *
 * Created on 14/07/2015, 03:36:05 PM
 */

package view;

import bean.AuditoriaSistema;
import bean.Rol;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import static view.RolEliminar.tf_identi;

/**
 *
 * @author Jorge
 */
public class MenuAdminSist extends javax.swing.JFrame {
    public static int opcion=0;

    /** Creates new form MenuAdminSist */
    public MenuAdminSist() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_rol = new javax.swing.JMenu();
        mItem_crearR = new javax.swing.JMenuItem();
        mItem_editarR = new javax.swing.JMenuItem();
        mItem_eliminarR = new javax.swing.JMenuItem();
        mItem_buscarR = new javax.swing.JMenuItem();
        menu_usuario = new javax.swing.JMenu();
        mitem_regis_usuario = new javax.swing.JMenuItem();
        mitem_editarusuario = new javax.swing.JMenuItem();
        mitem_eliminarusuario = new javax.swing.JMenuItem();
        miItem_buscarUsuario = new javax.swing.JMenuItem();
        menu_auditoria = new javax.swing.JMenu();
        menu_salir = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Administrador del Sistema");

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setForeground(new java.awt.Color(0, 153, 255));

        menu_rol.setBackground(new java.awt.Color(204, 204, 204));
        menu_rol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_rol.setText("Administrar Rol");
        menu_rol.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        menu_rol.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menu_rol.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        mItem_crearR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mItem_crearR.setText("Crear Rol");
        mItem_crearR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_crearR);

        mItem_editarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        mItem_editarR.setText("Editar Rol");
        mItem_editarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_editarR);

        mItem_eliminarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        mItem_eliminarR.setText("Eliminar Rol");
        mItem_eliminarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_eliminarR);

        mItem_buscarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        mItem_buscarR.setText("Buscar Rol");
        mItem_buscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarRActionPerformed(evt);
            }
        });
        menu_rol.add(mItem_buscarR);

        jMenuBar1.add(menu_rol);

        menu_usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_usuario.setText("Administrar Usuario");
        menu_usuario.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        mitem_regis_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-student.png"))); // NOI18N
        mitem_regis_usuario.setText("Registrar Usuario");
        mitem_regis_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_regis_usuarioActionPerformed(evt);
            }
        });
        menu_usuario.add(mitem_regis_usuario);

        mitem_editarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarusuario.png"))); // NOI18N
        mitem_editarusuario.setText("Editar Usuario");
        mitem_editarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_editarusuarioActionPerformed(evt);
            }
        });
        menu_usuario.add(mitem_editarusuario);

        mitem_eliminarusuario.setText("Eliminar Usuario");
        mitem_eliminarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_eliminarusuarioActionPerformed(evt);
            }
        });
        menu_usuario.add(mitem_eliminarusuario);

        miItem_buscarUsuario.setText("Buscar Usuario");
        miItem_buscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miItem_buscarUsuarioActionPerformed(evt);
            }
        });
        menu_usuario.add(miItem_buscarUsuario);

        jMenuBar1.add(menu_usuario);

        menu_auditoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_auditoria.setText("Ver Auditoría de Sistema");
        menu_auditoria.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        menu_auditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_auditoriaMouseClicked(evt);
            }
        });
        menu_auditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_auditoriaActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_auditoria);

        menu_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_salir.setText("Salir");
        menu_salir.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salirActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItem_crearRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearRActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Crear Rol";
        RolCreate.main(args);
    }//GEN-LAST:event_mItem_crearRActionPerformed

    private void mItem_buscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarRActionPerformed
        // TODO add your handling code here:
        opcion=3;
        String args[]=new String[1];
        args[0]="Buscar Rol";
        RolBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarRActionPerformed

    private void mItem_eliminarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarRActionPerformed
        // TODO add your handling code here:
        opcion=2;
         String args[]=new String[1];
        args[0]="Buscar Rol";
        RolBuscar.main(args);
    }//GEN-LAST:event_mItem_eliminarRActionPerformed

    private void mItem_editarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarRActionPerformed
        // TODO add your handling code here:
        opcion=1;
         String args[]=new String[1];
        args[0]="Buscar Rol";
        RolBuscar.main(args);
    }//GEN-LAST:event_mItem_editarRActionPerformed

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

    private void menu_auditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_auditoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_auditoriaActionPerformed

    private void menu_auditoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_auditoriaMouseClicked
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Auditoría de Sistema";
        VerAuditoriaSistema.main(args);
    }//GEN-LAST:event_menu_auditoriaMouseClicked

    private void mitem_regis_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_regis_usuarioActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Registrar usuario";
        UsuarioCreate.main(args);
    }//GEN-LAST:event_mitem_regis_usuarioActionPerformed

    private void miItem_buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miItem_buscarUsuarioActionPerformed
        // TODO add your handling code here:
        opcion = 3;
        String args[]=new String[1];
        args[0]="Buscar usuario";
        UsuarioBuscar.main(args);
    }//GEN-LAST:event_miItem_buscarUsuarioActionPerformed

    private void mitem_editarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_editarusuarioActionPerformed
        // TODO add your handling code here:
        opcion = 1;
        String args[]=new String[1];
        args[0]="Editar usuario";
        UsuarioBuscar.main(args);
    }//GEN-LAST:event_mitem_editarusuarioActionPerformed

    private void mitem_eliminarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_eliminarusuarioActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        opcion = 2;
        String args[]=new String[1];
        args[0]="Eliminar usuario";
        UsuarioBuscar.main(args);
    }//GEN-LAST:event_mitem_eliminarusuarioActionPerformed

    private void menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_salirActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new MenuAdminSist();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null);
               frame.setTitle(args[0]);
               frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem mItem_buscarR;
    private javax.swing.JMenuItem mItem_crearR;
    private javax.swing.JMenuItem mItem_editarR;
    private javax.swing.JMenuItem mItem_eliminarR;
    private javax.swing.JMenu menu_auditoria;
    private javax.swing.JMenu menu_rol;
    private javax.swing.JMenu menu_salir;
    private javax.swing.JMenu menu_usuario;
    private javax.swing.JMenuItem miItem_buscarUsuario;
    private javax.swing.JMenuItem mitem_editarusuario;
    private javax.swing.JMenuItem mitem_eliminarusuario;
    private javax.swing.JMenuItem mitem_regis_usuario;
    // End of variables declaration//GEN-END:variables

}
