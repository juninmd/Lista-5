/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe4.br.edu.fatecfranca;

import exe4.br.edu.fatecfranca.Radio;
import exe4.br.edu.fatecfranca.TV;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Controle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TV tv = new TV(133, 10);
        tv.trocaCanal("Globo");
        JOptionPane.showMessageDialog(null, tv.assistir());
        tv.trocaCanal("SBT");
        JOptionPane.showMessageDialog(null, tv.toString());

        Radio radio = new Radio(200, 0);
        radio.trocaBanda("AM");
        radio.trocaEstacao("95,7");
        JOptionPane.showMessageDialog(null, radio.escutar());

        radio.trocaBanda("FM");
        radio.trocaEstacao("Hertz 96,5");
        JOptionPane.showMessageDialog(null, radio.toString());
        
    }

}
