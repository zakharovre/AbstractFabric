package milk;

public class NoMilk implements Milk{
    @Override
    public void chooseMilk() {
        System.out.print("with no milk");
    }
}
