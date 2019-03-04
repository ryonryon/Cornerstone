package week4.company;

// Dynamic == ran-time
// Static  == compile-time

public class Driver {
    public static void main(String[] args) {
        Employee jasper = new Lawyer("Jasper", 1);
        Employee kei = new Programmer("Kei", 0, true);
        Employee yuuki = new Designer("Yuuki", 1, true);


        Employee[] employees = {jasper, kei, yuuki};

        for(Employee emp: employees) {
            System.out.println(emp.getSalary());
        }

        TechEmployee t1 = (TechEmployee) kei;
        TechEmployee t2 = (TechEmployee) yuuki;
        TechEmployee[] techEmployees = {t1, t2};

        for(TechEmployee te: techEmployees) {
            te.code();
        }
    }
}