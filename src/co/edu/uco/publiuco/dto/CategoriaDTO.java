package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilBoolean;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class CategoriaDTO {
    private UUID identificador;
    private CategoriaDTO categoriaPadre;
    private boolean tienePadre;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;

    public CategoriaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoriaPadre(CategoriaDTO.create());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
        setTienePadre(UtilBoolean.getDefaultValue());
    }

    public CategoriaDTO(UUID identificador, CategoriaDTO categoriaPadre, String nombre, String descripcion, EstadoDTO estado, boolean tienePadre) {
        super();
        setIdentificador(identificador);
        setCategoriaPadre(categoriaPadre);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
        setTienePadre(tienePadre);
    }


    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaDTO getCategoriaPadre() {
        return categoriaPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public CategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public CategoriaDTO setCategoriaPadre(final CategoriaDTO categoriaPadre) {
        if(tienePadre()) {
            this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDTO.create());
        }else {
			this.categoriaPadre = (CategoriaDTO) UtilObject.getNullValue();
        }
    	return this;
    }

    public CategoriaDTO setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public CategoriaDTO setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public CategoriaDTO setEstado(final EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static CategoriaDTO create (){
        return new CategoriaDTO();
    }

	public boolean tienePadre() {
		return tienePadre;
	}

	public CategoriaDTO setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}
}
