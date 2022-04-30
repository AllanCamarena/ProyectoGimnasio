/*
    clase hija
 */
package modelo;

/**
 *
 * @author Allan
 */
public class Nutricion extends Materiales{//inicia clase
    
    int numNutri;
    String nombreDieta;
    String descripcion;
    String tiempo;
    
    //constructor vacio

    public Nutricion() {
    }
    
    //constructor con super

    public Nutricion(int numNutri, String nombreDieta, String descripcion, String tiempo) {
        this.numNutri = numNutri;
        this.nombreDieta = nombreDieta;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    public Nutricion(int numNutri, String nombreDieta, String descripcion, String tiempo, int id, String titulo) {
        super(id, titulo);
        this.numNutri = numNutri;
        this.nombreDieta = nombreDieta;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }
    
    
    //gets y sets

    public int getNumNutri() {
        return numNutri;
    }

    public void setNumNutri(int numNutri) {
        this.numNutri = numNutri;
    }

    public String getNombreDieta() {
        return nombreDieta;
    }

    public void setNombreDieta(String nombreDieta) {
        this.nombreDieta = nombreDieta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
    
}//termina
