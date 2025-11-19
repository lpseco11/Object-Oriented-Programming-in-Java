import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.*;

/**
 * Classe responsável pela interação com o utilizador através da interface (GUI)
 */
public class Frame extends JFrame implements ActionListener {

    GereEmpresas gereEmpresas = new GereEmpresas();
    JPanel panel = new JPanel();
    JLabel listar = new JLabel();
    JLabel editar = new JLabel();
    JLabel criar = new JLabel();
    JLabel apagar = new JLabel();
    JLabel receita = new JLabel();
    JLabel lucro = new JLabel();
    JLabel despesa = new JLabel();
    JLabel clientes = new JLabel();

    /**
     * Botao para listar empresas
     */
    JButton button1 = new JButton("1");
    /**
     * Botao para editar empresas
     */
    JButton button2 = new JButton("2");
    /**
     * Botao para criar empresas
     */
    JButton button3 = new JButton("3");
    /**
     * Botao para apagar empresas
     */
    JButton button4 = new JButton("4");
    /**
     * Botao para listar empresas com maior receita
     */
    JButton button5 = new JButton("5");
    /**
     * Botao para listar empresas com maior lucro
     */
    JButton button6 = new JButton("6");
    /**
     * Botao para listar empresas com menor despesa
     */
    JButton button7 = new JButton("7");
    /**
     * Botao para listar Restauracao com mais clientes
     */
    JButton button8 = new JButton("8");
    File fich = new File("starthrive.obj");

    Frame() {
        gereEmpresas.lerFicheiroObjetos(fich);
        this.setSize(400, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);


        panel.setLayout(null);
        listar.setText("Listar");
        listar.setBounds(10, 20, 90, 25);
        panel.add(listar);

        editar.setText("Editar");
        editar.setBounds(10, 50, 90, 25);
        panel.add(editar);

        criar.setText("Criar");
        criar.setBounds(10, 80, 90, 25);
        panel.add(criar);

        apagar.setText("Apagar");
        apagar.setBounds(10, 110, 90, 25);
        panel.add(apagar);

        receita.setText("Maior receita");
        receita.setBounds(10, 140, 90, 25);
        panel.add(receita);

        lucro.setText("Maior lucro");
        lucro.setBounds(10, 170, 90, 25);
        panel.add(lucro);

        despesa.setText("Menor despesa");
        despesa.setBounds(10, 200, 90, 25);
        panel.add(despesa);

        clientes.setText("Mais clientes");
        clientes.setBounds(10, 230, 90, 25);
        panel.add(clientes);

        button1.setBounds(180, 20, 80, 25);
        panel.add(button1);
        button1.addActionListener(this);

        button2.setBounds(180, 50, 80, 25);
        panel.add(button2);
        button2.addActionListener(this);

        button3.setBounds(180, 80, 80, 25);
        panel.add(button3);
        button3.addActionListener(this);

        button4.setBounds(180, 110, 80, 25);
        panel.add(button4);
        button4.addActionListener(this);

        button5.setBounds(180, 140, 80, 25);
        panel.add(button5);
        button5.addActionListener(this);

        button6.setBounds(180, 170, 80, 25);
        panel.add(button6);
        button6.addActionListener(this);

        button7.setBounds(180, 200, 80, 25);
        panel.add(button7);
        button7.addActionListener(this);

        button8.setBounds(180, 230, 80, 25);
        panel.add(button8);
        button8.addActionListener(this);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {

            gereEmpresas.imprimeEmpresas();

        } else if (e.getSource() == button2) {
            Scanner sc = new Scanner(System.in);
            String coordenadas;

            System.out.print("Coordenadas da empresa (para fácil identificação): ");
            coordenadas = sc.nextLine();

            for (int i = 0; i < gereEmpresas.getListaEmpresas().size(); i++) {
                if (gereEmpresas.getListaEmpresas().get(i).getGps().equals(coordenadas)) {
                    gereEmpresas.editarEmpresa(gereEmpresas.getListaEmpresas().get(i));
                }
            }

            //System.out.print("Editar");
        } else if (e.getSource() == button3) {
            Scanner sc = new Scanner(System.in);
            int input;
            System.out.print("""
                    Que tipo de empresa quer adicionar
                    1 - Café
                    2 - Frutaria
                    3 - Pastelaria
                    4 - Mercado
                    5 - Restaurante Fast Food
                    6 - Restaurante local
                    """);
            input = sc.nextInt();

            if (input == 1) {
                Cafe cafe = new Cafe();
                gereEmpresas.adicionaEmpresa(cafe);
            } else if (input == 2) {
                Frutaria frutaria = new Frutaria();
                gereEmpresas.adicionaEmpresa(frutaria);
            } else if (input == 3) {
                Pastelaria pastelaria = new Pastelaria();
                gereEmpresas.adicionaEmpresa(pastelaria);
            } else if (input == 4) {
                Mercado mercado = new Mercado();
                gereEmpresas.adicionaEmpresa(mercado);
            } else if (input == 5) {
                RestauranteFastFood restauranteFastFood = new RestauranteFastFood();
                gereEmpresas.adicionaEmpresa(restauranteFastFood);
            } else if (input == 6) {
                RestauranteLocal restauranteLocal = new RestauranteLocal();
                gereEmpresas.adicionaEmpresa(restauranteLocal);
            }
            //System.out.print("Criar");
        } else if (e.getSource() == button4) {
            Scanner sc = new Scanner(System.in);
            String coordenadas;
            System.out.print("Coordenadas da empresa: ");
            coordenadas = sc.nextLine();
            gereEmpresas.apagarEmpresa(coordenadas);
            //System.out.print("Apagar");
        } else if (e.getSource() == button5) {
            gereEmpresas.comparaReceita();
        } else if (e.getSource() == button6) {
            gereEmpresas.comparaLucro();
        } else if (e.getSource() == button7) {
            gereEmpresas.comparaDespesa();
        } else if (e.getSource() == button8) {
            gereEmpresas.maxClientes();
        }
    }
}
