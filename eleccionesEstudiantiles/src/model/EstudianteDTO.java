package model;

public class EstudianteDTO {
    // Variables
    private int numeroIdentificacion;
    private String nombre;
    private String apellido;
    private String correo;
    private int numeroTelefonico;
    private char sexo;
    private String estado;
    private int idCarrera;
    private int idMunicipio;

    // Metodo Constructor
    public EstudianteDTO(int numeroIdentificacion, String nombre, String apellido, String correo, int numeroTelefonico,
                         char sexo, String estado, int idCarrera, int idMunicipio) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroTelefonico = numeroTelefonico;
        this.sexo = sexo;
        this.estado = estado;
        this.idCarrera = idCarrera;
        this.idMunicipio = idMunicipio;
    }

    // Metodos Propios
    public void registrarEstudiante() {

    }
}
