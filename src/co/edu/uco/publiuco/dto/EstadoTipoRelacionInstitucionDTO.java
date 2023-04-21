package co.edu.uco.publiuco.dto;

import java.util.UUID;
public final class EstadoTipoRelacionInstitucionDTO {

    private UUID identificador;
    private String nombre;
    private String descripcion;

    public EstadoTipoRelacionInstitucionDTO() {
        super();
        this.identificador = generarNuevoUUID();
        this.nombre = obtenerValorDefecto();
        this.descripcion = obtenerValorDefecto();
    }

    public EstadoTipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final EstadoTipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
        this.identificador = identificador;
        if (!esVaciaONulaLaCadena(identificador.toString())) {
            this.identificador = generarNuevoUUID();
        }
        return this;
    }

    public final String getNombre() {
        return nombre;
    }

    public final EstadoTipoRelacionInstitucionDTO setNombre(final String nombre) {

        if (!esVaciaONulaLaCadena(nombre)) {
            this.nombre = nombre.trim();
        }

        return this;
    }

    public final String getDescripcion() {
        return descripcion;
    }

    public final EstadoTipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
        this.descripcion = descripcion;

        if(esVaciaONulaLaCadena(descripcion)){
            this.descripcion = getNombre();
        }

        return this;
    }

    //INICIO Métodos de CROSS CUTTING (No sé como traerlo desde el componente PublicucoCrossCutting)

    public static boolean esVaciaONulaLaCadena (String cadena) {
        return cadena == null || "".equals(cadena.trim().intern());
    }

    public static UUID generarNuevoUUID() {
        return UUID.randomUUID(); //Faltaría validar que el UUID no exista para otro registro... supongo es del componente PubliucoData
    }

    public static String obtenerValorDefecto(){
        return "";
    }

    //FIN MÉTODOS CROSS CUTTING

}