/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.progra.bst;

import java.util.Scanner;

/**
 *
 * @author luism
 */
public class MainBST {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(10, "Juan","x","x");		
        Empleado e2 = new Empleado(20, "Maria","x","x");		
	Empleado e3 = new Empleado(5, "Pedro","x","x");		
        Empleado e4 = new Empleado(8, "Ana","x","x");		
	Empleado e5 = new Empleado(15, "Carlos","x","x");		
	Empleado e6 = new Empleado(25, "Sofia","x","x");
        
       BST bst = new BST();
       bst.insertar(e1);
       bst.insertar(e2);
       bst.insertar(e3);
       bst.insertar(e4);
       bst.insertar(e5);
       bst.insertar(e6);
 

    localizar(bst,8);
    localizar(bst,15);
    localizar(bst,30);
    

  Scanner scanner = new Scanner(System.in);
        int opcion;

         do {
            System.out.println("\n--- Menu de Operaciones en el BST ---");
            System.out.println("1. Mostrar recorrido InOrden");
            System.out.println("2. Mostrar recorrido PostOrden");
            System.out.println("3. Mostrar recorrido PreOrden");
            System.out.println("4. Encontrar Empleado con ID Minimo");
            System.out.println("5. Encontrar Empleado con ID Maximo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------------ Empleados InOrden ------------");
                    bst.inOrden();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("------------ Empleados PostOrden ------------");
                    bst.postOrden();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("------------ Empleados PreOrden ------------");
                    bst.preOrden();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Empleado con ID Minimo: " + bst.obtenerMinimo());
                    break;
                case 5:
                    System.out.println("Empleado con ID Maximo: " + bst.obtenerMaximo());
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();


  }
    
        private static void localizar(BST bst, int id) {
        if (bst.existe(id)) {
        	System.out.println("Obtener" + id + ":" + bst.obtener(id));
        } else {
        	System.out.println("No encuentro el empleado: " + id);
        }
    }
    
    
}

