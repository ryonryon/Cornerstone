import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayListExample();

        countries.add("Canada");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");

        countries.remove("Korea");

        int countiesSize = countries.size();
        String firstCountry = countries.get(0);
        countries.remove(1);
        countries.set(countiesSize,"Mexico");

        countries.set(countries.indexOf("Mexico"),"Chili");

        countries.set(0,"Brazil");


    }
}