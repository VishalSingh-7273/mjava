package javaprogrammingelemnts.level1;

public class profitlosscalculation {
    public static void main(String[] args) {
        double cp = 129;
        double sp = 191;
        double profit = sp-cp;
        double profitpercent = profit/cp*100;
        System.out.println("The cost price in INR "+cp +"and Selling Price is INR "+sp);
        System.out.println("The profit is INR "+profit +"and the profit percentage is "+profitpercent+"%");
        
    }
}
