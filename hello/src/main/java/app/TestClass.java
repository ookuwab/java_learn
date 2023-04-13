package app;

public class TestClass {
    public static final int ROUND_UP = 0;
    private String world = "world";
    private long l = 10L; //longリテラルは末尾にlかLをつける
    private int literal16 = 0xFFF; //16進数は0xから始まる
    private int literal8 = 0333; //8進数は0から始まることに注意
    private long literal2 = 0b1_1110_0101L; //2進数は0bから始まる _を桁区切り文字に使える（他の進数でも同様）
    private double d = 1.5e-2d; //指数表記が可能。末尾にdかDをつけるとdoubleになる
    private double double16 = 0x1F.7FFp-3D; //16進数の少数も最初に0x 16進数の少数をpつけないでやると不正扱いされた？
    private char c = 'a'; //char型はシングルクォート
    private String s = "aiueo"; //String型はダブルクォート
    private boolean bt = true;
    private boolean bf = false; //boolean型はtrue or false
    //nullは変数に代入できない
    

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
        System.out.println(this.l); //ローカル変数と重複していなければ、thisはつけてもつけなくてもよい
        System.out.println(literal16);
        System.out.println(literal8);
        System.out.println(literal2);
        System.out.println(d);
        System.out.println(double16);
    }
}
