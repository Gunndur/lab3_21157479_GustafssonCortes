package clases;
import interfaces.Ioption_21157479_GustafssonCortes;
import java.util.ArrayList;

/**
 * CLASE OPTION:
 * Clase que representa opciones, esta construye una opción para un flujo de un chatbot, siendo estos
 * unicos mediante su propio id. Cada opción se une a un chatbot y un flujo específicos.
 *
 * Dom: code(int) x message(string) x ChatbotCodeLink(int) x InitialFlowCodeLink(int) x Keyword.
 * Rec: option.
 */
public class option_21157479_GustafssonCortes implements Ioption_21157479_GustafssonCortes {

    //---------Atributos---------
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private ArrayList<String> keyword;

    //---------Métodos---------

    //Constructor
    public void option(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, ArrayList<String> keyword){
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keyword = keyword;
    }

    //Selectores

    /**
     * Se selecciona el codigo de la opción.
     */
    @Override
    public int getCode() {
        return code;
    }

    /**
     * Se selecciona el mensaje de la opción.
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Se selecciona el link del chatbot de una opción.
     */
    @Override
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * Se selecciona el código del link inicial del flow de una opción.
     */
    @Override
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     * Se selecciona los o el keyword de una opción.
     */
    @Override
    public ArrayList<String> getKeyword() {
        return keyword;
    }

    //Modificadores

}
