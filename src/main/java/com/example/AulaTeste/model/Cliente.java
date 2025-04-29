package com.example.AulaTeste.model;


import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity(name = "cliente")
public class Cliente {

    @id()
    @GeneratedValue
    private UUID codigo_usuarioUuid;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "telefone")
    private String telefone;
    public Cliente(){}
    public Cliente (String nome, String email, String senha, String cpf, String endereco, String telefone){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.cpf=cpf;
        this.endereco=endereco;
        this.telefone=telefone;
    }

}
