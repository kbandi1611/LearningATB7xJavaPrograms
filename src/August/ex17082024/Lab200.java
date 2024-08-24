package August.ex17082024;

public class Lab200 {
    public static void main(String[] args) {
        APIAutomation a = new APIAutomation();
        //SIB - call one time
        //IIB - when object is created

    }
}

class APIAutomation{
    static{
        //write a code to load the data from the MySQL
        System.out.println("Loaded data from the MySQL");
    }
    {
        //Write a code to load the data from the CSV file
        System.out.println("Loaded the data from the CSV file");
    }

}