/**
 * Created by aneudy on 16/06/17.
 */
public class Major {
    private String name;
    private String gpa;
    private String startDate;
    private String endDate;

    public Major(){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setGpa(String gpa){
        this.gpa = gpa;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public String getName(){
        return name;
    }

    public String getGpa(){
        return gpa;
    }

    public String getStartDate(){
        return startDate;
    }

    public String getEndDate(){
        return endDate;
    }

}
