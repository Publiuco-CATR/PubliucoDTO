package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class PalabraClavePublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private String palabraClave;

    public PalabraClavePublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setPalabraClave(UtilText.getDefaultValue());
    }

    public PalabraClavePublicacionDTO(final UUID identificador, final PublicacionDTO publicacion, final String palabraClave) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setPalabraClave(palabraClave);
    }

    public PalabraClavePublicacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PalabraClavePublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion,PublicacionDTO.create());
        return this;
    }

    public PalabraClavePublicacionDTO setPalabraClave(final String palabraClave) {
        this.palabraClave = UtilText.applyTrim(palabraClave);
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public static PalabraClavePublicacionDTO create (){
        return new PalabraClavePublicacionDTO();
    }
}
