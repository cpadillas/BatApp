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
public class Emballonuridae extends Murcielago{
    Boolean lineasDorsales;
    Boolean sacoGlandular;
    Boolean antebrazo; /*Es 1 si es mayor a 45mm*/
    public static String Familia;
    

    public Emballonuridae(Boolean lineasDorsales, Boolean sacoGlandular, Boolean antebrazo, 
            String nombre, String alimentacion, Boolean hojaNasal, Boolean colaLibre, Boolean bolsasProtopatagio, 
            Boolean falangeTercerDedo) {
        super(nombre, alimentacion, hojaNasal, colaLibre, bolsasProtopatagio, falangeTercerDedo);
        this.lineasDorsales = lineasDorsales;
        this.sacoGlandular = sacoGlandular;
        this.antebrazo = antebrazo;
    }
    

    public Boolean getLineasDorsales() {
        return lineasDorsales;
    }

    public void setLineasDorsales(Boolean lineasDorsales) {
        this.lineasDorsales = lineasDorsales;
    }

    public Boolean getSacoGlandular() {
        return sacoGlandular;
    }

    public void setSacoGlandular(Boolean sacoGlandular) {
        this.sacoGlandular = sacoGlandular;
    }

    public Boolean getAntebrazo() {
        return antebrazo;
    }

    public void setAntebrazo(Boolean antebrazo) {
        this.antebrazo = antebrazo;
    }

    public static String getFamilia() {
        return Familia;
    }

    public static void setFamilia(String Familia) {
        Emballonuridae.Familia = Familia;
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


