/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;
import java.util.*;
/**
 *
 * @author salan503
 */
public class Empleos {
    String fechainicio, fechafin;
    String nombre, descripcion, ciudad, cargo;
    
    Empleos(String fechainicio, String fechafin, String nombre, String descripcion, String ciudad, String cargo){
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
