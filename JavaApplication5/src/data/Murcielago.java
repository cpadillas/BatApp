/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import javax.swing.ImageIcon;

/**
 *
 * @author crist
 */
public class Murcielago {
    ImageIcon foto;
    String nombre;
    String alimentacion;
    Boolean hojaNasal; /*0=>Ausente, 1=>Presente*/
    Boolean colaLibre; /*0=>Contenida, 1=>Libre*/
    Boolean bolsasProtopatagio; /*0=>Ausente, 1=>Presente*/
    Boolean falangeTercerDedo; /*0=>Ausente, 1=>Presente*/

    public Murcielago(String nombre, String alimentacion, Boolean hojaNasal) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.hojaNasal = hojaNasal;
    }

    public Murcielago(String nombre, String alimentacion, Boolean hojaNasal, Boolean colaLibre, Boolean bolsasProtopatagio, Boolean falangeTercerDedo) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.hojaNasal = hojaNasal;
        this.colaLibre = colaLibre;
        this.bolsasProtopatagio = bolsasProtopatagio;
        this.falangeTercerDedo = falangeTercerDedo;
    }
    
    
}
