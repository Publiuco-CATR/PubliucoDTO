package co.edu.uco.publiuco.dto;

import java.util.UUID;

import static co.edu.uco.publiuco.dto.ValidacionesCrossCutting.*;

public class EstadoComentarioLectorDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    public EstadoComentarioLectorDTO(){
        setIdentificador(identificador);
        setNombre(obtenerValorDefecto());
        setDescripcion(obtenerValorDefecto());
    }
    public EstadoComentarioLectorDTO(UUID identificador, String nombre, String descripcion){
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public final EstadoComentarioLectorDTO setIdentificador(final UUID identificador) {
        this.identificador = identificador;
        if (!estaNulaLaCadena(identificador.toString())) {
            this.identificador = generarNuevoUUID();
        }
        return this;
    }

    public final EstadoComentarioLectorDTO setNombre(final String nombre) {

        this.nombre = "";
        if (!estaNulaLaCadena(nombre)) {
            this.nombre = nombre.trim();
        }

        return this;
    }

    public final EstadoComentarioLectorDTO setDescripcion(final String descripcion) {

        this.descripcion = descripcion;
        if(!estaNulaLaCadena(descripcion)){
            this.descripcion = getNombre();
        }

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
}
