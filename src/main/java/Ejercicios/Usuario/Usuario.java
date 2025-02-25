package Ejercicios.Usuario;

        //atributos
public class Usuario {
    private String username;
    private String email;
    private String password;
    private Estado estado;

        //CONSTRUCTORES
    public Usuario(String username, String email, String password, Estado estado ) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.estado = Estado.PENDIENTE;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Estado getEstado(Estado estado) {
        this.estado = Estado.PENDIENTE;
        return this.estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override public String toString() {
        return "Usuario{" +
                "username=" + username +
                ", email=" + email +
                ", password=" + password +
                ", estado=" + estado +
                '}';
    }
    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El nuevo estado de la cuenta es: " + estado);
    }
    public void mensajeEstado() {
        if (this.estado == Estado.PENDIENTE) {
            System.out.println("tienes que esperar un poco");
        } else if (this.estado == Estado.ACTIVADO) {
            System.out.println("TODO ok, via libre");
        } else if (this.estado == Estado.BLOQUEADO) {
            System.out.println("Usuario esta bloqueado, algo habrás hecho");
        } else System.out.println("estado desconocido");
    }
}
