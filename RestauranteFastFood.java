import java.util.Scanner;

/**
 * Classe que gere e contem as caracteristicas de um restaurante Fast Food
 */

public class RestauranteFastFood extends Restaurante {
    /**
     * Numero de mesas no interior do restaurante Fast Food
     */
    private int numMesas;

    /**
     * Valor medio de faturacao diaria por mesa
     */
    private double valorMedioMesa;

    /**
     * Numero medio de clientes diarios drive thru
     */
    private int numMedioClientesDt;

    /**
     * Valor medio de faturacao diária por cliente drive thru
     */
    private double valorMedioClientesDt;

    /**
     * Construtor da classe, pede dados ao utilizador
     */
    RestauranteFastFood() {
    }

    /**
     * Construtor da classe, recebe dados para iniciar
     * @param tipo tipo de empresa
     * @param nome nome da empresa
     * @param local distrito da empresa
     * @param gps coordenadas da empresa
     * @param numEmp numero de empregados
     * @param salEmp salario de empregados
     * @param numMedioClientes numero medio de clientes por dia
     * @param numDias numero de dias de funcionamento
     * @param numMesas numero de mesas no interior
     * @param valorMedioMesa valor medio de faturacao por mesa por dia
     * @param numMedioClientesDt numero de clientes drive thru
     * @param valorMedioClientesDt valor medio de faturacao por cliente drive thru
     */
    RestauranteFastFood(String tipo, String nome, String local, String gps, int numEmp, double salEmp, int numMedioClientes, int numDias, int numMesas, double valorMedioMesa, int numMedioClientesDt, double valorMedioClientesDt) {
        super(tipo, nome, local, gps, numEmp, salEmp, numMedioClientes, numDias);
        this.numMesas = numMesas;
        this.valorMedioMesa = valorMedioMesa;
        this.numMedioClientesDt = numMedioClientesDt;
        this.valorMedioClientesDt = valorMedioClientesDt;
    }

    /**
     * Fornece o numero de mesas no interior
     *
     * @return Numero de mesas no interior
     */
    public int getNumMesas() {
        return numMesas;
    }

    /**
     * Define o numero de mesas no interior
     *
     * @param numMesas Numero de mesas no interior
     */
    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    /**
     * Fornece o valor medio de faturacao diario por mesa por dia
     *
     * @return Valor medio de faturacao diario por mesa por dia
     */
    public double getValorMedioMesa() {
        return valorMedioMesa;
    }

    /**
     * Define o valor medio de faturacao diario por mesa por dia
     *
     * @param valorMedioMesa Valor medio de faturacao diario por mesa por dia
     */
    public void setValorMedioMesa(double valorMedioMesa) {
        this.valorMedioMesa = valorMedioMesa;
    }

    /**
     * Fornece o numero medio de clientes por dia drive thru
     *
     * @return Numero medio de clientes por dia drive thru
     */
    public int getNumMedioClientesDt() {
        return numMedioClientesDt;
    }

    /**
     * Define o numero medio de clientes por dia drive thru
     *
     * @param numMedioClientesDt Numero medio de clientes por dia drive thru
     */
    public void setNumMedioClientesDt(int numMedioClientesDt) {
        this.numMedioClientesDt = numMedioClientesDt;
    }

    /**
     * Fornece o valor medio de faturacao por cliente drive thru
     *
     * @return Valor medio de faturacao por cliente drive thru
     */
    public double getValorMedioClientesDt() {
        return valorMedioClientesDt;
    }

    /**
     * Define o valor medio de faturacao por cliente drive thru
     *
     * @param valorMedioClientesDt Valor medio de faturacao por cliente drive thru
     */
    public void setValorMedioClientesDt(double valorMedioClientesDt) {
        this.valorMedioClientesDt = valorMedioClientesDt;
    }

    /**
     * Metodo que calcula a despesa anual do restaurante fast food
     *
     * @return Despesa anual do restaurante fast food
     */
    public double despesaAnual() {
        return numEmp * salEmp;
    }

    /**
     * Metodo que calcula a receita anual de um restaurante fast food
     *
     * @return Receita anual de um restaurante fast food
     */
    public double receitaAnual() {
        return (numMesas * valorMedioMesa) + (numMedioClientesDt * valorMedioClientesDt);
    }

    /**
     * Metodo que calcula o lucro de um Restaurante Fast Food
     *
     * @return Valor do lucro
     */
    public double lucro() {
        return receitaAnual() - despesaAnual();
    }

    /**
     * Devolve o numero de clientes de um Restaurante Fast Food
     *
     * @return Numero de clientes de um Restaurante Fast Food
     */
    public int maisClientes() {
        return numMedioClientes;
    }

    /**
     * Metodo que permite criar uma empresa do tipo Restaurante Fast Food
     *
     * @return Empresa do tipo restaurante Fast Food
     */
    public RestauranteFastFood adicionaEmpresa() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String local;
        String gps;
        int numEmp;
        double salEmp;
        int numMedioClientes;
        int numDias;
        double valorMesa;
        int numClientesDt;
        double valorClientesDt;
        int numMesas;

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
        numMesas = sc.nextInt();

        System.out.print("Valor médio de faturação diária por mesa: ");
        valorMesa = sc.nextDouble();

        System.out.print("Número médio de clientes Drive thru: ");
        numClientesDt = sc.nextInt();

        System.out.print("Valor médio de faturação diária por cliente drive thru: ");
        valorClientesDt = sc.nextDouble();

        return new RestauranteFastFood("Restaurante_Fast_Food", nome, local, gps, numEmp, salEmp, numMedioClientes, numDias, numMesas, valorMesa, numClientesDt, valorClientesDt);
    }


    /**
     * Metodo que imprime a informacao do restaurante Fast Food
     *
     * @return Imprime a informacao do restaurante Fast Food
     */
    public String toString() {
        if (lucro() > 0) {
            return super.toString() + "\nNúmero de mesas no interior: " + numMesas + "\nValor médio de faturação por mesa por dia: " + valorMedioMesa
                    + "\nNúmero médio de clientes drive thru por dia: " + numMedioClientesDt + "\nValor médio de Faturação diária drive thru: " + valorMedioClientesDt
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: sim\n";
        } else {
            return super.toString() + "\nNúmero de mesas no interior: " + numMesas + "\nValor médio de faturação por mesa por dia: " + valorMedioMesa
                    + "\nNúmero médio de clientes drive thru por dia: " + numMedioClientesDt + "\nValor médio de Faturação diária drive thru: " + valorMedioClientesDt
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: não\n";
        }
    }
}
