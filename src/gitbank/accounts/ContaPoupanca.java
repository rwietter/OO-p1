/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitbank.accounts;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author rwietter
 */
public class ContaPoupanca extends ContaComum {

    public ContaPoupanca(UUID numeroConta, double saldo, Date dataAbertura, int tipoConta, String dataEncerramento, int situacao, String senha, String nome) {
        super(numeroConta, saldo, dataAbertura, tipoConta, dataEncerramento, situacao, senha, nome);
    }
    
    // Este método se aplica a todas as instâncias cujo dia da data de vencimento seja igual ao dia da data atual.
    public void rendimento(String datDia, String contaAniver){
        
    }

    @Override
    public void setSituacao(int situacao) {
        super.setSituacao(situacao); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSituacao() {
        return super.getSituacao(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDataEncerramento(String dataEncerramento) {
        super.setDataEncerramento(dataEncerramento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDataEncerramento() {
        return super.getDataEncerramento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipoConta(int tipoConta) {
        super.setTipoConta(tipoConta); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTipoConta() {
        return super.getTipoConta(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDataAbertura(Date dataAbertura) {
        super.setDataAbertura(dataAbertura); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getDataAbertura() {
        return super.getDataAbertura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSaldo(float saldo) {
        super.setSaldo(saldo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSaldo() {
        return super.getSaldo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumeroConta(UUID numeroConta) {
        super.setNumeroConta(numeroConta); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UUID getNumeroConta() {
        return super.getNumeroConta(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int valSenha(String senha) {
        return super.valSenha(senha); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int consultaConta(UUID numConta) {
        return super.consultaConta(numConta); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double verSaldo() {
        return super.verSaldo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposito(Double valor, UUID numConta) {
        super.deposito(valor, numConta); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float saqueConta(float valor, String senha) {
        return super.saqueConta(valor, senha); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int encerramentoConta(UUID numConta) {
        return super.encerramentoConta(numConta); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String aberturaConta(float valor, int tipoConta, String senha, String nome) {
        return super.aberturaConta(valor, tipoConta, senha, nome); //To change body of generated methods, choose Tools | Templates.
    }
}
