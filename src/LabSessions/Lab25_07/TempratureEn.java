package Lab25_07;
class Temprature{
	private double celcius;
	

public double getCelcius() {
	return celcius;
}
public double toFarenhit() {
	return (celcius*9/5)*32;
}

public double kelvin() {
	return celcius+273;
}
public void setCelsius(double celsius) {
    if (celsius >= -273) { 
        this.celcius = celsius;
    } else {
        System.out.println("Invalid");
        this.celcius = -273; 
    }
}



public void Display() {
	System.out.println("Celsius:" + celcius);
    System.out.println("Fahrenheit:" + toFarenhit());
    System.out.println("Kelvin:" + kelvin() );
	
	
}
}


public class TempratureEn {
	public static void main(String[] args) {
		 Temprature t1 = new Temprature();
	        t1.setCelsius(25);     
	        t1.Display();

	        Temprature t2 = new Temprature();
	        t2.setCelsius(-300); 
	        t2.Display();
	}

}
