public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max)
    {
        int result = max - min +1;
        result = (int)(Math.random() * result) + min;
        return result;
    }
    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int times = 0;
        boolean same = true;

        while(times < 2 && same == true) {
            int player = spin(2, 10);
            int computer = spin(1, 9);
            int dif;

            if (player > computer) {
                dif = player - computer;
                System.out.println("You win! " + dif + " points");
                same = false;
            } else if (computer > player) {
                dif = player - computer;
                System.out.println("You lose. " + dif + "points");
                same = false;
            }
            times++;
        }
        if(same == true)
            System.out.println("Tie. 0 points");
    }
}
