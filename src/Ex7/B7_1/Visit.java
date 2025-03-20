
package Ex7.B7_1;

import java.util.Date;
public class Visit {

        private Customer customer;
        private Date date;
        private double serviceExpense;
        private double productExpense;

        public Visit(String name, Date date) {
            this.customer = new Customer(name);
            this.date = date;
        }

        public String getName() {
            return customer.getName();
        }

        public double getServiceExpense() {
            return serviceExpense;
        }

        public void setServiceExpense(double serviceExpense) {
            this.serviceExpense = serviceExpense;
        }
        public double getProductExpense() {
            return productExpense;
        }

        public void setProductExpense(double productExpense) {
            this.productExpense = productExpense;
        }

        public double getTotalExpense() {
            double serviceDiscount = 0;
            double productDiscount = 0;

            if (customer.isMember()) {
                serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
                productDiscount = DiscountRate.getProductDiscountRate(customer.getMemberType());
            }

            double totalService = serviceExpense * (1 - serviceDiscount);
            double totalProduct = productExpense * (1 - productDiscount);

            return totalService + totalProduct;
        }
        @Override
        public String toString() {
            return "Visit[customer=" + customer.toString() + ", date=" + date +
                    ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + "]";
        }
    }


