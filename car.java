abstract class vehicle{

    abstract void brake();
    abstract void accelerate();

    void startengine(){
        System.out.println("engine started ");
    }
}
class car extends vehicle{
    
    @Override
    void brake(){
        System.out.println("apply brake ");
    }

    @Override
    void accelerate(){
        System.out.println("accelrate the car ");

    }

    public static void main(String[] args) {
        vehicle myobj = new car();
        myobj.brake();
        myobj.accelerate();
    }
}
