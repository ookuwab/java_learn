/**
 * Hello.java
 */
package app;

import app.TestClass;

/**
 * はじめての Java プログラムです。
 */
public class Hello {
    /**
     * プログラム起動時に最初に実行されるメソッドです。
     * 
     * @param args コマンドライン引数
     */
    public static void main(String... args){
        // 標準出力に "Hello, world" を表示します。
        System.out.println("Hello, world");
        TestClass testclass = new TestClass();
        testclass.setWorld("world!!");
        testclass.helloWorld();
    }
}

