package es.severo.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "presupuesto")
public class Presupuesto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lugar_presupuesto")
	private String lugarPresupuesto;

	@OneToOne
	@JoinColumn(name = "tramite_id")
	private Tramite tramite;

	public Presupuesto() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLugarPresupuesto() {
		return lugarPresupuesto;
	}

	public void setLugarPresupuesto(String lugarPresupuesto) {
		this.lugarPresupuesto = lugarPresupuesto;
	}

	public Tramite getTramite() {
		return tramite;
	}

	public void setTramite(Tramite tramite) {
		this.tramite = tramite;
	}
}
