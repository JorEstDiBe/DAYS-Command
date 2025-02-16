/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.days.commandproject;

/**
 *
 * @author Laura
 */
// Client (Sistema o Cliente en el Restaurante)
public class Restaurante {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();

        IPedido pizza = new OrdenPizza(cocina);
        IPedido pasta = new OrdenPasta(cocina);
        IPedido postre = new OrdenPostre(cocina);

        Mesero mesero = new Mesero();
        mesero.tomarOrden(pizza);
        mesero.tomarOrden(pasta);
        mesero.tomarOrden(postre);

        mesero.enviarOrdenes();
    }
}
