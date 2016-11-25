package example.belly;

/**
 * @author : ABDUL SAIF
 * @date   : 10/11/2016
 *
 */

public class Belly {

    private int cukes;

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
