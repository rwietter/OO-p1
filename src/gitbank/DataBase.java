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
        return client;
    }

    public void setClient(ClientRegistration client) {
        this.client.add(client);
    }
    
}
