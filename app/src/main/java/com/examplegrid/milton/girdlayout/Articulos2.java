package com.examplegrid.milton.girdlayout;

/**
 * Created by MILTON on 15/05/2015.
 */
public class Articulos2 {
    public String Marca;
    public String Codigo;
    public String Descripcion;
    public Double precio;
    public String xx;
    public String xxx;
    public int x;

    public Articulos2(String marca, String codigo, String descripcion, String xx, String xxx , int x, Double precio) {
        Marca = marca;
        Codigo = codigo;
        Descripcion = descripcion;
        this.precio = precio;
        this.xx = xx;
        this.xxx = xxx;
        this.x = x;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
