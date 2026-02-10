public class objVehiculo {
     private String tipo;
    private String marca;
    private int celda;
    private double pago_actual;
    private double pago_anterior;
    private int cilindraje;
    public objVehiculo(String tipo, String marca, int celda, double pago_actual, double pago_anterior, int cilindraje) {
        this.tipo = tipo;
        this.marca = marca;
        this.celda = celda;
        this.pago_actual = pago_actual;
        this.pago_anterior = pago_anterior;
        this.cilindraje = cilindraje;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCelda() {
        return celda;
    }
    public void setCelda(int celda) {
        this.celda = celda;
    }
    public double getPago_actual() {
        return pago_actual;
    }
    public void setPago_actual(double pago_actual) {
        this.pago_actual = pago_actual;
    }
    public double getPago_anterior() {
        return pago_anterior;
    }
    public void setPago_anterior(double pago_anterior) {
        this.pago_anterior = pago_anterior;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
   
}