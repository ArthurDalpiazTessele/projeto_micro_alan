package com.domain.model;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "salas")
@Schema(name = "Sala")
public class Sala {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    
    @Column(nullable = false)
    @Schema(example = "Sala 1")
    private String nome;
    
    @Column(nullable = false)
    @Schema(example = "50")
    private Integer capacidade;
    
    @Column(nullable = false)
    @Schema(example = "Bloco 1, 1º andar")
    private String localizacao;
    
    @Column(nullable = false)
    @Schema(example = "true")
    private Boolean disponivel;

    public Sala() {
    }

    public Sala(Boolean disponivel, String localizacao, Integer capacidade, String nome) {
        this.disponivel = disponivel;
        this.localizacao = localizacao;
        this.capacidade = capacidade;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
