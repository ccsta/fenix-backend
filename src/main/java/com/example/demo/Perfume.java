package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Isso avisa o banco: "Ei, cria uma tabela chamada Perfume pra mim!"
public class Perfume {

    @Id // Diz que esse campo é o identificador único (a Chave Primária)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco vai gerar os IDs sozinho: 1, 2, 3...
    private Long id;

    private String nome;
    private String marca;
    private String familiaOlfativa;

    // Construtor VAZIO (O Spring Boot obriga a ter isso pro banco funcionar)
    public Perfume() {}

    // Construtor normal (Perceba que tiramos o ID daqui, afinal o banco gera ele)
    public Perfume(String nome, String marca, String familiaOlfativa) {
        this.nome = nome;
        this.marca = marca;
        this.familiaOlfativa = familiaOlfativa;
    }

    // Getters para a API conseguir ler os dados
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getMarca() { return marca; }
    public String getFamiliaOlfativa() { return familiaOlfativa; }
// Setters para a API conseguir alterar os dados
    public void setNome(String nome) { this.nome = nome; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setFamiliaOlfativa(String familiaOlfativa) { this.familiaOlfativa = familiaOlfativa; }
}