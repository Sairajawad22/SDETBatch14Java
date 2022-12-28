package myOwnRepilPractice;

    class CarObjects{
        String model;
        double price;
        int quantity;
        CarObjects(String model, double price, int quantity){
            this.model=model;
            this.price=price;
            this.quantity=quantity;
        }
        void carStockValue(){
            double stockValue=quantity*price;
            System.out.println(model+" Stock Value "+stockValue);
        }
    }


    class Main3 {
        public static void main(String[] args){
            new CarObjects("Toyota 2019",250000,10).carStockValue();
            new CarObjects("BMW 2019",10883,60).carStockValue();
        }
    }




