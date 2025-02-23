package JavaPOO;

//Objeto
public class Testarcarro {

    public static void main(String [] args) {

        Carro c1 = new Carro();

        c1.nome = "Onix";
        c1.marca = "Chevrolet";
        c1.ano = 2022;
        c1.vel = 60;

        c1.acelerar(30);
        System.out.println("Velocidade: " + c1.vel + "km/h");

        c1.freiar(20);
        System.out.println("Velocidade: " + c1.vel + "km/h");

        c1.buzinar();

    }
}
