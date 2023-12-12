package interfaces;

/**
 * Interfaz que se componen de los métodos que deben de tener los usuarios.
 *
 */
public interface Iuser_21157479_GustafssonCortes {
    /**
     * Se selecciona el id del usuario.
     *
     * @return String Id del usuario.
     */
    public String getUsername();

    /**
     * Se selecciona el tipo del usuario, que con el cual se valida si es administrador o un usuario normal.
     *
     * @return int Numero identificador de tipo de usuario.
     */
    public int getTipo();
}
