/**
 *
 * @author Allan
 */
package modelo;

public class usuario  extends Materiales{//inicia clase
    
    String nombre;
    String apellido;
    String edad;
    String estatura;
    String peso;
    
    
  //contructor vacio

    public usuario() {
    }
    
    //constructor local

    public usuario(String nombre, String apellido, String edad, String estatura, String peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
    
    //constructor super

    public usuario(String nombre, String apellido, String edad, String estatura, String peso, int id, String titulo) {
        super(id, titulo);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
    
    
    
    
    
}//termina clase
