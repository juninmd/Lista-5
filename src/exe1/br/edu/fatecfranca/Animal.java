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
public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
        this.nome = "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imp() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome);
    }

    public void fala() {
        JOptionPane.showMessageDialog(null, "Eu não falo", Animal.class.getSimpleName(), 1);
    }

}
