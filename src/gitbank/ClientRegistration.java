/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitbank;

import gitbank.accounts.ContaComum;
import gitbank.accounts.ContaEspecial;
import gitbank.accounts.ContaPoupanca;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author rwietter
 */
public class ClientRegistration {
    private String nome;
    private String endereco;
    private String telefone;
    private float renda;
    private boolean situacao;
    private String cpf;
    
    private ArrayList<ContaComum> Contas;

    public ClientRegistration(String nome, String endereco, String telefone, float renda, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.renda = renda;
        this.cpf = cpf;
        
        Contas = new ArrayList<ContaComum>();
    }
    
    public ClientRegistration(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void valCpf() {
        
    }
    
    public void consCpf(){
        
    }

    public ArrayList<ContaComum> getContas() {
        return Contas;
    }

    public void setContas(ContaComum conta) {
        this.Contas.add(conta);
    }
}