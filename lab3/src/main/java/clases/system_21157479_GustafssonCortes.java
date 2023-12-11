package clases;
import interfaces.Isystem_21157479_GustafssonCortes;
import java.util.ArrayList;

/**
 * CLASE SYSTEM:
 * Clase que representa un sistema, que consiste de un nombre de tipo string, un id del chatbot inicializado en el sistema de tipo entero positivo,
 * una lista de chatbots, donde cada chatbot es de tipo chatbot, también consiste en una lista de usuarios donde cada elemento es de tipo user
 * y un historial del chat de tipo chatHistory, con su correspondiente hora.
 *
 * Dom: name(String) x initialChatbotCodeLink(int) x  chatbots(Lista de chatbot).
 * Rec: system.
 */
public class system_21157479_GustafssonCortes implements Isystem_21157479_GustafssonCortes{
    //---------Atributos---------
    private String name;
    private int initialChatbotCodeLink;
    private ArrayList<chatbot_21157479_GustafssonCortes> chatbots;


    //??????????????????????????
    private ArrayList<user_21157479_GustafssonCortes> users;
    private ArrayList<chatHistory_21157479_GustafssonCortes> chat;
    private String estado;

    //---------Métodos---------

    //Constructor
    public void system(String name, int initialChatbotCodeLink, ArrayList<chatbot_21157479_GustafssonCortes> chatbots){
    this.name = name;
    this.initialChatbotCodeLink = initialChatbotCodeLink;
    this.chatbots = chatbots;

    //???????????????????????????????
    this.users = new ArrayList<>();
    this.chat = new ArrayList<>();
    this.estado = "sesion_inactiva";
    }

    //Selectores
    /**
     * Se selecciona el nombre del sistema.
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Se selecciona el link del codigo inicial de un chatbot dedl sistema.
     */
    @Override
    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }
    /**
     * Se selecciona la lista de chatbots del sistema.
     */
    @Override
    public ArrayList<chatbot_21157479_GustafssonCortes> getChatbots() {
        return chatbots;
    }
    /**
     * Se selecciona la lista de usuarios deñ sistema.
     */
    @Override
    public ArrayList<user_21157479_GustafssonCortes> getUsers() {
        return users;
    }
    /**
     * Se selecciona el historial del chat del sistema.
     */
    @Override
    public ArrayList<chatHistory_21157479_GustafssonCortes> getChat() {
        return chat;
    }

    /**
     * Se selecciona el estado en el que encuentra el sistema.
     */
    @Override
    public String getEstado() {
        return estado;
    }


    //Modificadores
    /**
     * Añade un nuevo chatbot a la lista de chatbots de un sistema en específico, pero primero verifica que este nuevo
     * chatbot, por medio de su id, no se repita. Si está repetido, se mantiene el sistema inicial sin cambios.
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
     */
    public void systemAddUser(user_21157479_GustafssonCortes user){
        String x = user.getUsername();
        ArrayList<user_21157479_GustafssonCortes> users = this.getUsers();
        for(user_21157479_GustafssonCortes us : users){
            if (us.getUsername() == x){
                return;
            }
        }
        this.users.add(user);
    }

    /**
     * Hace iniciar sesión a un usuario en el sistema, pero primero se comprueba que no esté "conectado", que no haya
     * nadie con su misma id (su nombre) o que no existe una sesión ya iniciada por otro usuario.
     */
    public void systemLogin(user_21157479_GustafssonCortes user){
        String x = user.getUsername();
        ArrayList<user_21157479_GustafssonCortes> users = this.getUsers();
        String estado = this.getEstado();
        for(user_21157479_GustafssonCortes us : users){
            if (us.getUsername() == x || estado == null){
                this.estado = x;
                return;
            }
        }
    }


    /**
     * Permite cerrar la sesión abierta anteriormente por un mismo usuario.
     */
    public void systemLogout(){
        this.estado = null;
    }

    /**
     * Permite interactuar con un usuario que ya haya iniciado sesión.
     */
    public void system_talk(String message){}
}
