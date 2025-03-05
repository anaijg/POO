package ejercicios.aplicacion;

public class Usuario {
    private String username;
    private String email;
    private String password;
    private Estado estado;

    public Usuario(String username, String email, String password, Estado estado) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = estado;
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

    public void setEmail(String email) {
        this.email = email;
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
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", estado=" + estado +
                '}';
    }

    public void mensajeEstado(){
        switch (this.estado){
            case PENDIENTE -> System.out.println("Tienes que esperar un poco.");
            case ACTIVO -> System.out.println("Todo ok, dia libre.");
            case BLOQUEADO -> System.out.println("Usuario bloqueado. Algo habrás hecho.");
            default -> System.out.println("Estado desconocido");
        }
    }
}
