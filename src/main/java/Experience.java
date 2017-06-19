import java.util.ArrayList;

/**
 * Created by aneudy on 16/06/17.
 */
public class Experience {
    private Organization organization;
    private String startDate;
    private String endDate;
    private ArrayList<String> description;

    public Experience(Organization organization, String startDate, String endDate, ArrayList<String> description){
        this.organization = organization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String toString(){
        return "Experience\n" + "\n" +
                "Position: " + organization.getPosition().getPositionTitle() + "\n" +
                "Organization: " + organization.getName() + "\n" +
                "Location: " + organization.getLocation() + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate + "\n";
    }
}
