    package c02_OrientacaoAObjetos.ex01_BancoJava;

    import java.util.Random;

    public class BankAccount {
        private Random rand = new Random();

        private double balance = rand.nextDouble(1500, 5001);
        private int password;

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }
    }
