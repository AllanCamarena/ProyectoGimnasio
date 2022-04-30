/*
 Clase hija
 */
package modelo;

/**
 *
 * @author AllanGarcia
 */


public class Rutinas extends Materiales {//inicia clase
    //atributos
    int numRutina;
    String nombreRutina;
    String tipo;
    String repeticiones;
    
    //constructor vacio

    public Rutinas() {
    }
    
    //constructor local

    public Rutinas(int numRutina, String nombreRutina, String tipo, String repeticiones) {
        this.numRutina = numRutina;
        this.nombreRutina = nombreRutina;
        this.tipo = tipo;
        this.repeticiones = repeticiones;
    }

    //Constructor super
    public Rutinas(int numRutina, String nombreRutina, String tipo, String repeticiones, int id, String titulo) {
        super(id, titulo);
        this.numRutina = numRutina;
        this.nombreRutina = nombreRutina;
        this.tipo = tipo;
        this.repeticiones = repeticiones;
    }
    
    
    //gets y sets

    public int getNumRutina() {
        return numRutina;
    }

    public void setNumRutina(int numRutina) {
        this.numRutina = numRutina;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }
    
    
    
}//termina
