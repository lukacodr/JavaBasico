package ImportantBaseData.more;

public class Coche {

    String name = "nombre de coche";

    public Coche(){}
    public Coche(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}
