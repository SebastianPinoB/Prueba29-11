package Vista;

import BD.Conexion;
import java.sql.PreparedStatement;

public class AgregarClientes extends javax.swing.JFrame {

    public AgregarClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTipoCliente = new javax.swing.JTextField();
        btnLimpiarCampos = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Rut");

        jLabel3.setText("Nombre");

        jLabel4.setText("Numero de contacto");

        jLabel5.setText("Direccion");

        jLabel6.setText("Tipo de cliente");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLimpiarCampos.setText("Limpiar");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnLimpiarCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRut)
                    .addComponent(txtNombre)
                    .addComponent(txtNumero)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(52, 52, 52)
                        .addComponent(btnVolver))
                    .addComponent(txtDireccion)
                    .addComponent(txtTipoCliente))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiarCampos))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarCliente();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    public void agregarCliente(){
        String query = "INSERT INTO CLIENTE (`rut`, `nombre`, `numeroContacto`, `direccion`, `tipoCliente`) VALUES (?,?,?,?,?);";
        Conexion cx = new Conexion();
        cx.conectar();
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(query);
            st.setString(1, this.txtRut.getText());
            st.setString(2, this.txtNombre.getText());
            st.setString(3, this.txtNumero.getText());
            st.setString(4, this.txtDireccion.getText());
            st.setString(5, this.txtTipoCliente.getText());
            st.executeUpdate();
            System.out.println("Ingresado Correctamente");
            this.limpiarCampos();
        } catch (Exception e) {
            System.out.println("Error al agregar clientes: " + e.getMessage());
        }
    }
    
    public void limpiarCampos(){
        this.txtRut.setText("");
        this.txtNombre.setText("");
        this.txtNumero.setText("");
        this.txtDireccion.setText("");
        this.txtTipoCliente.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTipoCliente;
    // End of variables declaration//GEN-END:variables
}
