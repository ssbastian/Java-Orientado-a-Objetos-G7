package com.sebastian.desafio.modelos;

public class Compra implements Comparable<Compra> {

    private Articulo objArticulo;
    private Tarjeta objTarjeta;
    private Double precio;


    public Compra(Tarjeta objTarjeta, Articulo objArticulo, Double precio) {
        this.objTarjeta = objTarjeta;
        this.objArticulo = objArticulo;
        this.precio = precio;
    }

    public Articulo getObjArticulo() {
        return objArticulo;
    }

    public void setObjArticulo(Articulo objArticulo) {
        this.objArticulo = objArticulo;
    }

    public Tarjeta getObjTarjeta() {
        return objTarjeta;
    }

    public void setObjTarjeta(Tarjeta objTarjeta) {
        this.objTarjeta = objTarjeta;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "objArticulo=" + objArticulo.getDescription() +
                ", objTarjeta=" + objTarjeta.getLimite() +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Compra otraCompra) {
        if (this.getPrecio() < otraCompra.getPrecio()) {
            return 1;
        } else
            return 0;
    }
}
