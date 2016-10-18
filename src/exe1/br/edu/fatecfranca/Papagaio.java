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
public class Papagaio extends Passaro {

    private String vocabulario;

    public Papagaio(String vocabulario) {
        this.vocabulario = vocabulario;
    }

    public Papagaio() {
    }

    @Override
    public void fala() {
        JOptionPane.showMessageDialog(null, this.vocabulario, Papagaio.class.getSimpleName(), 1);
    }

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }

}
