package one.digitalinnovation.gof.strategy;

public class Robot {
    private Behavior strategy;

    public void setStrategy(Behavior strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
