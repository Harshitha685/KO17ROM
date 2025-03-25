class House {
	
   // Instance variables 
   int houseId;
   int totalRooms;
   int totalFloors;
   boolean hasGarage;
   char parkingFacility; // 'Y' for Yes, 'N' for No
   String area;
   double houseCost;

   // 1. No-args constructor
   House() {
     this(101);  
     System.out.println(" no-arg constructor executed");
   }

   // 2. 
   House(int houseId) {
     this(4, 2);  
     System.out.println("constructor with int executed");
     this.houseId = houseId;
   }

   // 3. 
   House(int totalRooms, int totalFloors) {
     this(true);  
     System.out.println("constructor with int,int executed");
     this.totalRooms = totalRooms;
     this.totalFloors = totalFloors;
   }

   // 4. 
   House(boolean hasGarage) {
     this('N');  
     System.out.println("constructor with boolean executed");
     this.hasGarage = hasGarage;
   }

   // 5. 
   House(char parkingFacility) {
     this("Mumbai"); 
     System.out.println("constructor with char executed");
     this.parkingFacility = parkingFacility;
   }

   // 6. 
   House(String area) {
     this(1500000.00);  
     System.out.println("constructor with String executed");
     this.area = area;
   }

   // 7.
   House(double houseCost) {
     System.out.println("constructor with double executed");
     this.houseCost = houseCost;
   }

  
   public void displayInfo() {
     System.out.println("\n--- House Details ---");
     System.out.println("House ID             : " + houseId);
     System.out.println("Total Rooms          : " + totalRooms);
     System.out.println("Total Floors         : " + totalFloors);
     System.out.println("Has Garage?          : " + hasGarage);
     System.out.println("Parking Facility     : " + parkingFacility);
     System.out.println("Area                 : " + area);
     System.out.println("House Cost           : ₹" + houseCost);
   }

   
}
