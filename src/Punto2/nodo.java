/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author USUARIO
 */
public class nodo {

    String marca;
    String color;
    String placa;
    String propietario;
    nodo sig;

    public nodo(String marca, String color, String placa, String propietario) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.propietario = propietario;
    }

    public String toString() {
        return "Marca: " + marca + ", Color: " + color + ", Placa: " + placa + ", Propietario: " + propietario;
    }
}