package interfaces;

import clases.chatHistory_21157479_GustafssonCortes;
import clases.chatbot_21157479_GustafssonCortes;
import clases.user_21157479_GustafssonCortes;

import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener los sistemas.
 */

public interface Isystem_21157479_GustafssonCortes {
    /**
     * Se selecciona el nombre del sistema.
     */
    public String getName();

    /**
     * Se selecciona el link del codigo inicial de un chatbot dedl sistema.
     */
    public int getInitialChatbotCodeLink();

    /**
     * Se selecciona la lista de chatbots del sistema.
     */
    public ArrayList<chatbot_21157479_GustafssonCortes> getChatbots();

    /**
     * Se selecciona la lista de usuarios deñ sistema.
     */
    public ArrayList<user_21157479_GustafssonCortes> getUsers();

    /**
     * Se selecciona el historial del chat del sistema.
     */
    public ArrayList<chatHistory_21157479_GustafssonCortes> getChat();

    /**
     * Se selecciona el estado en el que encuentra el sistema.
     */
    public String getEstado();
}
