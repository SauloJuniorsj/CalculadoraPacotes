/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Calculadora.*;

/**
 *
 * @author Saulo Jr
 */
public class ComGithubSauloJrCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Soma soma = new Soma(2, 3);
        Subtracao sub = new Subtracao(53, 32);
        Multiplicacao mul = new Multiplicacao(3, 21);
        Divisao divv = new Divisao(43, 2);
        divv.div(3, 0);
    }
    
}
