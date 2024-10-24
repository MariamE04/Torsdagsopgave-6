package Task2;

public class FindFemFejl {
            public static void main(String[] args) {
            Cinema biogrande = new Cinema(20, 10);

            // Reserver række 1, sæde 5
            System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(2, 3));

            // Print hele salen pænt
            System.out.println(biogrande);

            // Reserver det sidste sæde i den sidste række
            int numberOfRows = biogrande.getRows();
            int numberOfSeats = biogrande.getSeats();
            biogrande.reserve(numberOfRows -1, numberOfSeats -1); //tilføje -1, fordi vores index går fra 0-19, men denne metode tager 20 med.

            // Afbestil reservation på række 1, sæde 5
            System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));
        }
    }

