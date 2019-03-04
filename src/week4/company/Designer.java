package week4.company;

public class Designer extends Employee implements TechEmployee {

    private boolean hasTablet;

    public Designer(String name, int years, boolean hasTablet) {
        super(name, years);
        this.hasTablet = hasTablet;
    }

    public boolean getHasTablet() {
        return hasTablet;
    }

    public void setHasTablet(boolean hastablet) {
        this.hasTablet = hastablet;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 10000;
    }

    @Override
    public int vacationDays() {
        return super.vacationDays() + getYears() * 3;
    }

    @Override
    public String vacationForm() {
        return super.vacationForm() + " material design";
    }

    @Override
    public void code() {

    }

    @Override
    public void draw() {
        
    }
}