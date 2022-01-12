package co.com.choucair.certificacion.test.models.builder;

import co.com.choucair.certificacion.test.models.Registro;
import co.com.choucair.certificacion.test.utils.Builder;

public class RegistroBuilder implements Builder<Registro> {

    //variables
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


    public RegistroBuilder() {
        nombre = "";
        apellido = "";
        direccion = "";
        email = "";
        telefono = "";
        genero = "";
        hobbies = "";
        lenguajes = "";
        habilidades = "";
        pais = "";
        diaNacimiento = "";
        mesNacimiento = "";
        anioNacimiento = "";
        contrasena = "";
    }

    //constructor del gradle, con apunte a, como conector que lleva a la funcion que llena los set del builder
    public static RegistroBuilder con() {
        return new RegistroBuilder();
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDiaNacimiento(String diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setAnioNacimiento(String anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Registro informacionUsuario() {
        setNombre("Emmanuel");
        setApellido("Ruiz");
        setDireccion("Carrera 80");
        setEmail("emanuel@gmail.com");
        setTelefono("2808080");
        setGenero("Male");
        setHobbies("Movies");
        setLenguajes("Arabic");
        setHabilidades("AutoCAD");
        setPais("Japan");
        return build();
    }

    @Override
    public Registro build() {
        return new Registro(this);
    }
}