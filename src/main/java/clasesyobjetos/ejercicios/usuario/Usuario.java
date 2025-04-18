package clasesyobjetos.ejercicios.usuario;

/**
 *Atributos: username, email, password
 * Constructor con tres parámetros para inicializar las instancias de la clase
 * Getters y setters para los atributos, teniendo en cuenta que una vez creado un usuario no podemos cambiar su nombre
 *  Añade un método toString para visualizar las propiedades de los usuarios.
 * En el paquete usuario crea también una clase Main con un método main
 */

public class Usuario {

    //atributos
    private String username;
    private String email;
    private String password;
    //añade a la clase Usuario un atributo estado de tipo estado
    private Estado estado;

    //cosntructor
    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        //Haz lo necesario para que se crea un usuario se le asigne por defecto el estado pendiente.
        this.estado = Estado.PENDIENTE;
    }
    //metodos getters and setters

    public String getUsername() {
        return username;
    }

    //no hacemos un setter de username por que me dicen quen no pueden cambiarlo

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Añade metodos para poder ver y cambiar el estado de un usuario.


    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //metodos de instancia

//     * También en la clase Usuario crea un método mensajeEstado():void.El método hace lo siguiente:
//     * Si el estado es PENDIENTE, imprime "Tienes que esperar un poco".
//     * Si el estado es ACTIVO, imprime "Todo ok, vía libre".
//     * Si el estado es BLOQUEADO, imprime "Usuario bloqueado. Algo habrás hecho".
//     * Si no es ninguno de estos estados, imprime "Estado desconocido".

    public void mensajeEstado(){
        if (estado.equals(Estado.PENDIENTE)){
            System.out.println("Tienes que esperar un poco.");
        } else if (estado.equals(Estado.ACTIVO)) {
            System.out.println("Todo ok, via libre.");
        } else if (estado.equals(Estado.BLOQUEADO)) {
            System.out.println("Usuario Bloqueado. Algo habrás hecho");
        }else{
            System.out.println("Estado desconocido.");
        }
    }



}
