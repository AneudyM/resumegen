import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aneudy on 15/06/17.
 */
@XmlRootElement(name = "ConcreteResume")
public class ConcreteResume {
    private static int resume_id;
    private Header header;
    private Education education;
    private Experience experience;

    public ConcreteResume(){

    }

    public void setHeader(Header header){
        this.header = header;
    }

    public void setEducation(Education education){
        this.education = education;
    }

    public void setExperience(Experience experience){
        this.experience = experience;
    }

    public Header getHeader(){
        return header;
    }

    public Education getEducation() {
        return education;
    }

    public Experience getExperience() {
        return experience;
    }

    public String toString(){
        return header.toString() + "\n" +
                "+---------------------------------+" + "\n" +
                education.toString() + "\n" +
                "+---------------------------------+" + "\n" +
                experience.toString() + "\n";
    }
}
