import java.io.Writer;

public class MemoryVisibilityExample {
    public static void main(String[] args) {
        ShareFlag shareFlag = new ShareFlag();
        Thread writer = new Thread(()->{
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {}
            shareFlag.flag = true;
            System.out.println("Flag set to true");
        });
        Thread reader = new Thread(()->{
            while(!shareFlag.flag) {
                System.out.println("Flag detected as true");
            }
        });
        writer.start();
        reader.start();
    }
}