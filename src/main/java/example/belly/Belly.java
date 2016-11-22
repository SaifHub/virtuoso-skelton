package example.belly;

/**
 * Cucumber example
 */
public class Belly {

    private int cukes;

    /**
     * Saves how many cukes were eaten
     * @param cukes
     */
    public void eat(int cukes) {
            this.cukes = cukes;
        }

    /**
     * Checks if the belly should make a sound
     * @param waitingTime
     * @return whether to growl or stay silent
     */
    public String getSound(int waitingTime) {
            if (cukes > 41 && waitingTime >= 1) {
                return "growl";
            } else {
                return "silent";
            }
        }

}
