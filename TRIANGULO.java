package com.mycompany.practicasjv;
import javax.swing.JOptionPane;

public class proiedadestriangulo {
    public static void main(String[] args){
        // Solicitud de los datos de un triangulo rectangulo
        double catetouno = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del cateto de la base:"));
        double catetodos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del cateto en vertical:"));
        
        // Calculo de la hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(catetouno, 2) + Math.pow(catetodos, 2));
        
        // Datos de salida
        JOptionPane.showMessageDialog(null, "--------"
                + "\n==== Datos de Solución ===="
                + "\nÁrea: " + (catetouno * catetodos) / 2
                + "\nHipotenusa: " + hipotenusa
                + "\nPerímetro: " + (hipotenusa + catetouno + catetodos)
                + "\n--------"
        );
    }
}
