import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aneudy on 16/06/17.
 */

public class Header {
    private Candidate candidate;

    public Header(){

    }

    public Header(Candidate candidate){
        this.candidate = candidate;
    }

    public void setCandidate(Candidate candidate){
        this.candidate = candidate;
    }

    public String getCandidateName(){
        String candidateName = candidate.getFirstName().toUpperCase() + " " + candidate.getLastName().toUpperCase();
        return candidateName;
    }

    public String getCandidatePhone(){
        String candidatePhone = candidate.getPhone();
        return candidatePhone;
    }

    public String getCandidateEmail(){
        String candidateEmail = candidate.getEmail();
        return candidateEmail;
    }


    public String toString(){
        return "Candidate: " + candidate.getFirstName() + " " + candidate.getLastName() +
                "\n" + "Phone: " + candidate.getPhone() + "\n" +
                "Email: " + candidate.getEmail();
    }
}
