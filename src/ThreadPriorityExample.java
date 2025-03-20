public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(()->{
            while(true)
            {
                System.out.println("High-priority thread is running...");
            }
        });
        Thread lowPriorityThread = new Thread(()->{
            while(true)
            {
                System.out.println("Low-priority thread is running...");
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
