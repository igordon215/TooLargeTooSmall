/**
 * Created by iyasuwatts on 10/17/17.
 */
public class TooLargeTooSmall {
    private final Integer chosenNum;

    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
        if (g < chosenNum) {
            return -1;
        } else if (g > chosenNum) {
            return 1;
        } else {
            return 0;
        }

    }
}