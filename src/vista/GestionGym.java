/**
 *
 * @author Allan Garcia
 */

package vista;

//librerias de conexion
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
import modelo.Rutinas;
import modelo.usuario;

public class GestionGym extends javax.swing.JFrame {
    
    //objetos de conexion
       public Connection cn;
        public Statement stmt;
        public ResultSet rs;

        //clase usuario genera objUsuario para tratamiento de ifnormacion
        
        usuario objUsuario = new usuario(); //objeto para n Usuarios
        
        //clase entrenador genera objEntrenador para tratamiento de informacion
        
        Entrenador objEntrenador = new Entrenador();
        
        //clase Rutina genera objRutina para tratamiento de ifnormacion
        
        Rutinas objRutina = new Rutinas();
   
    public GestionGym() {//inicia constructor
        initComponents();
        setLocationRelativeTo(null);//centra ventana
    }//termina constructor
    
    //metodo para conectar a BD Mysql
    
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

        panGeneral = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        jpanPrincipal = new javax.swing.JTabbedPane();
        panRegistrarUsuario = new javax.swing.JPanel();
        lblCapturaDatos = new javax.swing.JLabel();
        panDatosNecesarios = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblEstatura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegresarMenu = new javax.swing.JButton();
        panVerUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panEditarBuscarUsuarios = new javax.swing.JPanel();
        panEliminarUsuario = new javax.swing.JPanel();
        lblIngresarIdUsuario = new javax.swing.JLabel();
        txtEliminarUsuario = new javax.swing.JTextField();
        btnEliminarUsuario = new javax.swing.JButton();
        lblIdEditarUsuario = new javax.swing.JLabel();
        lblNombreEditarUsuario = new javax.swing.JLabel();
        lblApellidoEditarUsuario = new javax.swing.JLabel();
        lblEdadEditarUsuario = new javax.swing.JLabel();
        lblEstaturaEditarUsuario = new javax.swing.JLabel();
        lblPesoEditarUsuario = new javax.swing.JLabel();
        txtIdEditarUsuario = new javax.swing.JTextField();
        txtNombreEditarUsuario = new javax.swing.JTextField();
        txtApellidoEditarUsuario = new javax.swing.JTextField();
        txtEdadEditarUsuario = new javax.swing.JTextField();
        txtEstaturaEditarUsuario = new javax.swing.JTextField();
        txtPesoEditarUsuario = new javax.swing.JTextField();
        btnEditarUsuario = new javax.swing.JButton();
        btnBuscarUsuarioId = new javax.swing.JButton();
        btnRegresarMenu1 = new javax.swing.JButton();
        panRegistrarRutina = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cboPartesCuerpo = new javax.swing.JComboBox<>();
        lblResultado = new javax.swing.JLabel();
        panRegistrarRutinaNueva = new javax.swing.JPanel();
        lblNombreRutina = new javax.swing.JLabel();
        lblNumeroRutina = new javax.swing.JLabel();
        lblTipoRutina = new javax.swing.JLabel();
        lblRepeticionesRutina = new javax.swing.JLabel();
        txtNombreRutina = new javax.swing.JTextField();
        txtNumeroRutina = new javax.swing.JTextField();
        txtTipoRutina = new javax.swing.JTextField();
        txtRepeticionesRutina = new javax.swing.JTextField();
        lblIdRutina = new javax.swing.JLabel();
        txtIdRutina = new javax.swing.JTextField();
        btnLimpiarRegistroRutina = new javax.swing.JButton();
        btnRegistrarRutinaNueva = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnRegresarMenu2 = new javax.swing.JButton();
        panVerRutinas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtConsultaRutinas = new javax.swing.JTable();
        panEditarBuscarRutinas = new javax.swing.JPanel();
        panEliminarRutina = new javax.swing.JPanel();
        btnEliminarRutina = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtEliminarRutina = new javax.swing.JTextField();
        btnEditarRutina = new javax.swing.JButton();
        btnBuscarRutina = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarEditarRutinaId = new javax.swing.JTextField();
        txtBuscarEditarRutinaNumero = new javax.swing.JTextField();
        txtBuscarEditarRutinaNombreRutina = new javax.swing.JTextField();
        txtBuscarEditarRutinaTipo = new javax.swing.JTextField();
        txtBuscarEditarRutinaRepeticiones = new javax.swing.JTextField();
        btnConsultarRutinas = new javax.swing.JButton();
        btnImprimirPdf = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnRegresarMenu3 = new javax.swing.JButton();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panGeneral.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Gestion del MARQS'GYM SA de CV");

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSubtitulo.setText("Bienvenido a la interfaz  del gimnasio MARQS'GYM");

