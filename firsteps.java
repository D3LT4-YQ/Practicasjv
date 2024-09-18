package com.mycompany.practicasjv;

import javax.swing.JOptionPane;
public class Practicasjv {

    public static void main(String[] args) {
        /*
        TIPOS DE DATOS Y EJEMPLOS
        ----------------------------------------------
        TIPO        | NOMBRE               | EJEMPLO  
        ----------------------------------------------
        String      | Cadena de texto      | "Hola, ¿cómo estás?"
        int         | Número entero        | 1, 2, 3, 4, 5 (números sin decimales)
        char        | Un solo carácter     | 'a', 'b', 'c' (solo una letra o símbolo)
        double      | Número decimal       | 1.05, 0.5, 2.75 (números con decimales)
        */
        
        // Definición de variables para almacenar los datos que el usuario ingresará
        String cadena;  // Aquí se almacenará una cadena de texto (varias palabras o frases)
        int entero;     // Aquí se almacenará un número entero (sin decimales)
        char letra;     // Aquí se guardará un solo carácter (una letra, número o símbolo)
        double decimal; // Aquí se guardará un número con decimales

        /*--- Ventanas para ingresar datos ---*/
        // Mostramos una ventana donde el usuario puede escribir una frase o texto.
        cadena = JOptionPane.showInputDialog("Por favor, ingrese una frase o texto:");

        // Mostramos una ventana donde el usuario ingresa un número entero (como 5, 10, etc.).
        entero = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un número entero:"));

        // Mostramos una ventana donde el usuario ingresa solo un carácter (como 'a', 'b', '1', etc.).
        // El ".charAt(0)" significa que solo tomamos el primer carácter que el usuario escriba.
        letra = JOptionPane.showInputDialog("Por favor, ingrese una letra o un símbolo:").charAt(0);

        // Mostramos una ventana donde el usuario ingresa un número con decimales (como 2.5, 3.14, etc.).
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese un número decimal (por ejemplo, 2.5):"));

        /*--- Ventanas para mostrar mensajes de salida ---*/
        // Mostramos un mensaje de bienvenida.
        JOptionPane.showMessageDialog(null, "¡Bienvenido a mi primer programa!");

        // Mostramos un mensaje para confirmar que los datos han sido ingresados.
        JOptionPane.showConfirmDialog(null, "Datos ingresados correctamente");

        // Mostramos el texto o frase que el usuario ingresó.
        JOptionPane.showConfirmDialog(null, "La frase que ingresaste es: " + cadena);
    }
}
