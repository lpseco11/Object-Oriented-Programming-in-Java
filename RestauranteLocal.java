import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que gere e contem as caracteristicas de um restaurante local
 */

public class RestauranteLocal extends Restaurante {

    /**
     * Numero de mesas no interior do restaurante
     */
    private int numMesasInt;

    /**
     * Numero de mesas na esplanada do restaurante
     */
    private int numMesasEsp;

    /**
     * Custo de licenca anual por mesa de esplanada
     */
    private double licencaEsplanada;

    /**
     * Valor medio de faturacao de cada mesa por dia
     */
    private double valorMesa;

    /**
     * Construtor da classe, pede dados ao utilizador
     */
    RestauranteLocal() {
    }

    /**
     * Construtor da classe, recebe dados para iniciar
     * @param tipo tipo de empresa
     * @param nome nome da empresa
     * @param local distrito da empresa
     * @param gps coordenadas da empresa
     * @param numEmp numero de empregados
     * @param salEmp salario medio anual dos empregados
     * @param numMedioClientes numero medio de clientes
     * @param numDias numero de dias de funcionamento
     * @param numMesasInt numero de mesas no interior
     * @param numMesasEsp numero de mesas na esplanada
     * @param licencaEsplanada custo anual da licenca por mesa de esplanada
     * @param valorMesa valor medio de faturacao por mesa
     */
    RestauranteLocal(String tipo, String nome, String local, String gps, int numEmp, double salEmp, int numMedioClientes, int numDias, int numMesasInt, int numMesasEsp, double licencaEsplanada, double valorMesa) {
        super(tipo, nome, local, gps, numEmp, salEmp, numMedioClientes, numDias);
        this.numMesasInt = numMesasInt;
        this.numMesasEsp = numMesasEsp;
        this.licencaEsplanada = licencaEsplanada;
        this.valorMesa = valorMesa;
    }

    /**
     * Fornece o numero de mesas no interior do restaurante local
     *
     * @return Numero de mesas no interior do restaurante local
     */
    public int getNumMesasInt() {
        return numMesasInt;
    }

    /**
     * Define o numero de mesas no interior do restaurante local
     *
     * @param numMesasInt Numero de mesas no interior do restaurante local
     */
    public void setNumMesasInt(int numMesasInt) {
        this.numMesasInt = numMesasInt;
    }

    /**
     * Fornece o numero de mesas na esplanada do restaurante local
     *
     * @return Numero de mesas na esplanada do restaurante local
     */
    public int getNumMesasEsp() {
        return numMesasEsp;
    }

    /**
     * Define o numero de mesas na esplanada do restaurante local
     *
     * @param numMesasEsp Numero de mesas na esplanada do restaurante local
     */
    public void setNumMesasEsp(int numMesasEsp) {
        this.numMesasEsp = numMesasEsp;
    }

    /**
     * Fornece o custo da licenca anual por mesa na esplanada
     *
     * @return Custo da licenca anual por mesa na esplanada
     */

    public double getLicencaEsplanada() {
        return licencaEsplanada;
    }

    /**
     * Define o custo da licenca anual por mesa na esplanada
     *
     * @param licencaEsplanada Custo da licenca anual por mesa na esplanada
     */
    public void setLicencaEsplanada(double licencaEsplanada) {
        this.licencaEsplanada = licencaEsplanada;
    }

    /**
     * Fornece o valor medio de faturacao por mesa por dia
     *
     * @return Valor medio de faturacao por mesa por dia
     */
    public double getValorMesa() {
        return valorMesa;
    }

    /**
     * Define o valor medio de faturacao por mesa por dia
     *
     * @param valorMesa Valor medio de faturacao por mesa por dia
     */
    public void setValorMesa(double valorMesa) {
        this.valorMesa = valorMesa;
    }

    /**
     * Metodo que calcula a despesa anual de um restaurante local
     *
     * @return Despesa anual de um restaurante local
     */
    public double despesaAnual() {
        return numEmp * salEmp + numMesasEsp * licencaEsplanada;
    }

    /**
     * Metodo que calcula a receita anual de um restaurante local
     *
     * @return Receita anual de um restaurante local
     */
    public double receitaAnual() {
        return (numMesasInt + numMesasEsp) * valorMesa * numDias;
    }

    /**
     * Metodo que calcula o lucro de um Restaurante Local
     *
     * @return Valor do lucro
     */
    public double lucro() {
        return receitaAnual() - despesaAnual();
    }

    /**
     * Metodo que devolve o numero de clientes de um Restaurante Local
     *
     * @return Numero de clientes de um Restaurante Local
     */
    public int maisClientes() {
        return numMedioClientes;
    }

    /**
     * Metodo que permite criar uma empresa do tipo Restaurante Local
     *
     * @return Empresa do tipo Restaurante Local
     */
    public RestauranteLocal adicionaEmpresa() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String local;
        String gps;
        int numEmp;
        double salEmp;
        int numMedioClientes;
        int numDias;
        int numMesasInt;
        int numMesasEsp;
        double licencaEsplanada;
        double valorMesa;


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

        System.out.print("Número médio de clientes: ");
        numMedioClientes = sc.nextInt();

        System.out.print("Número de dias em funcionamento por ano: ");
        numDias = sc.nextInt();

        System.out.print("Número de mesas no interior: ");
        numMesasInt = sc.nextInt();

        System.out.print("Número de mesas na esplanada: ");
        numMesasEsp = sc.nextInt();

        System.out.print("Custo de licença anual por mesa de esplanada: ");
        licencaEsplanada = sc.nextDouble();

        System.out.print("Valor médio de faturação diária por mesa: ");
        valorMesa = sc.nextDouble();


        return new RestauranteLocal("Restaurante_Local", nome, local, gps, numEmp, salEmp, numMedioClientes, numDias, numMesasInt, numMesasEsp, licencaEsplanada, valorMesa);
    }

    /**
     * Metodo que imprime a informacao de um restaurante local
     *
     * @return Informacao de um restaurante local
     */
    public String toString() {
        if (lucro() > 0) {
            return super.toString() + "\nNúmero de mesas no interior: " + numMesasInt + "\nNúmero de mesas na esplanada: " + numMesasEsp
                    + "\nCusto de licença da mesa: " + licencaEsplanada + "\nValor médio de faturação por mesa diário: " + valorMesa
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: sim\n";
        } else {
            return super.toString() + "\nNúmero de mesas no interior: " + numMesasInt + "\nNúmero de mesas na esplanada: " + numMesasEsp
                    + "\nCusto de licença da mesa: " + licencaEsplanada + "\nValor médio de faturação por mesa diário: " + valorMesa
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: não\n";
        }
    }
}
