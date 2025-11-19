import java.util.Scanner;

/**
 * Classe que gere e contem as caracteristicas de um Cafe
 */

public class Cafe extends Restauracao {

    /**
     * Numero medio de cafes vendidos por dia
     */
    private int numCafes;

    /**
     * Numero medio de clientes por dia
     */
    private int numMedioClientes;

    /**
     * Faturacao anual de um cafe
     */
    private double fatAnual;

    /**
     * Construtor da classe, pede dados ao utilizador
     */
    Cafe() {
    }

    /**
     * Construtor da classe, recebe dados para iniciar
     * @param tipo tipo de empresa
     * @param nome nome da empresa
     * @param local distrito da empresa
     * @param gps coordenadas da empresa
     * @param numEmp numero de empregados
     * @param salEmp salario dos empregados
     * @param numMedioClientes numero medio de clientes por dia
     * @param numCafes numero de cafes vendidos por dia
     * @param fatAnual valor de faturacao anual por cafe
     */
    Cafe(String tipo, String nome, String local, String gps, int numEmp, double salEmp, int numMedioClientes, int numCafes, double fatAnual) {
        super(tipo, nome, local, gps, numEmp, salEmp);
        this.numCafes = numCafes;
        this.numMedioClientes = numMedioClientes;
        this.fatAnual = fatAnual;
    }

    /**
     * Fornece o número medio de cafes vendidos por dia
     *
     * @return Numero medio de cafes vendidos por dia
     */
    public int getNumCafes() {
        return numCafes;
    }

    /**
     * Define o numero medio de cafes vendidos por dia
     *
     * @param numCafes Numero medio de cafes vendidos por dia
     */
    public void setNumCafes(int numCafes) {
        this.numCafes = numCafes;
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
     * Define o numero medio de clientes por dia
     *
     * @param numMedioClientes Numero medio de clientes por dia
     */
    public void setNumMedioClientes(int numMedioClientes) {
        this.numMedioClientes = numMedioClientes;
    }

    /**
     * Fornece o valor medio da faturacao anual por cafe vendido por dia
     *
     * @return Valor medio da faturacao anual por cafe vendido por dia
     */
    public double getFatAnual() {
        return fatAnual;
    }

    /**
     * Define o valor medio da faturacao anual por cafe vendido por dia
     *
     * @param fatAnual Valor medio da faturacao anual por cafe vendido por dia
     */
    public void setFatAnual(double fatAnual) {
        this.fatAnual = fatAnual;
    }

    /**
     * Metodo que calcula a receita anual de um cafe
     *
     * @return Receita anual de um cafe
     */
    public double receitaAnual() {
        return numCafes * fatAnual;
    }

    /**
     * Metodo que calcula a despesa anual de um cafe
     *
     * @return Despesa anual de um cafe
     */
    public double despesaAnual() {
        return numEmp * salEmp;
    }

    /**
     * Metodo que calcula o lucro de um Cafe
     *
     * @return Valor do lucro
     */
    public double lucro() {
        return receitaAnual() - despesaAnual();
    }

    public int maisClientes() {
        return numMedioClientes;
    }

    /**
     * Metodo que permite criar uma empresa do tipo Cafe
     *
     * @return Empresa do tipo Cafe
     */

    public Cafe adicionaEmpresa() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String local;
        String gps;
        int numEmp;
        double salEmp;
        int numMedioClientes;
        int numCafes;
        double fatAnual;

        System.out.print("Nome da empresa: ");
        nome = sc.nextLine();

        System.out.print("Distrito da empresa: ");
        local = sc.nextLine();

        System.out.print("Coordenadas: ");
        gps = sc.nextLine();

        System.out.print("Número de empregados: ");
        numEmp = sc.nextInt();

        System.out.print("Salário médio dos empregados: ");
        salEmp = sc.nextDouble();

        System.out.print("Número de clientes: ");
        numMedioClientes = sc.nextInt();

        System.out.print("Número de cafés vendidos por dia: ");
        numCafes = sc.nextInt();

        System.out.print("Faturação anual de um café: ");
        fatAnual = sc.nextDouble();

        return new Cafe("Cafe", nome, local, gps, numEmp, salEmp, numMedioClientes, numCafes, fatAnual);

    }

    /**
     * Metodo que imprime a informacao de um Cafe
     *
     * @return Informacao de um cafe
     */
    public String toString() {
        if (lucro() > 0) {
            return super.toString() + "\nNúmero médio de clientes diário: " + numMedioClientes
                    + "\nNúmero médio de cafés diário: " + numCafes + "\nFaturação anual do café: " + fatAnual
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: sim\n";
        } else {
            return super.toString() + "\nNúmero médio de clientes diário: " + numMedioClientes
                    + "\nNúmero médio de cafés diário: " + numCafes + "\nFaturação anual do café: " + fatAnual
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: não\n";
        }
    }
}
