public class Main {
    public static void main(String[] args) {
        Store store = new Store(5); // Tạo kho chứa tối đa 5 sản phẩm

        BT producer1 = new BT(store); // Tạo luồng sản xuất 1
        BT producer2 = new BT(store); // Tạo luồng sản xuất 2

        producer1.start(); // Bắt đầu luồng 1
        producer2.start(); // Bắt đầu luồng 2

        // Chạy chương trình trong 10 giây, sau đó dừng các luồng
        try {
            Thread.sleep(10000); // Chạy chương trình trong 10 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Dừng các luồng sau 10 giây
        producer1.interrupt();
        producer2.interrupt();

        System.out.println("Main thread exiting...");
    }
}