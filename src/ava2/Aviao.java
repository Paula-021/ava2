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
public class Aviao extends MeioTransporte {
    private String prefixo;
    private String dataRevisao;

    public Aviao() {
    }

    public Aviao(String prefixo, String dataRevisao) {
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }
    @Override
    public void entradaDados(){
        Scanner scan = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite prefixo");
        setPrefixo(scan.next());
        System.out.println("Digite data revisão");
        setDataRevisao(scan.next());    
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Prefixo: " + getPrefixo() + "\nData revisão: " + getDataRevisao());
    }
    public void reajustarPreco(double percentual){
        super.setPreco( super.getPreco()* percentual);
    }
}
