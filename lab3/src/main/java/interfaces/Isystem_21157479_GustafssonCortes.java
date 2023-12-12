package interfaces;

import clases.chatbot_21157479_GustafssonCortes;
import clases.user_21157479_GustafssonCortes;

import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener los sistemas.
 */

public interface Isystem_21157479_GustafssonCortes {
    /**
     * Se selecciona el nombre del sistema.
     *
     * @return String Nombre del sistema.
     */
    public String getName();

    /**
     * Se selecciona el link del codigo inicial de un chatbot dedl sistema.
     *
     * @return int Codigo del link inicial.
     */
    public int getInitialChatbotCodeLink();

    /**
     * Se selecciona la lista de chatbots del sistema.
     *
     * @return ArrayList Lista de chatbots.
     */
    public ArrayList<chatbot_21157479_GustafssonCortes> getChatbots();

    /**
     * Se selecciona la lista de usuarios del sistema.
     *
     * @return ArrayList Lista de usuarios.
     */
    public ArrayList<user_21157479_GustafssonCortes> getUsers();

    /**
     * Se selecciona el historial del chat del sistema.
     *
     * @return ArrayList Historial del chat.
     */
    public String[] getChat();

    /**
     * Se selecciona el estado en el que encuentra el sistema.
     *
     * @return String Estado del sistema.
     */
    public String getEstado();

    /**
     * Añade un nuevo chatbot a la lista de chatbots de un sistema en específico, pero primero verifica que este nuevo
     * chatbot, por medio de su id, no se repita. Si está repetido, se mantiene el sistema inicial sin cambios.
     *
     * @param chatbot Chatbot que se añadirá al sistema.
     */
    public void systemAddChatbot(chatbot_21157479_GustafssonCortes chatbot);

    /**
     * Añade un nuevo usuario al sistema, verificando que no se repita su nombre en otros usuarios, ya que si es así,
     * no será agregado a al sistema.
     *
     * @param user que se añadirá al sistema.
     */
    public void systemAddUser(user_21157479_GustafssonCortes user);

    /**
     * Hace iniciar sesión a un usuario en el sistema, pero primero se comprueba que no esté "conectado", que no haya
     * nadie con su misma id (su nombre) o que no existe una sesión ya iniciada por otro usuario.
     *
     * @param user Usuario que iniciará sesión.
     */
    public void systemLogin(user_21157479_GustafssonCortes user);

    /**
     * Permite cerrar la sesión abierta anteriormente por un mismo usuario.
     */
    public void systemLogout();
}
