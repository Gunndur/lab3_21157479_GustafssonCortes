package interfaces;
import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener las opciones.
 */
public interface Ioption_21157479_GustafssonCortes {
    /**
     * Se selecciona el codigo de la opción.
     *
     * @return int Codigo de la opción.
     */
    public int getCode();

    /**
     * Se selecciona el mensaje de la opción.
     *
     * @return String Mensaje de la opción.
     */
    public String getMessage();

    /**
     * Se selecciona el link del chatbot de una opción.
     *
     * @return int Link del chatbot de una opción.
     */
    public int getChatbotCodeLink();

    /**
     * Se selecciona el código del link inicial del flow de una opción.
     *
     * @return int Link inicial del flow de una opción.
     */
    public int getInitialFlowCodeLink();

    /**
     * Se selecciona los o el keyword de una opción.
     *
     * @return List Palabras claves de una opción
     */
    public String[] getKeyword();
}
