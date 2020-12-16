/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitbank.accounts;

import gitbank.ClientRegistration;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author rwietter
 */
public class ContaComum {
    protected UUID numeroConta;
    protected String nome;
    protected double saldo;
    protected Date dataAbertura;
    protected int tipoConta; // (comum, especial ou poupança)
    protected String dataEncerramento;
    protected int situacao; // (se está ativa ou inativa) e senha
    protected String senha;
    
    protected ClientRegistration client;

    public ContaComum(UUID numeroConta, double saldo, Date dataAbertura, int tipoConta, String dataEncerramento, int situacao, String senha, String nome) {
         this.numeroConta = numeroConta;
         this.saldo = saldo;
         this.dataAbertura = dataAbertura;
         this.tipoConta = tipoConta;
         this.dataEncerramento = dataEncerramento;
         this.situacao = situacao;
         this.senha = senha;
         this.nome = nome;
    }
    
    public ContaComum(ClientRegistration client){
        this.client = client;
    }
    
    public String aberturaConta(float valor, int tipoConta, String senha, String nome){
        try {
            Date date = new Date();

            this.saldo = valor;
            this.senha = senha;
            if(tipoConta == 1){
              this.tipoConta = 1;
            } else if(tipoConta == 2){
              this.tipoConta = 2;
            } else if(tipoConta == 3) {
              this.tipoConta = 3;
            }
            this.numeroConta =  UUID.randomUUID();
            this.dataAbertura = date;
            this.nome = nome;
            this.situacao = 1;
            this.dataEncerramento = "";
            return this.numeroConta.toString();
        } catch (Exception e) {
            return null;
        }
    }
    
    
    public int encerramentoConta(UUID numConta){
        if(consultaConta(numConta) == 1){
            this.situacao = 0;
            return 1;
        }
        return 0;
    }
    
    public float saqueConta(float valor, String senha){
        for(ContaComum conta : client.getContas()){
            if(valor < conta.getSaldo() && this.valSenha(senha) == 1){
                conta.setSaldo((float) conta.getSaldo() - valor);
                return valor;
            } else {
                return 0;
            }
        }
        return 0;
    }
    
    public void deposito(Double valor, UUID numConta){
        this.client.getContas().forEach(item -> {
            if(item.getNumeroConta().equals(numConta)){
                item.setSaldo((float) (item.getSaldo() + valor));
            }
        });
        System.out.println("Conta não encontrada");
    }
    
    public Double verSaldo(){
        if(this.consultaConta(numeroConta) == 1){
            return this.saldo;
        } else {
            return (double) 0;
        }
    }
    
    public int consultaConta(UUID numConta){
        if(numConta.equals(this.numeroConta)){
            return 1;
        } else {
            return 0;
        }
    }
    
    public int valSenha(String senha){
        for(ContaComum conta : client.getContas()){
            if(senha.equals(conta.getSenha())){
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public UUID getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(UUID numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
