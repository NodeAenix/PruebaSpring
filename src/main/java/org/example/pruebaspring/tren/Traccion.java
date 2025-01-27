package org.example.pruebaspring.tren;

import org.springframework.stereotype.Component;

@Component
public class Traccion {

    private double grados;
    private String tipo;

    public Traccion() {
        this.grados = 25;
        this.tipo = "eléctrico";
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
