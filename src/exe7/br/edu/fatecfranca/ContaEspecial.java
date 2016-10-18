/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe7.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class ContaEspecial {

    private String nomeCliente;
    private float salarioCliente;
    private int numeroConta;
    private float saldo;
    private float limite;

    /**
     *
     * @param nomeCliente
     * @param salarioCliente
     * @param numeroConta
     * @param saldo
     * @param limite
     * @throws Exception
     */
    public ContaEspecial(String nomeCliente, float salarioCliente, int numeroConta, float saldo, float limite) throws Exception {

        if (limite * 3 > salarioCliente) {
            throw new Exception("Seu limite não pode ser 3x maior que seu salário!");
        }
        this.nomeCliente = nomeCliente;
        this.salarioCliente = salarioCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean retira(float saldo) {
        if (this.saldo >= saldo) {
            this.saldo -= saldo;
            return true;
        }
        return false;
    }

    public float saldo() {
        return this.saldo;
    }
}
