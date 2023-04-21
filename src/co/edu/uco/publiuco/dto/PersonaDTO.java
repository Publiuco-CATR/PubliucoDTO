package co.edu.uco.publiuco.dto;

import java.util.UUID;

public class PersonaDTO {
    private UUID identificador;
    private TipoIdentificacionDTO tipoIdentificacionDTO;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;
    private PaisDTO paisDTOTelefono;
    private String numeroTelefonoMovil;
    private EstadoPersonaDTO estado;
}
