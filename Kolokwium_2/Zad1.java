public final class Zad1 {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        double grossIncome = 3000;
        System.out.println("Obliczenie kwoty wypłaty przy umowie zlecenia dla wynagrodzenia  " + grossIncome + " zł brutto");
        System.out.println("Dochód: " + calculator.calculateNetIncome(grossIncome));
        System.out.println("Podatek do zapłacenia: " + calculator.calculateTaxToPay(grossIncome));
        System.out.println("Ubezpieczenie zdrowotne do odprowadzenia: " + calculator.calculateHealthInsuranceToPay(grossIncome));
        System.out.println("Wypłata wyniesie " + calculator.calculateNetIncomeToPay(grossIncome));
    }
}

final class TaxCalculator{
    private final IncomeCosts incomeCosts = new IncomeCosts();
    private final TaxRates taxRates = new TaxRates();
    private final HealthInsuranceRates healthInsuranceRates = new HealthInsuranceRates();

    double calculateNetIncome(double grossIncome){
        return grossIncome * (1 - incomeCosts.getCosts());
    }
    double calculateHealthInsuranceToPay(double grossIncome){
        return grossIncome * healthInsuranceRates.getToPay();
    }
    double calculateHealthInsuranceToDeduct(double grossIncome){
        return grossIncome * healthInsuranceRates.getToDeduct();
    }
    double calculateTaxToPay(double grossIncome){
        double income = calculateNetIncome(grossIncome);
        double taxBeforeDeduction = income * taxRates.getTaxRate();
        double taxToPay = taxBeforeDeduction - calculateHealthInsuranceToDeduct(grossIncome);
        return Math.ceil(taxToPay);
    }
    double calculateNetIncomeToPay(double grossIncome){
        return calculateNetIncome(grossIncome) - calculateTaxToPay(grossIncome) - calculateHealthInsuranceToPay(grossIncome);
    }
}
final class IncomeCosts {
    private final double costs = 0.2;
    double getCosts(){
        return costs;
    }
}
final class TaxRates {
    private final double taxRate = 0.17;
    double getTaxRate(){
        return taxRate;
    }
}
final class HealthInsuranceRates {
    private final double toPay = 0.09;
    private final double toDeduct = 0.0775;
    double getToPay(){
        return toPay;
    }
    double getToDeduct(){
        return toDeduct;
    }
}