package main;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Main {
	public static void main(String[] args) {
		  try {
	            Car car = new Car("Hyundai", "Getz");
	            System.out.println(car.getBrand());
	            System.out.println(car.getModel());
	            
	            // file writer Serialization
	            FileOutputStream file = new FileOutputStream("D:\\car.txt");
	            ObjectOutputStream write = new ObjectOutputStream(file);
	            write.writeObject(car);

	            // file reader deSerialization
	            FileInputStream fileIn = new FileInputStream("D:\\car.txt");
	            ObjectInputStream read = new ObjectInputStream(fileIn);
	            Car fileCar = (Car) read.readObject();

	            System.out.println();
	            System.out.println("Car Brand : " + fileCar.getBrand());
	            System.out.println("Car Model: " + fileCar.getModel());

	            read.close();
	            write.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	}
}
