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

 

    

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Boolean getHojaNasal() {
        return hojaNasal;
    }

    public void setHojaNasal(Boolean hojaNasal) {
        this.hojaNasal = hojaNasal;
    }

    public Boolean getColaLibre() {
        return colaLibre;
    }

    public void setColaLibre(Boolean colaLibre) {
        this.colaLibre = colaLibre;
    }

    public Boolean getBolsasProtopatagio() {
        return bolsasProtopatagio;
    }

    public void setBolsasProtopatagio(Boolean bolsasProtopatagio) {
        this.bolsasProtopatagio = bolsasProtopatagio;
    }

    public Boolean getFalangeTercerDedo() {
        return falangeTercerDedo;
    }

    public void setFalangeTercerDedo(Boolean falangeTercerDedo) {
        this.falangeTercerDedo = falangeTercerDedo;
    }
    
    
}
