public class Fish implements Sailable {
    @Override
    public void sail(){
        eat();
        System.out.println("Это рыбка, она плывет");
    }

    private void eat(){
        System.out.println("Это рыбка, чтобы плавать ей нужен корм");
    }
}
