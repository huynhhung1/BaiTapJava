public class DeadlockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println(r1.name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                synchronized (r2) {
                    System.out.println(r2.name);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println(r2.name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                synchronized (r1) {
                    System.out.println(r1.name);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
