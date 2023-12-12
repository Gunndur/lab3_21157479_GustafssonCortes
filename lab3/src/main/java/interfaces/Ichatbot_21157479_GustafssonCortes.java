package interfaces;

import clases.flow_21157479_GustafssonCortes;

import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener los chatbots.
 */
public interface Ichatbot_21157479_GustafssonCortes {
    /**
     * Se selecciona el id del chatbot.
     *
     * @return int Id del chatbot.
     */
    public int getChatbotID();

    /**
     * Se selecciona el nombre del chatbot.
     *
     * @return String Nombre.
     */
    public String getName();

    /**
     * Se selecciona el mensaje de bienvenida del chatbot.
     *
     * @return String Mensaje de bienvenida.
     */
    public String getWelcomeMessage();

    /**
     * Se selecciona el codigo inicial de un flujo del chatbot.
     *
     * @return int Codigo inicial de un flujo.
     */
    public int getStartFlowId();

    /**
     * Se selecciona la lista de flujos del chatbot.
     *
     * @return ArrayList Lista de flujos.
     */
    public ArrayList<flow_21157479_GustafssonCortes> getFlows();

    /**
     * Añade un nuevo flujo a un chatbot, verificando que esté no se repita, esto se valida mediante el id del flujo,
     * si es así, no se añade y se mantiene el chatbot inicial. Añadir que se debe implementar un tipo de recursión,
     * en este caso se usó la recursión natural.
     *
     * @param flow Flujo a agregar.
     */
    public void chatbotAddFlow(flow_21157479_GustafssonCortes flow);

}
