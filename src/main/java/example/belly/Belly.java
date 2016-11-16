package example.belly;

/**
 * Demo class.
 */

public class Belly {

    private int cukes;
    /**
     * Class comment...
     */
        public void eat(int cukes) {
            this.cukes = cukes;
        }

        public String getSound(int waitingTime) {
            if (cukes > 41 && waitingTime >= 1) {
                return "growl";
            } else {
                return "silent";
            }
        }

}
