package herencia.preguntascortas;

class Bicicleta {
    protected int cadencia;
    private int pistones;
    private int velocidad;

    protected int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
    }
}



class MountainBike extends Bicicleta { }

class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();

    }
}

