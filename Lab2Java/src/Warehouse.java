public class Warehouse {
    private int items;
    private int maxItems;

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public Warehouse() {
        this.items = 0;
        this.maxItems = 5;
    }

    public synchronized void remove() {
        while (items <= 0) {
            System.out.print("\nEmpty");
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\nItem removed: " + items + " -> ");
        items -= 1;
        System.out.print(items);
        notify();
    }

    public synchronized  void add() {
        while (items >= maxItems) {
            System.out.print("\nFull");
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\nItem added: " + items + " -> ");
        items += 1;
        System.out.print(items);
        notify();
    }

}
