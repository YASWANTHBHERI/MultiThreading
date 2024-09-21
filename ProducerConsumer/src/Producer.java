public class Producer extends Thread{

    Company c;
    Producer(Company c){
        this.c = c;
    }
    @Override
    public void run(){
        int itemProduced = 1;
        while(true){
            this.c.produceItems(itemProduced);
            try{Thread.sleep(1000);}catch (Exception e){
                System.out.println(e);
            };
            itemProduced++;
        }
    }
}
