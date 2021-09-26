package ongbaitap;

public class CowtestDrive {
    public static void main(String[] args) {
        Cow cow;
        //cow = new Cow();
          cow = new Cow(15);
        //cow.weight = 15;
        System.out.println("weight: " + cow.weight);

        cow = new Cow(5);
        System.out.println("weight: " + cow.weight);

        cow = new Cow(25, "balan", "màu sữa");

         System.out.println("weight: " + cow.weight + " breed: " + cow.breed + " color: " + cow.color);
    }
}
