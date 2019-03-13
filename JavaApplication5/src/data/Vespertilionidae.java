/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author crist
 */
public class Vespertilionidae extends Murcielago{
    Boolean paridadIncisivos;
    int premolaresSuperiores;
    int premolaresInferiores;

    public Vespertilionidae(Boolean paridadIncisivos, int premolaresSuperiores, int premolaresInferiores, String nombre, 
            String alimentacion, Boolean hojaNasal, Boolean colaLibre, Boolean bolsasProtopatagio, Boolean falangeTercerDedo) {
        super(nombre, alimentacion, hojaNasal, colaLibre, bolsasProtopatagio, falangeTercerDedo);
        this.paridadIncisivos = paridadIncisivos;
        this.premolaresSuperiores = premolaresSuperiores;
        this.premolaresInferiores = premolaresInferiores;
    }
   
}
