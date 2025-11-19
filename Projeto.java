import java.io.*;


public class Projeto {
    public static void main(String[] args) {
        new Projeto();
    }

    public Projeto() {
        GereEmpresas gereEmpresas = new GereEmpresas();
        /*
        RestauranteFastFood rF1 = new RestauranteFastFood("Restaurante Fast Food", "McDonalds", "Coimbra", "1234,5678", 10, 10, 100, 210, 10, 1000, 10, 100);
        RestauranteFastFood rF2 = new RestauranteFastFood("Restaurante Fast Food", "Burger king", "Lisboa", "10203,04050", 20, 20, 200, 220, 20, 2000, 20, 200);
        RestauranteFastFood rF3 = new RestauranteFastFood("Restaurante Fast Food", "Kfc", "Coimbra", "1234,5678", 30, 30, 300, 230, 30, 3000, 30, 300);
        RestauranteFastFood rF4 = new RestauranteFastFood("Restaurante Fast Food", "H3", "Lisboa", "10203,04050", 40, 40, 400, 240, 40, 4000, 40, 400);
        RestauranteFastFood rF5 = new RestauranteFastFood("Restaurante Fast Food", "Popeys", "Coimbra", "1234,5678", 50, 50, 500, 250, 50, 5000, 50, 500);

        RestauranteLocal rl1 = new RestauranteLocal("Restaurante Local", "praxis", "Lisboa" , "1234,5678", 10, 10, 100, 210, 10, 10, 10, 100);
        RestauranteLocal rl2 = new RestauranteLocal("Restaurante Local", "guilty", "Lisboa" , "1234,5678", 20, 20, 200, 220, 20, 20, 20, 200);
        RestauranteLocal rl3 = new RestauranteLocal("Restaurante Local", "munich", "Lisboa" , "1234,5678", 30, 30, 300, 230, 30, 30, 30, 300);
        RestauranteLocal rl4 = new RestauranteLocal("Restaurante Local", "luna", "Lisboa" , "1234,5678", 40, 40, 400, 240, 40, 40, 40, 400);
        RestauranteLocal rl5 = new RestauranteLocal("Restaurante Local", "italia", "Lisboa" , "1234,5678", 50, 50, 500, 250, 50, 50, 50, 500);

        Cafe c1 = new Cafe("Cafe", "cafe1", "Coimbra", "1234,5678", 50, 50, 500, 500, 500);
        Cafe c2 = new Cafe("Cafe", "cafe2", "Coimbra", "1234,5678", 40, 40, 400, 400, 400);
        Cafe c3 = new Cafe("Cafe", "cafe3", "Coimbra", "1234,5678", 30, 30, 300, 300, 300);
        Cafe c4 = new Cafe("Cafe", "cafe4", "Coimbra", "1234,5678", 20, 20, 200, 200, 200);
        Cafe c5 = new Cafe("Cafe", "cafe5", "Coimbra", "1234,5678", 10, 50, 100, 100, 100);

        Frutaria f1 = new Frutaria("Frutaria", "frutaria1", "Coimbra", "1234,5678", 10, 10, 10);
        Frutaria f2 = new Frutaria("Frutaria", "frutaria2", "Coimbra", "1234,5678", 20, 20, 20);
        Frutaria f3 = new Frutaria("Frutaria", "frutaria3", "Coimbra", "1234,5678", 30, 30, 30);
        Frutaria f4 = new Frutaria("Frutaria", "frutaria4", "Coimbra", "1234,5678", 40, 40, 40);
        Frutaria f5 = new Frutaria("Frutaria", "frutaria5", "Coimbra", "1234,5678", 50, 50, 50);

        Mercado m1 = new Mercado("Mercado", "mercado1", "Coimbra", "1234,5678", 10,"mini",10, 10);
        Mercado m2 = new Mercado("Mercado", "mercado2", "Coimbra", "1234,5678", 20,"mini",20, 10);
        Mercado m3 = new Mercado("Mercado", "mercado3", "Coimbra", "1234,5678", 30,"mini",30, 10);
        Mercado m4 = new Mercado("Mercado", "mercado4", "Coimbra", "1234,5678", 40,"mini",40, 10);
        Mercado m5 = new Mercado("Mercado", "mercado5", "Coimbra", "1234,5678", 50,"mini",50, 10);

        Pastelaria p1 = new Pastelaria("Pastelaria", "pastelaria1", "Lisboa", "3456,7890", 10,10,10,10,10);
        Pastelaria p2 = new Pastelaria("Pastelaria", "pastelaria2", "Lisboa", "3456,7890", 20,20,20,20,20);
        Pastelaria p3 = new Pastelaria("Pastelaria", "pastelaria3", "Lisboa", "3456,7890", 30,30,30,30,30);
        Pastelaria p4 = new Pastelaria("Pastelaria", "pastelaria4", "Lisboa", "3456,7890", 40,40,40,40,40);
        Pastelaria p5 = new Pastelaria("Pastelaria", "pastelaria5", "Lisboa", "3456,7890", 50,50,50,50,50);

        gereEmpresas.addEmpresa(rF1);
        gereEmpresas.addEmpresa(rF2);
        gereEmpresas.addEmpresa(rF3);
        gereEmpresas.addEmpresa(rF4);
        gereEmpresas.addEmpresa(rF5);

        gereEmpresas.addEmpresa(rl1);
        gereEmpresas.addEmpresa(rl2);
        gereEmpresas.addEmpresa(rl3);
        gereEmpresas.addEmpresa(rl4);
        gereEmpresas.addEmpresa(rl5);

        gereEmpresas.addEmpresa(c1);
        gereEmpresas.addEmpresa(c2);
        gereEmpresas.addEmpresa(c3);
        gereEmpresas.addEmpresa(c4);
        gereEmpresas.addEmpresa(c5);

        gereEmpresas.addEmpresa(m1);
        gereEmpresas.addEmpresa(m2);
        gereEmpresas.addEmpresa(m3);
        gereEmpresas.addEmpresa(m4);
        gereEmpresas.addEmpresa(m5);

        gereEmpresas.addEmpresa(f1);
        gereEmpresas.addEmpresa(f2);
        gereEmpresas.addEmpresa(f3);
        gereEmpresas.addEmpresa(f4);
        gereEmpresas.addEmpresa(f5);

        gereEmpresas.addEmpresa(p1);
        gereEmpresas.addEmpresa(p2);
        gereEmpresas.addEmpresa(p3);
        gereEmpresas.addEmpresa(p4);
        gereEmpresas.addEmpresa(p5);
        */

        //gereEmpresas.leEmpresas();
        //gereEmpresas.imprimeEmpresas();
        //gereEmpresas.escreverFicheiroObjetos();
        //gereEmpresas.lerFicheiroObjetos();
        //gereEmpresas.imprimeEmpresas();
        //gereEmpresas.maxClientes();


        //gereEmpresas.comparaLucro();
        //gereEmpresas.comparaReceita();
        //gereEmpresas.comparaDespesa();
        File f = new File("starthrive.txt");
        File fich = new File("starthrive.obj");

        if (fich.exists() && fich.isFile()) {
            gereEmpresas.lerFicheiroObjetos(fich);
        } else {
            gereEmpresas.leEmpresas(f);
            gereEmpresas.escreverFicheiroObjetos(fich);
        }
        Frame frame = new Frame();
    }

}
