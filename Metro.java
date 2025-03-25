class Metro {

    // Instance variables
    int id;
    String lineName;
    String color;
    int totalStations;
    double ticketPrice;
    String startStation;
    String endStation;
    double frequencyInMins;
    boolean isUnderground;
    int totalCoaches;
    boolean hasWiFi;

    // 1. No-args constructor
    Metro() {
        this(101); 
        System.out.println(" No-args constructor invoked");
    }

    // 2. 
    Metro(int id) {
        this("Purple Line"); 
        System.out.println(" Constructor with int");
        this.id = id;
    }

    // 3. 
    Metro(String lineName) {
        this(25.0); 
        System.out.println("3. Constructor with lineName called");
        this.lineName = lineName;
    }

    // 4. 
    Metro(double ticketPrice) {
        this("KSR Station", "Whitefield"); 
        System.out.println("4. Constructor with ticketPrice called");
        this.ticketPrice = ticketPrice;
    }

    // 5
    Metro(String startStation, String endStation) {
        this(true); 
        System.out.println("5. Constructor with start and end stations called");
        this.startStation = startStation;
        this.endStation = endStation;
    }

    // 6.
    Metro(boolean isUnderground) {
        this("Purple", 40, 6); 
        System.out.println("6. Constructor with isUnderground called");
        this.isUnderground = isUnderground;
    }

    // 7. 
    Metro(String color, int totalStations, int totalCoaches) {
        System.out.println("7. Constructor with color, totalStations, totalCoaches called");
        this.color = color;
        this.totalStations = totalStations;
        this.totalCoaches = totalCoaches;
        
    }

    
    public void displayDetails() {
        System.out.println("\n--- Metro Details ---");
        System.out.println("ID               : " + id);
        System.out.println("Line Name        : " + lineName);
        System.out.println("Color            : " + color);
        System.out.println("Total Stations   : " + totalStations);
        System.out.println("Ticket Price     : " + ticketPrice);
        System.out.println("Start Station    : " + startStation);
        System.out.println("End Station      : " + endStation);
        System.out.println("Frequency (mins) : " + frequencyInMins);
        System.out.println("Underground?     : " + isUnderground);
        System.out.println("Total Coaches    : " + totalCoaches);
        System.out.println("Wi-Fi Available? : " + hasWiFi);
    }
}
