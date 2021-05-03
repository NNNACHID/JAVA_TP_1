public class Main {
    public static void main(String[] args) {
        int cardboard = 34;
        int truckCapacity = 9;
        int nbInTruck = 0;
        int travelNumbers = 0;

        while (cardboard > 0) {
            if(cardboard < truckCapacity){
                nbInTruck = cardboard;
                cardboard = 0;
            }else{
                cardboard -= truckCapacity;
                nbInTruck = truckCapacity;
            }
            travelNumbers += 1;
            System.out.println(nbInTruck);
            System.out.println("Le camion repart pour un voyage ! il as effectuer " + travelNumbers + " voyage !");

        }

        //System.out.println("Hello World");
    }
}