package interfaces;
import clases.flow_21157479_GustafssonCortes;
import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener los chatbots.
 */
public interface Ichatbot_21157479_GustafssonCortes {
    /**
     * Se selecciona el id del chatbot.
     */
    public int getChatbotID();

    /**
     * Se selecciona el nombre del chatbot.
     */
    public String getName();

    /**
     * Se selecciona el mensaje de bienvenida del chatbot.
     */
    public String getWelcomeMessage();

    /**
     * Se selecciona el codigo inicial de un flujo del chatbot.
     */
    public int getStartFlowId();

    /**
     * Se selecciona la lista de flujos del chatbot.
     */
    public ArrayList<flow_21157479_GustafssonCortes> getFlows();

}
