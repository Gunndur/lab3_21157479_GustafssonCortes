package clases;
import interfaces.Ioption_21157479_GustafssonCortes;

/**
 * CLASE OPTION:
 * Clase que representa opciones, esta construye una opción para un flujo de un chatbot, siendo estos
 * unicos mediante su propio id. Cada opción se une a un chatbot y un flujo específicos.
 *
 * Dom: code(int) x message(string) x chatbotCodeLink(int) x initialFlowCodeLink(int) x keyword(Lista de Strings).
 * Rec: option.
 *
 * @author Thomas Gustafsson Cortés
 */

public class option_21157479_GustafssonCortes implements Ioption_21157479_GustafssonCortes {

    //---------Atributos---------
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private String[] keyword;

    //---------Métodos---------

    /**
     * Constructor.
     * @param code
     * @param message
     * @param chatbotCodeLink
     * @param initialFlowCodeLink
     * @param keyword
     */
    public option_21157479_GustafssonCortes(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, String... keyword){
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keyword = keyword;
    }

    //Selectores

    /**
     * Se selecciona el codigo de la opción.
     *
     * @return int Codigo de la opción.
     */
    @Override
    public int getCode() {
        return code;
    }

    /**
     * Se selecciona el mensaje de la opción.
     *
     * @return String Mensaje de la opción.
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Se selecciona el link del chatbot de una opción.
     *
     * @return int Link del chatbot de una opción.
     */
    @Override
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * Se selecciona el código del link inicial del flow de una opción.
     *
     * @return int Link inicial del flow de una opción.
     */
    @Override
    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     * Se selecciona los o el keyword de una opción.
     *
     * @return List Palabras claves de una opción
     */
    @Override
    public String[] getKeyword() {
        return keyword;
    }

    //Modificadores

}
