package com.sebastian.desafio.modelos;

public class Tarjeta {


    private Double limite;
    private Double saldo;


    public Tarjeta(Double limiteTarjeta) {
        this.limite = limiteTarjeta;
        this.saldo = saldo;
    }

    public boolean disminuirSaldo (double a) {
        if (saldo >= a) {
            saldo -= a;
            return true;
        } else
            return false;
    }

    public Double getLimite() {
        return limite;
    }

}
