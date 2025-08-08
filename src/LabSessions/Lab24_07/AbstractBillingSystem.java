package Lab24_07;

abstract class Bill {
    abstract void generateBill(int amountUsed); 
}

class ElectricityBill extends Bill {
    void generateBill(int units) {
        int rate = 5;
        int amount = units * rate;
        System.out.println("Electricity Bill:");
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate per Unit: " + rate);
        System.out.println("Total Amount: ₹" + amount);
    }
}

class WaterBill extends Bill {
    void generateBill(int liters) {
        int rate = 2;
        int amount = liters * rate;
        System.out.println("Water Bill:");
        System.out.println("Water Consumed: " + liters);
        System.out.println("Rate per Liter: " + rate);
        System.out.println("Total Amount: ₹" + amount);
    }
}

public class AbstractBillingSystem {
    public static void main(String[] args) {
        Bill bill1 = new ElectricityBill();
        Bill bill2 = new WaterBill();

        bill1.generateBill(145); 
        bill2.generateBill(96);  
    }
}

