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
public class Cachorro extends Mamifero {

    private boolean lateMuito;

    public Cachorro(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }

    public Cachorro() {
        this.lateMuito = false;
    }

    public void setLateMuito() {
        this.lateMuito = true;
    }

    public void setLatePouco() {
        this.lateMuito = false;
    }

    @Override
    public void fala() {
        if (this.lateMuito) {
            JOptionPane.showMessageDialog(null, "AU! AU!", Cachorro.class.getSimpleName(), 1);
        } else {
            JOptionPane.showMessageDialog(null, "au, au...", Cachorro.class.getSimpleName(), 1);
        }
    }
}
