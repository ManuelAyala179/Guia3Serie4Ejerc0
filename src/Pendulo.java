
public class Pendulo {
    // Atributos del Pendulo

    private int Longitud;
    private double Aceleracion;

    // Métodos u operaciones
    // Constructor
    public Pendulo(int longi, double acel) {
        this.Longitud = longi;
        this.Aceleracion = acel;
    }

    // Analizadores
    public double ingLong() {
        return this.Longitud;
    }

    public double ingAceleracion() {
        return this.Aceleracion;
    }
}
