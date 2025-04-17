package BT17_4;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "Hello from VKU!";
        AESencryption aes = new AESencryption();
        RSAencryption rsa = new RSAencryption();

        Thread aesThread = new Thread(() -> {
            String encrypted = aes.encrypt(input);
            String decrypted = aes.decrypt(encrypted);
            System.out.println("AES => Encrypted: " + encrypted);
            System.out.println("AES => Decrypted: " + decrypted);
        });

        Thread rsaThread = new Thread(() -> {
            String encrypted = rsa.encrypt(input);
            String decrypted = rsa.decrypt(encrypted);
            System.out.println("RSA => Encrypted: " + encrypted);
            System.out.println("RSA => Decrypted: " + decrypted);
        });

        aesThread.start();
        rsaThread.start();

        aesThread.join();
        rsaThread.join();
    }
}
