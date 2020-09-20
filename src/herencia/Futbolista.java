/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author tavoGeek
 */
public class Futbolista extends SeleccionFutbol{
    
    private Integer dorsal;
    private String demarcacion;
    
    //Atributos propios
    private String posicion;
    private String patrocionador;
    private Boolean esTransferible;

    public Futbolista(Integer dorsal, String demarcacion, String posicion, String patrocionador, Boolean esTransferible, Integer id, String nombre, String apellidos, Integer edad, Boolean disponibleParaViajar, String genero, Integer numeroPolizaSeguroGMM) {
        super(id, nombre, apellidos, edad, disponibleParaViajar, genero, numeroPolizaSeguroGMM);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        this.posicion = posicion;
        this.patrocionador = patrocionador;
        this.esTransferible = esTransferible;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPatrocionador() {
        return patrocionador;
    }

    public void setPatrocionador(String patrocionador) {
        this.patrocionador = patrocionador;
    }

    public Boolean getEsTransferible() {
        return esTransferible;
    }

    public void setEsTransferible(Boolean esTransferible) {
        this.esTransferible = esTransferible;
    } 
    
    

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", posicion=" + posicion + ", patrocionador=" + patrocionador + ", esTransferible=" + esTransferible + '}';
    }
    
    public void jugarPartido(){
        // Metodo sin retorno
    }
    
    public void entrenar() {
        // Metodo sin retorno
    }
    
    // Metodos propios
    
    public String tirarPenal() {
        return this.nombre + " va a tirar un penal";
    }
    
    public String cobrarTiroDeEsquina() {
        return this.nombre + " va a cobrar tiro de esquina";
    }
    
    public String barrerse() {
        return this.nombre + " se ha barrido";
    }
    
}
