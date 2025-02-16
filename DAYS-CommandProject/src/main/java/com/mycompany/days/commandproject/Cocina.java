/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.days.commandproject;

/**
 *
 * @author Laura
 */
// Receiver (Cocina)
public class Cocina {
    public void prepararPizza() {
        System.out.println(Colores.VERDE + "[Cocina] 🍕 Preparando pizza deliciosa..." + Colores.RESET);
    }

    public void prepararPasta() {
        System.out.println(Colores.VERDE + "[Cocina] 🍝 Cocinando pasta al dente..." + Colores.RESET);
    }

    public void prepararPostre() {
        System.out.println(Colores.VERDE + "[Cocina] 🍰 Preparando un dulce postre..." + Colores.RESET);
    }
}