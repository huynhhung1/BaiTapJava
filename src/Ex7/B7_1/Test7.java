package Ex7.B7_1;

import java.util.Date;
public class Test7 {

        public static void main(String[] args) {
            Customer customer1 = new Customer("John Doe");
            customer1.setMember(true);
            customer1.setMemberType("Gold");
            Visit visit1 = new Visit(customer1.getName(), new Date());
            visit1.setServiceExpense(100);
            visit1.setProductExpense(200);

            System.out.println(visit1);
            System.out.println("Total expense after discount: $" + visit1.getTotalExpense());

            Customer customer2 = new Customer("Alice");
            customer2.setMember(false);

            Visit visit2 = new Visit(customer2.getName(), new Date());
            visit2.setServiceExpense(50);
            visit2.setProductExpense(100);

            System.out.println(visit2);
            System.out.println("Total expense after discount: $" + visit2.getTotalExpense());
        }
    }


