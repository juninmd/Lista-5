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
public class Produto {

    private int numeroSerial;
    private int volume;
    private String status;

    public Produto(int numeroSerial, int volume) {
        this.numeroSerial = numeroSerial;
        this.volume = volume;
        this.status = "Não testado";
    }

    public boolean testaUnidade() {
        //90% de chance de estar ok
        int random = (int) (Math.random() * 10);
        if (random <= 9) {
            this.status = "aprovado";
            return true;
        } else {
            this.status = "reprovado";
            return false;
        }
    }

    public void setaVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Número Serial: " + this.numeroSerial + "\n"
                + "Volume:" + this.volume + "\n"
                + "Status:" + this.status;
    }

}
