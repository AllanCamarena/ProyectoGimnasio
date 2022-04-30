/**
 *
 * @author AllanGarcia
 */
package modelo;

public class Entrenador extends Materiales{//inicia clase
    
    int cedula;
    String nombre;
    String apellido;
    String profesion;
    String genero;
    String edad;
    String certificaciones;
    
    //constructor vacio

    public Entrenador() {
    }
    
    //constructor local

    public Entrenador(int cedula, String nombre, String apellido, String profesion, String genero, String edad, String certificaciones) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.genero = genero;
        this.edad = edad;
        this.certificaciones = certificaciones;
    }

        //constructor super
    public Entrenador(int cedula, String nombre, String apellido, String profesion, String genero, String edad, String certificaciones, int id, String titulo) {
        super(id, titulo);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.genero = genero;
        this.edad = edad;
        this.certificaciones = certificaciones;
    }

       //gets y sets
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }
    
    
    
}//termina
