/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.days.commandproject;

/**
 *
 * @author Laura
 */
// Concrete Commands
public class OrdenPizza implements IPedido {
    private Cocina cocina;

    public OrdenPizza(Cocina cocina) {
        this.cocina = cocina;
    }

    @Override
    public void ejecutar() {
        System.out.println(Colores.AZUL + "[Mesero] 📋 Orden de Pizza recibida." + Colores.RESET);
        cocina.prepararPizza();
    }
}