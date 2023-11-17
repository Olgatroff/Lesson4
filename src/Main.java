public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        Fish fish = new Fish();

        SailExecutor sailExecutor = new SailExecutor();

        sailExecutor.makeSail(ship);
        sailExecutor.makeSail(fish);
    }
}



