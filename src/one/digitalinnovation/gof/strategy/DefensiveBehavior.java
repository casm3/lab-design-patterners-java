package one.digitalinnovation.gof.strategy;

public class DefensiveBehavior implements Behavior {
    @Override
    public void mover() {
        System.out.println("Defense Move");
    }
}