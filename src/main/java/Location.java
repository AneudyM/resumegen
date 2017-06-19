import java.util.ArrayList;

/**
 * Created by aneudy on 16/06/17.
 */
public class Location {
    private String location;


    public Location(){

    }

    public Location(String location){
        this.location = location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location.toString();
    }

    public String toString(){
        return location;
    }

}
