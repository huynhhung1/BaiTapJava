public class ThreadInterruptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Thread is running...");
                try{
                    Thread.sleep(500);
                } catch(InterruptedException e){
                    System.out.println("Thread interrupted");
                    break;
                }
            }
        });
        thread.start();
        try{
            Thread.sleep(3000);
            thread.interrupt();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
