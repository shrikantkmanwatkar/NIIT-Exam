Q2
package mm1;
import java.util.Scanner;

public class Fourwheller {

	class FourWheller{
		String name;
		int cc;
		int safety;
		int price;
		FourWheller(String n,int c,int sft,int p){
			this.name=n;
			this.cc=c;
			this.safety=sft;
			this.price=p;
		}
		void VehicleException() {
			System.out.println("Enter Available cc: ");
			Scanner s=new Scanner(System.in);
			int carcc=s.nextInt();
			if(carcc<1000||carcc>4000) {
				System.out.println("It is a two wheller,not four wheller");
			}
		}
		void display()  {
			System.out.println(name+" "+cc+" "+safety+" "+price);
		}
		void UnsafetyException() {
			System.out.println("Enter safety value: ");
			Scanner s=new Scanner(System.in);
			int sftvvl=s.nextInt();
			if(sftvvl!=5) {
				System.out.println("Sorry,Invalid safety features");
			}
			
		}
	}



	public class DemoFourWheller {

		public static void main(String[] args) {
			FourWheller c1=new FourWheller("Honda City",120,5,1600000);
			c1.display();
			c1.VehicleException();
			c1.UnsafetyException();
			FourWheller c2=new FourWheller("Hyundai Verna",150,5,1200000);
			c2.display();
			c2.VehicleException();
			c2.UnsafetyException();
			FourWheller c3=new FourWheller("Honda Jazz",400,4,500000);
			c3.display();
			c3.VehicleException();
			c3.UnsafetyException();
			FourWheller c4=new FourWheller("Maruti Ciaz",2300,6,300000);
			c4.display();
			c4.VehicleException();
			c4.UnsafetyException();

		}

	}
}
