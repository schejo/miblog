/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.sergio.res.dao;

import java.util.ArrayList;
import java.util.List;
import org.sergio.res.modelo.Articulo;

/**
 *
 * @author Usuario
 */
public final class BaseDeDatos {
    private final static BaseDeDatos baseDeDatos = new BaseDeDatos();
    private final List<Articulo> listado =new ArrayList<>();
    
    private BaseDeDatos(){
        Articulo art1 = new Articulo(1,"articulo","contenido","Alexys");
        Articulo art2 = new Articulo(2,"articulo","contenido","Alexys");
        Articulo art3 = new Articulo(3,"articulo","contenido","Alexys");
        listado.add(art1);
        listado.add(art2);
        listado.add(art3);
    }
    
    public  static BaseDeDatos getInstancia(){
        return baseDeDatos;
    }
    public List<Articulo> getListado(){
        return listado;
    }
    
    
    
    
    
    
}
