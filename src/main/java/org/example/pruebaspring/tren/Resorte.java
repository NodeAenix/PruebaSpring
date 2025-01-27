package org.example.pruebaspring.tren;

import org.springframework.stereotype.Component;

@Component
public class Resorte {

    private int muellesPrimarios;
    private int muellesSecundarios;
    private int amortiguadores;

    public Resorte() {
        this.muellesPrimarios = 2;
        this.muellesSecundarios = 2;
        this.amortiguadores = 4;
    }

    public int getMuellesPrimarios() {
        return muellesPrimarios;
    }

    public void setMuellesPrimarios(int muellesPrimarios) {
        this.muellesPrimarios = muellesPrimarios;
    }

    public int getMuellesSecundarios() {
        return muellesSecundarios;
    }

    public void setMuellesSecundarios(int muellesSecundarios) {
        this.muellesSecundarios = muellesSecundarios;
    }

    public int getAmortiguadores() {
        return amortiguadores;
    }

    public void setAmortiguadores(int amortiguadores) {
        this.amortiguadores = amortiguadores;
    }
}
