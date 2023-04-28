package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class LectorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;

    public LectorDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaDTO.create());
        setEstado(EstadoDTO.create());
    }

    public LectorDTO(final UUID identificador, final PersonaDTO datosPersona, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setEstado(estado);
    }

    public LectorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public LectorDTO setDatosPersona(final PersonaDTO datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaDTO.create());
        return this;
    }

    public LectorDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaDTO getDatosPersona() {
        return datosPersona;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static LectorDTO create (){
        return new LectorDTO();
    }
}
