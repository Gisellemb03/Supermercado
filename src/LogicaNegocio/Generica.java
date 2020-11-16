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
public abstract class Generica <T>{
    
    public abstract  boolean insertarFinal(T pojo);
    public abstract  boolean visualizar(T pojo);
    
    
}
