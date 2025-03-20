package Ex3.B3_4;

public class Test3_4 {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);

        // Hiển thị thời gian ban đầu
        System.out.println("Initial time: " + time);

        // Kiểm tra nextSecond
        time.nextSecond();
        System.out.println("After nextSecond(): " + time);

        // Kiểm tra previousSecond
        time.previousSecond();
        System.out.println("After previousSecond(): " + time);

        // Kiểm tra nextMinute
        time.nextMinute();
        System.out.println("After nextMinute(): " + time);

        // Kiểm tra previousMinute
        time.previousMinute();
        System.out.println("After previousMinute(): " + time);

        // Kiểm tra nextHour
        time.nextHour();
        System.out.println("After nextHour(): " + time);

        // Kiểm tra previousHour
        time.previousHour();
        System.out.println("After previousHour(): " + time);

        // Thiết lập thời gian khác
        time.setTime(14, 1, 9);
        System.out.println("Set time: " + time);

    }
}