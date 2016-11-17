package example.belly;

/**
 * Demo class.
 */

public class Belly {

    private int cukes;
    /**
     * Class comment...
     */
        protected void eat(int cukes) {
            this.cukes = cukes;
        }

        protected String getSound(int waitingTime) {
            if (cukes > 41 && waitingTime >= 1) {
                return "growl";
            } else {
                return "silent";
            }
        }

}
