/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author salan503
 */
public class HojaDeVida {
    
    private String Intereses;
    private Estudio listaestudios [];
    private Empleos experiencia [];
    private Acercade acercade;
    
    HojaDeVida(String Intereses, Estudio [] listaestudios, Empleos [] experiencia, Acercade acercade){
        this.Intereses = Intereses;
        this.listaestudios = listaestudios;
        this.experiencia = experiencia;
        this.acercade = acercade;
    }

    public String getIntereses() {
        return Intereses;
    }

    public void setIntereses(String Intereses) {
        this.Intereses = Intereses;
    }

    public Estudio[] getListaestudios() {
        return listaestudios;
    }

    public void setListaestudios(Estudio[] listaestudios) {
        this.listaestudios = listaestudios;
    }

    public Empleos[] getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Empleos[] experiencia) {
        this.experiencia = experiencia;
    }

    public Acercade getAcercade() {
        return acercade;
    }

    public void setAcercade(Acercade acercade) {
        this.acercade = acercade;
    }
    
    
}
