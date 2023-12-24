public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        double termOneYear = payment.calculate(1_000_000, 9.99, 12 );
        System.out.println("Ежемесячный платеж со сроком кредита 1 год составляет " + (int) termOneYear + " рублей");

        double termTwoYears = payment.calculate(1_000_000, 9.99, 24);
        System.out.println("Ежемесячный платеж со сроком кредита 2 года составляет " + (int) termTwoYears + " рублей");

        double termThreeYears = payment.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платеж со сроком кредита 3 года составляет " + (int) termThreeYears + " рублей");
        
    }
}