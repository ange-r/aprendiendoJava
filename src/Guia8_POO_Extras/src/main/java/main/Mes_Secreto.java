/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.MesSecreto;
import service.MesSecretoServ;

/**
 *
 * @author angel
 */
public class Mes_Secreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MesSecretoServ serv = new MesSecretoServ();
        MesSecreto nuevo = new MesSecreto();
        serv.adivine(nuevo.getMesSecreto());
    }
    
}
