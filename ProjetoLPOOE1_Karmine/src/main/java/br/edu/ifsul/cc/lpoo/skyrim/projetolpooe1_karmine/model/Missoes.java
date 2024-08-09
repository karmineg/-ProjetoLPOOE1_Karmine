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
@Table(name = "tb_missoes")
public class Missoes implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_missoes", sequenceName = "seq_missoes_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_missoes", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(name = "nome_missao", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "descricao_missao", nullable = false, length = 200)
    private String descricao;
    
    @Column(name = "recomepensa_missao", nullable = true, length = 100)
    private String recompensa;
    
    @ManyToOne
    @JoinColumn(name = "dragonborn_id", nullable = false)
    private Dragonborn dragonborn;

    public Missoes() {
        
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }
    
    public Dragonborn getDragonborn() {
        return dragonborn;
    }

    public void setDragonborn(Dragonborn dragonborn) {
        this.dragonborn = dragonborn;
    }
    
    @Override
    public String toString() {
        return this.getNome(); 
    }
    
}
