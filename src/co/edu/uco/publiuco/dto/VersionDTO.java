package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.*;

import java.time.LocalDateTime;
import java.util.UUID;

public class VersionDTO {
    private UUID identificador;
    private VersionDTO versionAnterior;
    private boolean tieneVersionAnterior;
    private Integer numeroVersion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaUltimaModificacion;
    private String titulo;
    private String resumen;
    private String cuerpo;
    private EstadoDTO estado;

    private static final VersionDTO INSTANCE_DEFAULT = VersionDTO.create();


    public VersionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setVersionAnterior(getDefaultValue());
        setNumeroVersion(UtilNumber.getIntegerDefaultValue());
        setFechaCreacion(UtilDate.getDefaultValue());
        setFechaUltimaModificacion(UtilDate.getDefaultValue());
        setTitulo(UtilText.getDefaultValue());
        setResumen(UtilText.getDefaultValue());
        setCuerpo(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
        setTieneVersionAnterior(UtilBoolean.getDefaultValue());
    }

    public VersionDTO(UUID identificador, VersionDTO versionAnterior, int numeroVersion, LocalDateTime fechaCreacion, LocalDateTime fechaUltimaModificacion, String titulo, String resumen, String cuerpo, EstadoDTO estado, boolean tieneVersionAnterior) {
        setIdentificador(identificador);
        setVersionAnterior(versionAnterior);
        setNumeroVersion(numeroVersion);
        setFechaCreacion(fechaCreacion);
        setFechaUltimaModificacion(fechaUltimaModificacion);
        setTitulo(titulo);
        setResumen(resumen);
        setCuerpo(cuerpo);
        setEstado(estado);
        setTieneVersionAnterior(tieneVersionAnterior);
    }

    public static VersionDTO getDefaultValue() {
        return INSTANCE_DEFAULT;
    }

    public UUID getIdentificador() {
        return identificador;
    }


    public boolean tieneVersionAnterior() {
		return tieneVersionAnterior;
	}

	public VersionDTO setTieneVersionAnterior(boolean tienePadre) {
		this.tieneVersionAnterior = tienePadre;
		return this;
	}

	public VersionDTO getVersionAnterior() {
        return versionAnterior;
    }

    public Integer getNumeroVersion() {
        return numeroVersion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public VersionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }


    public VersionDTO setVersionAnterior(final VersionDTO versionAnterior) {
    	if(tieneVersionAnterior()) {
            this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionDTO.create());
        }else {
			this.versionAnterior = (VersionDTO) UtilObject.getNullValue();
        }
    	return this;
    }

    public VersionDTO setNumeroVersion(final Integer numeroVersion) {
        this.numeroVersion = UtilNumber.getDefaultInt(numeroVersion);
        return this;
    }

    public VersionDTO setFechaCreacion(final LocalDateTime fechaCreacion) {
        this.fechaCreacion = UtilDate.getDefault(fechaCreacion);
        return this;
    }

    public VersionDTO setFechaUltimaModificacion(final LocalDateTime ultimaFechaModificacion) {
        this.fechaUltimaModificacion = UtilDate.getDefault(ultimaFechaModificacion);
        return this;
    }

    public VersionDTO setTitulo(final String titulo) {
        this.titulo = UtilText.applyTrim(titulo);
        return this;
    }

    public VersionDTO setResumen(final String resumen) {
        this.resumen = UtilText.applyTrim(resumen);
        return this;
    }

    public VersionDTO setCuerpo(final String cuerpo) {
        this.cuerpo = UtilText.applyTrim(cuerpo);
        return this;
    }

    public VersionDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static VersionDTO create (){
        return new VersionDTO();
    }
}
