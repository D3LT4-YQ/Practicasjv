package com.mycompany.practicasjv;

import javax.swing.JOptionPane;

public class Panaderia {
    public static void main(String[] args) {
        try {
            // Mostrar el menú con formato adecuado y sin guiones
            JOptionPane.showMessageDialog(null, "¡Bienvenido a la panadería Tzintzuntzan! "
                    + "\n==========================="
                    + "\n          MENÚ"
                    + "\n==========================="
                    + "\nNombre         | Costo por unidad"
                    + "\nBolillos       : $6"
                    + "\nConchitas      : $8"
                    + "\nCopetonas      : $10"
                    + "\nChillindrinas  : $9"
                    + "\n==========================="
            );

            // Solicitar la cantidad de panes al usuario
            int b = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de bolillos:"));
            int con = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de conchitas:"));
            int cope = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de copetonas:"));
            int chilin = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de chillindrinas:"));

            // Calcular el costo por tipo de pan
            int bolillos = b * 6;
            int conchitas = con * 8;
            int copetonas = cope * 10;
            int chillindrinas = chilin * 9;

            // Calcular el precio total
            int precio = bolillos + conchitas + copetonas + chillindrinas;

            // Aplicar un descuento del 30%
            double descuento = precio * 0.30;
            double precioFinal = precio - descuento;

            // Mostrar el ticket con formato adecuado
            JOptionPane.showMessageDialog(null, "==========================="
                    + "\n          TICKET"
                    + "\n==========================="
                    + "\nPan             | Cantidad | Precio"
                    + "\nBolillos        : " + b + "         $ " + bolillos
                    + "\nConchitas       : " + con + "         $ " + conchitas
                    + "\nCopetonas       : " + cope + "         $ " + copetonas
                    + "\nChillindrinas   : " + chilin + "         $ " + chillindrinas
                    + "\n==========================="
                    + "\nPrecio total    : $ " + precio
                    + "\nDescuento 30%   : $ " + descuento
                    + "\nPrecio final    : $ " + precioFinal
                    + "\n==========================="
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un número válido.");
        }
    }
}
// deltaprograming