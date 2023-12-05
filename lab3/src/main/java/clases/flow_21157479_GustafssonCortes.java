package clases;
import interfaces.Iflow_21157479_GustafssonCortes;
import java.util.ArrayList;

/**
 * CLASE FLOW:
 * Clase que representa un flujo en particular sin ningun tipo de repticion de un chatbot, este se representa por un id
 * unico de tipo entero positivo, un nombre del mensaje propiamente tal del flujo de tipo strinng y un listado
 * de las posibles opciones a escoger, donde cada uno de los elementos es de tipo option.
 *
 * Dom: id(int) x name-msg(String) x options(Lista de option).
 * Rec: flow.
 */
public class flow_21157479_GustafssonCortes implements Iflow_21157479_GustafssonCortes {
    //---------Atributos---------
    private int id;
    private String name_msg;
    private ArrayList<option_21157479_GustafssonCortes> options;

    //---------Métodos---------

    //Constructor
    public void flow(int id, String name_msg,ArrayList<option_21157479_GustafssonCortes> options){
        this.id = id;
        this.name_msg = name_msg;
        this.options = options;
    }

    //Selectores
    /**
     * Se selecciona el codigo del flow.
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Se selecciona el mensaje del flow.
     */
    @Override
    public String getName_msg() {
        return name_msg;
    }
    /**
     * Se selecciona la lista de opciones del flow.
     */
    @Override
    public ArrayList<option_21157479_GustafssonCortes> getOptions() {
        return options;
    }


    //Modificadores

    /**
     * Modifica un flujo para poder añadirle una nueva opción, pero primero verifica que no esté repetida mediante su
     * id, si está repetida la opción, no es agregada y se mantiene el flujo inicial.
     */
    public void flowAddOption(option_21157479_GustafssonCortes option){
        int x = option.getCode();
        ArrayList<option_21157479_GustafssonCortes> options = this.getOptions();
        for(option_21157479_GustafssonCortes op : options){
            if (op.getCode() == x){
                return;
            }
        }
    this.options.add(option);
    }
}
