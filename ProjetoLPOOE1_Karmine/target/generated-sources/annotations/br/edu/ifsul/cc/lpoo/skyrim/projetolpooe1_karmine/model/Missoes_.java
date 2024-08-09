package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model;

import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Dragonborn;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-09T13:57:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Missoes.class)
public class Missoes_ { 

    public static volatile SingularAttribute<Missoes, String> nome;
    public static volatile SingularAttribute<Missoes, Integer> id;
    public static volatile SingularAttribute<Missoes, String> descricao;
    public static volatile SingularAttribute<Missoes, String> recompensa;
    public static volatile SingularAttribute<Missoes, Dragonborn> dragonborn;

}