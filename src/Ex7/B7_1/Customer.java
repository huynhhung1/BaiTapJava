package Ex7.B7_1;
public class Customer {
        private String name;
        private boolean member = false;
        private String memberType;

        // Constructor
        public Customer(String name) {
            this.name = name;
        }

        // Getter cho name
        public String getName() {
            return name;
        }

        // Kiểm tra khách hàng có phải là thành viên không
        public boolean isMember() {
            return member;
        }

        // Đặt trạng thái thành viên
        public void setMember(boolean member) {
            this.member = member;
        }

        // Lấy loại thành viên
        public String getMemberType() {
            return memberType;
        }

        // Đặt loại thành viên
        public void setMemberType(String memberType) {
            this.memberType = memberType;
        }

        // toString
        @Override
        public String toString() {
            return "Customer[name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
        }
    }


