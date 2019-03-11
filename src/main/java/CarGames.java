public class CarGames {

    public static void main(String[] args) {

        String car1 = "Ford";
        String car2 = "BMW";
        String car3 = "Mercedes";

        String[] myCars = new String[3];
        myCars[0] = car1;
        myCars[1] = car2;
        myCars[2] = car3;

        for (int i = 0; i < myCars.length; i++) {
            System.out.println(myCars[i] + " ");
        }

        for (String masina : myCars) {
            System.out.println("Masina for each " + masina);
        }

        int i = 0;
        do {
            System.out.println("DO: " + myCars[i]);
            i++;
        } while (i < myCars.length);

    }
}
