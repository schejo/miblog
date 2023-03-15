/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.sergio.res.servicio;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.sergio.res.dao.BaseDeDatos;
import org.sergio.res.modelo.Articulo;

/**
 *
 * @author Usuario
 */
public class ArticuloServicio {
    private List<Articulo> listado = BaseDeDatos.getInstancia().getListado();
    
    public  List<Articulo> getarArticulos(){
        return listado;
    }
    
    public Articulo getArticulo(int id){
        for(Articulo articulo : listado){
            if(articulo.getId()==id){
                return articulo;
            }
            
        }
        return null;
    }
    
    public Articulo addArticulo(Articulo articulo){
        articulo.setId(getMaximo());
        articulo.setCreado(getCreado());
        listado.add(articulo);
        return articulo;
    }
    
    public Articulo updateArticulo(Articulo articulo){
        int posicion = getPosicion(articulo.getId());
        try{
            listado.set(posicion, articulo);
        }catch(IndexOutOfBoundsException ioobe){
            return null;
        }
        return articulo;
        
    }
    
    public  void deleteArticulo(int id){
        int posicion=getPosicion(id);
        listado.remove(id);
    }
    
    private int getPosicion(int id){
        for(int i=0; i<listado.size();i++){
            if(listado.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    
        private  Calendar getCreado(){
        Calendar creado ;
        creado= new GregorianCalendar();
        return creado;
    }
    
    private int getMaximo(){
        int size =listado.size();
        if(size >0){
            return listado.get(size-1).getId()+1;
            
        }else{
           return 1;
        }
    }
    
}
