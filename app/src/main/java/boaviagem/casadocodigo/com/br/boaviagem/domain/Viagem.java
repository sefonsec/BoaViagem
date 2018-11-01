package boaviagem.casadocodigo.com.br.boaviagem.domain;

import android.content.Intent;

import java.util.Date;

/**
 * Created by eduardo on 04/03/2018.
 */

public class Viagem {
    private Long id;
    private String destino;
    private Integer tipoViagem;
    private Date dataChegada;
    private Date dataSaida;
    private Double orcamento;
    private Integer quantidadePessoas;

    public Viagem(){}

    public Viagem(Long id, String destino, Integer tipoViagem,
                  Date dataChegada, Date dataSaida, Double orcamento,
                  Integer quantidadePessoas) {
        this.id = id;
        this.destino = destino;
        this.tipoViagem = tipoViagem;
        this.dataChegada = dataChegada;
        this.dataSaida = dataSaida;
        this.orcamento = orcamento;
        this.quantidadePessoas = quantidadePessoas;
    }
}