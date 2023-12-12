package clases;
import interfaces.Isystem_21157479_GustafssonCortes;
import java.util.ArrayList;
import java.util.List;

/**
 * CLASE SYSTEM:
 * Clase que representa un sistema, que consiste de un nombre de tipo string, un id del chatbot inicializado en el sistema de tipo entero positivo,
 * una lista de chatbots, donde cada chatbot es de tipo chatbot, también consiste en una lista de usuarios donde cada elemento es de tipo user
 * y un historial del chat de tipo chatHistory, con su correspondiente hora.
 *
 * Dom: name(String) x initialChatbotCodeLink(int) x  chatbots(Lista de chatbot).
 * Rec: system.
 *
 * @author Thomas Gustafsson Cortés
 */

public class system_21157479_GustafssonCortes implements Isystem_21157479_GustafssonCortes{
    //---------Atributos---------
    private String name;
    private int initialChatbotCodeLink;
    private ArrayList<chatbot_21157479_GustafssonCortes> chatbots;
    private ArrayList<user_21157479_GustafssonCortes> users;
    private String[] chat;
    private String estado;

    //---------Métodos---------

    /**
     * Constructor.
     * @param name
     * @param initialChatbotCodeLink
     * @param chatbots
     */
    public system_21157479_GustafssonCortes(String name, int initialChatbotCodeLink, chatbot_21157479_GustafssonCortes... chatbots){
    this.name = name;
    this.initialChatbotCodeLink = initialChatbotCodeLink;
    this.chatbots = new ArrayList<>(List.of(chatbots));
    this.users = new ArrayList<>();
    this.estado = "sesion_inactiva";
    }

    //Selectores
    /**
     * Se selecciona el nombre del sistema.
     *
     * @return String Nombre del sistema.
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Se selecciona el link del codigo inicial de un chatbot dedl sistema.
     *
     * @return int Codigo del link inicial.
     */
    @Override
    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }
    /**
     * Se selecciona la lista de chatbots del sistema.
     *
     * @return ArrayList Lista de chatbots.
     */
    @Override
    public ArrayList<chatbot_21157479_GustafssonCortes> getChatbots() {
        return chatbots;
    }
    /**
     * Se selecciona la lista de usuarios del sistema.
     *
     * @return ArrayList Lista de usuarios.
     */
    @Override
    public ArrayList<user_21157479_GustafssonCortes> getUsers() {
        return users;
    }
    /**
     * Se selecciona el historial del chat del sistema.
     *
     * @return ArrayList Historial del chat.
     */
    @Override
    public String[] getChat() {
        return chat;
    }

    /**
     * Se selecciona el estado en el que encuentra el sistema.
     *
     * @return String Estado del sistema.
     */
    @Override
    public String getEstado() {
        return estado;
    }


    //Modificadores
    /**
     * Añade un nuevo chatbot a la lista de chatbots de un sistema en específico, pero primero verifica que este nuevo
     * chatbot, por medio de su id, no se repita. Si está repetido, se mantiene el sistema inicial sin cambios.
     *
     * @param chatbot Chatbot que se añadirá al sistema.
     */
    public void systemAddChatbot(chatbot_21157479_GustafssonCortes chatbot){
        int x = chatbot.getChatbotID();
        ArrayList<chatbot_21157479_GustafssonCortes> chatbots = this.getChatbots();
        for(chatbot_21157479_GustafssonCortes cb : chatbots){
            if (cb.getChatbotID() == x){
                return;
            }
        }
        this.chatbots.add(chatbot);
    }

    /**
     * Añade un nuevo usuario al sistema, verificando que no se repita su nombre en otros usuarios, ya que si es así,
     * no será agregado a al sistema.
     *
     * @param user que se añadirá al sistema.
     */
    public void systemAddUser(user_21157479_GustafssonCortes user){
        String x = user.getUsername();
        ArrayList<user_21157479_GustafssonCortes> users = this.getUsers();
        for(user_21157479_GustafssonCortes us : users){
            if (us.getUsername().equals(x)){
                return;
            }
        }
        this.users.add(user);
    }

    /**
     * Hace iniciar sesión a un usuario en el sistema, pero primero se comprueba que no esté "conectado", que no haya
     * nadie con su misma id (su nombre) o que no existe una sesión ya iniciada por otro usuario.
     *
     * @param user Usuario que iniciará sesión.
     */
    public void systemLogin(user_21157479_GustafssonCortes user){
        String x = user.getUsername();
        ArrayList<user_21157479_GustafssonCortes> users = this.getUsers();
        String estado = this.getEstado();
        for(user_21157479_GustafssonCortes us : users){
            if (us.getUsername().equals(x) && estado.equals("sesion_inactiva")){
                this.estado = x;
                return;
            }
        }

    }

    /**
     * Permite cerrar la sesión abierta anteriormente por un mismo usuario.
     */
    public void systemLogout(){
        this.estado = "sesion_inactiva";
    }

    /**
     * Permite interactuar con un usuario que ya haya iniciado sesión.
     */
    public void system_talk(String message){}
}
