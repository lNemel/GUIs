package com.mycompany.mavenproject17;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mavenproject17 {

    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Ventana");
        JLabel etiqueta = new JLabel("Hola Mundo");
        ventana.add(etiqueta);
        ventana.setSize(250,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
