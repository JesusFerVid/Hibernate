package es.severo.persistence.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Capitulo.class)
public abstract class Chapter_ {

	public static volatile SingularAttribute<Capitulo, Integer> paginas;
	public static volatile SingularAttribute<Capitulo, Libro> book;
	public static volatile SingularAttribute<Capitulo, String> titulo;
	public static volatile SingularAttribute<Capitulo, Long> id;

	public static final String PAGINAS = "paginas";
	public static final String BOOK = "book";
	public static final String TITULO = "titulo";
	public static final String ID = "id";

}

