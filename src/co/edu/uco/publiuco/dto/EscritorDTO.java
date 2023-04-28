package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class EscritorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private TipoRelacionInstitucionDTO tipoRelacionInstitucion;
    private EstadoDTO estado;

    public EscritorDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaDTO.create());
        setTipoRelacionInstitucion(TipoRelacionInstitucionDTO.create());
        setEstado(EstadoDTO.create());
    }
    public EscritorDTO(final UUID identificador, final PersonaDTO datosPersona, final TipoRelacionInstitucionDTO tipoRelacionInstitucion, final EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
        setEstado(estado);
    }

    public EscritorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EscritorDTO setDatosPersona(final PersonaDTO datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaDTO.create());
        return this;
    }

    public EscritorDTO setTipoRelacionInstitucion(final TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionDTO.create());
        return this;
    }

    public EscritorDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado,EstadoDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaDTO getDatosPersona() {
        return datosPersona;
    }

    public TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public static EscritorDTO create (){
        return new EscritorDTO();
    }
}
