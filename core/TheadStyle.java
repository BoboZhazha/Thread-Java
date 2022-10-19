package core;

public class TheadStyle extends Thread{

    @Override
    public void run() {
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        TheadStyle theadStyle = new TheadStyle();
        theadStyle.start();

        System.out.println(Thread.currentThread().getName());
    }
}
