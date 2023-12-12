package clases;
import interfaces.Iuser_21157479_GustafssonCortes;

/**
 * CLASE USER:
 * Clase abstracta que representa un usuario con su nombre como id de tipo entero positivo.
 *
 * Dom: username(String).
 * Rec: user.
 *
 * @author Thomas Gustafsson Cortés
 */
public abstract class user_21157479_GustafssonCortes implements Iuser_21157479_GustafssonCortes{
    //---------Atributos---------
    protected String username;
    protected int tipo;

    //---------Métodos---------

    //Selectores
    /**
     * Se selecciona el id del usuario.
     *
     * @return String Id del usuario.
     */
    @Override
    public String getUsername() {
        return username;
    }

    /**
     * Se selecciona el tipo del usuario, que con el cual se valida si es administrador o un usuario normal.
     *
     * @return int Numero identificador de tipo de usuario.
     */
    @Override
    public int getTipo() {
        return tipo;
    }

}
