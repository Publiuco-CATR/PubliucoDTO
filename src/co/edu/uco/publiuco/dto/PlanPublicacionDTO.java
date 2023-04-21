package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class PlanPublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoPlanDTO estado;
}
