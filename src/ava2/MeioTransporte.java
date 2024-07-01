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
public class MeioTransporte {
    private int capacidadeTanque;
    private int numeroPassageiros;
    private double preco;
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public MeioTransporte() {
    }

    public MeioTransporte(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.velocidade = 0;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void aumentarVelocidade(){
        velocidade +=10;
    }
    public void entradaDados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite capacidade tanque: " );
        setCapacidadeTanque( scan.nextInt() );
        System.out.println("Digite números passageiros: " );
        setNumeroPassageiros(scan.nextInt() );
        System.out.println("Digite preço: " );
        setPreco(scan.nextDouble() );    
    }
    public void imprimir(){
        System.out.println("Capacidade: " + getCapacidadeTanque() + "\nNúmeros passageiros: " + getNumeroPassageiros() + "\nPreço: " + getPreco() + "\nVelocidade: " + getVelocidade());
    }
    /*
     private int capacidadeTanque;
    private int numeroPassageiros;
    private double preco;
    private int velocidade;
    */
}
