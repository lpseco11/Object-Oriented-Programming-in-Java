/**
 * Classe que gere e contém as caracteristicas da restauracao, uma das categorias da empresa
 */

public abstract class Restauracao extends Empresa {

    /**
     * Numero de empregados
     */
    protected int numEmp;

    /**
     * Salario medio anual do empregado
     */
    protected double salEmp;

    Restauracao() {
    }

    Restauracao(String tipo, String nome, String local, String gps, int numEmp, double salEmp) {
        super(tipo, nome, local, gps);
        this.numEmp = numEmp;
        this.salEmp = salEmp;
    }

    /**
     * Fornece o numero de empregados
     *
     * @return Numero de empregados
     */
    public int getNumEmp() {
        return numEmp;
    }

    /**
     * Define o numero de empregados
     *
     * @param numEmp Número de empregados
     */
    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    /**
     * Fornece o salario medio anual do empregado
     *
     * @return Salario medio anual do empregado
     */
    public double getSalEmp() {
        return salEmp;
    }

    /**
     * Define o salario medio anual do empregado
     *
     * @param salEmp Salario medio anual do empregado
     */
    public void setSalEmp(double salEmp) {
        this.salEmp = salEmp;
    }

    /**
     * Metodo que imprime a informacao de uma empresa da categoria restauracao
     *
     * @return Informacao de uma empresa da categoria restauracao
     */
    public String toString() {
        return super.toString() + "\nNúmero de empregados de mesa: " + numEmp
                + "\nSalário médio anual do empregado: " + salEmp;
    }

}
