package Product;

/**
 * Предмет "Золотая монета"
 */
public class GoldReward extends ItemReward {

    @Override
    public void open() {
        System.out.println("Opening Gold coin!");
    }
}
