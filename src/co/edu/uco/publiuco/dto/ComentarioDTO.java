package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class ComentarioDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private ComentarioDTO comentarioPadre;
    private LectorDTO lector;
    private LocalDateTime fechaCalificacion;
    private String comentario;
    private EstadoComentarioLectorDTO estado;
}
