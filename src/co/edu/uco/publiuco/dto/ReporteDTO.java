package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

public class ReporteDTO {
    private UUID identificador;
    private LectorDTO lector;
    private ComentarioDTO comentario;
    private String razon;
    private TipoReporteDTO tipoReporte;
    private LocalDateTime fechaReporte;
}
