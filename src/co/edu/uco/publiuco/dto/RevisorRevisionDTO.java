package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class RevisorRevisionDTO {
    private UUID identificador;
    private RevisionDTO revision;
    private RevisorDTO revisor;
    private LocalDateTime fechaAsignacionRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoRevisionDTO estado;
}
