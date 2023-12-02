package interfaces;
import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener las opciones.
 */
public interface Ioption_21157479_GustafssonCortes {
    /**
     * Se selecciona el codigo de la opción.
     */
    public int getCode();

    /**
     * Se selecciona el mensaje de la opción.
     */
    public String getMessage();

    /**
     * Se selecciona el link del chatbot de una opción.
     */
    public int getChatbotCodeLink();

    /**
     * Se selecciona el código del link inicial del flow de una opción.
     */
    public int getInitialFlowCodeLink();

    /**
     * Se selecciona los o el keyword de una opción.
     */
    public ArrayList<String> getKeyword();
}
