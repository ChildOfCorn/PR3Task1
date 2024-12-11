class Cashier extends Thread {
    private final String cashierName;

    public Cashier(String name) {
        this.cashierName = name;
    }

    @Override
    public void run() {
        System.out.println(cashierName + " почав обслуговувати клієнта.");
        try {
            Thread.sleep((long) (Math.random() * 3000));
        } catch (InterruptedException e) {
            System.out.println(cashierName + " було перервано.");
        }
        System.out.println(cashierName + " закінчив обслуговування клієнта.");
    }
}

public class Pr3_Task1 {
    public static void main(String[] args) {
        Thread cashier1 = new Cashier("Касир 1");
        Thread cashier2 = new Cashier("Касир 2");
        Thread cashier3 = new Cashier("Касир 3");

        cashier1.start();
        cashier2.start();
        cashier3.start();
    }
}
