package es.severo.persistence.entity;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Direccion.class)
public abstract class Direccion_ {

	public static volatile SingularAttribute<Direccion, String> numero;
	public static volatile SingularAttribute<Direccion, String> calle;
	public static volatile SingularAttribute<Direccion, Long> id;
	public static volatile ListAttribute<Direccion, Persona> personas;

	public static final String NUMERO = "numero";
	public static final String CALLE = "calle";
	public static final String ID = "id";
	public static final String PERSONAS = "personas";

}

