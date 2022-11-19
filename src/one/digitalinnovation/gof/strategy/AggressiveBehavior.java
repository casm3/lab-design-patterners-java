package one.digitalinnovation.gof.strategy;

public class AggressiveBehavior implements Behavior {
    @Override
    public void mover() {
        System.out.println("Agressive Move");
    }
}
