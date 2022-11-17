package es.severo.persistence.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String isbn;

	@Column(nullable = false)
	private String titulo;

	@Column(nullable = false)
	private String autor;

	@OneToMany(mappedBy = "libro", orphanRemoval = true)
	private List<Capitulo> capitulos = new ArrayList<>();

	public Libro() { }

	public Libro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Libro{" +
			"id=" + id +
			", isbn='" + isbn + '\'' +
			", titulo='" + titulo + '\'' +
			", autor='" + autor + '\'' +
			", chapters=" + capitulos +
			'}';
	}
}
