/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author KELVIN VR
 */
public class guerrero extends personaje {
    private int fuerza;
    private int resistencia;
    
    public void ataqueEspecial(personaje atacado){
        //implementar
    }

    @Override
    public void atacar(personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 20);
        atacado.defender(this);
    }
    
    /**
     * @return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the resistencia
     */
    public int getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }  
}
