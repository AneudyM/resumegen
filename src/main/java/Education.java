import java.util.ArrayList;

/**
 * Created by aneudy on 16/06/17.
 */
public class Education {
    private Organization institution;
    private Degree degree;
    private ArrayList<String> description;

    public Education(Organization institution, Degree degree, ArrayList<String> description){
        this.institution = institution;
        this.degree = degree;
        this.description = description;
    }

    public ArrayList<String> getDescription(){
        return description;
    }

    public String toString(){
        return "Organization\n"+
                "Name: " + institution.getName() + "\n" +
                "Location: " + institution.getLocation().toString() + "\n" +
                "Description: " + description.toString() + "\n" +
                "Degree: " + degree.getDegreeName() + "\n";
    }
}
