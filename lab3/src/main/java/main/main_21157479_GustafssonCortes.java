package main;
import clases.*;
import menu.*;

/**
 * CLASE MAIN:
 *  Se encarga de ejecutar el programa.
 *
 * @author Thomas Gustafsson Cortés
 */
public class main_21157479_GustafssonCortes {
    public static void main(String[] args){
        //Opciones
        option_21157479_GustafssonCortes op1 = new option_21157479_GustafssonCortes(1, "1) New York, USA", 1, 2, "USA", "Estados Unidos", "New York");
        option_21157479_GustafssonCortes op2 = new option_21157479_GustafssonCortes(2, "2) París, Francia", 1, 1, "Paris", "Eiffel");
        option_21157479_GustafssonCortes op99 = new option_21157479_GustafssonCortes(2, "999) NO", 2, 1, "incorrecto");
        option_21157479_GustafssonCortes op3 = new option_21157479_GustafssonCortes(3, "3) Torres del Paine, Chile", 1, 1, "Chile", "Torres", "Paine", "Torres Paine", "Torres del Paine");
        option_21157479_GustafssonCortes op4 = new option_21157479_GustafssonCortes(4, "4) Volver", 0, 1, "Regresar", "Salir", "Volver");

        //Flujos
        flow_21157479_GustafssonCortes f1 = new flow_21157479_GustafssonCortes(1, "Flujo 1 Chatbot1\n¿Dónde te Gustaría ir?", op1, op2);
        flow_21157479_GustafssonCortes f2 = new flow_21157479_GustafssonCortes(2, "Flujo 2 Chatbot1\n¿Otro lugar donde te gustaría ir?", op3, op4);
        f1.flowAddOption(op2);
        f1.flowAddOption(op99);

        //Chatbot
        chatbot_21157479_GustafssonCortes cb1 = new chatbot_21157479_GustafssonCortes(1, "Agencia Viajes",  "Bienvenido\n¿Dónde quieres viajar?", 1, f1, f2);
        cb1.chatbotAddFlow(f2);

        //System
        system_21157479_GustafssonCortes s1 = new system_21157479_GustafssonCortes("Chatbots Paradigmas", 0, cb1);
        s1.systemAddChatbot(cb1);

        //Users
        admin_21157479_GustafssonCortes ad1 = new admin_21157479_GustafssonCortes("UserAd1");
        userComun_21157479_GustafssonCortes u1 = new userComun_21157479_GustafssonCortes("UserC1");
        s1.systemAddUser(ad1);
        s1.systemAddUser(u1);
        s1.systemAddUser(u1);


        s1.systemLogin(ad1);
        s1.systemLogin(u1);

        s1.systemLogout();
        s1.systemLogin(u1);

        //INICIALIZACIÓN DEL MENÚ
        menu_21157479_GustafssonCortes menu = new menu_21157479_GustafssonCortes();
        menu.pantallaInicio();
    }



}