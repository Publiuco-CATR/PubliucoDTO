package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class TipoRelacionInstitucionDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;

    public TipoRelacionInstitucionDTO() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(new EstadoDTO());
    }
    public TipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion, EstadoDTO estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public TipoRelacionInstitucionDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public TipoRelacionInstitucionDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoRelacionInstitucionDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public TipoRelacionInstitucionDTO setEstado(EstadoDTO estado) {
        this.estado = estado;
        return this;
    }

}


