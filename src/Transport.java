public abstract class Transport {

    protected float speed;
    private int weight;
    private String color;
    private   byte[] coordinate;

public Transport(){};
    protected void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public abstract void moveObject(float speed);
    public  abstract  boolean stopObject();
    public Transport(float speed, int weight, String color, byte[] coordinate){

        System.out.println("Object created");
        this.setValues(speed,weight,color,coordinate);
       // System.out.println(this.getValues());
    }

    public  Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        //System.out.println(this.getValues());
    }
    protected String getValues(){
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color+"\n";
        String infoCoordinates = "Coordinates:\n";
        for(int i =0; i< this.coordinate.length; i++)
            infoCoordinates += this.coordinate[i]+"\n";

        return info + infoCoordinates;
    }
    class  Engine{

        private  boolean isReady;
        private  int km;

        public  void setValues(boolean isReady, int km)
        {
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady){
            this.isReady = isReady;
        }
        public  void info(){
            if(isReady)
                System.out.println("Двигатель исправен.");
            else
                System.out.println("Двигатель не исправен, он проехал уже " + km + " км");
        }
    }
}
