package herencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tavoGeek
 */
public class SeleccionFutbol {
    
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;
    
    // Atributos propios
    protected Boolean disponibleParaViajar;
    protected String genero;
    protected Integer numeroPolizaSeguroGMM;

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad, Boolean disponibleParaViajar, String genero, Integer numeroPolizaSeguroGMM) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.disponibleParaViajar = disponibleParaViajar;
        this.genero = genero;
        this.numeroPolizaSeguroGMM = numeroPolizaSeguroGMM;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getDisponibleParaViajar() {
        return disponibleParaViajar;
    }

    public void setDisponibleParaViajar(Boolean disponibleParaViajar) {
        this.disponibleParaViajar = disponibleParaViajar;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNumeroPolizaSeguroGMM() {
        return numeroPolizaSeguroGMM;
    }

    public void setNumeroPolizaSeguroGMM(Integer numeroPolizaSeguroGMM) {
        this.numeroPolizaSeguroGMM = numeroPolizaSeguroGMM;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", disponibleParaViajar=" + disponibleParaViajar + ", genero=" + genero + ", numeroPolizaSeguroGMM=" + numeroPolizaSeguroGMM + '}';
    }
    
    public void concentrarse() {
        // Método sin retorno
    }
    
    public void viajar() {
        // Mètodo sin retorno
    }
    
    // Metodos propios
    public String dormir() {
        return this.nombre + " esta durmiendo";
    }
    
    public String despertar() {
        return this.nombre + " esta despertando";
    }
    
    public String comer() {
        return this.nombre + " esta comiendo";
    }
    
}
