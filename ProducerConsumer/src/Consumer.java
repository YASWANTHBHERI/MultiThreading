public class Consumer extends Thread {
    Company c;
    Consumer(Company c){
        this.c = c;
    }
    @Override
    public void run(){
        while (true){
            this.c.consumeItems();
            try{Thread.sleep(3000);}catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
