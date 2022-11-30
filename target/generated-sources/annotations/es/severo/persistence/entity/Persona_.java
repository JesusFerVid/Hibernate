package es.severo.persistence.entity;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Persona.class)
public abstract class Persona_ {

	public static volatile ListAttribute<Persona, Direccion> direcciones;
	public static volatile SingularAttribute<Persona, Long> id;
	public static volatile SingularAttribute<Persona, String> nombre;

	public static final String DIRECCIONES = "direcciones";
	public static final String ID = "id";
	public static final String NOMBRE = "nombre";

}

