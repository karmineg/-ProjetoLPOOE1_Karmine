/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.dao;

import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.dao.InterfacePersistencia;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Dragonborn;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Companion;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Missoes;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author kurum
 */
public class PersistenciaJPA implements InterfacePersistencia {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("pu_db_lpooe1_karmine");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return entity.find(c, id);
    }

    @Override
    public void persist(Object o) throws Exception {
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
    }

    @Override
    public void remover(Object o) throws Exception {
        entity.getTransaction().begin();
        entity.remove(o);
        entity.getTransaction().commit();
    }

    public void atualizar(Object o) throws Exception {
        EntityTransaction tx = null;
        try {
            tx = entity.getTransaction();
            tx.begin();
            entity.merge(o);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        }
    }
    
    public List<Dragonborn> getDragonborn() {
        TypedQuery<Dragonborn> query = entity.createQuery("SELECT d FROM Dragonborn d", Dragonborn.class);
        return query.getResultList();
    }

    public List<Companion> getCompanion() {
        TypedQuery<Companion> query = entity.createQuery("SELECT c FROM Companion c", Companion.class);
        return query.getResultList();
    }

    public List<Missoes> getMissoes(Dragonborn dragonborn) {
        TypedQuery<Missoes> query = entity.createQuery("SELECT m FROM Missoes m WHERE m.dragonborn = :dragonborn", Missoes.class);
        query.setParameter("dragonborn", dragonborn);
        return query.getResultList();
    }

}
