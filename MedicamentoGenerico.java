package endes.farmacia.medicamentos;

/**
 * Clase hija (Medicamento Generico) de la clase padre Medicamento
 * @author Pablo
 */
public class MedicamentoGenerico extends Medicamento {

    /**
     * Constructor de la clase hija Medicamento Generico
     * @param nombre : Nombre del medicamento
     * @param precio : Precio del medicamento
     */

    public MedicamentoGenerico(String nombre, double precio) {
        super(nombre, precio);
    }

}
