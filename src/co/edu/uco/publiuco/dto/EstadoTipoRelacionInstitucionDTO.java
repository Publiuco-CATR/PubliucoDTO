package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

//import static co.edu.uco.publiuco.dto.ValidacionesCrossCutting.*;

public final class EstadoTipoRelacionInstitucionDTO {

    private UUID identificador;
    private String nombre;
    private String descripcion;

    public EstadoTipoRelacionInstitucionDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }

    public EstadoTipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }
    
    @Override
	public String toString() {
		return "EstadoTipoRelacionInstitucionDTO [identificador=" + identificador + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + "]";
	}

	public final EstadoTipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoTipoRelacionInstitucionDTO setNombre(final String nombre) {

        UtilText.getUtilText();
		this.nombre = UtilText.applyTrim(nombre);

        return this;
    }

    public final EstadoTipoRelacionInstitucionDTO setDescripcion(final String descripcion) {

        UtilText.getUtilText();
		this.descripcion = UtilText.applyTrim(descripcion);

        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final String getDescripcion() {
        return descripcion;
    }
    
    public static EstadoTipoRelacionInstitucionDTO create(){
    	return new EstadoTipoRelacionInstitucionDTO();
    }
    
    public static void main(String[] args) {
		EstadoTipoRelacionInstitucionDTO objeto = new EstadoTipoRelacionInstitucionDTO();
		objeto.setIdentificador(UtilUUID.generateNewUUID());
		objeto.setNombre("docente");
		objeto.setDescripcion("Soy docente");
		
		EstadoTipoRelacionInstitucionDTO objetoDos = 
				EstadoTipoRelacionInstitucionDTO.create().setDescripcion("Soy Docente")
				.setIdentificador(UtilUUID.generateNewUUID())
				.setNombre("Docente");
		
		System.out.println(objeto);
		System.out.println(objetoDos);
	}
}