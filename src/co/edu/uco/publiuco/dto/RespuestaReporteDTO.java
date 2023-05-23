package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

public class RespuestaReporteDTO {
	private UUID identificador;
	private ReporteDTO reporte;
	private CategoriaAdministradorCategoriaDTO administradorCategoria;
	private LocalDateTime fechaRespuestaReporte;
	private String justificacion;
	private EstadoDTO veredicto;
	
	public RespuestaReporteDTO() {
		setIdentificador(UtilUUID.getDefaultValue());
		setAdministradorCategoria(CategoriaAdministradorCategoriaDTO.create());
		setReporte(ReporteDTO.create());
		setFechaRespuestaReporte(UtilDate.getDefaultValue());
		setJustificacion(UtilText.getDefaultValue());
		setVeredicto(EstadoDTO.create());
	}
	public RespuestaReporteDTO(UUID identificador, ReporteDTO reporte,
			CategoriaAdministradorCategoriaDTO administradorCategoria, LocalDateTime fechaRespuestaReporte,
			String justificacion, EstadoDTO veredicto) {
		setIdentificador(identificador);
		setAdministradorCategoria(administradorCategoria);
		setReporte(reporte);
		setFechaRespuestaReporte(fechaRespuestaReporte);
		setJustificacion(justificacion);
		setVeredicto(veredicto);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public RespuestaReporteDTO setIdentificador(UUID identificador) {
		this.identificador = identificador;
		return this;
	}
	public ReporteDTO getReporte() {
		return reporte;
	}
	public RespuestaReporteDTO setReporte(ReporteDTO reporte) {
		this.reporte = reporte;
		return this;
	}
	public CategoriaAdministradorCategoriaDTO getAdministradorCategoria() {
		return administradorCategoria;
	}
	public RespuestaReporteDTO setAdministradorCategoria(CategoriaAdministradorCategoriaDTO administradorCategoria) {
		this.administradorCategoria = administradorCategoria;
		return this;
	}
	public LocalDateTime getFechaRespuestaReporte() {
		return fechaRespuestaReporte;
	}
	public RespuestaReporteDTO setFechaRespuestaReporte(LocalDateTime fechaRespuestaReporte) {
		this.fechaRespuestaReporte = fechaRespuestaReporte;
		return this;
	}
	public String getJustificacion() {
		return justificacion;
	}
	public RespuestaReporteDTO setJustificacion(String justificacion) {
		this.justificacion = justificacion;
		return this;
	}
	public EstadoDTO getVeredicto() {
		return veredicto;
	}
	public RespuestaReporteDTO setVeredicto(EstadoDTO veredicto) {
		this.veredicto = veredicto;
		return this;
	}
	public static RespuestaReporteDTO create (){
        return new RespuestaReporteDTO();
    }
}
