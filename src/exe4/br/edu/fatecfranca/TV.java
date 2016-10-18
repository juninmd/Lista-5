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
public class TV extends Produto {

    public String canal;
    public TV(int numeroSerial, int volume) {
        super(numeroSerial, volume);
    }

    public String assistir() {
        return this.toString();
    }

    public void trocaCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return this.canal;
    }

}
