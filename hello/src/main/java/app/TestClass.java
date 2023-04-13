package app;

public class TestClass {
    public static final int ROUND_UP = 0;
    private String world = "world";

    public TestClass() {

    }

    public void setWorld(String w) {
        world = w;
    }
    public String getWorld() {
        return world;
    }
    public void helloWorld() {
        System.out.println("hello, "+world);
    }
}
