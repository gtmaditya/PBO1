public class Main {
    public static void main(String[] args) {

        Mobil sedan = new Sedan("Toyota");
        Mobil suv = new SUV("Honda");

        Sepeda mountainBike = new MountainBike("Mountain");


        sedan.suara();
        suv.suara();
        mountainBike.suara();

        Mobil mobilTanpaMerek = new Mobil("Tanpa Merek");
        System.out.println("Merek mobil: " + mobilTanpaMerek.getMerek());


        System.out.println("Program selesai.");
    }
}