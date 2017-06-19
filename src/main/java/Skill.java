import java.util.ArrayList;

/**
 * Created by aneudy on 16/06/17.
 */
public class Skill {
    private ArrayList<String> skills;

    public Skill(){

    }

    public void setSkill(String skill){
        this.skills.add(skill);
    }

    public ArrayList<String> getSkills(){
        return skills;
    }
}
