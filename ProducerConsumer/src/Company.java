public class Company {

    int items;
    boolean workStatus = false;
    synchronized public void produceItems(int items){
        // if workstatus is true then the chance is for consumer to consume
        if(workStatus){
            try {
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        this.items = items;
        System.out.println("Produced: "+this.items);
        workStatus = true;
        notify();
    }

    synchronized public void consumeItems(){
        // if workstatus is false then the chance is for producer to produce
        if(!workStatus){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Consumed: "+this.items);
        workStatus = false;
        notify();
    }
}
