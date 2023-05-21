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
public class arquero extends personaje{
private int agilidad;
private int precision;

public void dispararFlecha (personaje atacado){
    //implementar
}
    @Override
    public void atacar(personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        if(this.precision>5)
            atacado.setVida(nivelActualDeVida - 60);
        else
            atacado.setVida(nivelActualDeVida - 7);

        atacado.defender(this);
    }
    /**
     * @return the agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * @return the precision
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * @param precision the precision to set
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }
}
