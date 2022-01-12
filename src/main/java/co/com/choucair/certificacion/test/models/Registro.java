package co.com.choucair.certificacion.test.models;

import co.com.choucair.certificacion.test.models.builder.RegistroBuilder;

public class Registro {
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private String telefono;
    private String genero;
    private String hobbies;
    private String lenguajes;
    private String habilidades;
    private String pais;
    private String diaNacimiento;
    private String mesNacimiento;
    private String anioNacimiento;
    private String contrasena;

    public Registro( RegistroBuilder registroBuilder) {
        this.nombre = registroBuilder.getNombre();
        this.apellido = registroBuilder.getApellido();
        this.direccion = registroBuilder.getDireccion();
        this.email = registroBuilder.getEmail();
        this.telefono = registroBuilder.getTelefono();
        this.genero = registroBuilder.getGenero();
        this.hobbies = registroBuilder.getHobbies();
        this.lenguajes = registroBuilder.getLenguajes();
        this.habilidades = registroBuilder.getHabilidades();
        this.pais = registroBuilder.getPais();
        this.diaNacimiento = registroBuilder.getDiaNacimiento();
        this.mesNacimiento = registroBuilder.getMesNacimiento();
        this.anioNacimiento = registroBuilder.getAnioNacimiento();
        this.contrasena = registroBuilder.getContrasena();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getGenero() {
        return genero;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public String getPais() {
        return pais;
    }

    public String getDiaNacimiento() {
        return diaNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public String getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }
}
