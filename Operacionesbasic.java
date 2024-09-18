package com.mycompany.practicasjv;
import javax.swing.JOptionPane;

/*
 Ejercicio: 
 Dado dos números, este programa realiza las operaciones de suma, resta, multiplicación y división, 
 y muestra los resultados.
*/

public class t1tecuni {
    
    public static void main (String[] args) {
        /*--- Programa que realiza operaciones básicas (suma, resta, multiplicación y división) con dos números ---*/
        
        // Declaramos dos variables para almacenar los números que ingresará el usuario
        int d1, d2;

        // Declaramos variables para almacenar los resultados de las operaciones
        // "double" permite almacenar números con decimales, para que la división funcione correctamente
        double suma, resta, multiplicacion, division;

        // Abrimos una ventana para pedir al usuario que ingrese el primer número
        d1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));

        // Abrimos otra ventana para pedir el segundo número
        d2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        // Realizamos las operaciones matemáticas básicas:
        // Suma
        suma = d1 + d2;

        // Resta
        resta = d1 - d2;

        // Multiplicación
        multiplicacion = d1 * d2;

        // División
        // Aquí usamos "double" para que el resultado pueda incluir decimales, en caso de ser necesario
        division = d1 / (double) d2; // Convertimos "d2" a decimal para evitar errores en divisiones

        // Mostramos los resultados en una ventana:
        // \n se usa para hacer saltos de línea y que los resultados aparezcan uno debajo del otro
        JOptionPane.showConfirmDialog(null, 
            "Resultados de las operaciones:\n" + 
            "Suma: " + suma + "\n" + 
            "Resta: " + resta + "\n" + 
            "Multiplicación: " + multiplicacion + "\n" + 
            "División: " + division);
    }
}
