package co.edu.uco.publiuco.dto;

import java.util.UUID;

public class  ValidacionesCrossCutting {
    public static boolean estaNulaLaCadena (String cadena) {
        return cadena == null;
    }

    public static UUID generarNuevoUUID() {
        return UUID.randomUUID(); //Faltaría validar que el UUID no exista para otro registro... supongo es responabilidad de componente PubliucoData
    }

    public static String obtenerValorDefecto(){
        return "";
    }
}
