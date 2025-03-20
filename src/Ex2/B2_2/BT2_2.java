package Ex2.B2_2;

public class BT2_2 {

        private String name;
        private Author[] authors;
        private double price;
        private int qty = 0;

        // Constructor với số lượng mặc định
        public BT2_2(String name, Author[] authors, double price) {
            this.name = name;
            this.authors = authors;
            this.price = price;
        }

        // Constructor với số lượng được chỉ định
        public BT2_2(String name, Author[] authors, double price, int qty) {
            this.name = name;
            this.authors = authors;
            this.price = price;
            this.qty = qty;
        }

        // Getters
        public String getName() {
            return name;
        }

        public Author[] getAuthors() {
            return authors;
        }

        public double getPrice() {
            return price;
        }

        public int getQty() {
            return qty;
        }

        // Setters
        public void setPrice(double price) {
            this.price = price;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        // Phương thức trả về chuỗi biểu diễn cuốn sách
        @Override
        public String toString() {
            StringBuilder authorsStr = new StringBuilder();
            for (int i = 0; i < authors.length; i++) {
                authorsStr.append(authors[i].toString());
                if (i < authors.length - 1) {
                    authorsStr.append(", ");
                }
            }
            return "Book[name=" + name + ", authors={" + authorsStr + "}, price=" + price + ", qty=" + qty + "]";
        }

        // Phương thức trả về tên của các tác giả, ngăn cách bằng dấu phẩy
        public String getAuthorNames() {
            StringBuilder authorNames = new StringBuilder();
            for (int i = 0; i < authors.length; i++) {
                authorNames.append(authors[i].getName());
                if (i < authors.length - 1) {
                    authorNames.append(", ");
                }
            }
            return authorNames.toString();
        }
}
