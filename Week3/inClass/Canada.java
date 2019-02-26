public class Canada{

    private String name;
    private Province[] province;

    public Canada() {
        province[0] = new Province("Alberta","Edmonton",4);
        province[1] = new Province("British Columbia","Victoria",5);
        province[2] = new Province("Manitoba","Winnipeg",1);
        province[3] = new Province("New Brunswick","Fredericton",1);
        province[4] = new Province("Newfoundland and Labrador","St. John's",1);
        province[5] = new Province("Nova Scotia","Halifax",1);
        province[6] = new Province("Ontario","Toronto",14);
        province[7] = new Province("Prince Edward Island","Charlottetown",1);
        province[8] = new Province("Quebec","Quebec City",8);
        province[9] = new Province("Saskatchewan","Regina",1);
    }
    
    public void displayAllProvinces() {

        for(Province prv : this.province) {
            
            prv.getDetails();
        }
    }

    public int howManyHaveThisPopulation(int min, int max) {

        int pplCount = 0;

        for(Province prv : this.province) {
            if(min <= prv.popopulationInMillion && prv.popopulationInMillion <= max) {
                pplcount++;
            }
        }

        return pplCount;
    }
}