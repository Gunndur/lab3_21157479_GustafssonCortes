package clases;
import interfaces.Iuser_21157479_GustafssonCortes;

/**
 * CLASE USER:
 * Clase abstracta que representa un usuario con su nombre como id de tipo entero positivo.
 *
 * Dom: username(String).
 * Rec: user.
 */
public abstract class user_21157479_GustafssonCortes implements Iuser_21157479_GustafssonCortes{
    //---------Atributos---------
    protected String username;

    //---------Métodos---------

    //Constructor

    //Selectores
    /**
     * Se selecciona el id del chatbot.
     */
    @Override
    public String getUsername() {
        return username;
    }
    //Modificadores

}
