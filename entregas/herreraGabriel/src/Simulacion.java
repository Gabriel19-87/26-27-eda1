public class Simulacion {
    private int minutosTotales;
    private Fila fila;
    private CajaRegistradora caja;

    public Simulacion(int minutosTotales) {
        this.minutosTotales = minutosTotales;
        this.fila = new Fila();
        this.caja = new CajaRegistradora();
    }

    public void ejecutar() {
        for (int minuto = 1; minuto <= this.minutosTotales; minuto++) {
            
            if (Math.random() < 0.6) {
                this.fila.formarPersona();
            }

            if (Math.random() < 0.4) {
                if (!this.fila.estaVacia()) {
                    this.fila.salirPersona();
                    this.caja.atenderPersona();
                }
            }
        }
    }

    public void mostrarResultados() {
        System.out.println("=== Resultados CCCF tras " + this.minutosTotales + " minutos ===");
        System.out.println("Personas que fueron atendidas: " + this.caja.getTotalAtendidos());
        System.out.println("Personas que quedaron en la fila: " + this.fila.getLongitud());
    }
}