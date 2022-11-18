package es.severo.persistence.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nombre;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
		name = "vive_en",
		joinColumns = @JoinColumn(name = "persona_id"),
		inverseJoinColumns =  @JoinColumn(name = "direccion_id")
	)
	private List<Direccion> direcciones = new ArrayList<>();

	public Persona() { }

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	public void addDireccion(Direccion d) {
		this.direcciones.add(d);
	}

	public void removeDireccion(Direccion d) {
		this.direcciones.remove(d);
	}
}
