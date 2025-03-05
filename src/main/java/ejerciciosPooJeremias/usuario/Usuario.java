package ejerciciosPooJeremias.usuario;

public class Usuario {
    private String username, email, password;
    private Estado estado;

    /**
     *
     * @param username
     * @param email
     * @param password
     */
    public Usuario(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        //cuando se crea un usuario se le asigna por defecto el estado pendiente
        this.estado = Estado.PENDIENTE;
    }

    //Getter
    public String getUsername(){
        return "El nombre de usuario es: " + this.username;
    }

    public String getEmail(){
        return "El email es: " + this.email;
    }

    public String getPassword(){
        return "El pass del usuario es: ";
    }

    //Setter
    public void setEmail(String email){
        this.email = email;
        System.out.println("Ingrese el email: ");
    }

    public void setPassword(String password){
        this.password = password;
        System.out.println("Ingrese una pass");
    }


    //Set y Get de estado
    public Estado getEstado(){
        return this.estado;
    }

    public void  setEstado(Estado estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    /*
    En la clase Usuario crea un méto_do mensajeEstado():void.El méto_do
    hace lo siguiente:
        Si el estado es PENDIENTE, imprime "Tienes que esperar un poco".
        Si el estado es ACTIVO, imprime "To_do ok, vía libre".
        Si el estado es BLOQUEADO, imprime "Usuario bloqueado. Algo habrás hecho".
        Si no es ninguno de estos estados, imprime "Estado desconocido".
    */

    public void mensajeEstado(){
        if (estado.equals(Estado.PENDIENTE)){
            System.out.println("Tienes que esperar un poco");
        } else if (estado.equals(Estado.ACTIVO)) {
            System.out.println("Todo ok, vía libre");
        }else{
            System.out.println("Usuario bloqueado. Algo habrás hecho");
        }
    }
}
