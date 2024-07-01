/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ava2;

import java.util.Scanner;

/**
 *
 * @author paulinha
 */
public class Navio extends MeioTransporte {
   private String nome;
   private int numeroTripulantes;
   private String dataLancamento;

    public Navio() {
    }

    public Navio(String nome, int numeroTripulantes, String dataLancamento) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
   @Override
    public void entradaDados(){
        super.entradaDados();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite nome: ");
        setNome(scan.next());
        System.out.println("Digite números tripulantes");
        setNumeroTripulantes(scan.nextInt());
        System.out.println("Digite data lançamento");
        setDataLancamento(scan.next());
            
    }
   @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("nome: " + getNome() + "\nNúmeros tripulantes: " + getNumeroTripulantes()+ " \nData lançamento: " + getDataLancamento());
    }
    public int passageirosPorTripulantes(){
        return super.getNumeroPassageiros() / getNumeroTripulantes();
        
    }
}
