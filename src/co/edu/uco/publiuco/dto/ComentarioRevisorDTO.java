package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class ComentarioRevisorDTO {
    private UUID identificador;
    private RevisorRevisionDTO revisorRevision;
    private TipoComentarioRevisorDTO tipo;
    private String contenido;

    public ComentarioRevisorDTO(UUID identificador, RevisorRevisionDTO revisorRevision, TipoComentarioRevisorDTO tipo, String contenido) {
        super();
        setIdentificador(identificador);
        setRevisorRevision(revisorRevision);
        setTipo(tipo);
        setContenido(contenido);

    }
    public ComentarioRevisorDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setRevisorRevision(RevisorRevisionDTO.create());
        setTipo(TipoComentarioRevisorDTO.create());
        setContenido(UtilText.getDefaultValue());

    }

    public UUID getIdentificador() {
        return identificador;
    }

    public RevisorRevisionDTO getRevisorRevision() {
        return revisorRevision;
    }

    public TipoComentarioRevisorDTO getTipo() {
        return tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public ComentarioRevisorDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ComentarioRevisorDTO setRevisorRevision(final RevisorRevisionDTO revisorRevision) {
        this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionDTO.create());
        return this;
    }

    public ComentarioRevisorDTO setTipo(final TipoComentarioRevisorDTO tipoComentarioRevisor) {
        this.tipo = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorDTO.create());
        return this;
    }

    public ComentarioRevisorDTO setContenido(final String contenido) {
        this.contenido = UtilText.applyTrim(contenido);
        return this;
    }
    public static ComentarioRevisorDTO create (){
        return new ComentarioRevisorDTO();
    }
}
