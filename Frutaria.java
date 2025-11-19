import java.util.Scanner;

/**
 * Classe que gere e contém as caracteristicas de uma frutaria
 */

public class Frutaria extends Mercearia {

    /**
     * Numero de produtos da frutaria
     */
    private int numProdutos;

    /**
     * Valor medio faturacao anual por produto
     */
    private double fatAnual;

    /**
     * Construtor da classe, pede dados ao utilizador
     */
    Frutaria() {
    }

    /**
     * Construtor da classe, recebe dados para iniciar
     * @param tipo tipo de empresa
     * @param nome nome da empresa
     * @param local distrito da empresa
     * @param gps coordenadas da empresa
     * @param custoLimpeza custo de limpeza da empresa
     * @param numProdutos numero de produtos
     * @param fatAnual faturacao anual por produto
     */
    Frutaria(String tipo, String nome, String local, String gps, double custoLimpeza, int numProdutos, double fatAnual) {
        super(tipo, nome, local, gps, custoLimpeza);
        this.numProdutos = numProdutos;
        this.fatAnual = fatAnual;
    }

    /**
     * Fornece o numero de produtos da frutaria
     *
     * @return Numero de produtos da frutaria
     */
    public int getNumProdutos() {
        return numProdutos;
    }

    /**
     * Define o numero de produtos da frutaria
     *
     * @param numProdutos Numero de produtos da frutaria
     */
    public void setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
    }

    /**
     * Fornece o valor medio de faturacao anual por produto
     *
     * @return Valor medio de faturacao anual por produto
     */
    public double getFatAnual() {
        return fatAnual;
    }

    /**
     * Define o valor medio de faturacao anual por produto
     *
     * @param fatAnual Valor medio de faturacao anual por produto
     */
    public void setFatAnual(double fatAnual) {
        this.fatAnual = fatAnual;
    }

    /**
     * Metodo que calcula a despesa anual de uma frutaria
     *
     * @return Despesa anual de uma frutaria
     */
    public double despesaAnual() {
        return custoLimpeza;
    }

    /**
     * Metodo que calcula a receita anual de uma frutaria
     *
     * @return Receita anual de uma frutaria
     */
    public double receitaAnual() {
        return numProdutos * fatAnual;
    }

    /**
     * Metodo que calcula o lucro de uma Frutaria
     *
     * @return Valor do lucro
     */
    public double lucro() {
        return receitaAnual() - despesaAnual();
    }

    @Override
    public int maisClientes() {
        return 0;
    }

    /**
     * Metodo que permite criar uma empresa do tipo frutaria
     *
     * @return Empresa do tipo frutaria
     */
    public Frutaria adicionaEmpresa() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String local;
        String gps;
        double custoLimpeza;
        int numProdutos;
        double faturacao;


        System.out.print("Nome da empresa: ");
        nome = sc.nextLine();

        System.out.print("Distrito da empresa: ");
        local = sc.nextLine();

        System.out.print("Coordenadas: ");
        gps = sc.nextLine();

        System.out.print("Custo anual de limpeza do estabelecimento: ");
        custoLimpeza = sc.nextDouble();

        System.out.print("Número de produtos do estabelecimento: ");
        numProdutos = sc.nextInt();

        System.out.print("Valor médio de faturação anual por produto: ");
        faturacao = sc.nextDouble();


        return new Frutaria("Frutatia", nome, local, gps, custoLimpeza, numProdutos, faturacao);

    }


    /**
     * Metodo que imprime a informacao de uma frutaria
     *
     * @return Informacao de uma frutaria
     */
    public String toString() {
        if (lucro() > 0) {
            return super.toString() + "\nNúmero de produtos: " + numProdutos + "\nValor médio de faturação anual por produto: "
                    + fatAnual + "\nCusto anual de limpeza do estabelecimento: " + custoLimpeza
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: sim\n";
        } else {
            return super.toString() + "\nNúmero de produtos: " + numProdutos + "\nValor médio de faturação anual por produto: "
                    + fatAnual + "\nCusto anual de limpeza do estabelecimento: " + custoLimpeza
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: não\n";
        }
    }
}
