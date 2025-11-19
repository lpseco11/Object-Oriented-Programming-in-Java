import java.util.Scanner;

/**
 * Classe que gere e contem as caracteristicas de um mercado
 */

public class Mercado extends Mercearia {

    /**
     * Tipo do mercado (mini, super, hiper)
     */
    private String tipoMercado;

    /**
     * Area do estabelecimento
     */
    private double area;

    /**
     * Valor medio de faturacao anual por m2
     */
    private double fatAnual;

    /**
     * Construtor da classe, pede dados ao utilizador
     */
    Mercado() {
    }

    /**
     * Construtor da classe, recebe dados para iniciar
     * @param tipo tipo de empresa
     * @param nome nome da empresa
     * @param local distrito da empresa
     * @param gps coordenadas da empresa
     * @param custoLimpeza custo de limpeza da empresa
     * @param tipoMercado tipo de mercado
     * @param area area da empresa
     * @param fatAnual faturacao anual por m2
     */
    Mercado(String tipo, String nome, String local, String gps, double custoLimpeza, String tipoMercado, double area, double fatAnual) {
        super(tipo, nome, local, gps, custoLimpeza);
        this.tipoMercado = tipoMercado;
        this.area = area;
        this.fatAnual = fatAnual;
    }

    /**
     * Fornece o tipo do mercado(mini, super, hiper)
     *
     * @return Tipo do mercado
     */
    public String getTipoMercado() {
        return tipoMercado;
    }

    /**
     * Define o tipo do mercado
     *
     * @param tipoMercado Tipo do mercado
     */
    public void setTipoMercado(String tipoMercado) {
        this.tipoMercado = tipoMercado;
    }

    /**
     * Fornece a area do estabelecimento
     *
     * @return Area do estabelecimento
     */
    public double getArea() {
        return area;
    }

    /**
     * Define a area do estabelecimento
     *
     * @param area Area do estabelecimento
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Fornece o valor médio de faturacao anual por m2
     *
     * @return Valor médio de faturacao anual por m2
     */
    public double getFatAnual() {
        return fatAnual;
    }

    /**
     * Define o valor medio de faturacao anual por m2
     *
     * @param fatAnual Valor medio de faturacao anual por m2
     */
    public void setFatAnual(double fatAnual) {
        this.fatAnual = fatAnual;
    }


    /**
     * Metodo que calcula a despesa anual de um mercado
     *
     * @return Despesa anual de um mercado
     */
    public double despesaAnual() {
        return custoLimpeza;
    }

    /**
     * Metodo que calcula a receita anual de um mercado
     *
     * @return Receita anual de um mercado
     */
    public double receitaAnual() {
        return area * fatAnual;
    }

    /**
     * Metodo que calcula o lucro de um Mercado
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
     * Metodo que permite criar uma empresa do tipo mercado
     *
     * @return Empresa do tipo mercado
     */
    public Mercado adicionaEmpresa() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String local;
        String gps;
        double custoLimpeza;
        String tipoMercado;
        double area;
        double faturacao;


        System.out.print("Nome da empresa: ");
        nome = sc.nextLine();

        System.out.print("Distrito da empresa: ");
        local = sc.nextLine();

        System.out.print("Coordenadas: ");
        gps = sc.nextLine();

        System.out.print("Número de empregados: ");
        custoLimpeza = sc.nextDouble();
        sc.nextLine();

        System.out.print("Tipo de mercado(mini, super, hiper): ");
        tipoMercado = sc.nextLine();

        System.out.print("Area do estabelecimento: ");
        area = sc.nextDouble();
        sc.nextLine();

        System.out.print("Faturação anual por m2: ");
        faturacao = sc.nextDouble();
        sc.nextLine();


        return new Mercado("Mercado", nome, local, gps, custoLimpeza, tipoMercado, area, faturacao);

    }

    /**
     * Metodo que imprime a informacao de um mercado
     *
     * @return Informacao de um mercado
     */
    public String toString() {
        if (lucro() > 0) {
            return super.toString() + "\nTipo: " + tipoMercado + "\nArea: " + area + "\nValor medio de faturacao anual por m2: "
                    + fatAnual + "\nCusto anual de limpeza: " + custoLimpeza
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: sim\n";
        } else {
            return super.toString() + "\nTipo: " + tipoMercado + "\nArea: " + area + "\nValor medio de faturacao anual por m2: "
                    + fatAnual + "\nCusto anual de limpeza: " + custoLimpeza
                    + "\nDespesa anual: " + despesaAnual() + "\nReceita anual: " + receitaAnual() + "\nLucro: nao\n";
        }
    }
}
