/**
 * Classe que gere e contem as caracteristicas de um restaurante
 */

public abstract class Restaurante extends Restauracao {

    /**
     * Numero medio de clientes por dia
     */
    protected int numMedioClientes;

    /**
     * Numero de dias de funcionamento por ano
     */
    protected int numDias;

    Restaurante() {
    }

    Restaurante(String tipo, String nome, String local, String gps, int numEmp, double salEmp, int numMedioClientes, int numDias) {
        super(tipo, nome, local, gps, numEmp, salEmp);
        this.numMedioClientes = numMedioClientes;
        this.numDias = numDias;
    }

    /**
     * Fornece o numero medio de clientes por dia
     *
     * @return Numero medio de clientes por dia
     */
    public int getNumMedioClientes() {
        return numMedioClientes;
    }

    /**
     * Define o numero medio de clientes por dia do restaurante
     *
     * @param numMedioClientes Numero medio de clientes por dia do restaurante
     */
    public void setNumMedioClientes(int numMedioClientes) {
        this.numMedioClientes = numMedioClientes;
    }

    /**
     * Fornece o numero de dias em que o restaurante funciona por ano
     *
     * @return Numero de dias em que o restaurante funciona por ano
     */
    public int getNumDias() {
        return numDias;
    }

    /**
     * Define o numero medio de dias em que o restaurante funciona
     *
     * @param numDias Define o numero medio de dias em que o restaurante funciona
     */
    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    /**
     * Metodo que imprime a informacao do restaurante
     *
     * @return Informacao do restaurante
     */
    public String toString() {
        return super.toString() + "\nNúmero médio de clientes diário: " + numMedioClientes +
                "\nNúmero de dias de funcionamento por ano: " + numDias;
    }
}
