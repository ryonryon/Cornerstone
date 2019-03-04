package week4.company;

public class Lawyer extends Employee {

    public Lawyer(String name, int years) {
        super(name, years);
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 20000;
    }

    @Override
    public int vacationDays() {
        return super.vacationDays() - 10;
    }

    @Override
    public String vacationForm() {
        return super.vacationForm() + " purple";
    }

}