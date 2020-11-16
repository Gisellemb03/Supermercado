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
public class gestionProductos extends Generica <productos> {
    private productos cabeza;
    private productos anterior;
    private int tamaño;

    public gestionProductos(){
        cabeza = null;
        tamaño = 0;
    }

  
  public boolean esVacia(){
        return cabeza == null;
    }

    @Override
    public boolean insertarFinal(productos entrada) {
        productos nuevo = new productos(entrada);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            anterior.enlace = nuevo;
        }
        anterior = nuevo;
        return true;
    }

    @Override
    public boolean visualizar(productos pojo) {
        productos n;
        n = cabeza;
        while (n != null) {
            System.out.println(n.nombre + n.cantidad + n.precio );
            n = n.enlace;
        }
        return true;
    }
    
}
