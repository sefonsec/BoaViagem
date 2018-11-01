package boaviagem.casadocodigo.com.br.boaviagem.domain;

import java.util.Date;

/**
 * Created by eduardo on 04/03/2018.
 */

public class Gasto {
    private Long id;
    private Date data;
    private String categoria;
    private String descricao;
    private Double valor;
    private String local;
    private Integer viagemId;

    public Gasto(){}

    public Gasto(Long id, Date data, String categoria,
                 String descricao, Double valor, String local,
                 Integer viagemId) {

        this.id = id;
        this.data = data;
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
        this.local = local;
        this.viagemId = viagemId;
    }
}