import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class Tienda {
    private String nombre;
    private List<Producto> inventario;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public List<Producto> getInventario() {
        return inventario;
    }

    // Métodos
    public void agregarProducto(Producto p) {
        this.inventario.add(p);
        System.out.println("Producto '" + p.getDescripcion() + "' agregado al inventario.");
    }

    public void mostrarInventario() {
        System.out.println("\n--- Inventario de la Tienda: " + this.nombre + " ---");
        for (Producto producto : inventario) {
            System.out.println(producto.mostrarDatos());
        }
        System.out.println("----------------------------------------");
    }

    public double calcularValorTotal() {
        return inventario.stream()
                         .mapToDouble(Producto::getPrecio)
                         .sum();
    }

    public void ordenarPorPrecioDescendente() {
        Collections.sort(this.inventario, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return Double.compare(p2.getPrecio(), p1.getPrecio());
            }
        });
        System.out.println("Inventario ordenado por precio descendente.");
    }

    public void buscarProductosPorTipo(String tipo) {
        boolean encontrado = false;
        String tipoNormalizado = tipo.toLowerCase();

        System.out.println("Productos de tipo '" + tipo + "':");
        for (Producto p : inventario) {
            if (tipoNormalizado.equals("tecnologico") && p instanceof ProductoTecnologico) {
                System.out.println(p.mostrarDatos());
                encontrado = true;
            } else if (tipoNormalizado.equals("oficina") && p instanceof ProductoOficina) {
                System.out.println(p.mostrarDatos());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron productos del tipo '" + tipo + "'.");
        }
        System.out.println("----------------------------------------");
    }
}