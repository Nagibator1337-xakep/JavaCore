public class App3 {
    public static void main(String[] args) {
        double baseFare = 1000;
        System.out.println("Infant 1yo = " + calculateTicketPrice(1,baseFare));
        System.out.println("Child 5yo = " + calculateTicketPrice(5,baseFare));
        System.out.println("Adult 32yo = " + calculateTicketPrice(32,baseFare));
        System.out.println("Senior 75yo = " + calculateTicketPrice(75,baseFare));
    }
    public static double calculateTicketPrice(int age, double baseFare) {
        if(age<=2) {
            return 0;
        }
        if(age<13) {
            return baseFare*0.5;
        }
        if(age>65) {
            return baseFare*0.8;
        }
        return baseFare;
    }
}
