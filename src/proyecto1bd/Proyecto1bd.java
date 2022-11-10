/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1bd;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author marcossanchez
 */
public class Proyecto1bd {

    public static void digite(LinkedList<String> lista, Scanner entrada) {
        System.out.println("Ingrese los datos");
        lista.push(entrada.next());
    }

    public static void medicamentos(LinkedList<String> lista) {
        System.out.println("Ingrese los medicamentos");
        System.out.println(lista);

    }

    public static void buscar(LinkedList<String> lista, Scanner entrada) {
        System.out.println("Introduzca el medicamento buscado ");
        String nombre;
        nombre = entrada.next();
        if (lista.contains(nombre)) {
            System.out.println("El medicamento" + nombre + "se encuentra en la posicion" + lista.indexOf(nombre));

        } else {
            System.out.println("El medicamento buscado no se encuentra en la lista");

        }

    }

    public static void borrar(LinkedList<String> lista, Scanner entrada) {
 System.out.println("Ingrese el medicamento que quiere borrar");
        String nombre;
        nombre = entrada.next();
        if (lista.contains(nombre)) {
            lista.remove(nombre);
            System.out.println("El medicamento" + nombre + "fue eliminado");

        } else {
            System.out.println("El medicamento no se encuentra en la lista");

        }

    }

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Siga el orden numerico");
            System.out.println("1.-Digite el nombre del paciente");
            System.out.println("2.-Medicamentos del paciente");
            System.out.println("3.-Buscar medicamentos");
            System.out.println("4.-Borrar medicamento que el paciente no utiliza");
            System.out.println("5.-Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Estas digitando nombre del paciente");
                    digite(lista, entrada);
                    break;
                case 2:
                    System.out.println("Medicamentos utilizados por el paciente");
                    medicamentos(lista);
                    break;

                case 3:
                    System.out.println("Buscar otro tipo de medicamento ");
                    buscar(lista, entrada);
                    break;

                case 4:
                    System.out.println("Borrar medicamento");
                    borrar(lista, entrada);
                    break;

                case 5:
                    System.out.println("Hasta luego");
                default:
                    System.out.println("Opcion invalida");
                    break;

            }

        } while (opcion != 5);
    }

}
