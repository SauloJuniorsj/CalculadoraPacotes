/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.calculadora;

/**
 *
 * @author Saulo Jr
 */
public class Divisao {

    public Divisao(double v1, double v2) {
        System.out.println(div(v1,v2));
    }
    
    public double div(double v1, double v2){
        
        try{
            if(v2 == 0){
                throw new ArithmeticException();
            }else{
                return v1/v2;
            }
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException occured!");
        }
        return 0;
    }
}