        jpanPrincipal.setBackground(new java.awt.Color(255, 255, 204));

        panRegistrarUsuario.setBackground(new java.awt.Color(204, 255, 204));

        lblCapturaDatos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCapturaDatos.setText("Captura los datos del nuevo usuario");

        panDatosNecesarios.setBackground(new java.awt.Color(255, 255, 102));
        panDatosNecesarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Necesarios:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setText("Id:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellido.setText("Apellido:");

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdad.setText("Edad:");

        lblEstatura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEstatura.setText("Estatura:");

        lblPeso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPeso.setText("Peso:");

        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEstatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 204));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDatosNecesariosLayout = new javax.swing.GroupLayout(panDatosNecesarios);
        panDatosNecesarios.setLayout(panDatosNecesariosLayout);
        panDatosNecesariosLayout.setHorizontalGroup(
            panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosNecesariosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtEdad)
                    .addComponent(txtNombre)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panDatosNecesariosLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        panDatosNecesariosLayout.setVerticalGroup(
            panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosNecesariosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(lblEdad))
                .addGap(52, 52, 52)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstatura)
                    .addComponent(lblPeso))
                .addGap(40, 40, 40)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panDatosNecesariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img1.png"))); // NOI18N

        btnRegresarMenu.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresarMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnRegresarMenu.setText("Cerrar Sesion");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistrarUsuarioLayout = new javax.swing.GroupLayout(panRegistrarUsuario);
        panRegistrarUsuario.setLayout(panRegistrarUsuarioLayout);
        panRegistrarUsuarioLayout.setHorizontalGroup(
            panRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarUsuarioLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarUsuarioLayout.createSequentialGroup()
                        .addComponent(panDatosNecesarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblCapturaDatos)
                        .addGap(340, 340, 340))))
            .addGroup(panRegistrarUsuarioLayout.createSequentialGroup()
                .addComponent(btnRegresarMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panRegistrarUsuarioLayout.setVerticalGroup(
            panRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCapturaDatos)
                .addGroup(panRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panDatosNecesarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnRegresarMenu))
                    .addGroup(panRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jpanPrincipal.addTab("Registrar Usuario", panRegistrarUsuario);

        panVerUsuarios.setBackground(new java.awt.Color(204, 255, 204));

        jtConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        btnActualizar.setBackground(new java.awt.Color(51, 204, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Consultar Usuarios");

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Imprimir Lista de usuarios");

        panEditarBuscarUsuarios.setBackground(new java.awt.Color(255, 255, 102));
        panEditarBuscarUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar/Buscar usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        panEliminarUsuario.setBackground(new java.awt.Color(255, 204, 204));
        panEliminarUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblIngresarIdUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIngresarIdUsuario.setText("Ingresa el ID del usuario que deseas eliminar");

        btnEliminarUsuario.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEliminarUsuarioLayout = new javax.swing.GroupLayout(panEliminarUsuario);
        panEliminarUsuario.setLayout(panEliminarUsuarioLayout);
        panEliminarUsuarioLayout.setHorizontalGroup(
            panEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarUsuarioLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(panEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarUsuarioLayout.createSequentialGroup()
                        .addComponent(lblIngresarIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarUsuarioLayout.createSequentialGroup()
                        .addComponent(btnEliminarUsuario)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarUsuarioLayout.createSequentialGroup()
                        .addComponent(txtEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        panEliminarUsuarioLayout.setVerticalGroup(
            panEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIngresarIdUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarUsuario)
                .addGap(70, 70, 70))
        );

        lblIdEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdEditarUsuario.setText("Id:");

        lblNombreEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreEditarUsuario.setText("Nombre:");

        lblApellidoEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidoEditarUsuario.setText("Apellido:");

        lblEdadEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEdadEditarUsuario.setText("Edad:");

        lblEstaturaEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEstaturaEditarUsuario.setText("Estatura:");

        lblPesoEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPesoEditarUsuario.setText("Peso:");

        btnEditarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuarioId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarUsuarioId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarUsuarioId.setText("Buscar por ID");
        btnBuscarUsuarioId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEditarBuscarUsuariosLayout = new javax.swing.GroupLayout(panEditarBuscarUsuarios);
        panEditarBuscarUsuarios.setLayout(panEditarBuscarUsuariosLayout);
        panEditarBuscarUsuariosLayout.setHorizontalGroup(
            panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarBuscarUsuariosLayout.createSequentialGroup()
                .addComponent(panEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panEditarBuscarUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panEditarBuscarUsuariosLayout.createSequentialGroup()
                        .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdEditarUsuario)
                            .addComponent(lblNombreEditarUsuario)
                            .addComponent(lblApellidoEditarUsuario)
                            .addComponent(lblEdadEditarUsuario)
                            .addComponent(lblEstaturaEditarUsuario)
                            .addComponent(lblPesoEditarUsuario))
                        .addGap(96, 96, 96)
                        .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstaturaEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panEditarBuscarUsuariosLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnEditarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarUsuarioId)
                        .addGap(63, 63, 63))))
        );
        panEditarBuscarUsuariosLayout.setVerticalGroup(
            panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarBuscarUsuariosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEditarUsuario)
                    .addComponent(txtIdEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEditarUsuario)
                    .addComponent(txtNombreEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoEditarUsuario)
                    .addComponent(txtApellidoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEditarUsuario)
                    .addComponent(txtEdadEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstaturaEditarUsuario)
                    .addComponent(txtEstaturaEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesoEditarUsuario)
                    .addComponent(txtPesoEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditarBuscarUsuariosLayout.createSequentialGroup()
                        .addGap(18, 106, Short.MAX_VALUE)
                        .addComponent(panEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditarBuscarUsuariosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panEditarBuscarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarUsuarioId)
                            .addComponent(btnEditarUsuario))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnRegresarMenu1.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresarMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresarMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnRegresarMenu1.setText("Cerrar Sesion");
        btnRegresarMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerUsuariosLayout = new javax.swing.GroupLayout(panVerUsuarios);
        panVerUsuarios.setLayout(panVerUsuariosLayout);
        panVerUsuariosLayout.setHorizontalGroup(
            panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerUsuariosLayout.createSequentialGroup()
                .addGroup(panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVerUsuariosLayout.createSequentialGroup()
                        .addGroup(panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panVerUsuariosLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panVerUsuariosLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(83, 83, 83)
                                .addGroup(panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panVerUsuariosLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))
                                    .addComponent(jLabel1)))
                            .addComponent(btnRegresarMenu1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerUsuariosLayout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(panEditarBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panVerUsuariosLayout.setVerticalGroup(
            panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panEditarBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panVerUsuariosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(panVerUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresarMenu1))
        );

        jpanPrincipal.addTab("Consultar Usuarios", panVerUsuarios);

        panRegistrarRutina.setBackground(new java.awt.Color(204, 255, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Selecciona la parte del cuerpo que quieres ejercitar");

        cboPartesCuerpo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboPartesCuerpo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Basica", "Intermedia", "Avanzada", "Hombros", "Biceps", "Triceps", "Gluteos", "Abdomen", "Antebrazos", "Pecho", "Espalda", "Pierna" }));
        cboPartesCuerpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPartesCuerpoActionPerformed(evt);
            }
        });

        lblResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panRegistrarRutinaNueva.setBackground(new java.awt.Color(255, 204, 255));
        panRegistrarRutinaNueva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar nueva rutina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lblNombreRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreRutina.setText("Nombre de la rutina:");

        lblNumeroRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumeroRutina.setText("Numero:");

        lblTipoRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoRutina.setText("Tipo");

        lblRepeticionesRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRepeticionesRutina.setText("Repeticiones:");

        lblIdRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIdRutina.setText("Id:");

        btnLimpiarRegistroRutina.setBackground(new java.awt.Color(255, 204, 255));
        btnLimpiarRegistroRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiarRegistroRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRegistroRutinaActionPerformed(evt);
            }
        });

        btnRegistrarRutinaNueva.setBackground(new java.awt.Color(0, 204, 204));
        btnRegistrarRutinaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnRegistrarRutinaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRutinaNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistrarRutinaNuevaLayout = new javax.swing.GroupLayout(panRegistrarRutinaNueva);
        panRegistrarRutinaNueva.setLayout(panRegistrarRutinaNuevaLayout);
        panRegistrarRutinaNuevaLayout.setHorizontalGroup(
            panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarRutinaNuevaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombreRutina, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(lblNumeroRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTipoRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRepeticionesRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIdRutina))
                .addGap(45, 45, 45)
                .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumeroRutina, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtIdRutina)
                    .addComponent(txtNombreRutina)
                    .addComponent(txtTipoRutina)
                    .addComponent(txtRepeticionesRutina))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarRutinaNuevaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRegistrarRutinaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(btnLimpiarRegistroRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        panRegistrarRutinaNuevaLayout.setVerticalGroup(
            panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarRutinaNuevaLayout.createSequentialGroup()
                .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panRegistrarRutinaNuevaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarRutinaNueva))
                    .addGroup(panRegistrarRutinaNuevaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdRutina)
                            .addComponent(txtIdRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroRutina))
                        .addGap(53, 53, 53)
                        .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreRutina)
                            .addComponent(txtNombreRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoRutina)
                            .addComponent(txtTipoRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(panRegistrarRutinaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRepeticionesRutina)
                            .addComponent(txtRepeticionesRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnLimpiarRegistroRutina)))
                .addGap(26, 26, 26))
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img5.png"))); // NOI18N

        btnRegresarMenu2.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresarMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresarMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnRegresarMenu2.setText("Cerrar Sesion");
        btnRegresarMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistrarRutinaLayout = new javax.swing.GroupLayout(panRegistrarRutina);
        panRegistrarRutina.setLayout(panRegistrarRutinaLayout);
        panRegistrarRutinaLayout.setHorizontalGroup(
            panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                .addGroup(panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(100, 100, 100)
                                .addComponent(cboPartesCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                                .addComponent(panRegistrarRutinaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrarRutinaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegresarMenu2))))))
                    .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(240, 240, 240))
        );
        panRegistrarRutinaLayout.setVerticalGroup(
            panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cboPartesCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panRegistrarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panRegistrarRutinaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panRegistrarRutinaLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel11))))
                    .addComponent(btnRegresarMenu2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jpanPrincipal.addTab("Registrar rutina", panRegistrarRutina);

        panVerRutinas.setBackground(new java.awt.Color(204, 255, 204));

        jtConsultaRutinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtConsultaRutinas);

        panEditarBuscarRutinas.setBackground(new java.awt.Color(153, 255, 153));
        panEditarBuscarRutinas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar/Editar rutina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        panEliminarRutina.setBackground(new java.awt.Color(255, 204, 204));
        panEliminarRutina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar Rutina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnEliminarRutina.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminarRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnEliminarRutina.setText("Eliminar Rutina");
        btnEliminarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRutinaActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(153, 153, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ingresa el  Id de la rutina que deseas eliminar");

        javax.swing.GroupLayout panEliminarRutinaLayout = new javax.swing.GroupLayout(panEliminarRutina);
        panEliminarRutina.setLayout(panEliminarRutinaLayout);
        panEliminarRutinaLayout.setHorizontalGroup(
            panEliminarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEliminarRutinaLayout.createSequentialGroup()
                .addGroup(panEliminarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEliminarRutinaLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel17))
                    .addGroup(panEliminarRutinaLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(txtEliminarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEliminarRutinaLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnEliminarRutina)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panEliminarRutinaLayout.setVerticalGroup(
            panEliminarRutinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEliminarRutinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txtEliminarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarRutina)
                .addGap(26, 26, 26))
        );

        btnEditarRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarRutina.setText("Editar");
        btnEditarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRutinaActionPerformed(evt);
            }
        });

        btnBuscarRutina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarRutina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarRutina.setText("Buscar por ID");
        btnBuscarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRutinaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Id:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Numero de Rutina:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Nombre de la rutina:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Tipo:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Repeticiones:");

        javax.swing.GroupLayout panEditarBuscarRutinasLayout = new javax.swing.GroupLayout(panEditarBuscarRutinas);
        panEditarBuscarRutinas.setLayout(panEditarBuscarRutinasLayout);
        panEditarBuscarRutinasLayout.setHorizontalGroup(
            panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panEliminarRutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panEditarBuscarRutinasLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEditarRutina)
                        .addComponent(jLabel16)))
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditarBuscarRutinasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBuscarEditarRutinaId, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtBuscarEditarRutinaNumero)
                            .addComponent(txtBuscarEditarRutinaNombreRutina)
                            .addComponent(txtBuscarEditarRutinaTipo)
                            .addComponent(txtBuscarEditarRutinaRepeticiones))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarBuscarRutinasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarRutina)
                        .addGap(46, 46, 46))))
        );
        panEditarBuscarRutinasLayout.setVerticalGroup(
            panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarBuscarRutinasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBuscarEditarRutinaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBuscarEditarRutinaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBuscarEditarRutinaNombreRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtBuscarEditarRutinaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtBuscarEditarRutinaRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(panEditarBuscarRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarRutina)
                    .addComponent(btnBuscarRutina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(panEliminarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnConsultarRutinas.setBackground(new java.awt.Color(102, 204, 255));
        btnConsultarRutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        btnConsultarRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarRutinasActionPerformed(evt);
            }
        });

        btnImprimirPdf.setBackground(new java.awt.Color(255, 153, 153));
        btnImprimirPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Buscar Rutinas");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Imprimir PDF");

        btnRegresarMenu3.setBackground(new java.awt.Color(255, 204, 204));
        btnRegresarMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresarMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        btnRegresarMenu3.setText("Cerrar Sesion");
        btnRegresarMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerRutinasLayout = new javax.swing.GroupLayout(panVerRutinas);
        panVerRutinas.setLayout(panVerRutinasLayout);
        panVerRutinasLayout.setHorizontalGroup(
            panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerRutinasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVerRutinasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(panVerRutinasLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(btnConsultarRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImprimirPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)))
                .addComponent(panEditarBuscarRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panVerRutinasLayout.createSequentialGroup()
                .addComponent(btnRegresarMenu3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panVerRutinasLayout.setVerticalGroup(
            panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVerRutinasLayout.createSequentialGroup()
                .addGroup(panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVerRutinasLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarRutinas)
                            .addComponent(btnImprimirPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panVerRutinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVerRutinasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panEditarBuscarRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(btnRegresarMenu3))
        );

        jpanPrincipal.addTab("Consultar Rutinas", panVerRutinas);

        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo - copia.png"))); // NOI18N

        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo - copia.png"))); // NOI18N

        javax.swing.GroupLayout panGeneralLayout = new javax.swing.GroupLayout(panGeneral);
        panGeneral.setLayout(panGeneralLayout);
        panGeneralLayout.setHorizontalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblImagen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(390, 390, 390))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                        .addComponent(lblSubtitulo)
                        .addGap(361, 361, 361))))
            .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGeneralLayout.createSequentialGroup()
                    .addContainerGap(933, Short.MAX_VALUE)
                    .addComponent(lblImagen2)
                    .addGap(106, 106, 106)))
        );
        panGeneralLayout.setVerticalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panGeneralLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(lblSubtitulo))
                    .addComponent(lblImagen1))
                .addGap(14, 14, 14)
                .addComponent(jpanPrincipal))
            .addGroup(panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panGeneralLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblImagen2)
                    .addContainerGap(685, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        conectarBase();

        //try catch
        try {
            //declaración de un modelo para almacenar toda la consulta de la tabla
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsulta.setModel(modeloDatos);

            rs = stmt.executeQuery("SELECT * FROM usuario");

            //Imprimir y contar columnas
            ResultSetMetaData rsmd =  rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Id ");
            modeloDatos.addColumn("Nombre");
            modeloDatos.addColumn("Apellido");
            modeloDatos.addColumn("Edad");
            modeloDatos.addColumn("Estatura");
            modeloDatos.addColumn("Peso");

            //Imprimir filas
            while (rs.next()) {
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                    fila[i] = rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4 de BD para Alta: \n\n" + ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtId.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText(null);
        this.txtEdad.setText(null);
        this.txtEstatura.setText(null);
        this.txtPeso.setText(null);

        this.txtId.requestFocus();//posiciona cursor
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        conectarBase();
        //objeto libro toma metodo set de acceso a el dato y se parsea o convierte de objeto a primitivo.
        objUsuario.setId(Integer.parseInt(txtId.getText()));
        objUsuario.setNombre(txtNombre.getText());
        objUsuario.setApellido(txtApellido.getText());
        objUsuario.setEdad(txtEdad.getText());
        objUsuario.setEstatura(txtEstatura.getText());
        objUsuario.setPeso(txtPeso.getText());

        //variable Objeto procesa instrucciones SQL para un INSERT.
        String altaLibro = "INSERT INTO usuario (`ID`,`nombre`,`apellido`,`edad`,`estatura`,`peso`) VALUES ('"+objUsuario.getId()+"','"+objUsuario.getNombre()+"','"+objUsuario.getApellido()+"','"+objUsuario.getEdad()+"','"+objUsuario.getEstatura()+"','"+objUsuario.getPeso()+"')";

        //ejecutar con estructura de control de tratamiento de errores try-catch
        try {
            stmt.executeUpdate(altaLibro);
            JOptionPane.showMessageDialog(null, "Registro Exitoso\n Usuario \n\n "+objUsuario.getNombre());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 3 de BD para Alta: \n\n" + e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
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
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void cboPartesCuerpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPartesCuerpoActionPerformed
       String mensaje = "La parte del cuerpo a ejercitar es ";
       mensaje= mensaje+cboPartesCuerpo.getSelectedItem().toString();
       lblResultado.setText(mensaje);
    }//GEN-LAST:event_cboPartesCuerpoActionPerformed

    private void btnRegistrarRutinaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRutinaNuevaActionPerformed
       conectarBase();
          //objeto libro toma metodo set de acceso a el dato y se parsea o convierte de objeto a primitivo.
        objRutina.setId(Integer.parseInt(txtIdRutina.getText()));
        objRutina.setNumRutina(Integer.parseInt(txtNumeroRutina.getText()));
        objRutina.setNombreRutina(txtNombreRutina.getText());
        objRutina.setTipo(txtTipoRutina.getText());
        objRutina.setRepeticiones(txtRepeticionesRutina.getText());

        //variable Objeto procesa instrucciones SQL para un INSERT.
        String altaRepeticiones = "INSERT INTO rutina (`ID`,`numRutina`,`nombreRutina`,`tipo`,`repeticiones`) VALUES ('"+objRutina.getId()+"','"+objRutina.getNumRutina()+"','"+objRutina.getNombreRutina()+"','"+objRutina.getTipo()+"','"+objRutina.getRepeticiones()+"')";

        //ejecutar con estructura de control de tratamiento de errores try-catch
        try {
            stmt.executeUpdate(altaRepeticiones);
            JOptionPane.showMessageDialog(null, "Registro Exitoso\n Rutina \n\n "+objRutina.getNumRutina());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 3 de BD para Alta: \n\n" + e);
        }
    }//GEN-LAST:event_btnRegistrarRutinaNuevaActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
       String actualizarUsuario = "";
            
            try {
                conectarBase();
            
            objUsuario.setId(Integer.parseInt(txtIdEditarUsuario.getText()));
            objUsuario.setNombre(txtNombreEditarUsuario.getText());
            objUsuario.setApellido(txtApellidoEditarUsuario.getText());
            objUsuario.setEdad(txtEdadEditarUsuario.getText());
            objUsuario.setEstatura(txtEstaturaEditarUsuario.getText());
            objUsuario.setPeso(txtPesoEditarUsuario.getText());
                    
            actualizarUsuario = "UPDATE usuario SET nombre = '"+objUsuario.getNombre()+"', apellido = '"+objUsuario.getApellido()+"',edad = '"+objUsuario.getEdad()+"',estatura = '"+objUsuario.getEstatura()+"',peso = '"+objUsuario.getPeso()+"' where id='"+ objUsuario.getId()+"' ";
            stmt.executeUpdate(actualizarUsuario);
            JOptionPane.showMessageDialog(null, "Datos del usuario actualizados \n de forma correcta\n\nVerifica consulta");
            
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error de base de datos 7 editar\n" + ex);
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnBuscarUsuarioIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioIdActionPerformed
          try {
            conectarBase();
            objUsuario.setId(Integer.parseInt(txtIdEditarUsuario.getText()));
            rs=stmt.executeQuery("SELECT * FROM usuario where id ='"+objUsuario.getId()+"'");
            JOptionPane.showMessageDialog(null, "Buscando Usuario.....");
            
            
            
            if (rs.next()==true) {
                txtNombreEditarUsuario.setText(rs.getString("nombre"));
                txtApellidoEditarUsuario.setText(rs.getString("apellido"));
                txtEdadEditarUsuario.setText(rs.getString("edad"));
                txtEstaturaEditarUsuario.setText(rs.getString("estatura"));
                txtPesoEditarUsuario.setText(rs.getString("peso"));
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe el ID del usuario");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error 6 de BD para editar: \n\n" + ex);
        }
    }//GEN-LAST:event_btnBuscarUsuarioIdActionPerformed

    private void btnConsultarRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarRutinasActionPerformed
            conectarBase();

        //try catch
        try {
            //declaración de un modelo para almacenar toda la consulta de la tabla
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsultaRutinas.setModel(modeloDatos);

            rs = stmt.executeQuery("SELECT * FROM rutina");

            //Imprimir y contar columnas
            ResultSetMetaData rsmd =  rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Id");
            modeloDatos.addColumn("#Rutina");
            modeloDatos.addColumn("Nombre de rutina");
            modeloDatos.addColumn("tipo");
            modeloDatos.addColumn("Repeticiones");

            //Imprimir filas
            while (rs.next()) {
                Object fila [] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                    fila[i] = rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4 de BD para Alta: \n\n" + ex);
        }
    }//GEN-LAST:event_btnConsultarRutinasActionPerformed

    private void btnLimpiarRegistroRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRegistroRutinaActionPerformed
            this.txtIdRutina.setText("");
            this.txtNumeroRutina.setText("");
            this.txtNombreRutina.setText(null);
            this.txtTipoRutina.setText(null);
            this.txtRepeticionesRutina.setText(null);

            this.txtId.requestFocus();//posiciona cursor      
    }//GEN-LAST:event_btnLimpiarRegistroRutinaActionPerformed

    private void btnBuscarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutinaActionPerformed
                try {
            conectarBase();
            objRutina.setId(Integer.parseInt(txtBuscarEditarRutinaId.getText()));
            rs=stmt.executeQuery("SELECT * FROM rutina where id ='"+objRutina.getId()+"'");
            JOptionPane.showMessageDialog(null, "Buscando rutina.....");
            
            
            
            if (rs.next()==true) {
                txtBuscarEditarRutinaNumero.setText(rs.getString("numRutina"));
                txtBuscarEditarRutinaNombreRutina.setText(rs.getString("nombreRutina"));
                txtBuscarEditarRutinaTipo.setText(rs.getString("tipo"));
                txtBuscarEditarRutinaRepeticiones.setText(rs.getString("repeticiones"));
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe el ID de la rutina");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error 6 de BD para editar: \n\n" + ex);
        }
    }//GEN-LAST:event_btnBuscarRutinaActionPerformed

    private void btnEditarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRutinaActionPerformed
            String actualizarRutina = "";
            
            try {
                conectarBase();
            
            objRutina.setId(Integer.parseInt(txtBuscarEditarRutinaId.getText()));
            objRutina.setNumRutina(Integer.parseInt(txtBuscarEditarRutinaNumero.getText()));
            objRutina.setNombreRutina(txtBuscarEditarRutinaNombreRutina.getText());
            objRutina.setTipo(txtBuscarEditarRutinaTipo.getText());
            objRutina.setRepeticiones(txtBuscarEditarRutinaRepeticiones.getText());
                    
            actualizarRutina = "UPDATE rutina SET numRutina = '"+objRutina.getNumRutina()+"', nombreRutina = '"+objRutina.getNombreRutina()+"',tipo = '"+objRutina.getTipo()+"',repeticiones = '"+objRutina.getRepeticiones()+"'where id='"+ objRutina.getId()+"'";
            stmt.executeUpdate(actualizarRutina);
            JOptionPane.showMessageDialog(null, "Datos de la rutina actualizados \n de forma correcta\n\nVerifica consulta");
            
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error de base de datos 7 editar\n" + ex);
        }
    }//GEN-LAST:event_btnEditarRutinaActionPerformed

    private void btnEliminarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutinaActionPerformed
           int confirmaBaja;
        
        try {
            conectarBase();
            int idRutina = Integer.parseInt(txtEliminarRutina.getText());
            confirmaBaja= stmt.executeUpdate("DELETE FROM rutina where id ='"+idRutina+"'");
            
            if (confirmaBaja==1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el ID de la rutina \n\n"+idRutina+ "\nVerifica Consulta");
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe el id de esa rutina");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 5 de BD para Baja: \n\n" + ex);
        }
    }//GEN-LAST:event_btnEliminarRutinaActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        Acceso ventanaEntrenador = new Acceso();
        ventanaEntrenador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void btnRegresarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu1ActionPerformed
        Acceso ventanaEntrenador = new Acceso();
        ventanaEntrenador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarMenu1ActionPerformed

    private void btnRegresarMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu2ActionPerformed
       Acceso ventanaEntrenador = new Acceso();
        ventanaEntrenador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarMenu2ActionPerformed

    private void btnRegresarMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu3ActionPerformed
        Acceso ventanaEntrenador = new Acceso();
        ventanaEntrenador.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarMenu3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(GestionGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionGym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionGym().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarRutina;
    private javax.swing.JButton btnBuscarUsuarioId;
    private javax.swing.JButton btnConsultarRutinas;
    private javax.swing.JButton btnEditarRutina;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarRutina;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnImprimirPdf;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarRegistroRutina;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarRutinaNueva;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnRegresarMenu1;
    private javax.swing.JButton btnRegresarMenu2;
    private javax.swing.JButton btnRegresarMenu3;
    private javax.swing.JComboBox<String> cboPartesCuerpo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jpanPrincipal;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JTable jtConsultaRutinas;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoEditarUsuario;
    private javax.swing.JLabel lblCapturaDatos;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdadEditarUsuario;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblEstaturaEditarUsuario;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdEditarUsuario;
    private javax.swing.JLabel lblIdRutina;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblIngresarIdUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreEditarUsuario;
    private javax.swing.JLabel lblNombreRutina;
    private javax.swing.JLabel lblNumeroRutina;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPesoEditarUsuario;
    private javax.swing.JLabel lblRepeticionesRutina;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTipoRutina;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panDatosNecesarios;
    private javax.swing.JPanel panEditarBuscarRutinas;
    private javax.swing.JPanel panEditarBuscarUsuarios;
    private javax.swing.JPanel panEliminarRutina;
    private javax.swing.JPanel panEliminarUsuario;
    private javax.swing.JPanel panGeneral;
    private javax.swing.JPanel panRegistrarRutina;
    private javax.swing.JPanel panRegistrarRutinaNueva;
    private javax.swing.JPanel panRegistrarUsuario;
    private javax.swing.JPanel panVerRutinas;
    private javax.swing.JPanel panVerUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoEditarUsuario;
    private javax.swing.JTextField txtBuscarEditarRutinaId;
    private javax.swing.JTextField txtBuscarEditarRutinaNombreRutina;
    private javax.swing.JTextField txtBuscarEditarRutinaNumero;
    private javax.swing.JTextField txtBuscarEditarRutinaRepeticiones;
    private javax.swing.JTextField txtBuscarEditarRutinaTipo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdadEditarUsuario;
    private javax.swing.JTextField txtEliminarRutina;
    private javax.swing.JTextField txtEliminarUsuario;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtEstaturaEditarUsuario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdEditarUsuario;
    private javax.swing.JTextField txtIdRutina;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEditarUsuario;
    private javax.swing.JTextField txtNombreRutina;
    private javax.swing.JTextField txtNumeroRutina;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPesoEditarUsuario;
    private javax.swing.JTextField txtRepeticionesRutina;
    private javax.swing.JTextField txtTipoRutina;
    // End of variables declaration//GEN-END:variables
}
