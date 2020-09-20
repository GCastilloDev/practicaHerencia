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
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private Integer aniosExperiencia;
    
    // Atributos propios
    private Boolean estaTitulada;
    private String[] tiposDeMasajes;
    private Boolean estaActualizada;

    public Masajista(String titulacion, Integer aniosExperiencia, Boolean estaTitulada, String[] tiposDeMasajes, Boolean estaActualizada, Integer id, String nombre, String apellidos, Integer edad, Boolean disponibleParaViajar, String genero, Integer numeroPolizaSeguroGMM) {
        super(id, nombre, apellidos, edad, disponibleParaViajar, genero, numeroPolizaSeguroGMM);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
        this.estaTitulada = estaTitulada;
        this.tiposDeMasajes = tiposDeMasajes;
        this.estaActualizada = estaActualizada;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Boolean getEstaTitulada() {
        return estaTitulada;
    }

    public void setEstaTitulada(Boolean estaTitulada) {
        this.estaTitulada = estaTitulada;
    }

    public String[] getTiposDeMasajes() {
        return tiposDeMasajes;
    }

    public void setTiposDeMasajes(String[] tiposDeMasajes) {
        this.tiposDeMasajes = tiposDeMasajes;
    }

    public Boolean getEstaActualizada() {
        return estaActualizada;
    }

    public void setEstaActualizada(Boolean estaActualizada) {
        this.estaActualizada = estaActualizada;
    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + ", estaTitulada=" + estaTitulada + ", tiposDeMasajes=" + tiposDeMasajes + ", estaActualizada=" + estaActualizada + '}';
    }
    
    public void darMasaje() {
        //Metodo sin retorno
    }
    
    // Metodos propios
    
    public String untarAceite() {
        return this.nombre + " esta untando aceite para el masaje";
    }
    
    public String prepararCamaDeMasaje() {
        return this.nombre + " esta preparando la cama de masajes";
    }
    
    public String crearValoracion() {
        return this.nombre + " esta escribiendo la valoracion del masaje";
    }
    
    
    
}
