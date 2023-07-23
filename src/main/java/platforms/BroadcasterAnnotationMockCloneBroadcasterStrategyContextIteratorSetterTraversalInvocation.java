package platforms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class BroadcasterAnnotationMockCloneBroadcasterStrategyContextIteratorSetterTraversalInvocation {
    private int randomInt;

    public BroadcasterAnnotationMockCloneBroadcasterStrategyContextIteratorSetterTraversalInvocation() {
        this.randomInt = ThreadLocalRandom.current().nextInt(0, 100);
    }

    public void simplyDoNothing() {
        System.out.println("Yup pretty much nothing :3");
    }

    public void performIOOperation() throws IOException {
        throw new IOException("WTF, what happened?");
    }

    public Object[] constructArray() {
        return new String[]{"LOL", "XDD"};
    }

    public int getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }
}
