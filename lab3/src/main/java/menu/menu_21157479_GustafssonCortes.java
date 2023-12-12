package menu;
import java.util.ArrayList;
import java.util.Scanner;

import clases.*;
import interfaces.Isystem_21157479_GustafssonCortes;
import interfaces.Iuser_21157479_GustafssonCortes;

/**
 * CLASE MENU:
 *  Clase que representa un menú interactivo que permite la interacción de un usuario con el programa y lo que este
 *  puede ofrecer como sistema de chatbots.
 *
 * @author Thomas Gustafsson Cortés
 */
public class menu_21157479_GustafssonCortes {
    //---------Atributos---------
    private Isystem_21157479_GustafssonCortes system;
    private Iuser_21157479_GustafssonCortes user;
    private user_21157479_GustafssonCortes userActivo;

    //---------Métodos---------

     //Selectores

    /**
     * Selecciona el usuario.
     * @return user
     */
    public Iuser_21157479_GustafssonCortes getUser() {
        return user;
    }

    /**
     * Selecciona el sistema.
     * @return system
     */
    public Isystem_21157479_GustafssonCortes getSystem() {
        return system;
    }

    /**
     * Selecciona el usuario activo
     * @return user
     */
    public user_21157479_GustafssonCortes getUserActivo() {
        return userActivo;
    }

    //Modificadores

    public void system(String name){
        this.system = new system_21157479_GustafssonCortes(name, 999, (chatbot_21157479_GustafssonCortes) null);
    }

    /**
     * Crea un usuario común dentro del menú.
     *
     * @param name Nombre del usuario.
     */
    public void userComun(String name){
        this.userActivo = new userComun_21157479_GustafssonCortes(name);
    }

    /**
     * Crea un usuario administrador dentro del menú.
     *
     * @param name Nombre del usuario.
     */
    public void userAdmin(String name){
        this.userActivo = new admin_21157479_GustafssonCortes(name);
    }

    //---------MENÚS---------

    /**
     * Muestra el menú de inicio.
     *
     */
    public void pantallaInicio(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- Sistema de Chatbots -----");
            System.out.println("\n----- INICIO -----");
            System.out.println("1. Ingresar");
            System.out.println("2. Registrarse");
            System.out.print("\nIntroduzca su opción: ");
            String opcion = sc.nextLine();
            switch (opcion){
                case "1":
                    pantallaIngresar(sc);
                    return;

                case "2":
                    pantallaRegisrto(sc);
                    return;

                default:
                    System.out.println("La opción no es válida");
                    return;
            }
        }
    }

    /**
     * Muestra el menú para registrar un usuario normal o administrador.
     * @param sc Respuesta que se ingresa por consola.
     */
    public void pantallaRegisrto(Scanner sc){
        System.out.println("\n----- Sistema de Chatbots -----");
        System.out.println("\n----- REGISTRO -----");
        System.out.println("1. Registrar usuario normal");
        System.out.println("2. Registrar usuario administrador");
        System.out.println("3. Volver");
        System.out.print("\nIntroduzca su opción: ");
        String opcion = sc.nextLine();
        switch (opcion){

                case "1":
                    System.out.println("\n----- Sistema de Chatbots -----");
                    System.out.println("\n----- REGISTRO DE USUARIO NORMAL-----");
                    System.out.print("Introduzca el nombre del usuario normal: ");
                    String nameC = sc.nextLine();
                    userComun(nameC);
                    System.out.print("El usuario se creó con éxito");
                    return;

                case "2":
                    System.out.println("\n----- Sistema de Chatbots -----");
                    System.out.println("\n----- REGISTRO DE USUARIO ADMINISTRADOR-----");
                    System.out.print("Introduzca el nombre del usuario administrador: ");
                    String nameAd = sc.nextLine();
                    userAdmin(nameAd);
                    System.out.print("El usuario se creó con éxito");
                    return;

                case "3":
                    return;

                default:
                    System.out.println("La opción no es válida");
                    break;
            }

    }

    /**
     * Muestra el menú para ingresar.
     *
     * @param sc Respuesta que se ingresa por consola.
     */
    public void pantallaIngresar(Scanner sc){
        System.out.println("\n----- Sistema de Chatbots -----");
        System.out.println("\n----- INGRESAR -----");
        System.out.print("Introduzca el nombre de usuario: ");
        String opcion = sc.nextLine();
        if(opcion.equals(String.valueOf(this.userActivo)) && this.userActivo.getTipo() == 0){
            pantallaComun(sc);
            return;
        }
        else if(opcion.equals(String.valueOf(this.userActivo)) && this.userActivo.getTipo() == 1){
            pantallaAdministrador(sc);
            return;
        }
        else {
            System.out.println("El nombre de usuario no es válido");
            return;
        }

    }

    /**
     * Muestra el menú de un usuario común.
     *
     * @param sc Respuesta que se ingresa por consola.
     */
    public void pantallaComun(Scanner sc){
        System.out.println("\n----- Sistema de Chatbots -----");
        System.out.println("\n----- USUARIO COMÚN -----");
        System.out.println("1. Entrar en un sistema [systemLogin]");
        System.out.println("2. Salir de un sistema [systemLogout]");
        System.out.println("3. Interactuar con un chatbot [system_talmk] |NO IMPLEMENTADO|");
        System.out.println("4. Síntesis de un chatbot [system_synthesis] |NO IMPLEMENTADO|");
        System.out.println("5. Simular dialogo entre chatbots [system_simulate] |NO IMPLEMENTADO|");
        System.out.print("\nIntroduzca su opción: ");
        String opcion = sc.nextLine();
        switch (opcion){
            case "1":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "2":
                System.out.println("Esta opción no ha sido implementada");
                break;

            case "3":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "4":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "5":
                System.out.println("Esta opción no ha sido implementada");
                break;

            default:
                System.out.println("La opción no es válida");
                break;
        }

    }

    /**
     * Muestra el menú de un usuario administrador.
     *
     * @param sc Respuesta que se ingresa por consola.
     */
    public void pantallaAdministrador(Scanner sc){
        System.out.println("\n----- Sistema de Chatbots -----");
        System.out.println("\n----- USUARIO ADMINISTRADOR -----");
        System.out.println("1. Entrar en un sistema [systemLogin]");
        System.out.println("2. Salir de un sistema [systemLogout]");
        System.out.println("3. Interactuar con un chatbot [system_talmk] |NO IMPLEMENTADO|");
        System.out.println("4. Síntesis de un chatbot [system_synthesis] |NO IMPLEMENTADO|");
        System.out.println("5. Simular dialogo entre chatbots [system_simulate] |NO IMPLEMENTADO|");
        System.out.println("\n----- OPCIONES DE ADMINISTRADOR -----");
        System.out.println("6. Crear/Agregar un chatbots a un sistema");
        System.out.println("7. Crear/Agregar un flujo a un chatbot");
        System.out.println("8. Crear/Agregar una opción a un flujo");
        System.out.print("\nIntroduzca su opción: ");

        String opcion = sc.nextLine();
        switch (opcion){
            case "1":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "2":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "3":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "4":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "5":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "6":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "7":
                System.out.println("Esta opción no ha sido implementada");
                break;
            case "8":
                System.out.println("Esta opción no ha sido implementada");
                break;

            default:
                System.out.println("La opción no es válida");
                break;
        }
    }


}


