/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Denisse
 */
public class Banco {
    
    public static void main(String[] args) {
        Usuario usuario =new Usuario("denisse", 6000.0);
        CajeroAutomatico cajero = new CajeroAutomatico();

        System.out.println("Saldo inicial: " + cajero.consultarSaldo(usuario));

        cajero.depositar(usuario, 300.0);
        System.out.println("Saldo después de depositar 600: " + cajero.consultarSaldo(usuario));

        if (cajero.retirar(usuario, 300.0)) {
            System.out.println("Retiro exitoso. Saldo actual: " + cajero.consultarSaldo(usuario));
        } else {
            System.out.println("Retiro fallido. Fondos insuficientes.");
        }
    }
}

