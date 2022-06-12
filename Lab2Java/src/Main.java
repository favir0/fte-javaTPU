
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse();

        Runnable addProduct = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    warehouse.add();
                }
            }
        };

        Runnable removeProduct = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    warehouse.remove();
                }
            }
        };

        Thread add = new Thread(addProduct);
        Thread remove = new Thread(removeProduct);
        add.start();
        remove.start();
        Thread.sleep(1000);
    }
}


