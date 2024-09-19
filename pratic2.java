package com.mycompany.practicasjv;

import javax.swing.JOptionPane;

public class sumatoria {
    public static void main(String[] args) {
        // Declaración de variables
        int d1, d2, d3, d4, d5;
        double suma, pro;

        // Obtener datos desde la interfaz gráfica
        d1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        d2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        d3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));
        d4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cuarto número:"));
        d5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el quinto número:"));

        // Realizar sumatoria y calcular promedio
        suma = d1 + d2 + d3 + d4 + d5;
        pro = suma / 5;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, 
            "Resultados de las operaciones:"+
            "Los datos integrados son :"+ d1+" "+d2+" "+d3+" "+d4+" "+d5+
            "La suma de los datos es: " + suma + "\n" +
            "El promedio de los datos es: " + pro);

    }
}
