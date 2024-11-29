
package Vista;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniListar = new javax.swing.JMenuItem();
        mniAgregar = new javax.swing.JMenuItem();
        mniEditar = new javax.swing.JMenuItem();
        mniEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Gestion de autos");

        mniListar.setText("Listar");
        mniListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarActionPerformed(evt);
            }
        });
        jMenu1.add(mniListar);

        mniAgregar.setText("Agregar");
        mniAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(mniAgregar);

        mniEditar.setText("Editar");
        mniEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditarActionPerformed(evt);
            }
        });
        jMenu1.add(mniEditar);

        mniEliminar.setText("Eliminar");
        mniEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(mniEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mniSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarActionPerformed
        ListarClientes listar = new ListarClientes();
        listar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniListarActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarActionPerformed
        AgregarClientes agregar = new AgregarClientes();
        agregar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniAgregarActionPerformed

    private void mniEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditarActionPerformed
        BuscarCliente editar = new BuscarCliente();
        editar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniEditarActionPerformed

    private void mniEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminarActionPerformed
        EliminarCliente ec = new EliminarCliente();
        ec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAgregar;
    private javax.swing.JMenuItem mniEditar;
    private javax.swing.JMenuItem mniEliminar;
    private javax.swing.JMenuItem mniListar;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables
}
