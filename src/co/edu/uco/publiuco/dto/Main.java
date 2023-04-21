package co.edu.uco.publiuco.dto;

public class Main {
    public static void main(String[] args) {
        EstadoTipoRelacionInstitucionDTO ensayo = new EstadoTipoRelacionInstitucionDTO();

        System.out.println("id: " + ensayo.getIdentificador() +  " nom: " + ensayo.getNombre() + " descrp: " + ensayo.getDescripcion());
    }
}
