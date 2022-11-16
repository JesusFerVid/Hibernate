package es.severo.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tramite")
public class Tramite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "tipo_tramite")
	private String tipo;

	@Column(name = "fecha_tramite")
	private LocalDateTime fecha;

	// Bidireccional
	@OneToOne(mappedBy = "tramite", cascade = CascadeType.REMOVE)
	private Presupuesto presupuesto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Tramite{" +
			"id=" + id +
			", tipo='" + tipo + '\'' +
			", fecha=" + fecha +
			'}';
	}
}
