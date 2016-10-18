/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe1.br.edu.fatecfranca;

import exe1.br.edu.fatecfranca.Animal;
import exe1.br.edu.fatecfranca.BemTiVi;
import exe1.br.edu.fatecfranca.Cachorro;
import exe1.br.edu.fatecfranca.Mamifero;
import exe1.br.edu.fatecfranca.Papagaio;
import exe1.br.edu.fatecfranca.Passaro;
import exe1.br.edu.fatecfranca.Pitbull;
import exe1.br.edu.fatecfranca.Poodle;
import exe1.br.edu.fatecfranca.Vaca;

/**
 *
 * @author jr_ac
 */
public class TesteAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Animal() {
            {
                this.setNome("Animal Aleatório");
                this.imp();
                this.fala();
            }
        };

        new BemTiVi() {
            {
                this.setNome("Osvaldo");
                this.imp();
                this.fala();
            }
        };

        new Cachorro() {
            {
                this.setNome("Pluto");
                this.imp();
                this.setLateMuito();
                this.fala();
                this.setLatePouco();
                this.fala();
            }
        };

        new Mamifero() {
            {
                this.setNome("Manifero");
                this.imp();
                this.fala();
            }
        };

        new Papagaio() {
            {
                this.setNome("Louro José");
                this.imp();
                this.setVocabulario("Louro quer biscoito");
                this.fala();
            }
        };

        new Passaro() {
            {
                this.setNome("Bird");
                this.imp();
                this.fala();
            }
        };

        new Vaca() {
            {
                this.setNome("Muuuuuu");
                this.imp();
                this.fala();
            }
        };

        new Pitbull() {
            {
                this.setNome("Latino");
                this.imp();
                this.setLateMuito();
                this.enfurecer();
                this.enfurecer();
                this.enfurecer();
                this.fala();
                this.mostraInfo();
            }
        };

        new Poodle() {
            {
                this.setNome("Trevor");
                this.imp();
                this.setLateMuito();
                this.tosar();
                this.tosar();
                this.tosar();
                this.fala();
                this.mostraInfo();
            }
        };
    }
}
