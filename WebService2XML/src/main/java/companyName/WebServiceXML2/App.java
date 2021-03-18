package companyName.WebServiceXML2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.nt.model.Student;

public class App {
	public static void main(String[] args) {
		try {
			Student sob = new Student();
			sob.setStdId(100);
			sob.setStdName("SAMPLE");
			sob.setStdFee(1200.0);

			// create context object for Student
			JAXBContext context = JAXBContext.newInstance(Student.class);

			// create Marshaller object
			Marshaller m = context.createMarshaller();
			System.out.println(m.getClass().getName());

			// call marshal method
			m.marshal(sob, new File("data.xml")); //void type

			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			// create context object for Student
			JAXBContext context = JAXBContext.newInstance(Student.class);

			// create unmarshaller
			Unmarshaller um = context.createUnmarshaller();

			// call unmarshal
			Student std = (Student) um.unmarshal(new File("data.xml")); //object type

			// print data
			System.out.println(std);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
