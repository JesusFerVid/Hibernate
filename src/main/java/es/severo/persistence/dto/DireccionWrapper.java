package es.severo.persistence.dto;

public class DireccionWrapper {
	private final Long id;
	private final String calle;

	public DireccionWrapper(Long id, String calle) {
		this.id = id;
		this.calle = calle;
	}

	public Long getId() {
		return id;
	}

	public String getCalle() {
		return calle;
	}

	@Override
	public String toString() {
		return "DireccionWrapper{" +
			"id=" + id +
			", calle='" + calle + '\'' +
			'}';
	}
}
