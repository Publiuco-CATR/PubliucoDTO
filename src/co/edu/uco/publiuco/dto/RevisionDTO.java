package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class RevisionDTO {
    private UUID identificador;
    private VersionDTO version;
    private TipoRevisionDTO tipoRevision;
    private LocalDateTime fechaSolicitudRevision;
    private LocalDateTime fechaLimiteRevision;
    private LocalDateTime fechaCompletitudRevision;
    private EstadoRevisionDTO estado;
}
