public class CreditPaymentService {
    public double calculate (int amountCredit, double interestRate, double months) {
        double result;
        double monthlyRate = interestRate / 12 / 100;
        double coefficient = (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);

        result = amountCredit * coefficient;
        return result;
    }

}
