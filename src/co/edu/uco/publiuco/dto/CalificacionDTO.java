package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class CalificacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private LectorDTO lector;
    private LocalDateTime fechaCalificacion;
    private String calificacion;
}
