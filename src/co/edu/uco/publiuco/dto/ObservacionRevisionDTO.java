package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class ObservacionRevisionDTO {
    private UUID identificador;
    private EscritorPublicacionDTO escritorPublicacion;
    private ComentarioRevisorDTO comentarioRevisor;
    private LocalDateTime fechaReportePublicacion;
    private LocalDateTime fechaRevisionObservacion;
    private String observacion;
    private EstadoObservacionRevisorDTO estado;
}
