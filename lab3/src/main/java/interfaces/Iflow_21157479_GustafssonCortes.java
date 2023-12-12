package interfaces;
import clases.option_21157479_GustafssonCortes;
import java.util.ArrayList;

/**
 * Interfaz que se componen de los métodos que deben de tener los flujos.
 */
public interface Iflow_21157479_GustafssonCortes {
    /**
     * Se selecciona el código del flow.
     *
     * @return int Código de un flujo.
     */
    public int getId();

    /**
     * Se selecciona el mensaje del flow.
     *
     * @return String Mensaje de un flujo.
     */
    public String getName_msg();
    /**
     * Se selecciona la lista de opciones del flow.
     *
     * @return ArrayList Lista de opciones de un flujo.
     */
    public ArrayList<option_21157479_GustafssonCortes> getOptions();

    /**
     * Modifica un flujo para poder añadirle una nueva opción, pero primero verifica que no esté repetida mediante su
     * id, si está repetida la opción, no es agregada y se mantiene el flujo inicial.
     *
     * @param option Opción a agregar.
     */
    public void flowAddOption(option_21157479_GustafssonCortes option);
}

