/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.exe5.br.edu.fatecfranca;

import exe5.br.edu.fatecfranca.Coisa;
import exe5.br.edu.fatecfranca.Papel;
import exe5.br.edu.fatecfranca.Pedra;
import exe5.br.edu.fatecfranca.Tesoura;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class Jogo {

    public enum Meios {
        Pedra,
        Papel,
        Tesoura
    }

    public enum StatusPartida {
        Empate,
        Vitoria,
        Derrota
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here]]

        Coisa c1 = GeraAdversario();
        Coisa c2 = GeraAdversario();

        JOptionPane.showMessageDialog(null, Duelar(c1, c2));

    }

    public static String Duelar(Coisa a, Coisa b) {
        switch (duela(a, b)) {
            case Vitoria:
                return WhoIAm(a).name() + " obteve vitória sobre " + WhoIAm(b).name();
            case Empate:
                return WhoIAm(a).name() + " empatou com " + WhoIAm(b).name();
            default:
                return WhoIAm(b).name() + " obteve vitória sobre " + WhoIAm(a).name();
        }
    }

    public static StatusPartida duela(Coisa a, Coisa b) {

        Meios casa = WhoIAm(a);
        Meios visitante = WhoIAm(b);

        switch (casa) {
            case Pedra:
                return JogosPedra(visitante);
            case Papel:
                return JogosPapel(visitante);
            default:
                return JogosTesoura(visitante);
        }
    }

    public static Coisa GeraAdversario() throws Exception {
        int i = (int) (Math.random() * (3 - 1) + 1);

        switch (i) {
            case 1:
                return new Pedra();
            case 2:
                return new Tesoura();
            case 3:
                return new Papel();
            default:
                throw new Exception("");
        }
    }

    public static Meios WhoIAm(Coisa who) {
        switch (who.getClass().getSimpleName()) {
            case "Pedra":
                return Meios.Pedra;
            case "Papel":
                return Meios.Papel;
            default:
                return Meios.Tesoura;
        }
    }

    public static StatusPartida JogosPedra(Meios inimigo) {
        switch (inimigo) {
            case Pedra:
                return StatusPartida.Empate;
            case Papel:
                return StatusPartida.Derrota;
            default:
                return StatusPartida.Vitoria;
        }
    }

    public static StatusPartida JogosPapel(Meios inimigo) {
        switch (inimigo) {
            case Pedra:
                return StatusPartida.Vitoria;
            case Papel:
                return StatusPartida.Empate;
            default:
                return StatusPartida.Derrota;
        }
    }

    public static StatusPartida JogosTesoura(Meios inimigo) {
        switch (inimigo) {
            case Pedra:
                return StatusPartida.Derrota;
            case Papel:
                return StatusPartida.Vitoria;
            default:
                return StatusPartida.Empate;
        }
    }
}
