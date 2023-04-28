package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class SuscripcionPublicacionDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private PlanPublicacionDTO planPublicacion;

    public SuscripcionPublicacionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilDTO.create());
        setPlanPublicacion(PlanPublicacionDTO.create());
    }
    public SuscripcionPublicacionDTO(final UUID identificador,final PerfilDTO perfil, final PlanPublicacionDTO planPublicacion) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setPlanPublicacion(planPublicacion);
    }

    public SuscripcionPublicacionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public SuscripcionPublicacionDTO setPerfil(final PerfilDTO perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
        return this;
    }

    public SuscripcionPublicacionDTO setPlanPublicacion(final PlanPublicacionDTO planPublicacion) {
        this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilDTO getPerfil() {
        return perfil;
    }

    public PlanPublicacionDTO getPlanPublicacion() {
        return planPublicacion;
    }

    public static SuscripcionPublicacionDTO create (){
        return new SuscripcionPublicacionDTO();
    }
}
