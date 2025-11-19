import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Classe que manipula a lista que contém as empresas
 */
public class GereEmpresas {

    /**
     * Lista que contem as empresas
     */
    public ArrayList<Empresa> listaEmpresas;

    /**
     * Ficheiro de objetos que contem as informacoes das empresas
     */
    File fich = new File("starthrive.obj");

    public GereEmpresas() {
        listaEmpresas = new ArrayList<>();
    }

    /**
     * Fornece a lista que contem as empresas
     *
     * @return Lista que contem as empresas
     */
    public ArrayList<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    /**
     * Define a lista que contem as empresas
     *
     * @param listaEmpresas Lista que contem as empresas
     */
    public void setListaEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    /**
     * Metodo que adiciona uma Empresa a lista
     *
     * @param empresa Empresa
     */
    public void addEmpresa(Empresa empresa) {
        listaEmpresas.add(empresa);
    }

    /**
     * Metodo que imprime a informacao de todas as empresas
     */
    public void imprimeEmpresas() {
        System.out.print(listaEmpresas);
    }

    /**
     * Metodo que calcula e imprime a informacao relativa a(s) empresa(s) com maior lucro anual
     */
    public void comparaLucro() {
        Empresa e1 = null;
        double lucro1 = -Double.MAX_VALUE;

        Empresa e2 = null;
        double lucro2 = -Double.MAX_VALUE;

        Empresa e3 = null;
        double lucro3 = -Double.MAX_VALUE;

        Empresa e4 = null;
        double lucro4 = -Double.MAX_VALUE;

        Empresa e5 = null;
        double lucro5 = -Double.MAX_VALUE;

        Empresa e6 = null;
        double lucro6 = -Double.MAX_VALUE;


        for (Empresa empresa : listaEmpresas) {
            if (empresa.getTipo().equals("Restaurante_Fast_Food") && empresa.lucro() >= lucro1) {
                e1 = empresa;
                lucro1 = empresa.lucro();
            } else if (empresa.getTipo().equals("Restaurante_Local") && empresa.lucro() >= lucro2) {
                e2 = empresa;
                lucro2 = empresa.lucro();
            } else if (empresa.getTipo().equals("Frutaria") && empresa.lucro() >= lucro3) {
                e3 = empresa;
                lucro3 = empresa.lucro();
            } else if (empresa.getTipo().equals("Café") && empresa.lucro() >= lucro4) {
                e4 = empresa;
                lucro4 = empresa.lucro();
            } else if (empresa.getTipo().equals("Pastelaria") && empresa.lucro() >= lucro5) {
                e5 = empresa;
                lucro5 = empresa.lucro();
            } else if (empresa.getTipo().equals("Mercado") && empresa.lucro() >= lucro6) {
                e6 = empresa;
                lucro6 = empresa.lucro();
            }
        }

        System.out.print("Empresas com maior lucro\n");
        if (e1 != null) {
            System.out.print("Restaurante Fast Food: " + e1.nome + ", Lucro: " + e1.lucro() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Restaurante Fast Food!\n");
        }
        if (e2 != null) {
            System.out.print("Restaurante Local: " + e2.nome + ", Lucro: " + e2.lucro() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Restaurante Local!\n");
        }
        if (e3 != null) {
            System.out.print("Frutaria: " + e3.nome + ", Lucro: " + e3.lucro() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Frutaria!\n");
        }
        if (e4 != null) {
            System.out.print("Cafe: " + e4.nome + ", Lucro: " + e4.lucro() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Cafe!\n");
        }
        if (e5 != null) {
            System.out.print("Pastelaria: " + e5.nome + ", Lucro: " + e5.lucro() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Pastelaria!\n");
        }
        if (e6 != null) {
            System.out.print("Mercado: " + e6.nome + ", Lucro: " + e6.lucro() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Mercado!\n");
        }

    }

    /**
     * Metodo que calcula e imprime a informacao relativa a(s) empresa(s) com maior receita anual
     */
    public void comparaReceita() {
        Empresa e1 = null;
        double receita1 = -Double.MAX_VALUE;
        ;
        Empresa e2 = null;
        double receita2 = -Double.MAX_VALUE;
        ;
        Empresa e3 = null;
        double receita3 = -Double.MAX_VALUE;
        ;
        Empresa e4 = null;
        double receita4 = -Double.MAX_VALUE;
        ;
        Empresa e5 = null;
        double receita5 = -Double.MAX_VALUE;
        ;
        Empresa e6 = null;
        double receita6 = -Double.MAX_VALUE;
        ;

        for (Empresa empresa : listaEmpresas) {
            if (empresa.getTipo().equals("Restaurante_Fast_Food") && empresa.receitaAnual() >= receita1) {
                e1 = empresa;
                receita1 = empresa.receitaAnual();
            } else if (empresa.getTipo().equals("Restaurante_Local") && empresa.receitaAnual() >= receita2) {
                e2 = empresa;
                receita2 = empresa.receitaAnual();
            } else if (empresa.getTipo().equals("Frutaria") && empresa.receitaAnual() >= receita3) {
                e3 = empresa;
                receita3 = empresa.receitaAnual();
            } else if (empresa.getTipo().equals("Café") && empresa.receitaAnual() >= receita4) {
                e4 = empresa;
                receita4 = empresa.receitaAnual();
            } else if (empresa.getTipo().equals("Pastelaria") && empresa.receitaAnual() >= receita5) {
                e5 = empresa;
                receita5 = empresa.receitaAnual();
            } else if (empresa.getTipo().equals("Mercado") && empresa.receitaAnual() >= receita6) {
                e6 = empresa;
                receita6 = empresa.receitaAnual();
            }
        }

        System.out.print("Empresas com maior receita\n");
        if (e1 != null) {
            System.out.print("Restaurante Fast Food: " + e1.nome + ", Receita: " + e1.receitaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Restaurante Fast Food!\n");
        }
        if (e2 != null) {
            System.out.print("Restaurante Local: " + e2.nome + ", Receita: " + e2.receitaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Restaurante Local!\n");
        }
        if (e3 != null) {
            System.out.print("Frutaria: " + e3.nome + ", Receita: " + e3.receitaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Frutaria!\n");
        }
        if (e4 != null) {
            System.out.print("Cafe: " + e4.nome + ", Receita: " + e4.receitaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Cafe!\n");
        }
        if (e5 != null) {
            System.out.print("Pastelaria: " + e5.nome + ", Receita: " + e5.receitaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Pastelaria!\n");
        }
        if (e6 != null) {
            System.out.print("Mercado: " + e6.nome + ", Receita: " + e6.receitaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Mercado!\n");
        }
    }

    /**
     * Metodo que calcula e imprime a informacao relativa a(s) empresa(s) com menor despesa anual
     */
    public void comparaDespesa() {
        Empresa e1 = null;
        double despesa1 = Double.MAX_VALUE;
        Empresa e2 = null;
        double despesa2 = Double.MAX_VALUE;
        Empresa e3 = null;
        double despesa3 = Double.MAX_VALUE;
        Empresa e4 = null;
        double despesa4 = Double.MAX_VALUE;
        Empresa e5 = null;
        double despesa5 = Double.MAX_VALUE;
        Empresa e6 = null;
        double despesa6 = Double.MAX_VALUE;

        for (Empresa empresa : listaEmpresas) {
            if (empresa.getTipo().equals("Restaurante_Fast_Food") && empresa.despesaAnual() <= despesa1) {
                e1 = empresa;
                despesa1 = empresa.despesaAnual();
            } else if (empresa.getTipo().equals("Restaurante_Local") && empresa.despesaAnual() <= despesa2) {
                e2 = empresa;
                despesa2 = empresa.despesaAnual();
            } else if (empresa.getTipo().equals("Frutaria") && empresa.despesaAnual() <= despesa3) {
                e3 = empresa;
                despesa3 = empresa.despesaAnual();
            } else if (empresa.getTipo().equals("Café") && empresa.despesaAnual() <= despesa4) {
                e4 = empresa;
                despesa4 = empresa.despesaAnual();
            } else if (empresa.getTipo().equals("Pastelaria") && empresa.despesaAnual() <= despesa5) {
                e5 = empresa;
                despesa5 = empresa.despesaAnual();
            } else if (empresa.getTipo().equals("Mercado") && empresa.despesaAnual() <= despesa6) {
                e6 = empresa;
                despesa6 = empresa.despesaAnual();
            }
        }

        System.out.print("Empresas com menor despesa\n");
        if (e1 != null) {
            System.out.print("Restaurante Fast Food: " + e1.nome + ", Despesa: " + e1.despesaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Restaurante Fast Food!\n");
        }
        if (e2 != null) {
            System.out.print("Restaurante Local: " + e2.nome + ", Despesa: " + e2.despesaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Restaurante Local!\n");
        }
        if (e3 != null) {
            System.out.print("Frutaria: " + e3.nome + ", Despesa: " + e3.despesaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Frutaria!\n");
        }
        if (e4 != null) {
            System.out.print("Cafe: " + e4.nome + ", Despesa: " + e4.despesaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Cafe!\n");
        }
        if (e5 != null) {
            System.out.print("Pastelaria: " + e5.nome + ", Despesa: " + e5.despesaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Pastelaria!\n");
        }
        if (e6 != null) {
            System.out.print("Mercado: " + e6.nome + ", Despesa: " + e6.despesaAnual() + "\n");
        } else {
            System.out.print("Não existem empresas do tipo Mercado!\n");
        }
    }

    /**
     * Metodo que le as empresas que estao presentes no ficheiro de texto
     */
    public void leEmpresas(File f) {
        //File f = new File("starthrive.txt");
        if (f.exists() && f.isFile()) {
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String[] tokens = line.split(" ");
                    String tipo = tokens[0];
                    String nome = tokens[1];
                    String local = tokens[2];
                    String gps = tokens[3];
                    if (Objects.equals(tipo, "Café")) {
                        int numEmp = Integer.parseInt(tokens[4]);
                        double salEmp = Double.parseDouble(tokens[5]);
                        int numClientes = Integer.parseInt(tokens[6]);
                        int numCafes = Integer.parseInt(tokens[7]);
                        double fatAnual = Double.parseDouble(tokens[8]);
                        Cafe cafe = new Cafe(tipo, nome, local, gps, numEmp, salEmp, numClientes, numCafes, fatAnual);
                        addEmpresa(cafe);
                    }
                    if (Objects.equals(tipo, "Restaurante_Fast_Food")) {
                        int numEmp = Integer.parseInt(tokens[4]);
                        double salEmp = Double.parseDouble(tokens[5]);
                        int numMedioClientes = Integer.parseInt(tokens[6]);
                        int numDias = Integer.parseInt(tokens[7]);
                        int numMesas = Integer.parseInt(tokens[8]);
                        double valorMesa = Double.parseDouble(tokens[9]);
                        int numCliente = Integer.parseInt(tokens[10]);
                        double valorCliente = Double.parseDouble(tokens[11]);
                        RestauranteFastFood rF = new RestauranteFastFood(tipo, nome, local, gps, numEmp, salEmp, numMedioClientes, numDias, numMesas, valorMesa, numCliente, valorCliente);
                        addEmpresa(rF);
                    }
                    if (Objects.equals(tipo, "Restaurante_Local")) {
                        int numEmp = Integer.parseInt(tokens[4]);
                        double salEmp = Double.parseDouble(tokens[5]);
                        int numMedioClientes = Integer.parseInt(tokens[6]);
                        int numDias = Integer.parseInt(tokens[7]);
                        int numMesasInt = Integer.parseInt(tokens[8]);
                        int numMesasEsp = Integer.parseInt(tokens[9]);
                        double licencaEsplanada = Double.parseDouble(tokens[10]);
                        double valorMesa = Double.parseDouble(tokens[11]);
                        RestauranteLocal rL = new RestauranteLocal(tipo, nome, local, gps, numEmp, salEmp, numMedioClientes, numDias, numMesasInt, numMesasEsp, licencaEsplanada, valorMesa);
                        addEmpresa(rL);
                    }
                    if (Objects.equals(tipo, "Pastelaria")) {
                        int numEmp = Integer.parseInt(tokens[4]);
                        double salEmp = Double.parseDouble(tokens[5]);
                        int numMedioClientes = Integer.parseInt(tokens[6]);
                        int numBolos = Integer.parseInt(tokens[7]);
                        double faturacao = Double.parseDouble(tokens[8]);
                        Pastelaria p4 = new Pastelaria(tipo, nome, local, gps, numEmp, salEmp, numMedioClientes, numBolos, faturacao);
                        addEmpresa(p4);
                    }
                    if (Objects.equals(tipo, "Frutaria")) {
                        double custoLimpeza = Double.parseDouble(tokens[4]);
                        int numProdutos = Integer.parseInt(tokens[5]);
                        double faturacao = Double.parseDouble(tokens[6]);
                        Frutaria frutaria = new Frutaria(tipo, nome, local, gps, custoLimpeza, numProdutos, faturacao);
                        addEmpresa(frutaria);
                    }
                    if (Objects.equals(tipo, "Mercado")) {
                        double custoLimpeza = Double.parseDouble(tokens[4]);
                        String tipoMercado = tokens[5];
                        double area = Double.parseDouble(tokens[6]);
                        double faturacao = Double.parseDouble(tokens[7]);
                        Mercado mercado = new Mercado(tipo, nome, local, gps, custoLimpeza, tipoMercado, area, faturacao);
                        addEmpresa(mercado);
                    }
                }
                br.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir ficheiro de texto.");
            } catch (IOException ex) {
                System.out.println("Erro a ler ficheiro de texto.");
            }
        } else {
            System.out.println("Ficheiro não existe.");
        }
    }

    /**
     * Metodo que escreve a informacao para o ficheiro de objetos
     */
    public void escreverFicheiroObjetos(File fich) {
        //File fich = new File("starthrive.obj");
        try (FileOutputStream fos = new FileOutputStream(fich);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(listaEmpresas);
        } catch (FileNotFoundException e) {
            System.out.println("Erro a criar ficheiro");
        } catch (IOException e) {
            System.out.println("Erro a escrever no ficheiro.");
        }
    }

    /**
     * Metodo que le a informacao do ficheiro de objetos
     */
    public void lerFicheiroObjetos(File fich) {
        //File fich = new File("starthrive.obj");
        try (FileInputStream fis = new FileInputStream(fich);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Empresa> listaEmpresa = (ArrayList<Empresa>) ois.readObject();

            //System.out.println(listaEmpresa);
            listaEmpresas.addAll(listaEmpresa);

        } catch (FileNotFoundException e) {
            System.out.println("Erro de abertura do ficheiro.");
        } catch (IOException e) {
            System.out.println("Erro a ler ficheiro.");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro a converter para objeto.");
        }
    }

    /**
     * Metodo que adiciona uma empresa
     *
     * @param empresa Empresa
     */
    public void adicionaEmpresa(Empresa empresa) {
        listaEmpresas.add(empresa.adicionaEmpresa());
        escreverFicheiroObjetos(fich);
    }

    /**
     * Metodo que apaga uma empresa da base de dados
     *
     * @param coordenadas Coordenadas da empresa
     */
    public void apagarEmpresa(String coordenadas) {
        for (int i = 0; i < listaEmpresas.size(); i++) {
            if (listaEmpresas.get(i).getGps().equals(coordenadas)) {
                listaEmpresas.remove(listaEmpresas.get(i));
            }
        }
        escreverFicheiroObjetos(fich);
    }

    /**
     * Metodo que edita a informacao de uma empresa
     *
     * @param empresa Empresa
     */
    public void editarEmpresa(Empresa empresa) {
        listaEmpresas.remove(empresa);
        listaEmpresas.add(empresa.adicionaEmpresa());
        escreverFicheiroObjetos(fich);
    }

    /**
     * Metodo que calcula que empresa teve mais clientes
     */
    public void maxClientes() {
        int valor = 0;
        int valor2 = 0;
        Empresa e1 = null;
        Empresa e2 = null;
        for (Empresa empresa : listaEmpresas) {
            if (empresa.maisClientes() > valor) {
                if (valor > valor2) {
                    valor2 = valor;
                    e2 = e1;
                }
                valor = empresa.maisClientes();
                e1 = empresa;
            } else if (empresa.maisClientes() > valor2) {
                valor2 = empresa.maisClientes();
                e2 = empresa;
            }
        }
        assert e1 != null;
        assert e2 != null;
        System.out.print("Empresas restauração com mais clientes\n" + e1.getNome() + "\n" + e2.getNome());
    }
}

