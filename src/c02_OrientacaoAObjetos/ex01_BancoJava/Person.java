package c02_OrientacaoAObjetos.ex01_BancoJava;

public class Person {
    private int age;
    private String name;
    private boolean student;

    //encapsulamento das variaveis
    public int getAge() {
        return age;
    }

    //sistema para verificação de idade com minimo 18 e maximo 120 dando retorno de boolean
    public boolean setAge(int age) {
        if (age >= 18 && age <= 120) {
            this.age = age;
            return true;

        } else if (age < 18) {
            System.out.println("para a utilização do sistema é necessario ter no minimo 18 anos");
        } else {
            System.out.println("favor inserir uma idade valida");
        }
        return false;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {

        this.student = student;
    }
}


