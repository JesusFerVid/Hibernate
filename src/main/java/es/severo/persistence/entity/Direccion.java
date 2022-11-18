package es.severo.persistence.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "direccion")
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String calle;

	@Column(nullable = false)
	private String numero;

	@ManyToMany(mappedBy = "direcciones")
	private List<Persona> personas = new ArrayList<>();

	public Direccion() { }

	public Direccion(String calle, String numero) {
		this.calle = calle;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion{" +
			"id=" + id +
			", calle='" + calle + '\'' +
			", numero='" + numero + '\'' +
			'}';
	}
}
