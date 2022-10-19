package core;

class RunnableStyle implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();

//      主线程
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
    }

}

