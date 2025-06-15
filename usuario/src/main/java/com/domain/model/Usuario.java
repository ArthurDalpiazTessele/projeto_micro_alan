package com.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Entity
@Table(name = "usuarios")
@Schema(name = "Usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    
    @Column(nullable = false)
    @Schema(example = "Arthur Tessele")
    private String nome;
    
    @Column(nullable = false, unique = true)
    @Schema(example = "arthurtessele@gmail.com")
    private String email;
    
    @Column(nullable = false)
    @Schema(example = "admin")
    private String senha;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @Schema(example = "ADMIN")
    private TipoUsuario tipo;
    
    @Column(nullable = false)
    @Schema(example = "true")
    private Boolean ativo;
}
