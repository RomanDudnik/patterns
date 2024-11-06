package Product;

/**
 * Предмет "Драгоценный камень"
 */
public class GemReward extends ItemReward {
    @Override
    public void open() {
        System.out.println("Opening Gem reward!");
    }
}
