/*
 Clase Padre
 */
package modelo;

/**
 *
 * @author Allan Garcia
 */
public class Materiales {//inicia clase
        //atributos
    
    int id;
    String titulo;
    
    //constructor vacio
    public Materiales() {
       
    }
    
    //constructor de parametros

    public Materiales(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    //gets y sets

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
