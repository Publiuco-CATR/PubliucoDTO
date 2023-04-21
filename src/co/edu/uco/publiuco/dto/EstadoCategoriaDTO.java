package co.edu.uco.publiuco.dto;

import java.util.UUID;

import static co.edu.uco.publiuco.dto.ValidacionesCrossCutting.*;

public class EstadoCategoriaDTO {

    private UUID identificador;
    private String nombre;
    private String descripcion;

    public EstadoCategoriaDTO(UUID identificador, String nombre, String descripcion){
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public EstadoCategoriaDTO(){
        setIdentificador(identificador);
        setNombre(obtenerValorDefecto());
        setDescripcion(obtenerValorDefecto());
    }

    public final EstadoCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = identificador;
        if (!estaNulaLaCadena(identificador.toString())) {
            this.identificador = generarNuevoUUID();
        }
        return this;
    }

    public final EstadoCategoriaDTO setNombre(final String nombre) {

        this.nombre = "";
        if (!estaNulaLaCadena(nombre)) {
            this.nombre = nombre.trim();
        }

        return this;
    }

    public final EstadoCategoriaDTO setDescripcion(final String descripcion) {

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
