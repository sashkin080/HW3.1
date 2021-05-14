public class Main {
    public static void main(String[] args) {

        int ticketPrice = 5000;  // в рублях
        int amount = 20; // в рублях

        int bonusMile = ticketPrice / amount;
        System.out.println("Количество бесплатных миль : " + bonusMile );
    }
}