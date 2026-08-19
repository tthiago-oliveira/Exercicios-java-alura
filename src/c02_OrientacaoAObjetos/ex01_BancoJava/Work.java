package c02_OrientacaoAObjetos.ex01_BancoJava;

import java.util.Random;

public class Work {
    Random rand = new Random();

    //sorteio de valor aleatorio de 200 para 500
    public double toWork() {
        double wage = rand.nextDouble(200, 500);
        return wage;
    }
}

