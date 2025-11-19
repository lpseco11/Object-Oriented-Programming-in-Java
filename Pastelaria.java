import java.util.Scanner;

/**
 * Classe que gere e contém as caracteristicas de uma pastelaria
 */

public class Pastelaria extends Restauracao {

    /**
     * Número medio de clientes por dia
     */
    private int numMedioClientes;

    /**
     * Número medio de bolos vendidos por dia
     */
    private int numBolos;

    /**
     * Faturacao anual de bolo
     */
    private double fatAnual;

    /**
     * Construtor da classe, pede dados ao utilizador
     */
    Pastelaria() {
    }

    /**
     * Construtor da classe, recebe dados para iniciar
     * @param tipo tipo de empresa
     * @param nome nome da empresa
     * @param local distrito da empresa
     * @param gps coordenadas da empresa
     * @param numEmp numero de empregados
     * @param salEmp salario dos empregados
     * @param numMedioClientes numero medio de clientes
     * @param numBolos numero de bolos vendido por dia
     * @param fatAnual faturacao anual por bolo
     */
    Pastelaria(String tipo, String nome, String local, String gps, int numEmp, double salEmp, int numMedioClientes, int numBolos, double fatAnual) {
        super(tipo, nome, local, gps, numEmp, salEmp);
        this.numMedioClientes = numMedioClientes;
        this.numBolos = numBolos;
        this.fatAnual = fatAnual;
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
     * Deine o numero medio de clientes por dia
     *
     * @param numMedioClientes Numero medio de clientes por dia
     */
    public void setNumMedioClientes(int numMedioClientes) {
        this.numMedioClientes = numMedioClientes;
    }

    /**
     * Fornece o numero de bolos vendidos por dia
     *
     * @return Numero de bolos vendidos por dia
     */
    public int getNumBolos() {
        return numBolos;
    }

    /**
     * Define o numero de bolos vendidos por dia
     *
     * @param numBolos Numero de bolos vendidos por dia
     */
    public void setNumBolos(int numBolos) {
        this.numBolos = numBolos;
    }

    /**
     * Fornece a faturacao anual de bolos
     *
     * @return Faturacao anual de bolos
     */
    public double getFatAnual() {
        return fatAnual;
    }

    /**
     * Define a faturacao anual de bolos
     *
     * @param fatAnual Faturacao anual de bolos
     */
    public void setFatAnual(double fatAnual) {
        this.fatAnual = fatAnual;
    }

    /**
     * Metodo que calcula a despesa anual de uma pastelaria
     *
     * @return Despesa anual de uma pastelaria
     */
    public double despesaAnual() {
        return numEmp * salEmp;
    }

    /**
     * Metodo que calcula a receita anual de uma pastelaria
     *
     * @return Receita anual de uma pastelaria
     */
    public double receitaAnual() {
        return numBolos * fatAnual;
    }

    /**
     * Metodo que calcula o lucro de uma Pastelaria
     *
     * @return Valor do lucro
     */
    public double lucro() {
        return receitaAnual() - despesaAnual();
    }

    @Override
    public int maisClientes() {
        return numMedioClientes;
    }

    /**
     * Metodo que permite criar uma empresa do tipo Pastelaria
     *
     * @return Empresa do tipo Pastelaria
     */
    public Pastelaria adicionaEmpresa() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String local;
        String gps;
        int numEmp;
        double salEmp;
        int numClientes;
        int numBolos;
        double faturacao;


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
        numClientes = sc.nextInt();

        System.out.print("Número de bolos vendidos por dia: ");
        numBolos = sc.nextInt();

        System.out.print("Faturação anual de um café: ");
        faturacao = sc.nextDouble();

        return new Pastelaria("Pastelaria", nome, local, gps, numEmp, salEmp, numClientes, numBolos, faturacao);
    }

    /**
     * Metodo que imprime a informacao da pastelaria
     *
     * @return Informecao da pastelaria
     */
    public String toString() {
        if (lucro() > 0) {
            return super.toString() + "\nNúmero médio de clientes por dia: " + numMedioClientes +
                    "\nNúmero de bolos vendidos por dia: " + numBolos + "\nFaturação anual de bolos: " + fatAnual
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: sim\n";
        } else {
            return super.toString() + "\nNúmero médio de clientes por dia: " + numMedioClientes +
                    "\nNúmero de bolos vendidos por dia: " + numBolos + "\nFaturação anual de bolos: " + fatAnual
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: não\n";
        }
    }
}
