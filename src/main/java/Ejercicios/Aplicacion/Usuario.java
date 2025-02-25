package Ejercicios.Aplicacion;

public class Usuario {
    private String username;
    private String email;
    private String password;
    private Estado estado;


    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.Pendiente;
    }

    public String getUsername() {
        return username;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void mensajeEstado() {
        if (estado.equals(Estado.Activo)) {
            System.out.println("Todo ok, via libre");
        } else if (estado.equals(Estado.Pendiente)) {
            System.out.println("tienes que esperar un poco");
        } else if (estado.equals(Estado.Bloquado)) {
            System.out.println("Usuario bloqueado, algo habras hecho");
        }
    }
}
