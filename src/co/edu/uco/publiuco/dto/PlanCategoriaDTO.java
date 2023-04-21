package co.edu.uco.publiuco.dto;

import java.util.UUID;
import java.time.LocalDateTime;

public class PlanCategoriaDTO {
    private UUID identificador;
    private CategoriaDTO categoria;
    private double precio;
    private LocalDateTime fechaDesde;
    private LocalDateTime fechaHasta;
    private EstadoPlanDTO estado;
}
