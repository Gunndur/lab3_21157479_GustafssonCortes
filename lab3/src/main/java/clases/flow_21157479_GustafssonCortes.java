package clases;
import interfaces.Iflow_21157479_GustafssonCortes;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * CLASE FLOW:
 * Clase que representa un flujo en particular sin ningun tipo de repticion de un chatbot, este se representa por un id
 * unico de tipo entero positivo, un nombre del mensaje propiamente tal del flujo de tipo strinng y un listado
 * de las posibles opciones a escoger, donde cada uno de los elementos es de tipo option.
 *
 * Dom: id(int) x name-msg(String) x options(Lista de option).
 * Rec: flow.
 *
 * @author Thomas Gustafsson Cortés
 */

public class flow_21157479_GustafssonCortes implements Iflow_21157479_GustafssonCortes {
    //---------Atributos---------
    private int id;
    private String name_msg;
    private ArrayList<option_21157479_GustafssonCortes> options;

    //---------Métodos---------

    /**
     * Constructor.
     * @param id
     * @param name_msg
     * @param options
     */
    public flow_21157479_GustafssonCortes(int id, String name_msg, option_21157479_GustafssonCortes... options){
        this.id = id;
        this.name_msg = name_msg;
        this.options = new ArrayList<>(List.of(options));
    }

    //Selectores
    /**
     * Se selecciona el código del flow.
     *
     * @return int Código de un flujo.
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Se selecciona el mensaje del flow.
     *
     * @return String Mensaje de un flujo.
     */
    @Override
    public String getName_msg() {
        return name_msg;
    }
    /**
     * Se selecciona la lista de opciones del flow.
     *
     * @return ArrayList Lista de opciones de un flujo.
     */
    @Override
    public ArrayList<option_21157479_GustafssonCortes> getOptions() {
        return options;
    }

    //Modificadores

    /**
     * Modifica un flujo para poder añadirle una nueva opción, pero primero verifica que no esté repetida mediante su
     * id, si está repetida la opción, no es agregada y se mantiene el flujo inicial.
     *
     * @param option Opción a agregar.
     */
    public void flowAddOption(option_21157479_GustafssonCortes option){
        int x = option.getCode();
        ArrayList<option_21157479_GustafssonCortes> options = this.options;
        for(option_21157479_GustafssonCortes op : options){
            if (op.getCode() == x){
                return;
            }
        }
        this.options.add(option);
    }
}
