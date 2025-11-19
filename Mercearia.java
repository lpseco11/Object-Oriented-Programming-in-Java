public abstract class Mercearia extends Empresa {

    /**
     * Custo anual de limpeza do estabelecimento
     */
    protected double custoLimpeza;

    Mercearia() {
    }

    Mercearia(String tipo, String nome, String local, String gps, double custoLimpeza) {
        super(tipo, nome, local, gps);
        this.custoLimpeza = custoLimpeza;
    }

    /**
     * Fornece o custo de limpeza do estabelecimento
     *
     * @return Custo de limpeza do estabelecimento
     */
    public double getCustoLimpeza() {
        return custoLimpeza;
    }

    /**
     * Define o custo de limpeza do estabelecimento
     *
     * @param custoLimpeza Custo de limpeza do estabelecimento
     */
    public void setCustoLimpeza(double custoLimpeza) {
        this.custoLimpeza = custoLimpeza;
    }

    public String toString() {
        return super.toString();
    }
}
