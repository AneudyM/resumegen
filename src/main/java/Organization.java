/**
 * Created by aneudy on 16/06/17.
 */
public class Organization {
    private String name = "";
    private Location location;
    private Position position;

    public Organization(){

    }

    public String getName(){
        return name;
    }

    public Location getLocation(){
        return location;
    }

    public Position getPosition(){
        return position;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public void setPosition(Position position){
        this.position = position;
    }
}
