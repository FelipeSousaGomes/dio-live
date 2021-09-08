package com.dio.live.Repository;

import com.dio.live.model.JornadadeTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JornadaRepository extends JpaRepository<JornadadeTrabalho,Long> {
}
