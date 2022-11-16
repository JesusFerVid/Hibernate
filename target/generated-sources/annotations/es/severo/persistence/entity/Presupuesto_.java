package es.severo.persistence.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Presupuesto.class)
public abstract class Presupuesto_ {

	public static volatile SingularAttribute<Presupuesto, Tramite> tramite;
	public static volatile SingularAttribute<Presupuesto, Long> id;
	public static volatile SingularAttribute<Presupuesto, String> lugarPresupuesto;

	public static final String TRAMITE = "tramite";
	public static final String ID = "id";
	public static final String LUGAR_PRESUPUESTO = "lugarPresupuesto";

}

