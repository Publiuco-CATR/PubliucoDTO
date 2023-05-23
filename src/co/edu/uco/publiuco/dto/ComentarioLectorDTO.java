package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilBoolean;
import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
public final class ComentarioLectorDTO {
	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private boolean tienePadre;
	private String contenido;
	private LocalDateTime fechaComentario;
	private EstadoDTO estado;

	public ComentarioLectorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setComentarioPadre(ComentarioLectorDTO.create());
		setCotenido(UtilText.getDefaultValue());
		setFechaComentario(UtilDate.getDefaultValue());
		setEstado(EstadoDTO.create());
		setTienePadre(UtilBoolean.getDefaultValue());
	}



	public ComentarioLectorDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion, ComentarioLectorDTO comentarioPadre, String contenido, LocalDateTime fechaComentario, EstadoDTO estado, boolean tienePadre) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentarioPadre(comentarioPadre);
		setPublicacion(publicacion);
		setCotenido(contenido);
		setFechaComentario(fechaComentario);
		setEstado(estado);
		setTienePadre(tienePadre);
	}


	public UUID getIdentificador() {
		return identificador;
	}

	public LectorDTO getLector() {
		return lector;
	}

	public PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public ComentarioLectorDTO getComentarioPadre() {
		return comentarioPadre;
	}

	public String getCotenido() {
		return contenido;
	}

	public LocalDateTime getFechaComentario() {
		return fechaComentario;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public ComentarioLectorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public ComentarioLectorDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public ComentarioLectorDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public ComentarioLectorDTO setComentarioPadre(final ComentarioLectorDTO comentarioPadre) {
		if(tienePadre()) {
			this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDTO.create());
		}else {
			this.comentarioPadre = (ComentarioLectorDTO) UtilObject.getNullValue();
		}
		return this;
	}

	public ComentarioLectorDTO setEstado(final EstadoDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
		return this;
	}

	public ComentarioLectorDTO setCotenido(final String cotenido) {
		this.contenido = UtilText.applyTrim(cotenido);
		return this;
	}

	public ComentarioLectorDTO setFechaComentario(final LocalDateTime fechaComentario) {
		this.fechaComentario = UtilDate.getDefault(fechaComentario);
		return this;
	}

	public static ComentarioLectorDTO create (){
		return new ComentarioLectorDTO();
	}



	public boolean tienePadre() {
		return tienePadre;
	}

	public ComentarioLectorDTO setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}
}