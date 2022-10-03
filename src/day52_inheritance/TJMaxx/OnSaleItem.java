package day52_inheritance.TJMaxx;

    public class OnSaleItem extends Item {
        private double discount;


        public OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
            super(name,quantity,catalogNumber,price);
            setDiscount(discount);
        }


        public double getDiscount() {

            return discount;
        }


        public void setDiscount(double discount) {
            this.discount=discount;
        }


        @Override
        public String toString() {
            return "OnSaleItem{discount=" + discount + "%, name=" + getName() + ", price=" + getPrice() + "}";


        }}








