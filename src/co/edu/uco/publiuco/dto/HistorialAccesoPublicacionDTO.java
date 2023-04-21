package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class HistorialAccesoPublicacionDTO {
    private UUID identificador;
    private LectorDTO lector;
    private PublicacionDTO publicacion;
    private LocalDateTime fechaAcceso;
}
