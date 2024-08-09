package br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model;

import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Dragonborn;
import br.edu.ifsul.cc.lpoo.skyrim.projetolpooe1_karmine.model.Raca;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-09T13:57:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Companion.class)
public class Companion_ { 

    public static volatile SingularAttribute<Companion, String> dragonbornNome;
    public static volatile SingularAttribute<Companion, Raca> raca;
    public static volatile SingularAttribute<Companion, String> nome;
    public static volatile SingularAttribute<Companion, Integer> id;
    public static volatile SingularAttribute<Companion, Integer> nivel;
    public static volatile SingularAttribute<Companion, Dragonborn> dragonborn;

}