public class Truck extends Transport{

    private boolean isLoaded;
    public Engine engine = new Engine();

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект движется со скоростью: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    public Truck(int weight, byte[] coordinate){
        super(weight,coordinate);
    }
    public Truck(int weight, byte[] coordinate, boolean isLoaded){
        super(weight,coordinate);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    protected void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded){
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }
    public String getLoaded(){
        if(isLoaded)
           return  "Грузовик загружен";
        else
           return  "Грузовик не загружен";
    }


}
