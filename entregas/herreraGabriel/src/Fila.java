public class Fila {
    private int cantidadPersonas;

    public Fila() {
        this.cantidadPersonas = 0;
    }

    public void formarPersona() {
        this.cantidadPersonas++;
    }

    public void salirPersona() {
        if (!estaVacia()) {
            this.cantidadPersonas--;
        }
    }

    public boolean estaVacia() {
        return this.cantidadPersonas == 0;
    }

    public int getLongitud() {
        return this.cantidadPersonas;
    }
}