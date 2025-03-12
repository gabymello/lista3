
package tipos.de.transporte;

    class Avião extends Transporte {
    private int altitudeMaxima;  // Atributo altitude máxima com visibilidade privada

    public Avião(int capacidade, int altitudeMaxima) {
        super(capacidade);
        this.altitudeMaxima = altitudeMaxima;
    }

    // Método para definir a altitude máxima do Avião
    public void definirAltitude(int altitude) {
        this.altitudeMaxima = altitude;
    }

    @Override
    public void mover() {
        System.out.println("O Avião está voando a uma altitude máxima de " + altitudeMaxima + " metros.");
    }
}


