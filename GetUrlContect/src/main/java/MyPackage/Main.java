package MyPackage;


public class Main {
    public static void main(String[] args) {
        //------------------------------s
        // 生成並啟動執行緒物件
        //------------------------------
        new MyThread("https://www.hinet.net/", "/Users/ylhsieh/out.txt").start();
        //------------------------------
    }    
}