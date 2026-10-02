// Multiple threads accessing shared balance
class BankingSystem {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " Remaining: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Runnable task = () -> b.withdraw(700);

        new Thread(task).start();
        new Thread(task).start();
    }
}
