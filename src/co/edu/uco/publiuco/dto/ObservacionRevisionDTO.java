package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class ObservacionRevisionDTO {
    private UUID identificador;
    private EscritorPublicacionDTO escritorPublicacion;
    private ComentarioRevisorDTO comentarioRevisor;
    private LocalDateTime fechaReportePublicacion;
    private LocalDateTime fechaRevisionObservacion;
    private String observacion;
    private EstadoDTO estado;

    public ObservacionRevisionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setEscritorPublicacion(EscritorPublicacionDTO.create());
        setComentarioRevisor(ComentarioRevisorDTO.create());
        setFechaReportePublicacion(UtilDate.getDefaultValue());
        setFechaRevisionObservacion(UtilDate.getDefaultValue());
        setObservacion(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public ObservacionRevisionDTO(final UUID identificador, final EscritorPublicacionDTO escritorPublicacion,final ComentarioRevisorDTO comentarioRevisor,final LocalDateTime fechaReportePublicacion, final LocalDateTime fechaRevisionObservacion,final String observacion, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setEscritorPublicacion(escritorPublicacion);
        setComentarioRevisor(comentarioRevisor);
        setFechaReportePublicacion(fechaReportePublicacion);
        setFechaRevisionObservacion(fechaRevisionObservacion);
        setObservacion(observacion);
        setEstado(estado);
    }


    public ObservacionRevisionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ObservacionRevisionDTO setEscritorPublicacion(final EscritorPublicacionDTO escritorPublicacion) {
        this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionDTO.create());
        return this;
    }

    public ObservacionRevisionDTO setComentarioRevisor(final ComentarioRevisorDTO comentarioRevisor) {
        this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorDTO.create());
        return this;
    }

    public ObservacionRevisionDTO setFechaReportePublicacion(final LocalDateTime fechaReportePublicacion) {
        this.fechaReportePublicacion = UtilDate.getDefault(fechaReportePublicacion);
        return this;
    }

    public ObservacionRevisionDTO setFechaRevisionObservacion(final LocalDateTime fechaRevisionObservacion) {
        this.fechaRevisionObservacion = UtilDate.getDefault(fechaRevisionObservacion);
        return this;
    }

    public ObservacionRevisionDTO setObservacion(final String observacion) {
        this.observacion = UtilText.applyTrim(observacion);
        return this;
    }

    public ObservacionRevisionDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public EscritorPublicacionDTO getEscritorPublicacion() {
        return escritorPublicacion;
    }

    public ComentarioRevisorDTO getComentarioRevisor() {
        return comentarioRevisor;
    }

    public LocalDateTime getFechaReportePublicacion() {
        return fechaReportePublicacion;
    }

    public LocalDateTime getFechaRevisionObservacion() {
        return fechaRevisionObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static ObservacionRevisionDTO create (){
        return new ObservacionRevisionDTO();
    }
}
