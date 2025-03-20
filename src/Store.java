import java.util.LinkedList;
import java.util.Queue;

public class Store {
    private final int capacity; // Số lượng sản phẩm tối đa trong kho
    private final Queue<Long> storage = new LinkedList<>();

    public Store(int capacity) {
        this.capacity = capacity;
    }

    public synchronized boolean put(long item) {
        if (storage.size() < capacity) {
            storage.add(item);
            return true; // Thêm sản phẩm thành công
        } else {
            return false; // Kho đã đầy
        }
    }

    public synchronized Long take() {
        return storage.poll(); // Lấy sản phẩm đầu tiên ra khỏi kho (nếu có)
    }

    public synchronized int getSize() {
        return storage.size(); // Trả về số lượng sản phẩm hiện có
    }
}