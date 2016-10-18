/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1.br.edu.fatecfranca;

import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Vaca extends Mamifero {

    @Override
    public void fala() {
        JOptionPane.showMessageDialog(null, "Muuu..", Vaca.class.getSimpleName(), 1);
    }
}
