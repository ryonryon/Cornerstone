package week3.inclass;

import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();

        countries.add("Canada");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");

        countries.remove("Korea");

        int countiesSize = countries.size();
        countries.remove(1);
        countries.set(countiesSize,"Mexico");

        countries.set(countries.indexOf("Mexico"),"Chili");

        countries.set(0,"Brazil");


    }
}