package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model;

import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Companion;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Missoes;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Raca;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-08T13:43:35", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Dragonborn.class)
public class Dragonborn_ { 

    public static volatile SingularAttribute<Dragonborn, Companion> companion;
    public static volatile SingularAttribute<Dragonborn, Raca> raca;
    public static volatile SingularAttribute<Dragonborn, String> nome;
    public static volatile SingularAttribute<Dragonborn, Integer> id;
    public static volatile SingularAttribute<Dragonborn, Integer> nivel;
    public static volatile ListAttribute<Dragonborn, Missoes> missoes;

}