package ejemploherenciapersona;

import java.time.LocalDate;

public class Programador extends Empleado {


    private String[] lenguajes;


    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }
}
