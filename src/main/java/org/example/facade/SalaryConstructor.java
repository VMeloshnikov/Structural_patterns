package org.example.facade;

public class SalaryConstructor {

    private final Bookkeeper bookkeeper = new Bookkeeper();
    private final Director director = new Director();
    private final Supervisor supervisor = new Supervisor();

    public void salaryConstruct() {

        supervisor.salaryCalculation();
        bookkeeper.paymentTaxes();
        director.sign();

        System.out.println("Вам пришла зарплата 45 000");
    }
}
