package Lab25_07;

class Rectangle implements Shape2 {
	
	double len,wid;
	
	Rectangle(double len,double wid){
		
		this.len=len;
		this.wid=wid;
	}
	public double getArea() {
		
		return len*wid;
	}

}
