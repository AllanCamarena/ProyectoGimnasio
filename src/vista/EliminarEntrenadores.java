
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
import modelo.Entrenador;

public class EliminarEntrenadores extends javax.swing.JFrame {

        public Connection cn;
        public Statement stmt;
        public ResultSet rs;
        //clase entrenador genera objEntrenador para tratamiento de informacion
        
        Entrenador objEntrenador = new Entrenador();
        
    public EliminarEntrenadores() {
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
        btnRegresarMenu = new javax.swing.JButton();
        btnRevisarActualizaciones2 = new javax.swing.JButton();
        panEliminar = new javax.swing.JPanel();
        lblSubtitulo = new javax.swing.JLabel();
        txtIngresarId = new javax.swing.JTextField();
        btnEliminarEntrenador = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Eliminar entrenador del gym");

        btnRegresarMenu.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresarMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnRegresarMenu.setText("Regresar al menu");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        btnRevisarActualizaciones2.setBackground(new java.awt.Color(204, 255, 204));
        btnRevisarActualizaciones2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRevisarActualizaciones2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listo.png"))); // NOI18N
        btnRevisarActualizaciones2.setText("Revisar Actualizaciones");
        btnRevisarActualizaciones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActualizaciones2ActionPerformed(evt);
            }
        });

        panEliminar.setBackground(new java.awt.Color(255, 204, 204));
        panEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar entrenadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubtitulo.setText("Ingresa el ID del entrenador que deseas eliminar");

        btnEliminarEntrenador.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminarEntrenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnEliminarEntrenador.setText("Eliminar entrenador");
        btnEliminarEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEntrenadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEliminarLayout = new javax.swing.GroupLayout(panEliminar);
        panEliminar.setLayout(panEliminarLayout);
        panEliminarLayout.setHorizontalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminarEntrenador)
                .addGap(125, 125, 125))
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGroup(panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtIngresarId, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEliminarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblSubtitulo)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panEliminarLayout.setVerticalGroup(
            panEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblSubtitulo)
                .addGap(43, 43, 43)
                .addComponent(txtIngresarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnEliminarEntrenador)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrenador3.png"))); // NOI18N

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addComponent(btnRegresarMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRevisarActualizaciones2)
                        .addGap(74, 74, 74))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addComponent(panEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(lblImagen)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(59, 59, 59)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRevisarActualizaciones2)
                    .addComponent(btnRegresarMenu))
                .addGap(22, 22, 22))
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

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        MenuAdmin ventanaAdministrador = new MenuAdmin();
        ventanaAdministrador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void btnRevisarActualizaciones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActualizaciones2ActionPerformed
        RegistroEntrenadores ventanaConsulta = new RegistroEntrenadores();
        ventanaConsulta.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRevisarActualizaciones2ActionPerformed

    private void btnEliminarEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEntrenadorActionPerformed
               int confirmaBaja;
        
        try {
            conectarBase();
            int idEntrenadorBaja = Integer.parseInt(txtIngresarId.getText());
            confirmaBaja= stmt.executeUpdate("DELETE FROM entrenadores where id ='"+idEntrenadorBaja+"'");
            
            if (confirmaBaja==1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el ID del entrenador \n\n"+idEntrenadorBaja+ "\nVerifica Consulta");
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe el id del entrenador");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 5 de BD para Baja: \n\n" + ex);
        }
    }//GEN-LAST:event_btnEliminarEntrenadorActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEntrenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEntrenadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarEntrenador;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnRevisarActualizaciones2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panEliminar;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JTextField txtIngresarId;
    // End of variables declaration//GEN-END:variables
}
