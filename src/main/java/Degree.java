import java.util.ArrayList;

/**
 * Created by aneudy on 16/06/17.
 */
public class Degree {
    private ArrayList<String> baccalaureate;
    private ArrayList<String> graduate;
    private Major major;
    boolean obtained;
    // placeholder
    private String name;

    public Degree(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getDegreeName(){
        return name;
    }
}
