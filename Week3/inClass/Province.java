import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Province{

    private String state;
    private String capital;
    private int populationInMillion;

    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";
    public static final int DEFAULT_POPULATION_MILLIONS = 4;

    public static final String[] PROVINCES = {"Alberta","British Columbia","Manitoba","New Brunswick"
        ,"Newfoundland and Labrador","Nova Scotia","Ontario","Prince Edward Island","Quebec","Saskatchewan"};
    
    public static final String[] CAPITALCITIES = {"Edmonton","Victoria","Winnipeg","Fredericton","St. John's"
        ,"Halifax","Toronto","Charlottetown","Quebec City","Regina"};

    public Province(String state, String capital, int populationInMillion) {

        if(
            isValidProvince(state)
            && isValidCapitalCity(capital) 
            && isValidPopulation(populationInMillion)
        ) {
            setState(state);
            setCapital(capital);
            setPopulationInMillion(populationInMillion);
        } else {
            setState(DEFAULT_PROVINCE);
            setCapital(DEFAULT_CAPITAL);
            setPopulationInMillion(DEFAULT_POPULATION_MILLIONS);
        }
        
    }

    public void setState(String state) {
            this.state = state;
    }


    public void setCapital(String capital) {
        this.capital = capital;
}

    public void setPopulationInMillion(int populationInMillion) {
        this.populationInMillion = populationInMillion;
    }

    public boolean isValidProvince(String province) {

        boolean isValidProvinceFlg = false;
        int i = 0;
        while(i <= PROVINCES.length) {

            if(PROVINCES[i].equals(province)) {
                isValidProvinceFlg = true;
            }

            i++;
        }

        return isValidProvinceFlg;
    }

    public boolean isValidCapitalCity(String capital) {

        boolean isValidCapitalCityFlg = false;

        for(String city : CAPITALCITIES) {

            if(city.equals(capital)) {
                isValidCapitalCityFlg = true;
            }
        }
        
        return isValidCapitalCityFlg;
    }

    public boolean isValidPopulation(int population) {
        boolean isValidPopulation = false;
        if(0 <= population && population <= 38) {
            isValidPopulation = true;
        }
        
        return isValidPopulation;
    }

    public String getDetails() {

        return String.format("The capital of %s (pop. %s million) is %s."
                    , this.state, this.populationInMillion, this.capital);
    }
}