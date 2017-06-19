import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;


/**
 * Created by aneudy on 15/06/17.
 */
public class PDFGenerator {
    private static final String pdfDest = "output/resume.pdf";

    public static void main(String[] argv){
        Candidate candidate = new Candidate();
        File headerLayout =  new File("resources/header.xml");
        String className = "Candidate";
        try {
            parseXML(className, headerLayout);
        } catch (JAXBException je){
            System.out.println("JAXBException!");
        } catch (InstantiationException ie){
            System.out.println("Instatiation Exception!");
        } catch (IllegalAccessException iae){
            System.out.println("Illegal Access Exception!");
        } catch (ClassNotFoundException cnfe){
            System.out.println("Sorry, the specified class \""+className+"\" was not found.");
        }

        ConcreteResume concreteResume = new ConcreteResume();
        try {
            createPDF(concreteResume);
        } catch (FileNotFoundException fnfe){
            System.out.println("File not found.");
        } catch (IOException ioe){
        }

    }

    public static void parseXML(String className, File f) throws ClassNotFoundException, JAXBException, InstantiationException, IllegalAccessException{
        Class c = Class.forName(className);
        JAXBContext jc = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Object obj = unmarshaller.unmarshal(f);
        System.out.println(obj.toString());
    }

    public static void createPDF(ConcreteResume concreteResume) throws FileNotFoundException, IOException {
        OutputStream fos = new FileOutputStream(pdfDest);
        PdfWriter writer = new PdfWriter(fos);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        Paragraph header = new Paragraph();
        Paragraph education = new Paragraph();
        Paragraph experience = new Paragraph();

        education.add(concreteResume.getEducation().toString());
        experience.add(concreteResume.getExperience().toString());

        Text candidateName = new Text(concreteResume.getHeader().getCandidateName()).setFontSize(14).setBold();
        Text candidatePhone = new Text(concreteResume.getHeader().getCandidatePhone());
        Text candidateEmail = new Text(concreteResume.getHeader().getCandidateEmail());
        header.add(candidateName);
        header.add("\n");
        header.add(candidatePhone);
        header.add("\n");
        header.add(candidateEmail);

        document.add(header);

        document.close();
    }
}
