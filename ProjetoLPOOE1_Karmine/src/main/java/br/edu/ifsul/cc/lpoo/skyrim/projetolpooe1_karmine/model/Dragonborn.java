/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model;
import java.io.*;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author kurum
 */
@Entity
@Table(name = "tb_dragonborn")
public class Dragonborn implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_dragonborn", sequenceName = "seq_dragonborn_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_dragonborn", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(name = "nome_dragonborn", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "nivel_dragonborn", nullable = false)
    private Integer nivel;
    
    @Column(name = "raca_dragonborn", nullable = false)
    @Enumerated(EnumType.STRING)
    private Raca raca;
    
    @OneToMany(mappedBy = "dragonborn", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Missoes> missoes = new ArrayList<>();
    
    @OneToOne
    @JoinColumn(nullable = true)
    private Companion companion;

    public Dragonborn() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }
    
    public List<Missoes> getMissoes() {
        return missoes;
    }

    public void setMissoes(List<Missoes> missoes) {
        this.missoes = missoes;
    }

    public void addMissao(Missoes missao) {
        missoes.add(missao);
        missao.setDragonborn(this);
    }

    public void removeMissao(Missoes missao) {
        missoes.remove(missao);
        missao.setDragonborn(null);
    }
    
    public Companion getCompanion() {
        return companion;
    }

    public void setCompanion(Companion companion) {
        this.companion = companion;
    }
    
    @Override
    public String toString() {
        return this.getNome(); 
    }
    
}
