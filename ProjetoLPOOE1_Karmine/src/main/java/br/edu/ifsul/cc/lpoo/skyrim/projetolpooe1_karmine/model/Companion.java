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
@Table(name = "tb_companion")
public class Companion implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_companion", sequenceName = "seq_companion_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_companion", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(name = "nome_companion", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "nivel_companion", nullable = false)
    private Integer nivel;
    
    @Column(name = "raca_companion", nullable = false)
    @Enumerated(EnumType.STRING)
    private Raca raca;
    
    @OneToOne
    @JoinColumn(name = "dragonborn_nome", referencedColumnName = "nome_dragonborn", nullable = true)
    private Dragonborn dragonborn;

    @Column(name = "dragonborn_nome", insertable = false, updatable = false)
    private String dragonbornNome;

    public Companion() {
        
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
    
    public Dragonborn getDragonborn() {
        return dragonborn;
    }

    public void setDragonborn(Dragonborn dragonborn) {
        this.dragonborn = dragonborn;
        this.dragonbornNome = dragonborn != null ? dragonborn.getNome() : null;
    }

    public String getDragonbornNome() {
        return dragonbornNome;
    }
    
    @Override
    public String toString() {
        return this.getNome(); 
    }
    
}
