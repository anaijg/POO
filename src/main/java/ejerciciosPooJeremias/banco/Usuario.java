package ejerciciosPooJeremias.banco;

public class Usuario {
    private String login, nombre, apellidos;


    //Constructor parametrizado
    /**
     *
     * @param login
     * @param nombre
     * @param apellidos
     */

    public Usuario( String login, String nombre, String apellidos){
        this.login = login;
        this.nombre = nombre;
        this.apellidos=apellidos;
    }



    //Getters
    public String getLogin(){
        return "Login de usuario: " + login;
    }

    public String getNombre(){
        return "Nombre de Usuario: " + nombre;
    }

    public String getApellidos(){
        return "Apellidos del usuario: " + apellidos;
    }

    //Setters

    public void setLogin(String login){
        this.login = login;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
