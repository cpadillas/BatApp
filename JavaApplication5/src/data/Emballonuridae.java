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
public class Emballonuridae extends Murcielago{
    Boolean lineasDorsales;
    Boolean sacoGlandular;
    Boolean antebrazo; /*Es 1 si es mayor a 45mm*/

    public Emballonuridae(Boolean lineasDorsales, Boolean sacoGlandular, Boolean antebrazo, 
            String nombre, String alimentacion, Boolean hojaNasal, Boolean colaLibre, Boolean bolsasProtopatagio, 
            Boolean falangeTercerDedo) {
        super(nombre, alimentacion, hojaNasal, colaLibre, bolsasProtopatagio, falangeTercerDedo);
        this.lineasDorsales = lineasDorsales;
        this.sacoGlandular = sacoGlandular;
        this.antebrazo = antebrazo;
    }
}
