package co.edu.uco.publiuco.dto;

import java.util.UUID;

public class ComentarioRevisorDTO {
    private UUID identificador;
    private RevisorRevisionDTO revisorRevision;
    private TipoComentarioRevisorDTO tipoComentarioRevisor;
    private String comentario;
}
