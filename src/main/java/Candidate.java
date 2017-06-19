import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aneudy on 16/06/17.
 */

@XmlRootElement(name = "Candidate")
public class Candidate {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Candidate(String firstName, String lastName, String email, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Candidate(){

    }

    @XmlElement(name = "FirstName")
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    @XmlElement(name = "LastName")
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    @XmlElement(name = "Email")
    public void setEmail(String email){
        this.email = email;
    }
    @XmlElement(name = "Phone")
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public String toString(){
        return "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n";
    }

}
