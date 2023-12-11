package interfaces;
import clases.option_21157479_GustafssonCortes;
import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener los flujos.
 */
public interface Iflow_21157479_GustafssonCortes {
    /**
     * Se selecciona el codigo del flow.
     */
    public int getId();

    /**
     * Se selecciona el mensaje del flow.
     */
    public String getName_msg();
    /**
     * Se selecciona la lista de opciones del flow.
     */
    public String[] getOptions();
}
