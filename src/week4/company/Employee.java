package week4.company;

public abstract class Employee {
    
    private String name;
    private int years;

    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return this.name;
    }

    public int getYears() {
        return this.years;
    }

    public int getSalary() {
        return 50000;
    }

    public int vacationDays() {
        return 21;
    }

    public String vacationForm() {
        return "white";
    }

    public void party(){
        System.out.println("party");
    }
    
}