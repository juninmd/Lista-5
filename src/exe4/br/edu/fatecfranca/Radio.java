/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe4.br.edu.fatecfranca;

/**
 *
 * @author jr_ac
 */
public class Radio extends Produto {

    private String banda;
    private String estacao;

    public Radio(int numeroSerial, int volume) {
        super(numeroSerial, volume);
    }

    public String escutar() {
        return "Você está ouvindo: " + this.toString();
    }

    public void trocaBanda(String banda) {
        this.banda = banda;
    }

    public void trocaEstacao(String estacao) {
         this.estacao = estacao;
    }

    @Override
    public String toString() {
        return this.estacao + "/" + this.banda;
    }

}
