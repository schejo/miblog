/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.sergio.res.recursos;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.sergio.res.modelo.Articulo;
import org.sergio.res.servicio.ArticuloServicio;

/**
 *
 * @author Usuario
 */
@Path("/articulos")
public class ArticuloRecurso {

    ArticuloServicio servicio = new ArticuloServicio();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Articulo> getARticulos() {

        return servicio.getarArticulos();
    }

    @GET
    @Path("/{articuloID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Articulo getArticulo(@PathParam("articuloID") int id) {
        return servicio.getArticulo(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Articulo addArticulo(Articulo articulo){
        return servicio.addArticulo(articulo);
    }

    

}
