package co.edu.uco.publiuco.dto;

import java.util.UUID;

public class EstadoEscritor {
	private UUID identificador;
	private String nombre;
	private String descripcion;


	public EstadoEscritor() {
		super();
		setIdentificador(identificador);
		setNombre("");
		setDescripcion("");
	}

	public EstadoEscritor(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}


	public final UUID getIdentificador() {
		return identificador;
	}

	public final EstadoEscritor setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final EstadoEscritor setNombre(final String nombre) {

		this.nombre = "";

		if (nombre != null) {
			this.nombre = nombre.trim();
		}

		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoEscritor setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

}
