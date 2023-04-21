package co.edu.uco.publiuco.dto;

import java.util.UUID;
import static co.edu.uco.publiuco.dto.ValidacionesCrossCutting.*;

public class EstadoAdministradorCategoriaDTO {

    private UUID identificador;
    private String nombre;
    private String descripcion;

    public EstadoAdministradorCategoriaDTO(UUID identificador, String nombre, String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public EstadoAdministradorCategoriaDTO(){
        super();
        setIdentificador(identificador);
        setNombre(obtenerValorDefecto());
        setDescripcion(obtenerValorDefecto());
    }

    public final EstadoAdministradorCategoriaDTO setIdentificador(final UUID identificador) {
        this.identificador = identificador;
        if (!estaNulaLaCadena(identificador.toString())) {
            this.identificador = generarNuevoUUID();
        }
        return this;
    }

    public final EstadoAdministradorCategoriaDTO setNombre(final String nombre) {

        this.nombre = "";
        if (!estaNulaLaCadena(nombre)) {
            this.nombre = nombre.trim();
        }

        return this;
    }

    public final EstadoAdministradorCategoriaDTO setDescripcion(final String descripcion) {

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
