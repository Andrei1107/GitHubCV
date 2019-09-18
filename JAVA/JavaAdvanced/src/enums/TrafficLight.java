package enums;

public   enum TrafficLight {




    RED("STOP!!!",30),

    GREEN("GO",30),

    ORANGE("RUN!!!!",5);


    private String message;
    private int timeToWait;


    public String getMessage() {
        return message;
    }

    public int getTimeToWait() {
        return timeToWait;
    }



    TrafficLight(String message, int timeToWait) {
        this.timeToWait = timeToWait;
        this.message = message;
    }


    public void modifyTimeToWait(int time){
        this.timeToWait=time;
    }


}
