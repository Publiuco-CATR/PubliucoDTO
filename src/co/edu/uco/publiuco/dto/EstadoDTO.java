package co.edu.uco.publiuco.dto;


import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public final class EstadoDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private TipoEstadoDTO tipo;


    public EstadoDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipo(TipoEstadoDTO.create());
    }


    public EstadoDTO(UUID identificador, String nombre, TipoEstadoDTO tipo, String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipo(tipo);
    }

    public String getDescripcion() {
		return descripcion;
	}


	public final EstadoDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.applyTrim(descripcion);
		return this;
	}


	public final EstadoDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public final EstadoDTO setTipo(final TipoEstadoDTO tipoEstado) {

        this.tipo = UtilObject.getDefault(tipoEstado, TipoEstadoDTO.create());
        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoDTO getTipo() {
        return tipo;
    }

    public static EstadoDTO create (){
        return new EstadoDTO();
    }
}
