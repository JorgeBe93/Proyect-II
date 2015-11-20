/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RecordarContrasenaView.java
 *
 * Created on 23/07/2015, 11:16:37 AM
 */

package view;

import bean.Correo;
import bean.Empleado;
import bean.Usuario;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class RecordarContrasenaView extends javax.swing.JFrame {
    private int limite=11;
    private char ch;
    private int id;
    private String emisor="hmsystem.pol@gmail.com";
    private String contrasenha="HMSYSTEM123";//contrasenha de acceso al servidor de correo
    private String receptor;
    private String password;// contrasenha del usuario para su acceso al sistema
    private String datos[]=new String[3];

    /** Creates new form RecordarContrasenaView */
    public RecordarContrasenaView() {
        initComponents();
        lbl_nombreEmpleado.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empleado e");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel1 = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        tf_codempl = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbl_nombreEmpleado = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        panel_Recordar = new javax.swing.JPanel();
        lbl_Recordar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_codigo.setBackground(new java.awt.Color(204, 204, 204));
        lbl_codigo.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lbl_codigo.setText("Ingrese  su Código de Usuario:");

        tf_codempl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codemplActionPerformed(evt);
            }
        });
        tf_codempl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_codemplKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codemplKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lbl_nombreEmpleado.setFont(new java.awt.Font("Candara", 1, 13)); // NOI18N
        lbl_nombreEmpleado.setText("Empleado: ");
        lbl_nombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl_nombreEmpleadoKeyPressed(evt);
            }
        });

        lbl_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_nombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lbl_nombreEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreEmpleado)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lbl_codigo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(tf_codempl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_codempl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel_Recordar.setBackground(new java.awt.Color(0, 153, 255));
        panel_Recordar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_Recordar.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_Recordar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Recordar.setText("Recordar Contraseña");

        javax.swing.GroupLayout panel_RecordarLayout = new javax.swing.GroupLayout(panel_Recordar);
        panel_Recordar.setLayout(panel_RecordarLayout);
        panel_RecordarLayout.setHorizontalGroup(
            panel_RecordarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_RecordarLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(lbl_Recordar)
                .addGap(93, 93, 93))
        );
        panel_RecordarLayout.setVerticalGroup(
            panel_RecordarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RecordarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Recordar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(panel_Recordar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panel_Recordar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here
        String args[]=new String[1];
        args[0]="Ingreso al Sistema";
        LoginView.main(args);            
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_codemplKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codemplKeyTyped
        // TODO add your handling code here:
         if(tf_codempl.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_codemplKeyTyped

    private void tf_codemplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codemplActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tf_codemplActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
         if(tf_codempl.getText().length()==0){
             JOptionPane.showMessageDialog(null,"No ha ingresado el Código de Usuario", "Error",JOptionPane.ERROR_MESSAGE);
             return;
        }else{

           id=Integer.parseInt(tf_codempl.getText());
            query = entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
            query.setParameter("codigoEmpleado",id);
            List<Empleado> e = query.getResultList();
            query=entityManager.createNamedQuery("Usuario.findByCodigoEmpleado");
            query.setParameter("codigoEmpleado", id);
            List<Usuario> u=query.getResultList();
            if(e.size()==0 ){
                JOptionPane.showMessageDialog(null,"Identificación de Usuario inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                tf_codempl.setText(null);
                 return;
            }else{
                receptor=e.get(0).getEmail();//obtenemos el email del usuario
                password=u.get(0).getPassword();
                datos[0]=receptor;//email de quien recibe el mensaje
                datos[1]="Recordatorio de contraseña";//tema del mensaje
                datos[2]="Su contraseña de acceso al sistema es:"+" "+"'"+password+"'"; //cuerpo del mensaje
                Correo c=new Correo();
               if(c.enviarCorreo(datos)){
                   JOptionPane.showMessageDialog(null,"Su contrasenha fue enviada exitosamente a su email", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                   
               }else{
                    JOptionPane.showMessageDialog(null,"Dirección de correo invalida", "Error",JOptionPane.ERROR_MESSAGE);
               }
               String args[]=new String[1];
               args[0]="Ingreso al Sistema";
               LoginView.main(args);
               this.dispose();
            }
        }
         this.dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void lbl_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_nombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_nombreKeyReleased

    private void lbl_nombreEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_nombreEmpleadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_nombreEmpleadoKeyPressed

    private void tf_codemplKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codemplKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            obtenerUsuario();
        }
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            lbl_nombreEmpleado.setVisible(false);
            lbl_nombre.setText(null);
        }
    }//GEN-LAST:event_tf_codemplKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new RecordarContrasenaView();
               frame.setTitle("Recordar Contraseña");
               frame.setLocationRelativeTo(null);
               frame.setVisible(true);
               Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
               frame.setIconImage(icon);
               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Recordar;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombreEmpleado;
    private java.util.List<bean.Empleado> list;
    private javax.swing.JPanel panel_Recordar;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_codempl;
    // End of variables declaration//GEN-END:variables
    private void obtenerUsuario(){
        query = entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
        query.setParameter("codigoEmpleado", Integer.parseInt(tf_codempl.getText()));
        try{
            Empleado empleado = (Empleado)query.getSingleResult();
            lbl_nombre.setText(empleado.getNombre() + " " + empleado.getApellido());
            lbl_nombreEmpleado.setVisible(true);
        }catch(javax.persistence.NoResultException e){
            JOptionPane.showMessageDialog(null, "Código de empleado inexistente",
                    "Error", JOptionPane.ERROR_MESSAGE);
            lbl_nombreEmpleado.setVisible(false);
            lbl_nombre.setText(null);
        }
            
    }
}
