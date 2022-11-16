package es.severo.persistence.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tramite.class)
public abstract class Tramite_ {

	public static volatile SingularAttribute<Tramite, LocalDateTime> fecha;
	public static volatile SingularAttribute<Tramite, String> tipo;
	public static volatile SingularAttribute<Tramite, Presupuesto> presupuesto;
	public static volatile SingularAttribute<Tramite, Long> id;

	public static final String FECHA = "fecha";
	public static final String TIPO = "tipo";
	public static final String PRESUPUESTO = "presupuesto";
	public static final String ID = "id";

}

