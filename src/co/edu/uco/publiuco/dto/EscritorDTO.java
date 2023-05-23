package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class EscritorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;

    public EscritorDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaDTO.create());
        setEstado(EstadoDTO.create());
    }
    public EscritorDTO(UUID identificador, PersonaDTO datosPersona, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setEstado(estado);
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

    public EscritorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EscritorDTO setDatosPersona(final PersonaDTO datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaDTO.create());
        return this;
    }


    public EscritorDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado,EstadoDTO.create());
        return this;
    }
    public static EscritorDTO create (){
        return new EscritorDTO();
    }
}
