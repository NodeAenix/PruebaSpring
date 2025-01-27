package org.example.pruebaspring.tren;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bogie {

    private int ruedas;
    private String forma;
    private Resorte resorte;

    @Autowired
    public Bogie(Resorte resorte) {
        this.ruedas = 4;
        this.forma = "H";
        this.resorte = resorte;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Resorte getResorte() {
        return resorte;
    }

    public void setResorte(Resorte resorte) {
        this.resorte = resorte;
    }
}
