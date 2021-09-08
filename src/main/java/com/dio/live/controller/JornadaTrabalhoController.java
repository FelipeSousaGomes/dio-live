package com.dio.live.controller;

import com.dio.live.JornadaService;
import com.dio.live.model.JornadadeTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadadeTrabalho createJornada(@RequestBody JornadadeTrabalho jornadadeTrabalho) {
        return jornadaService.saveJornada (jornadadeTrabalho);
    }

    @GetMapping("/list")
    public List<JornadadeTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @DeleteMapping("/(idJornada)")
    public ResponseEntity<JornadadeTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception{
        try{
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadadeTrabalho>) ResponseEntity.ok();
    }
}
