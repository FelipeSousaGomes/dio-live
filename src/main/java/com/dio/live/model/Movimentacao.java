package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    @Entity
    public  class MovimentacaoId implements Serializable{
      private  long idMovimento;
      private  long idUsuario;

    }
  @EmbeddedId
    private  MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private  LocalDateTime dataSaida;
    private BigDecimal periodo;
    private  Ocorrencia ocorrencia;
    private Calendario calendario;
}
