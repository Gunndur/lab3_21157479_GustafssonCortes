package clases;
import interfaces.Ichatbot_21157479_GustafssonCortes;
import java.util.ArrayList;
import java.util.List;

/**
 * CLASE CHATBOT:
 * Clase que representa un chatbot, este posee un id unico tipo entero mayor que cero, un nombre de tipo string, un
 * mensaje de presentación de tipo string, el id del flow inicial asociado de tipo entero positivo y una lista de los
 * flujos, donde cada uno de los flujos es de tipo flow.
 *
 * Dom: chatbotID(int) x name(String) x welcomeMessage(String) x startFlowId(int) x  flows(Lista de flows).
 * Rec: chatbot.
 *
 * @author Thomas Gustafsson Cortés
 */

public class chatbot_21157479_GustafssonCortes implements Ichatbot_21157479_GustafssonCortes {
    //---------Atributos---------
    private int chatbotID;
    private String name;
    private String welcomeMessage;
    private int startFlowId;
    private ArrayList<flow_21157479_GustafssonCortes> flows;
    //---------Métodos---------

    /**
     * Constructor.
     * @param chatbotID
     * @param name
     * @param welcomeMessage
     * @param startFlowId
     * @param flows
     */
    public chatbot_21157479_GustafssonCortes(int chatbotID, String name, String welcomeMessage, int startFlowId, flow_21157479_GustafssonCortes... flows){
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        this.flows = new ArrayList<>(List.of(flows));
    }
    //Selectores
    /**
     * Se selecciona el id del chatbot.
     *
     * @return int Id del chatbot.
     */
    @Override
    public int getChatbotID() {
        return chatbotID;
    }

    /**
     * Se selecciona el nombre del chatbot.
     *
     * @return String Nombre.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Se selecciona el mensaje de bienvenida del chatbot.
     *
     * @return String Mensaje de bienvenida.
     */
    @Override
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    /**
     * Se selecciona el codigo inicial de un flujo del chatbot.
     *
     * @return int Codigo inicial de un flujo.
     */
    public int getStartFlowId() {
        return startFlowId;
    }

    /**
     * Se selecciona la lista de flujos del chatbot.
     *
     * @return ArrayList Lista de flujos.
     */
    @Override
    public ArrayList<flow_21157479_GustafssonCortes> getFlows() {
        return flows;
    }


    //Modificadores

    /**
     * Añade un nuevo flujo a un chatbot, verificando que esté no se repita, esto se valida mediante el id del flujo,
     * si es así, no se añade y se mantiene el chatbot inicial. Añadir que se debe implementar un tipo de recursión,
     * en este caso se usó la recursión natural.
     *
     * @param flow Flujo a agregar.
     */
    public void chatbotAddFlow(flow_21157479_GustafssonCortes flow){
        int x = flow.getId();
        ArrayList<flow_21157479_GustafssonCortes> flows = this.getFlows();
        for(flow_21157479_GustafssonCortes fl : flows){
            if (fl.getId() == x){
                return;
            }
        }
        this.flows.add(flow);
    }
}
