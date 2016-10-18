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
public class Poodle extends Cachorro {

    private int pelo;

    public Poodle() {
        this.pelo = 100;
    }

    public void tosar() {
        if (this.pelo >= 50) {
            this.pelo -= 50;
        } else {
            JOptionPane.showMessageDialog(null, "O poodle está tosado.", Poodle.class.getSimpleName(), 1);
        }
    }

    public void mostraInfo() {
        JOptionPane.showMessageDialog(null, this.pelo > 0 ? "O Poodle está todo tosado!" : "O Poodle ainda tem pelo", Poodle.class.getSimpleName(), 1);
    }
}
