package _04_xml.dom_example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import _04_xml.dom_example.entities.Address;
import _04_xml.dom_example.entities.Student;

public class DOMWriteExample {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		Address address = new Address("UA", "DP", "KM");
		students.add(new Student("Vasya Pupevich", 332332, address, "vas", "design"));
		
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("students");
			doc.appendChild(rootElement);

			students.forEach((student) -> {
				Element studentElement = doc.createElement("student");
				studentElement.setAttribute("login", student.getLogin());
				studentElement.setAttribute("faculty", student.getFaculty());
				
				Element nameElement = doc.createElement("name");
				nameElement.setTextContent(student.getName());
				studentElement.appendChild(nameElement);
				
				Element phoneElement = doc.createElement("phone");
				phoneElement.setTextContent(String.valueOf(student.getPhone()));
				studentElement.appendChild(phoneElement);
				//added an address
				Element addressElement = doc.createElement("adress");
				studentElement.appendChild(addressElement);
				
				Element countryElement = doc.createElement("country");
				countryElement.setTextContent(address.getCountry());
				addressElement.appendChild(countryElement);
				
				Element cityElement = doc.createElement("city");
				cityElement.setTextContent(address.getCity());
				addressElement.appendChild(cityElement);
				
				Element streetElement = doc.createElement("street");
				streetElement.setTextContent(address.getStreet());
				addressElement.appendChild(streetElement);
				
				rootElement.appendChild(studentElement);
			});
			
			
			

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			//added a line break for xml file
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			
			StreamResult result = new StreamResult(new File("studentsTEST.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

}
