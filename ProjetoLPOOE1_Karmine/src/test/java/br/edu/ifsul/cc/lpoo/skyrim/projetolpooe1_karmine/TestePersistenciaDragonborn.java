/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Dragonborn;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Missoes;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Companion;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Raca;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author kurum
 */
public class TestePersistenciaDragonborn {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaDragonborn() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    //@Test
    public void TestePersistenciaDragonborn() throws Exception {
        Dragonborn d = new Dragonborn();
        d.setNome("Erishkigal");
        d.setNivel(10);
        d.setRaca(Raca.IMPERIAL);
        
        Missoes m1 = new Missoes();
        m1.setNome("Dragon Rising");
        m1.setDescricao("Lute e mate seu primeiro dragão na Torre de Vigia Ocidental.");

        Missoes m2 = new Missoes();
        m2.setNome("With Friends Like These...");
        m2.setDescricao("O Dragonborn pode receber a Carta Misteriosa de um mensageiro e depois de três dias ele recebe uma visita de uma assassina.");
        m2.setRecompensa("Se juntar a Irmandade Sombria");

        d.addMissao(m1);
        d.addMissao(m2);

        jpa.persist(d);

        Companion c1 = new Companion();
        c1.setNome("Lydia");
        c1.setNivel(5);
        c1.setRaca(Raca.NORD);
        
        jpa.persist(c1);

        Companion c2 = new Companion();
        c2.setNome("Kaidan");
        c2.setNivel(10);
        c2.setRaca(Raca.BRETON);
        c2.setDragonborn(d);
        
        jpa.persist(c2);


        d.setCompanion(c2);
        jpa.persist(d);
        
    }
}
