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
    String Pregunta;
    ImageIcon Afirmativo;
    ImageIcon Negativo;

    public Pregunta(int numero, String Pregunta, ImageIcon Afirmativo, ImageIcon Negativo) {
        this.numero =  numero;
        this.Pregunta = Pregunta;
        this.Afirmativo = Afirmativo;
        this.Negativo = Negativo;
    }
}
