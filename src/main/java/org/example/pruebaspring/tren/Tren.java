package org.example.pruebaspring.tren;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tren {

    private Bogie bogie;
    private Traccion traccion;

    @Autowired
    public Tren(Bogie bogie, Traccion traccion) {
        this.bogie = bogie;
        this.traccion = traccion;
    }

    public Bogie getBogie() {
        return bogie;
    }

    public void setBogie(Bogie bogie) {
        this.bogie = bogie;
    }

    public Traccion getTraccion() {
        return traccion;
    }

    public void setTraccion(Traccion traccion) {
        this.traccion = traccion;
    }
}
