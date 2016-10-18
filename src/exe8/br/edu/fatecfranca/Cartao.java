/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe8.br.edu.fatecfranca;

import exe6.br.edu.fatecfranca.Conta;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Cartao {

    private String senha;
    private Conta conta;

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public void retirada(float saldo) {
        this.conta.retira(saldo);
    }

    public float saldo() {
        return this.conta.saldo();
    }

    public void alterarSenha(String senhaAntiga, String novaSenha) {
        if (this.senha.equals(senhaAntiga)) {
            this.senha = novaSenha;
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
}
