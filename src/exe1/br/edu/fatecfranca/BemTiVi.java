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
public class BemTiVi extends Passaro {

    @Override
    public void fala() {
        JOptionPane.showMessageDialog(null, "bem-ti-vi", BemTiVi.class.getSimpleName(), 1);
    }

}
