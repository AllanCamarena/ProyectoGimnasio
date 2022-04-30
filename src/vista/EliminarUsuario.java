
package vista;

import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL    DDL,DML,DCL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import modelo.usuario;

public class EliminarUsuario extends javax.swing.JFrame {

     public Connection cn;
        public Statement stmt;
        public ResultSet rs;
    
        usuario objUsuario = new usuario(); //objeto para n Usuarios
   
    public EliminarUsuario() {
        initComponents();
         setLocationRelativeTo(null);//centra ventana
    }
    
          public void conectarBase(){//Inicia metodo
    try{ //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bdisGym","uisGym","udl12345GYM");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nMARQS'GYM");
            stmt=cn.createStatement();//genera sentencias sobre objetos de base de datos
    }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de base de datos 1: \n"+ ex);
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de base de datos 2:"+ e);
     }
    }//termina metodo

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panEliminarUsuario = new javax.swing.JPanel();
        lblEliminarUsuario = new javax.swing.JLabel();
        txtEliminarUsuario = new javax.swing.JTextField();
        btnElliminarUsuario = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        btnRegresaralMenu = new javax.swing.JButton();
        btnRevisarActualizaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Eliminar usuario del Gym");

        panEliminarUsuario.setBackground(new java.awt.Color(255, 102, 102));
        panEliminarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elimina al usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblEliminarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEliminarUsuario.setText("Elimina a cualquier usuario por su ID");

        btnElliminarUsuario.setBackground(new java.awt.Color(255, 153, 153));
        btnElliminarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnElliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnElliminarUsuario.setText("Eliminar");
        btnElliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElliminarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEliminarUsuarioLayout = new javax.swing.GroupLayout(panEliminarUsuario);
        panEliminarUsuario.setLayout(panEliminarUsuarioLayout);
        panEliminarUsuarioLayout.setHorizontalGroup(
            panEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarUsuarioLayout.createSequentialGroup()
                .addGroup(panEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEliminarUsuarioLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEliminarUsuarioLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblEliminarUsuario))
                    .addGroup(panEliminarUsuarioLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnElliminarUsuario)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        panEliminarUsuarioLayout.setVerticalGroup(
            panEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarUsuarioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblEliminarUsuario)
                .addGap(51, 51, 51)
                .addComponent(txtEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnElliminarUsuario)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarusuario.png"))); // NOI18N

        btnRegresaralMenu.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresaralMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresaralMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnRegresaralMenu.setText("Regresar al menu");
        btnRegresaralMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresaralMenuActionPerformed(evt);
            }
        });

        btnRevisarActualizaciones.setBackground(new java.awt.Color(255, 255, 153));
        btnRevisarActualizaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRevisarActualizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listo.png"))); // NOI18N
        btnRevisarActualizaciones.setText("Revisar Actualizaciones");
        btnRevisarActualizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActualizacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(lblImagen)
                .addGap(88, 88, 88))
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnRegresaralMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRevisarActualizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(panEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblImagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresaralMenu)
                    .addComponent(btnRevisarActualizaciones))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRevisarActualizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActualizacionesActionPerformed
        ConsultaUsuario ventanaConsulta = new ConsultaUsuario();
        ventanaConsulta.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRevisarActualizacionesActionPerformed

    private void btnRegresaralMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaralMenuActionPerformed
       MenuAdmin ventanaAdministrador = new MenuAdmin();
        ventanaAdministrador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresaralMenuActionPerformed

    private void btnElliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElliminarUsuarioActionPerformed
         int confirmaBaja;
        
        try {
            conectarBase();
            int idUsuario = Integer.parseInt(txtEliminarUsuario.getText());
            confirmaBaja= stmt.executeUpdate("DELETE FROM usuario where id ='"+idUsuario+"'");
            
            if (confirmaBaja==1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el ID del usuario \n\n"+idUsuario+ "\nVerifica Consulta");
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe el id del entrenador");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 5 de BD para Baja: \n\n" + ex);
        }
    }//GEN-LAST:event_btnElliminarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElliminarUsuario;
    private javax.swing.JButton btnRegresaralMenu;
    private javax.swing.JButton btnRevisarActualizaciones;
    private javax.swing.JLabel lblEliminarUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panEliminarUsuario;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JTextField txtEliminarUsuario;
    // End of variables declaration//GEN-END:variables
}
