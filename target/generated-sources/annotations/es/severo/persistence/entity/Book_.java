package es.severo.persistence.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Libro.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Libro, String> isbn;
	public static volatile SingularAttribute<Libro, String> titulo;
	public static volatile SingularAttribute<Libro, Long> id;
	public static volatile SingularAttribute<Libro, String> autor;

	public static final String ISBN = "isbn";
	public static final String TITULO = "titulo";
	public static final String ID = "id";
	public static final String AUTOR = "autor";

}

