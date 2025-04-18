package endes.farmacia.medicamentos;


/**
 * Clase hija (Medicamento especializado) de la clase padre Medicamento
 * @author Pablo
 */
public class MedicamentoEspecializado extends Medicamento {
    private String tipo;

    /**
     * Constructor de la clase hija medicamento especializado
     * @param nombre : Nombre del medicamento
     * @param precio : Precio del medicamento
     * @param tipo : Tipo del medicamento
     */
    public MedicamentoEspecializado(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    /**
     * Retorna el tipo de medicamento
     * @return Retorna el tipo de medicamento
     */

    public String getTipo() {
        return tipo;
    }

    /**
     * Método utilizado para setear el tipo de medicamento
     * @param tipo : Tipo de medicamento
     */

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método utilizado para sacar por pantalla la información del medicamento
     * @param numero : Número del medicamento
     * @param cantidad : Cantidad que contiene el medicamento
     * @param numFarmacia : Número de la farmacia
     * @param codigoMedicamento : El código del medicamento
     * @param codigoFarmacia : Código del medicamento
     * @return Retorna los valores de los parámetros
     */


    public String mostrarMedicamento(int numero, int cantidad, int numFarmacia, int codigoMedicamento, int codigoFarmacia) {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;

    }

    /**
     * Método utilizado para sacar los valores por pantalla como una cadena String
     * @return Método utilizado para sacar los valores por pantalla como una cadena String
     */

    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;
    }
}
