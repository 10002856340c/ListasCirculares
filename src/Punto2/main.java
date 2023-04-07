
package Punto2;



import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        nodo cabeza = null;
        nodo recorrido = null;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del vehículo " + i + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Propietario: ");
            String propietario = scanner.nextLine();

            nodo nuevoNodo = new nodo(marca, color, placa, propietario);
            if (cabeza == null) {
                cabeza = nuevoNodo;
                recorrido = nuevoNodo;
            } else {
                recorrido.sig = nuevoNodo;
                recorrido = nuevoNodo;
            }
        }
        recorrido.sig = cabeza; // Hacer que la lista sea circular

        recorrido = cabeza;
        do {
            System.out.println(recorrido);
            recorrido = recorrido.sig;
        } while (recorrido != cabeza);
    }
}


