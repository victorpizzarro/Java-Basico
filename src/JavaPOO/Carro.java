package JavaPOO;

//Classe
public class Carro{

    //atributos
    String nome;
    String marca;
    int ano;
    int vel;

    //métodos
    void acelerar(int aceleração) {
        vel += aceleração;

    }

    void freiar (int reduzir) {
        vel -= reduzir;
    }

    void buzinar() {
        System.out.println("bibi");

    }

}
