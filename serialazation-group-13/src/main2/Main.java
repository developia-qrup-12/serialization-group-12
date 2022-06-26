package main2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import main.Car;

public class Main {

	public static void main(String[] args) {
		  try {
	            SavingAccount sAccount=new SavingAccount("test", 1);
	            
				  // file writer serialization
	            FileOutputStream file = new FileOutputStream("D:\\account.txt");
	            ObjectOutputStream write = new ObjectOutputStream(file);
	            write.writeObject(sAccount);

				  // file reader deSerialization
	            FileInputStream fileIn = new FileInputStream("D:\\account.txt");
	            ObjectInputStream read = new ObjectInputStream(fileIn);
	            SavingAccount newSavingAccount = (SavingAccount) read.readObject();

	            System.out.println("Account Name : " + newSavingAccount.getName());
	            System.out.println("Account Id : " + newSavingAccount.getId());

	            read.close();
	            write.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	}

}
