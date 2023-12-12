package clases;

/**
 * CLASE ADMIN:
 * Clase que representa un usuario tipo administrador, con su nombre y con un historial del chat propio.
 * Hereda los atributos y métodos de la clase user_21157479_GustafssonCortes.
 *
 * Dom: username(String).
 * Rec: admin.
 *
 * @author Thomas Gustafsson Cortés
 */
public class admin_21157479_GustafssonCortes extends user_21157479_GustafssonCortes{
    //---------Atributos---------

    //---------Métodos---------

    /**
     * Constructor.
     * @param username
     */
    public admin_21157479_GustafssonCortes(String username){
        this.username = username;
        this.tipo = 1;
    }

}
