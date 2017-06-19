import java.util.ArrayList;

/**
 * Created by aneudy on 16/06/17.
 */
public class Position {
    private String positionTitle = "";
    private String startDate = "";
    private String endDate =  "";
    private ArrayList<String> description;

    public Position(){

    }

    public String getPositionTitle(){
        return positionTitle;
    }

    public String getStartDate(){
        return startDate;
    }

    public String getEndDate(){
        return endDate;
    }

    public void setPositionTitle(String positionTitle){
        this.positionTitle = positionTitle;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }
}
