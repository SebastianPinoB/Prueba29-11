package Vista;

import Controlador.ControladorCliente;
import Modelo.Cliente;
import javax.swing.table.DefaultTableModel;

public class ListarClientes extends javax.swing.JFrame {

    public ListarClientes() {
        initComponents();
        mostrarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarClientes = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblListarClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Contacto", "Direccion", "Tipo Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListarClientes);
        if (tblListarClientes.getColumnModel().getColumnCount() > 0) {
            tblListarClientes.getColumnModel().getColumn(0).setResizable(false);
            tblListarClientes.getColumnModel().getColumn(1).setResizable(false);
            tblListarClientes.getColumnModel().getColumn(2).setResizable(false);
            tblListarClientes.getColumnModel().getColumn(3).setResizable(false);
            tblListarClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnVolver)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListarClientes;
    // End of variables declaration//GEN-END:variables

    public void mostrarClientes(){
        DefaultTableModel dtm = (DefaultTableModel) tblListarClientes.getModel();
        dtm.setNumRows(0);
        ControladorCliente cc = new ControladorCliente();
        for(int i=0; i < cc.obtenerClientes().size(); i++){
            dtm.addRow(new Object[]{
                cc.obtenerClientes().get(i).getRut(),
                cc.obtenerClientes().get(i).getNombre(),
                cc.obtenerClientes().get(i).getNumeroContacto(),
                cc.obtenerClientes().get(i).getDireccion(),
                cc.obtenerClientes().get(i).getTipoCliente(),
            });
        }

    }
    
}
