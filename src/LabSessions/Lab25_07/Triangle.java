package Lab25_07;

class Triangle implements Shape2 {
	
	double base,height;
	 
	 Triangle(double base,double height){
		 this.base=base;
		 this.height=height;
		
	 }
	 
	 public double getArea() {
		 return 0.5*base*height;
	 }

}
