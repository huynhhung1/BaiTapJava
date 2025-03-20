public class BT extends Thread {
    Store store=null;
    long index=1;
    public BT(Store s) {
        store=s;
    }
    public void run() {
        while(true) {
            try{
                boolean reult=store.put(index);
                if(reult==true) {
                    System.out.println("product"+(index++));
                }
                else {
                    System.out.println("store is full");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}