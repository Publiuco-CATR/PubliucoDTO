package co.edu.uco.publiuco.dto;

import java.util.UUID;

public class EstadoEscritorDTO {
	private UUID identificador;
	private String nombre;
	private String descripcion;


	public EstadoEscritorDTO() {
		super();
		setIdentificador(identificador);
		setNombre("");
		setDescripcion("");
	}

	public EstadoEscritorDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}


	public final UUID getIdentificador() {
		return identificador;
	}

	public final EstadoEscritorDTO setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final EstadoEscritorDTO setNombre(final String nombre) {

		this.nombre = "";

		if (nombre != null) {
			this.nombre = nombre.trim();
		}

		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoEscritorDTO setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

}
