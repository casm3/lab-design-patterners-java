package one.digitalinnovation.gof.strategy;

public class NormalBehavior implements Behavior {
    @Override
    public void mover() {
        System.out.println("Normal Move");
    }
}
