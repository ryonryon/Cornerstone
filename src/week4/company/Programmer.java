package week4.company;

public class Programmer extends Employee implements TechEmployee {

    private boolean hasMac;

    public Programmer(String name, int years, boolean hasMac) {
        super(name, years);
        this.hasMac = hasMac;
    }

    public boolean getHasMac() {
        return hasMac;
    }

    public void setHasMac(boolean hasMac) {
        this.hasMac = hasMac;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 30000 * getYears();
    }
    
    @Override
    public int vacationDays() {
        return super.vacationDays() + getYears() * 2;
    }

    @Override
    public String vacationForm() {
        return super.vacationForm() + " space gray";
    }

    @Override
    public void code() {

    }

    @Override
    public void draw() {
        
    }
}