/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.com.app.readxmlconfigfile;

import java.io.Console;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author garfi
 */
public class MainProgram {
    public static void main(String[] args) {
        try {
            ReadProperties rp = new ReadProperties();
            
            System.out.println("host: " + rp.getProps().getProperty("host"));
            
        } catch (IOException ex) {
            System.out.println("Excepcion en app que lee configuraion");
            Logger.getLogger(MainProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
