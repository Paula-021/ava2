/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ava2;

import java.util.InputMismatchException;

/**
 *
 * @author paulinha
 */
public class Ava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MeioTransporte[] meioTransporte = new MeioTransporte[20];
        for (int i = 0; i < 10; i++) {
            meioTransporte[i] = new Aviao();
            try{
                meioTransporte[i].entradaDados();
                
            }
            catch(InputMismatchException inpEx){
                System.out.println("Número inválido");
            }
            
        }
        for (int i = 10; i < 20; i++) {
            meioTransporte[i] = new Navio();
           try{
                meioTransporte[i].entradaDados();
           }
           catch(InputMismatchException inpEx){
               System.out.println("Número inválido");
           } 
        }
        for (int i = 0; i < 20; i++) {
            meioTransporte[i].imprimir();
            
        }

    }
    
}
