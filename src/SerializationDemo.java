import java.io.*;
import java.io.IOException;
//Created a class SerializationDemo
public class SerializationDemo {
	public static void main(String[]args)throws IOException{
		//created object of Employee class
		Employee e= new Employee();
		//Taking reference and setting first andthen last name
		e.setEmpFirstName("Bhawani");
		e.setEmpLastName("Shankar");
		
	//creating object of fileoutputStream and passing the directory path
	FileOutputStream fout= new FileOutputStream("D:\\prienc");
	//creating object of ObjectOutputStream  and passing reference of FileOutputStream
	ObjectOutputStream ous= new ObjectOutputStream(fout);
	 //Write the specified object to the ObjectOutputStream
	ous.writeObject(e);
	ous.close();
	fout.close();
	//printline
System.out.println("Operation sucessful saved in D:\\prienc");
}
}