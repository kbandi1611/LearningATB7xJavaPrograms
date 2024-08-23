package July.ex28072024;

public class Lab155 {
    public static void main(String[] args) {
        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Pvt BUilder";
        prestige.noOfRooms = 200;

        prestige.useLift();
    }
}
