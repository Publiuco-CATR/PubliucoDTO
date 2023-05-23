package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

public class ReporteDTO {
    private UUID identificador;
    private LectorDTO lector;
    private ComentarioLectorDTO comentario;
    private String razon;
    private TipoReporteDTO tipo;
    private LocalDateTime fechaReporte;
    private EstadoDTO estado;

    public ReporteDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorDTO.create());
        setComentario(ComentarioLectorDTO.create());
        setRazon(UtilText.getDefaultValue());
        setTipo(TipoReporteDTO.create());
        setFechaReporte(UtilDate.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public ReporteDTO(UUID identificador, LectorDTO lector, ComentarioLectorDTO comentario, String razon, TipoReporteDTO tipo, LocalDateTime fechaReporte,EstadoDTO estado) {
        setIdentificador(identificador);
        setLector(lector);
        setComentario(comentario);
        setRazon(razon);
        setTipo(tipo);
        setFechaReporte(fechaReporte);
        setEstado(estado);
    }

    
    public EstadoDTO getEstado() {
		return estado;
	}

	public ReporteDTO setEstado(EstadoDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
		return this;
	}

	public UUID getIdentificador() {
        return identificador;
    }

    public LectorDTO getLector() {
        return lector;
    }

    public ComentarioLectorDTO getComentario() {
        return comentario;
    }

    public String getRazon() {
        return razon;
    }

    public TipoReporteDTO getTipo() {
        return tipo;
    }

    public LocalDateTime getFechaReporte() {
        return fechaReporte;
    }

    public ReporteDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReporteDTO setLector(final LectorDTO lector) {
        this.lector = UtilObject.getDefault(lector, LectorDTO.create());
        return this;
    }

    public ReporteDTO setComentario(final ComentarioLectorDTO comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioLectorDTO.create());
        return this;
    }

    public ReporteDTO setRazon(final String razon) {
        this.razon = UtilText.applyTrim(razon);
        return this;
    }

    public ReporteDTO setTipo(final TipoReporteDTO tipoReporte) {
        this.tipo = UtilObject.getDefault(tipoReporte, TipoReporteDTO.create());
        return this;
    }

    public ReporteDTO setFechaReporte(final LocalDateTime fechaReporte) {
        this.fechaReporte = UtilDate.getDefault(fechaReporte);
        return this;
    }
    public static ReporteDTO create (){
        return new ReporteDTO();
    }
}
