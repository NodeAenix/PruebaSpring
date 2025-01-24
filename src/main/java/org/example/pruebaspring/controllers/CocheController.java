package org.example.pruebaspring.controllers;

import org.example.pruebaspring.entities.Coche;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coches")
public class CocheController {

    @GetMapping("/coche")
    public ResponseEntity<Coche> getCoche() {
        Coche c = new Coche("Ford", "Utilitario", "Azul", "Diésel", 90, 1200);
        return ResponseEntity.ok(c);
    }

    @PostMapping("/coche")
    public ResponseEntity<Coche> postCoche(@RequestBody Coche c) {
        return ResponseEntity.ok(c);
    }

}
