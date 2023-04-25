package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class PaisDTO {
    private UUID identificador;
    private String nombre;
    private String indicadorPais;

    public PaisDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getDefaultValue());
        setIndicadorPais(UtilText.getDefaultValue());
    }

    public PaisDTO(UUID identificador, String nombre, String indicadorPais) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setIndicadorPais(indicadorPais);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIndicadorPais() {
        return indicadorPais;
    }

    public PaisDTO setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    public PaisDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public PaisDTO setIndicadorPais(String indicadorPais) {
        this.indicadorPais = UtilText.applyTrim(indicadorPais);
        return this;
    }
}
