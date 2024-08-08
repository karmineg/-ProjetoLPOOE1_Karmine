/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author kurum
 */
public class TestPersistencia {
    
    @Test
    public void testeConexao(){
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("Conexao realizada com sucesso");
        } else {
            System.out.println("Falha ao conectar no Banco");
        }
    }
}
