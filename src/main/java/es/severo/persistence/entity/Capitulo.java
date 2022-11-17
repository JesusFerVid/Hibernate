package es.severo.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "capitulo")
public class Capitulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;

	private int paginas;

	@ManyToOne
	private Libro libro;

	public Capitulo() { }

	public Capitulo(String titulo, int paginas) {
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Libro getBook() {
		return libro;
	}

	public void setBook(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "Capitulo{" +
			"id=" + id +
			", titulo='" + titulo + '\'' +
			", paginas=" + paginas +
			'}';
	}
}
