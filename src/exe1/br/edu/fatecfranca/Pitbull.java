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
public class Pitbull extends Cachorro {

    private int raiva;

    public void enfurecer() {
        this.raiva += 10;
    }

    public void mostraInfo() {
        JOptionPane.showMessageDialog(null, this.raiva > 6 ? "O Pitbull se encontra Enfurecido!" : "O Pitbull está calmo", Pitbull.class.getSimpleName(), 1);
    }
}
