package chap_06_class.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas == 0){
            System.out.println("Some more Gas!");
            return false;
        }
        System.out.println("Enough Gas~");
        return true;
    }

    void run(){
        while(true){
            if(gas == 0) {
                System.out.println("now stop! (gas:"+gas+")");
                return;
            }
            System.out.println("keep going (gas:"+gas+")");
            gas--;
        }
    }

}
