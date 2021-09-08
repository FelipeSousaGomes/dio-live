package com.dio.live;

import com.dio.live.Repository.JornadaRepository;
import com.dio.live.model.JornadadeTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public  JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;

    }
    public JornadadeTrabalho saveJornada(JornadadeTrabalho jornadadeTrabalho){
     return    jornadaRepository.save(jornadadeTrabalho );
    }

    public List <JornadadeTrabalho> findAll() {
        return  jornadaRepository.findAll();
    }
    public Optional<JornadadeTrabalho> getJornadaById(Long idJornada){
        return JornadaRepository.findById(idJornada);

    } public JornadadeTrabalho updateJornada(JornadadeTrabalho jornadadeTrabalho){
        return    jornadaRepository.save(jornadadeTrabalho );
}
    public void deleteJornada(Long idJornada) {
    JornadaRepository.deleteById(idJornada);
    }
}