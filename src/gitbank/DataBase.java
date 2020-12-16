/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitbank;

import java.util.ArrayList;

/**
 *
 * @author rwietter
 */
public class DataBase {
    private ArrayList<ClientRegistration> client;

    public DataBase() {
        this.client = new ArrayList<ClientRegistration>();
    }
    
    public ArrayList<ClientRegistration> getClient() {
        return this.client;
    }

    public void setClient(ClientRegistration client) {
        this.client.add(client);
    }
    
    public void print(){
        for(int i = 0; i < client.size(); i++){
            System.out.println(client.get(i).getNome());
        }
    }
}
