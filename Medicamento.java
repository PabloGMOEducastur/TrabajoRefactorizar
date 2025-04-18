package endes.farmacia.medicamentos;


/**
 * Clase padre de Medicamentos
 * @author Pablo
 *
 */
public class Medicamento {
    public String nombre;
    public double precio;
    public double CONSTANTESUBENCIONADO = 15;

    /**
     * Constructor de la clase padre Parámetros
     * @param nombre : Nombre del medicamento
     * @param precio : Precio del medicamento
     */
    public Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Método que devuelve el precio subvencionado
     * @return Retorna el precio subencionado multiplicando por la constante y el precio
     *
     */

    public double getPrecioSubvencionado() {
        return CONSTANTESUBENCIONADO * precio;
    }
}
