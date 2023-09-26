package GB.Architecture.pt2;

public class GemGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        System.out.println("Создал новый сундук");
        return new GoldReward();
    }
}
