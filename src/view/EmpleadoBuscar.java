/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Empleado;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vladimir
 */
public class EmpleadoBuscar extends javax.swing.JFrame {
    private int fila;
    Date fecha= new Date(); 
    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy");

    /**
     * Creates new form EmpleadoBuscar
     */
    public EmpleadoBuscar() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empleado e");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        panel_BuscarRol = new javax.swing.JPanel();
        lbl_BuscarRol = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado}"));
        columnBinding.setColumnName("Empleado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedula}"));
        columnBinding.setColumnName("Cedula");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellido}"));
        columnBinding.setColumnName("Apellido");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCargo.nombre}"));
        columnBinding.setColumnName("Cargo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaNacimiento}"));
        columnBinding.setColumnName("Nacimiento");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefono}"));
        columnBinding.setColumnName("Telefono");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${direccion}"));
        columnBinding.setColumnName("Direccion");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoJefe.cedula}"));
        columnBinding.setColumnName("Jefe");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaIngreso}"));
        columnBinding.setColumnName("Ingreso");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(7).setPreferredWidth(150);
            masterTable.getColumnModel().getColumn(8).setPreferredWidth(150);
        }

        panel_BuscarRol.setBackground(new java.awt.Color(0, 153, 255));
        panel_BuscarRol.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarRol.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarRol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarRol.setText("Buscar Empleado");

        javax.swing.GroupLayout panel_BuscarRolLayout = new javax.swing.GroupLayout(panel_BuscarRol);
        panel_BuscarRol.setLayout(panel_BuscarRolLayout);
        panel_BuscarRolLayout.setHorizontalGroup(
            panel_BuscarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarRolLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(lbl_BuscarRol)
                .addGap(216, 216, 216))
        );
        panel_BuscarRolLayout.setVerticalGroup(
            panel_BuscarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarRolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_BuscarRol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleado", "Cedula", "Nombre", "Apellido", "Cargo", "Jefe", " " }));
        list_filtros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                list_filtrosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                list_filtrosFocusLost(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        btn_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_buscarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lbl_valor)
                .addGap(18, 18, 18)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_buscar)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(387, 387, 387))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_BuscarRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_BuscarRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btn_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        char ch;
        if (list_filtros.getSelectedItem()=="Jefe" 
                || list_filtros.getSelectedItem()=="Empleado"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
        if (list_filtros.getSelectedItem()=="Nombre"
            || list_filtros.getSelectedItem()=="Apellido" || list_filtros.getSelectedItem()=="Cargo" ){
                ch=evt.getKeyChar();
                if(Character.isDigit(ch)){
                    getToolkit().beep();
                    evt.consume();
                }
        }

    }//GEN-LAST:event_tf_valorKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (list_filtros.getSelectedItem()=="Nombre"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                        + "WHERE nombre LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> r = query.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nombre inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(r);
            }
            else if (list_filtros.getSelectedItem()=="Apellido"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                        + "WHERE apellido LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> r = query.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Apellido inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(r);
            }
            else if(list_filtros.getSelectedItem()=="Cedula"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                        + "WHERE cedula LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cedula Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Empleado"){
                query=entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
                query.setParameter("codigoEmpleado", Integer.parseInt(tf_valor.getText()));
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Empleado Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Cargo"){
                query = entityManager.createNativeQuery( "SELECT * FROM empleado e "
                    + "INNER JOIN cargo c "
                    + "on e.codigoCargo = c.codigoCargo "
                    + "WHERE c.nombre like '%"
                    +tf_valor.getText() + "%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No se han encontrado registros para el cargo", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Jefe"){
                //query=entityManager.createNamedQuery("Empleado.findByCedula");
                //query.setParameter("cedula", tf_valor.getText());
                query = entityManager.createNativeQuery( "SELECT * FROM empleado e "
                    + "INNER JOIN empleado j "
                    + "on e.codigoJefe = j.codigoEmpleado "
                    + "WHERE j.cedula like '%"
                    +tf_valor.getText() + "%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cedula Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_masterTableMouseClicked

    private void list_filtrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusGained
        // TODO add your handling code here:
                tf_valor.setText(null);

    }//GEN-LAST:event_list_filtrosFocusGained

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void list_filtrosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_list_filtrosFocusLost

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
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new EmpleadoBuscar();
                frame.setTitle("Buscar Empleado");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_BuscarRol;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.Empleado> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_BuscarRol;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

        private Empleado obtenerEmpleado(int fila) {
            EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
            EntityManager ema = fact.createEntityManager(); 
            Query clienteQuery;
            clienteQuery = ema.createNamedQuery("Empleado.findByCodigoEmpleado");
            clienteQuery.setParameter("codigoEmpleado", Integer.parseInt(masterTable.getValueAt(fila, 0).toString()) );
            Empleado empleado = null;
            try{
               empleado = (Empleado)clienteQuery.getSingleResult();
               System.out.println(empleado);
            }catch(javax.persistence.NoResultException e){
                System.out.println(empleado);
            }
            ema.close();
            return empleado;
        }
}
