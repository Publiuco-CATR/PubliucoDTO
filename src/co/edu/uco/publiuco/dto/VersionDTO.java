package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class VersionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private VersionDTO versionAnterior;
    private int numeroVersion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaFechaModificacion;
    private String titulo;
    private String resumen;
    private String cuerpo;
    private EstadoVersionDTO estado;


}
