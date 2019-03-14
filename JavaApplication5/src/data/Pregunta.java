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
public class Pregunta {
    int numero;
    String PreguntaA;
    String PreguntaN;
    ImageIcon Afirmativo;
    ImageIcon Negativo;

    public Pregunta(int numero, String PreguntaA, String PreguntaN, ImageIcon Afirmativo, ImageIcon Negativo) {
        this.numero = numero;
        this.PreguntaA = PreguntaA;
        this.PreguntaN = PreguntaN;
        this.Afirmativo = Afirmativo;
        this.Negativo = Negativo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPreguntaA() {
        return PreguntaA;
    }

    public String getPreguntaN() {
        return PreguntaN;
    }

    public ImageIcon getAfirmativo() {
        return Afirmativo;
    }

    public ImageIcon getNegativo() {
        return Negativo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPreguntaA(String PreguntaA) {
        this.PreguntaA = PreguntaA;
    }

    public void setPreguntaN(String PreguntaN) {
        this.PreguntaN = PreguntaN;
    }

    public void setAfirmativo(ImageIcon Afirmativo) {
        this.Afirmativo = Afirmativo;
    }

    public void setNegativo(ImageIcon Negativo) {
        this.Negativo = Negativo;
    }
    
    
}
