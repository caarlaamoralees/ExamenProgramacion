/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenprogramacion;

import java.util.Scanner;

/**
 *
 * @author carlamorales
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParqueAtracciones parqueAtracciones = new ParqueAtracciones();

        while (true) {
            System.out.println("Menu del parque de atracciones");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Agregar atraccion");
            System.out.println("3. Agregar visitante");
            System.out.println("4. Mostrar informacion del parque");
            System.out.println("5. Salir del menu");
            int opcion = sc.nextInt();

            switch (opcion) {
                // agregar un nuevo empleado
                case 1:
                    System.out.println("Ingresa el nombre del empleado");
                    Scanner scNombre = new Scanner(System.in);
                    String nombreEmpleado = scNombre.next();

                    System.out.println("Ingresa el id del empleado");
                    Scanner scId = new Scanner(System.in);
                    int idEmpleado = scId.nextInt();

                    System.out.println("Ingresa el puesto: mantenimiento/vendedor/seguridad");
                    Scanner scPuesto = new Scanner(System.in);
                    String puestoStr = scPuesto.next();
                    Puesto puesto = null;

                    // verificar que los puestos existan
                    if (puestoStr.equalsIgnoreCase("mantenimiento")) {
                        puesto = Puesto.mantenimiento;
                    } else if (puestoStr.equalsIgnoreCase("vendedor")) {
                        puesto = Puesto.vendedor;
                    } else if (puestoStr.equalsIgnoreCase("seguridad")) {
                        puesto = Puesto.seguridad;
                    } else {
                        System.out.println("Puesto no valido");
                    }

                    // guardar los empleados
                    Empleado nuevoEmpleado = new Empleado(nombreEmpleado, idEmpleado, puesto);
                    parqueAtracciones.agregarEmpleado(nuevoEmpleado);
                    break;

                case 2:
                    // agregar atraccion
                    System.out.println("Ingresa el nombre de la atraccion");
                    String nombreAtraccion = sc.next();
                    System.out.println("Ingresa la capacidad de la atraccion");
                    int capacidad = sc.nextInt();
                    System.out.println("Ingresa el estado: 1. operativa/ 2. en mantenimiento/ 3. fuera de servicio");
                    Scanner scEstado = new Scanner(System.in);
                    int estadoInt = scEstado.nextInt();
                    Estado estado;
                    // verificar que las atracciones existan
                    switch (estadoInt) {
                        case 1:
                            estado = Estado.operativa;
                            break;
                        case 2:
                            estado = Estado.enMantenimiento;
                            break;
                        case 3:
                            estado = Estado.fueraDeServicio;
                            break;
                        default:
                            System.out.println("Estado invalido. Por defecto: Operativa");
                            estado = Estado.operativa;
                    }

                    // guardar las atracc1iones
                    Atraccion nuevaAtraccion = new Atraccion(nombreAtraccion, capacidad, estado);
                    parqueAtracciones.agregarAtraccion(nuevaAtraccion);
                    break;

                case 3:
                    // agregar visitante
                    System.out.println("Ingresa el nombre del visitante");
                    String nombreVisitante = sc.next();
                    System.out.println("Ingresa el id del visitante");
                    int idVisitante = sc.nextInt();
                    System.out.println("Ingresa la edad del visitante");
                    int edadVisitante = sc.nextInt();
                    Visitante visitante = new Visitante(idVisitante, nombreVisitante, edadVisitante);
                    parqueAtracciones.agregarVisitante(visitante);
                    break;

                case 4:
                    // mostrar la informacion del parque
                    parqueAtracciones.mostrarInformacionParque();
                    break;

                case 5:
                    // salir del menu
                    System.out.println("Hasta luego!");
                    return;

            }

        }
    }

}
