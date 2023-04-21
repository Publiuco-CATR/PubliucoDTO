package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class PublicacionDTO {
    private UUID identificador;
    private CategoriaDTO categoria;
    private TipoAccesoDTO tipoAcceso;
    private LocalDateTime fechaPublicacion;
    private VersionDTO versionPublicada;
    private EstadoPublicacionDTO estado;
}
