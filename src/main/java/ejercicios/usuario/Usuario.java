package ejercicios.usuario;

/**
 * La clase Usuario debe contener:
 * Atributos: username, email, password
 * Constructor con tres parámetros para inicializar las instancias de la clase
 * Getters y setters para los atributos, teniendo en cuenta que una vez creado un usuario no podemos cambiar su nombre
 *  Añade un método toString para visualizar las propiedades de los usuarios.
 */

public class Usuario {
    // atributos
    private String username;
    private String email;
    private String password;
    // Añade a la clase Usuario un atributo estado de tipo Estado;
    private Estado estado;

    // constructor
    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        // Haz lo necesario para que cuando se crea un usuario se le asigne por defecto el estado pendiente.
        this.estado = Estado.PENDIENTE;
    }

    // getters y setters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    // no hacemos un setter de username porque me dicen que no puedo cambiarlo
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Añade métodos para poder ver y cambiar el estado de un usuario.
    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // toString
    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // métodos de instancia
    // método mensajeEstado():void.El método hace lo siguiente:
    //Si el estado es PENDIENTE, imprime "Tienes que esperar un poco".
    //Si el estado es ACTIVO, imprime "Todo ok, vía libre".
    //Si el estado es BLOQUEADO, imprime "Usuario bloqueado. Algo habrás hecho".
    //Si no es ninguno de estos estados, imprime "Estado desconocido".
    public void mensajeEstado() {
        if (estado.equals(Estado.PENDIENTE)) {
            System.out.println("Tienes que esperar un poco.");
        } else if (estado.equals(Estado.ACTIVO)) {
            System.out.println("Todo ok, vía libre.");
        } else if (estado.equals(Estado.BLOQUEADO)) {
            System.out.println("Usuario bloqueado. Algo habrás hecho");
        } else {
            System.out.println("Estado desconocido.");
        }
    }

}
