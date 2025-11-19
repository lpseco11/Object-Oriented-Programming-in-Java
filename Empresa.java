import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe que gere e contém as caracteristicas de uma empresa
 */

public abstract class Empresa implements Serializable {

    /**
     * Caracteristicas da empresa (categoria, nome da empresa, distrito onde se encontra, coordenadas da sua localizacao)
     */
    protected String tipo, nome, local, gps;

    Empresa() {
    }

    Empresa(String tipo, String nome, String local, String gps) {
        this.tipo = tipo;
        this.nome = nome;
        this.local = local;
        this.gps = gps;
    }

    /**
     * Fornece a categoria da empresa
     *
     * @return Categoria da empresa
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo de empresa
     *
     * @param tipo Tipo de empresa
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Fornece o nome da empresa
     *
     * @return Nome da empresa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da empresa
     *
     * @param nome Nome da empresa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    /**
     * Fornece o distrito onde a empresa se encontra
     *
     * @return Distrito onde a empresa se encontra
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o distrito onde se encontra a empresa
     *
     * @param local Distrito onde se encontra a empresa
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * Fornece a localizacao da empresa (coordenadas GPS)
     *
     * @return Localizacao da emrpesa (coordenadas GPS)
     */
    public String getGps() {
        return gps;
    }

    /**
     * Define a localizacao da empresa (coordenadas GPS)
     *
     * @param gps Localizacao da empresa (coordenadas GPS)
     */
    public void setGps(String gps) {
        this.gps = gps;
    }

    /**
     * Calcula a despesa anual da empresa
     *
     * @return Despesa anual da empresa
     */
    public abstract double despesaAnual();

    /**
     * Calcula a receita anual da empresa
     *
     * @return Receita anual da empresa
     */
    public abstract double receitaAnual();

    /**
     * Metodo que calcula o lucro de uma Empresa
     *
     * @return Valor do lucro
     */
    public abstract double lucro();

    /**
     * Metodo que permite calcular as empresas com mais clientes
     * @return Empresas com mais clientes
     */
    abstract public int maisClientes();

    /**
     * Metodo que permite criar uma empresa
     *
     * @return Empresa
     */
    public abstract Empresa adicionaEmpresa();


    /**
     * Metodo que imprime a informacao de uma empresa
     *
     * @return Informacao de uma empresa
     */


    public String toString() {
        return "Categoria: " + tipo + "\nNome: " + nome + "\nDistrito: " + local +
                "\nLocalização (coordenadas): " + gps;
    }
}
