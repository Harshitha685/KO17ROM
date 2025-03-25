class Road {

    int id;
    String name;
    String type;
    double length;
    int lanes;
    boolean isToll;
    String surfaceType;
    String city;
    String condition;
    boolean underConstruction;
    int speedLimit;
	
//1.	
Road(){
this(2);
System.out.println("Road constructor is invoked");
}

//2.
Road(int id){
this("Outer Ring Road");
System.out.println("Road constructor with int");
this.id = id;
}

//3.
Road(String name){
this(56.8);
System.out.println("Road constructor with String,String");
this.name = name;

}

//4.
Road(double length){
this( true);
System.out.println("Road constructor with double");
this.length = length;
}

//5.
Road(boolean isToll){
this( "Highway",4);
System.out.println("Road constructor with boolean,int");
this.isToll = isToll;
}

//6.
Road(String type,int lanes){
this("Asphalt", "Bangalore", "Good");
System.out.println("Road constructor with String,String");
this.type = surfaceType;
this.lanes = lanes;

}

//7.
Road(String surfaceType,String city,String condition){
System.out.println("Road constructor with String,string,string");
		this.surfaceType = surfaceType;
        this.city = city;
        this.condition = condition;
        
}


public void displayDetails() {
    System.out.println("\n--- Road Details ---");
    System.out.println("ID                : " + id);
    System.out.println("Name              : " + name);
    System.out.println("Type              : " + type);
    System.out.println("Length (km)       : " + length);
    System.out.println("Lanes             : " + lanes);
    System.out.println("Is Toll Road      : " + isToll);
    System.out.println("Surface Type      : " + surfaceType);
    System.out.println("City              : " + city);
    System.out.println("Condition         : " + condition);
    System.out.println("Under Construction: " + underConstruction);
    System.out.println("Speed Limit (km/h): " + speedLimit);
    }
}