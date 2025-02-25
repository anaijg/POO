package ejercicios.usuario;

public class Usuario {
    private String username;
    private String email;
    private String password;
    private Estado estado;

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.PENDIENTE;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
public void mensajeEstado(){

        if (estado.equals(Estado.PENDIENTE)){
            System.out.println("Tienes que esperar un poco");
        } else if (estado.equals(Estado.ACTIVO)){
            System.out.println("Todo ok, via libre");
        } else if (estado.equals(Estado.BLOQUEADO)){
            System.out.println("Usuario bloqueado. Algo habrás hecho");
        } else {
            System.out.println("Estado desconocido");
        }
}

}
