/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.days.commandproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura
 */
// Invoker (Mesero)
public class Mesero {
    private List<IPedido> pedidos = new ArrayList<>();

    public void tomarOrden(IPedido pedido) {
        pedidos.add(pedido);
        System.out.println(Colores.AMARILLO + "[Mesero] 📝 Tomando pedido..." + Colores.RESET);
    }

    public void enviarOrdenes() {
        System.out.println(Colores.AMARILLO + "[Mesero] 🚀 Enviando pedidos a la cocina..." + Colores.RESET);
        pedidos.forEach(IPedido::ejecutar);
        pedidos.clear();
    }
}