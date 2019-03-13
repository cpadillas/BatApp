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
public class Phyllostomidae extends Murcielago{
    Boolean hocicoLargoYAngost;
    Boolean trianguloHoja;
    Boolean surcoProfundo;
    Boolean lenguaLarga;
    Boolean polexDesarrollado;
    Boolean cola;
    Boolean uropatagioDesarrollado;
    Boolean hocicoRedondeado;
    Boolean lineasDorsales;
    Boolean lineasFaciales;
    Boolean premolaresInferiores; /*0=> 2, 1=>3*/
    Boolean membranaLateral; /*0=>Anclada al pie, 1=>Anclada a tobillos*/
    Boolean largoCalcar; /*0=>Mayor o igual que el pie, 1=>Menor que el pie*/
    Boolean largoOreja; /*0=>Menor que 25mm, 1=> Mayor que 25mm*/
    Boolean crestaSagital;
    Boolean primerIncisivo; /*1=>Mas alto que ancho*/
    Boolean protuberanciaLabioYMenton;
    Boolean sierraFinaHojaNasal;
    Boolean colaLarga;
    Boolean dosIncisivosInferiores;
    Boolean verrugasBarbilla;
    char tamañoOrejas; /*S=>Mediana, M=>Grande, L=>Muy Grande*/
    char tamañoHojaNasal; /*S=>Mediana, M=>Grande, L=>Muy Grande*/
    Boolean premolarInferiorDoblePrimerMolar;
    Boolean igualdadIncisivosExterInter;
    Boolean entradaMuescaMandibular;
    Boolean molaresSuperiores; /*Tiene 2*/
    Boolean molaresInferiores; /*Tiene 3*/
    Boolean prepostOrbitalesDesarrollados;
    Boolean pelajeMoteado;
    Boolean todosIncisivosBilobados;
    Boolean igualdadIncisivosSuperiores;
    Boolean craneoRecto;
    Boolean depresionRostro;
    Boolean incisivosInferioresTrilobulados;
    Boolean incisivosMediosBifidos;
    int cuspidesAccesorias;
    public static String Familia;

    public Phyllostomidae(Boolean hocicoLargoYAngost, Boolean trianguloHoja, Boolean surcoProfundo, Boolean lenguaLarga, 
            Boolean polexDesarrollado, Boolean cola, Boolean uropatagioDesarrollado, Boolean hocicoRedondeado, 
            Boolean lineasDorsales, Boolean lineasFaciales, Boolean premolaresInferiores, Boolean membranaLateral, 
            Boolean largoCalcar, Boolean largoOreja, Boolean crestaSagital, Boolean primerIncisivo, 
            Boolean protuberanciaLabioYMenton, Boolean sierraFinaHojaNasal, Boolean largoCola, Boolean dosIncisivosInferiores, 
            Boolean verrugasBarbilla, char tamañoOrejas, char tamañoHojaNasal, Boolean premolarInferiorDoblePrimerMolar, 
            Boolean igualdadIncisivosExterInter, Boolean entradaMuescaMandibular, Boolean molaresSuperiores, 
            Boolean molaresInferiores, Boolean prepostOrbitalesDesarrollados, Boolean pelajeMoteado, 
            Boolean todosIncisivosBilobados, Boolean igualdadIncisivosSuperiores, Boolean craneoRecto, Boolean depresionRostro, 
            Boolean incisivosInferioresTrilobulados, Boolean incisivosMediosBifidos, int cuspidesAccesorias, 
            String nombre, String alimentacion, Boolean hojaNasal) {
        super(nombre, alimentacion, hojaNasal);
        this.hocicoLargoYAngost = hocicoLargoYAngost;
        this.trianguloHoja = trianguloHoja;
        this.surcoProfundo = surcoProfundo;
        this.lenguaLarga = lenguaLarga;
        this.polexDesarrollado = polexDesarrollado;
        this.cola = cola;
        this.uropatagioDesarrollado = uropatagioDesarrollado;
        this.hocicoRedondeado = hocicoRedondeado;
        this.lineasDorsales = lineasDorsales;
        this.lineasFaciales = lineasFaciales;
        this.premolaresInferiores = premolaresInferiores;
        this.membranaLateral = membranaLateral;
        this.largoCalcar = largoCalcar;
        this.largoOreja = largoOreja;
        this.crestaSagital = crestaSagital;
        this.primerIncisivo = primerIncisivo;
        this.protuberanciaLabioYMenton = protuberanciaLabioYMenton;
        this.sierraFinaHojaNasal = sierraFinaHojaNasal;
        this.colaLarga = largoCola;
        this.dosIncisivosInferiores = dosIncisivosInferiores;
        this.verrugasBarbilla = verrugasBarbilla;
        this.tamañoOrejas = tamañoOrejas;
        this.tamañoHojaNasal = tamañoHojaNasal;
        this.premolarInferiorDoblePrimerMolar = premolarInferiorDoblePrimerMolar;
        this.igualdadIncisivosExterInter = igualdadIncisivosExterInter;
        this.entradaMuescaMandibular = entradaMuescaMandibular;
        this.molaresSuperiores = molaresSuperiores;
        this.molaresInferiores = molaresInferiores;
        this.prepostOrbitalesDesarrollados = prepostOrbitalesDesarrollados;
        this.pelajeMoteado = pelajeMoteado;
        this.todosIncisivosBilobados = todosIncisivosBilobados;
        this.igualdadIncisivosSuperiores = igualdadIncisivosSuperiores;
        this.craneoRecto = craneoRecto;
        this.depresionRostro = depresionRostro;
        this.incisivosInferioresTrilobulados = incisivosInferioresTrilobulados;
        this.incisivosMediosBifidos = incisivosMediosBifidos;
        this.cuspidesAccesorias = cuspidesAccesorias;
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

    public static String getFamilia() {
        return Familia;
    }

    public static void setFamilia(String Familia) {
        Phyllostomidae.Familia = Familia;
    }
    
    
    
}
