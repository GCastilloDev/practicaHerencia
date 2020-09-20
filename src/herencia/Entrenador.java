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
public class Entrenador extends SeleccionFutbol{
    
    private Integer idFederacion;
    
    //Atributos propios
    private String[] equiposAnteriores;
    private boolean estaSuspendido;
    private boolean pasoTestPsicologico;

    public Entrenador(Integer idFederacion, String[] equiposAnteriores, boolean estaSuspendido, boolean pasoTestPsicologico, Integer id, String nombre, String apellidos, Integer edad, Boolean disponibleParaViajar, String genero, Integer numeroPolizaSeguroGMM) {
        super(id, nombre, apellidos, edad, disponibleParaViajar, genero, numeroPolizaSeguroGMM);
        this.idFederacion = idFederacion;
        this.equiposAnteriores = equiposAnteriores;
        this.estaSuspendido = estaSuspendido;
        this.pasoTestPsicologico = pasoTestPsicologico;
    }

    public Integer getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }

    public String[] getEquiposAnteriores() {
        return equiposAnteriores;
    }

    public void setEquiposAnteriores(String[] equiposAnteriores) {
        this.equiposAnteriores = equiposAnteriores;
    }

    public boolean isEstaSuspendido() {
        return estaSuspendido;
    }

    public void setEstaSuspendido(boolean estaSuspendido) {
        this.estaSuspendido = estaSuspendido;
    }

    public boolean isPasoTestPsicologico() {
        return pasoTestPsicologico;
    }

    public void setPasoTestPsicologico(boolean pasoTestPsicologico) {
        this.pasoTestPsicologico = pasoTestPsicologico;
    }

    public void dirigirPartido() {
        //Metodo sin retorno
    }
    
    public void dirigirEntramiento() {
        //Metodo sin retorno
    }
    
    //Metodos propios
    
    public String darPlaticaMotivacional() {
        return this.nombre + " esta motivando a la seleccion";
    }
    
    public String reganarJugador(String nombreJugador) {
        return this.nombre + " esta regañando a " + nombreJugador;
    }
    
    public String recalamarAlArbitro() {
        return this.nombre + " esta reclamandole al arbtitro";
    }
    
}
