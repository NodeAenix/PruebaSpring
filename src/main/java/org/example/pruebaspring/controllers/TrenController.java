package org.example.pruebaspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.pruebaspring.tren.Tren;

@RestController
@RequestMapping("/trenes")
public class TrenController {

    @Autowired
    private Tren tren;

    @GetMapping("/tren")
    public ResponseEntity<Tren> getTren() {
        return ResponseEntity.ok(tren);
    }

    @PostMapping("/tren")
    public ResponseEntity<Tren> postTren(@RequestBody Tren tren) {
        return ResponseEntity.ok(tren);
    }

}

