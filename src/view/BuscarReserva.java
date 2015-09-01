/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Reserva;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vladimir
 */
public class BuscarReserva extends javax.swing.JFrame {
    public int fila;
    

    /**
     * Creates new form BuscarReserva
     */
    public BuscarReserva() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reserva r");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        masterTable.setToolTipText("");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoReserva}"));
        columnBinding.setColumnName("Reserva");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCliente.nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCliente.apellido}"));
        columnBinding.setColumnName("Apellido ");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantPersonas}"));
        columnBinding.setColumnName("Personas");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${checkIn}"));
        columnBinding.setColumnName("Check In");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${checkOut}"));
        columnBinding.setColumnName("Check Out");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numHabitacion.numero}"));
        columnBinding.setColumnName(" Habitación");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numHabitacion.codigoCategoria.nombre}"));
        columnBinding.setColumnName("Categoría");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoTotal}"));
        columnBinding.setColumnName("Monto Total");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${montoAbonado}"));
        columnBinding.setColumnName("Monto Abonado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numPresupuesto.numPresupuesto}"));
        columnBinding.setColumnName("Presupuesto");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            masterTable.getColumnModel().getColumn(9).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(10).setPreferredWidth(50);
        }

        panel_BuscarRol.setBackground(new java.awt.Color(0, 153, 255));
        panel_BuscarRol.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarRol.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarRol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarRol.setText("Buscar Reserva");

        javax.swing.GroupLayout panel_BuscarRolLayout = new javax.swing.GroupLayout(panel_BuscarRol);
        panel_BuscarRol.setLayout(panel_BuscarRolLayout);
        panel_BuscarRolLayout.setHorizontalGroup(
            panel_BuscarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarRolLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(lbl_BuscarRol)
                .addContainerGap(255, Short.MAX_VALUE))
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

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reserva", "Nombre", "Apellido", "Habitación", "Categoría", "CheckIn", "CheckOut" }));

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
                .addGap(78, 78, 78)
                .addComponent(lbl_valor)
                .addGap(18, 18, 18)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(53, 53, 53))
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_BuscarRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(btn_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panel_BuscarRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar)
                .addGap(21, 21, 21))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        char ch;
        if (list_filtros.getSelectedItem()=="Habitación" || list_filtros.getSelectedItem()=="Reserva"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
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
              query = entityManager.createNativeQuery( "SELECT * FROM reserva r "
                    + "INNER JOIN cliente c "
                    + "on r.codigoCliente = c.codigoCliente "
                    + "WHERE c.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", Reserva.class);
            List<Reserva> r = query.getResultList();
            if (r.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Nombre inexistente","Error",JOptionPane.ERROR_MESSAGE );
                 tf_valor.setText(null);
                  return;
            }
            list.clear();
            list.addAll(r);
            }
            else if (list_filtros.getSelectedItem()=="Apellido"){
              query = entityManager.createNativeQuery( "SELECT * FROM reserva r "
                    + "INNER JOIN cliente c "
                    + "on r.codigoCliente = c.codigoCliente "
                    + "WHERE c.apellido LIKE "
                    +"'%"+tf_valor.getText()+"%'", Reserva.class);
            List<Reserva> r = query.getResultList();
            if (r.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Apellido inexistente","Error",JOptionPane.ERROR_MESSAGE );
                 tf_valor.setText(null);
                  return;
            }
            list.clear();
            list.addAll(r);
            }
            else if(list_filtros.getSelectedItem()=="CheckIn"){
                 query=entityManager.createNativeQuery("SELECT * FROM reserva "
                         + "WHERE STR_TO_DATE(checkIn, '%d/%m/%Y') >= "
                    +"'"+tf_valor.getText()+"'", Reserva.class);
                 List<Reserva> a=query.getResultList();
                 if(a.size()==0){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                 }
                 list.clear();
                 list.addAll(a);
                 return;
             }
            else if(list_filtros.getSelectedItem()=="CheckOut"){
                 query=entityManager.createNativeQuery("SELECT * FROM reserva WHERE checkOut LIKE "
                    +"'%"+tf_valor.getText()+"%'", Reserva.class);
                 List<Reserva> a=query.getResultList();
                 if(a.size()==0){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                 }
                 list.clear();
                 list.addAll(a);
                 return;
             } 
            else if(list_filtros.getSelectedItem()=="Habitación"){
              query = entityManager.createNativeQuery( "SELECT * FROM reserva r "
                    + "INNER JOIN habitacion h "
                    + "on r.numHabitacion = h.numero "
                    + "WHERE r.numHabitacion = "
                    +tf_valor.getText(), Reserva.class);
                 List<Reserva> a=query.getResultList();
                 if(a.size()==0){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                 }
                 list.clear();
                 list.addAll(a);
                 return;
             }
            else if(list_filtros.getSelectedItem()=="Reserva"){
                query=entityManager.createNamedQuery("Reserva.findByCodigoReserva");
                query.setParameter("codigoReserva", Integer.parseInt(tf_valor.getText()));
                List<Reserva> r =query.getResultList();
                if(r.size()==0){
                     JOptionPane.showMessageDialog(null,"Codigo de Reserva inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_valor.setText(null);
                     return;
                }
                list.clear();
                list.addAll(r);
            }
            else if(list_filtros.getSelectedItem()=="Categoría"){
                 query=entityManager.createNativeQuery("SELECT * FROM reserva r "
                         +"INNER JOIN habitacion h "
                         +"ON r.numHabitacion=h.numero "
                         +"INNER JOIN categ_habitacion c "
                         +"ON h.codigoCategoria=c.codigoCategoria "
                         + "WHERE c.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", Reserva.class);
                 List<Reserva> a=query.getResultList();
                 if(a.isEmpty()){
                     JOptionPane.showMessageDialog(null,"No se han encontrado registros para la categoría de habitación", "Error",JOptionPane.ERROR_MESSAGE);
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
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
      
      switch (MenuRecepcionista.opcion){
          case 1:
                 fila = masterTable.getSelectedRow();
                 ReservaEditar.reserva = obtenerReserva(fila);
                 JFrame frame1=new ReservaEditar();
                 frame1.setVisible(true);
                 frame1.setTitle("Modificar Reserva");
                 frame1.setLocationRelativeTo(null);
                 frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                 this.dispose();
                 break;
          case 2:

                 fila = masterTable.getSelectedRow();
                 ReservaEliminar.reserva = obtenerReserva(fila);
                 JFrame frame2=new ReservaEliminar();
                 frame2.setVisible(true);
                 frame2.setTitle("Eliminar Reserva");
                 frame2.setLocationRelativeTo(null);
                 frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                 this.dispose();    
                 break;

          case 3:
              break;
      }
        
    }//GEN-LAST:event_masterTableMouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
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
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new BuscarReserva();
                frame.setVisible(true);
                frame.setTitle("Buscar Reserva");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
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
    private java.util.List<bean.Reserva> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_BuscarRol;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
        private Reserva obtenerReserva(int fila) {
            EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
            EntityManager ema = fact.createEntityManager(); 
            Query clienteQuery;
            clienteQuery = ema.createNamedQuery("Reserva.findByCodigoReserva");
            clienteQuery.setParameter("codigoReserva", Integer.parseInt(masterTable.getValueAt(fila, 0).toString()) );
            Reserva reserva = null;
            try{
               reserva = (Reserva)clienteQuery.getSingleResult();
               System.out.println(reserva);
            }catch(javax.persistence.NoResultException e){
                System.out.println(reserva);
            }
            ema.close();
            return reserva;
        }

}
