package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class SuscripcionCategoriaDTO {
    private UUID identificador;
    private PerfilDTO perfil;
    private PlanCategoriaDTO planCategoria;

    public SuscripcionCategoriaDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setPerfil(PerfilDTO.create());
        setPlanCategoria(PlanCategoriaDTO.create());
    }

    public SuscripcionCategoriaDTO(final UUID identificador,final PerfilDTO perfil, final PlanCategoriaDTO planCategoria) {
        setIdentificador(identificador);
        setPerfil(perfil);
        setPlanCategoria(planCategoria);
    }

    public SuscripcionCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public SuscripcionCategoriaDTO setPerfil(final PerfilDTO perfil) {
        this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
        return this;
    }

    public SuscripcionCategoriaDTO setPlanCategoria(final PlanCategoriaDTO planCategoria) {
        this.planCategoria = UtilObject.getDefault(planCategoria, PlanCategoriaDTO.create());
        return this;
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PerfilDTO getPerfil() {
        return perfil;
    }

    public PlanCategoriaDTO getPlanCategoria() {
        return planCategoria;
    }

    public static SuscripcionCategoriaDTO create (){
        return new SuscripcionCategoriaDTO();
    }
}
