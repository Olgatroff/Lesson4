public class Ship implements Sailable {
    @Override
    public void sail() {
        fuel();
        System.out.println("Это корабль, он плывет");
    }

    private void fuel() {
        System.out.println("Это корабль, чтобы он плыл, его нужно заправить топливом");

    }
}