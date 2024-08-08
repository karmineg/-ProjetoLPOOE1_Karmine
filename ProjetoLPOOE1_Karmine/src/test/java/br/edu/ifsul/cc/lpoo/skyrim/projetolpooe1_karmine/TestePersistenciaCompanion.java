/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Companion;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Raca;
import org.junit.*;

/**
 *
 * @author kurum
 */
public class TestePersistenciaCompanion {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaCompanion() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void TestePersistenciaDragonborn() throws Exception {
        Companion c1 = new Companion();
        c1.setNome("Lydia");
        c1.setNivel(5);
        c1.setRaca(Raca.NORD);
        
        jpa.persist(c1);

        Companion c2 = new Companion();
        c2.setNome("Kaidan");
        c2.setNivel(10);
        c2.setRaca(Raca.BRETON);
        
        jpa.persist(c2);
        
    }
}