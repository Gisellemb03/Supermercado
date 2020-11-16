/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author gisellemb
 */
public class productos {
    String nombre;
    int cantidad;
    float precio;
    productos enlace;
//    double total;

    public productos(String nombre, int cantidad, double precio, productos enlace, double total) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = (float) precio;
        this.enlace = enlace;
//        this.total = total;
    }

    

    public productos() {
    }

    productos(productos entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

  

    public productos getEnlace() {
        return enlace;
    }

    public void setEnlace(productos enlace) {
        this.enlace = enlace;
    }
        
    
}
