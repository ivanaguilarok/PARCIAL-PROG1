public class ProductoTecnologico extends Producto {
    private int garantiaMeses;

    public ProductoTecnologico(String codigo, String descripcion, double precio, int garantiaMeses) {
        super(codigo, descripcion, precio);
        this.garantiaMeses = garantiaMeses;
    }

    // Getters
    public int getGarantiaMeses() {
        return garantiaMeses;
    }
    // Setters
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    // Mostrar datos
    @Override
    public String mostrarDatos() {
        return "Tecnológico: " + getDescripcion() + " - Garantía (meses): " + getGarantiaMeses() + " - Precio: " + getPrecio();
    }
}