class Zepto {

public static double tableOrders(String dessertName) {

    if (dessertName == "Tiramisu") 
        return 169.0;
	
    else if (dessertName == "Chocolate Mousee") 
        return 159.0;
	
    else if (dessertName == "Choco Lava Cake") 
        return 109.09;
	
    else if (dessertName == "Mysore Pak") 
        return 209.65;
	
    else if (dessertName == "Chokola Dessert Bars Hamper") 
        return 557.0;
	
    else if (dessertName == "Heritage Sweets Doodh Peda") 
        return 200.91;
	
    else if (dessertName == "Cadbury Dairy Milk Silk Desserts Brownie Chocolate Bar") 
        return 129.23;
	
    else if (dessertName == "Kwality Wall's Frozen Dessert - Blushing Strawberry") 
        return 125;
	
    else if (dessertName == "Kwality Wall's Frozen Dessert - Dazzli Tutti Frutti") 
        return 155.0;
	
    else if (dessertName == "Fabelle Hazelnut Handcrafted Chocolate Truffles Inspired by Classic Desserts, Assorted Luxury Chocolates") 
        return 122;
	
    else if (dessertName == "Cadbury Dairy Milk Silk Desserts Plum Cake Chocolate Bar") 
        return 299;
	
    else if (dessertName == "Dessert Combo") 
        return 411;
	
    else if (dessertName == "Kwality Wall'S Frozen Dessert Strawberry Ice") 
        return 196.0;
	
    else if (dessertName == "Rangmunch Roasted Coriander") 
        return 125;
	
    else if (dessertName == "Coconut Dry Gujiya - By Haldiram's") 
        return 231;
	
    else if (dessertName == "Slow Churn Chikoo Ice Cream Tub") 
        return 149;
	
    else if (dessertName == "Grb Kaju Katli") 
        return 280.0;
	
    else if (dessertName == "Masqa Gulab Jamun") 
        return 89;
	
    else if (dessertName == "Go Desi Desi Meetha Dry Fruit Barfi") 
        return 315;
	
    else if (dessertName == "Bikaji Gol-M-Gol(Gulabjamun)") 
        return 200;
	
    else if (dessertName == "Grameen Dry Fruit Matka Kulfi") 
        return 300.0;
	
    else if (dessertName == "Bikano Panjeeri Laddu By Bikano") 
        return 180;
	
    else if (dessertName == "Baskin Robbins Ice Cream Rocks Hazelnut") 
        return 323;
	
    else if (dessertName == "Get-A-Way Black Forest Ice Cream Pastry") 
        return 154;
	
    else if (dessertName == "Go Desi Classic Peanut Chikki") 
        return 231.0;
	
    else if (dessertName == "Go Desi Sesame Chikki") 
        return 209;
	
    else if (dessertName == "Kwality Wall's Magnum Almond Ice Cream Stick") 
        return 352;
	
    else if (dessertName == "GRB Rasogolla ") 
        return 134;
	
    else if (dessertName == "Masqa Rajbhog") 
    return 104.0;

    else if (dessertName == "London Dairy Double Chocolate Ice Cream Tub") 
        return 500.20;
	
    else if (dessertName == "Igp Masqa Desi Ghee Besan Laddoo") 
        return 190;
	
    else if (dessertName == "Cream Pot Cookies Cream") 
        return 266.99;
	
    else if (dessertName == "Nic Belgian Chocolate") 
        return 456;
	
    else if (dessertName == "Ferrero Rocher Moments Chocolate ") 
        return 899.99;
	
    else if (dessertName == "Cream Pot Black Currant") 
        return 247.20;
	
    else if (dessertName == "Daadi's Ghee Crispy Mysore Pak") 
        return 199.90;
	
    else if (dessertName == "Kwality Wall's Alphonso Mango Tub ") 
        return 340.67;
	
    else if (dessertName == "Minus 30 Coconut Mini Stick Vegan & Sugar Free") 
        return 124.75;
	
    else if (dessertName == "Get- A- Way Blueberry Cheesecake Jar") 
        return 189.0;
	
    else if (dessertName == "Kwality Wall'S Shameless Vanillaâ Tub") 
        return 239.99;
    else 
        System.out.println("The dessert is not found");
    
    return 0.0;
    }


public static double tableOrders(String dessertName, int quantity) {

    if (dessertName == "Tiramisu") 
        return 169.0 * quantity;
	
    else if (dessertName == "Chocolate Mousee") 
        return 159.0 * quantity;
	
    else if (dessertName == "Choco Lava Cake") 
        return 109.09 * quantity;
	
    else if (dessertName == "Mysore Pak") 
        return 209.65 * quantity;
	
    else if (dessertName == "Chokola Dessert Bars Hamper") 
        return 557.0 * quantity;
	
    else if (dessertName == "Heritage Sweets Doodh Peda") 
        return 200.91 * quantity;
	
    else if (dessertName == "Cadbury Dairy Milk Silk Desserts Brownie Chocolate Bar") 
        return 129.23 * quantity;
	
    else if (dessertName == "Kwality Wall's Frozen Dessert - Blushing Strawberry") 
        return 125 * quantity;
	
    else if (dessertName == "Kwality Wall's Frozen Dessert - Dazzli Tutti Frutti") 
        return 155.0 * quantity;
	
    else if (dessertName == "Fabelle Hazelnut Handcrafted Chocolate Truffles Inspired by Classic Desserts, Assorted Luxury Chocolates") 
        return 122 * quantity;
	
    else if (dessertName == "Cadbury Dairy Milk Silk Desserts Plum Cake Chocolate Bar") 
        return 299 * quantity;
	
    else if (dessertName == "Dessert Combo") 
        return 411 * quantity;
	
    else if (dessertName == "Kwality Wall'S Frozen Dessert Strawberry Ice") 
        return 196.0 * quantity;
	
    else if (dessertName == "Rangmunch Roasted Coriander") 
        return 125 * quantity;
	
    else if (dessertName == "Coconut Dry Gujiya - By Haldiram's") 
        return 231 * quantity;
	
    else if (dessertName == "Slow Churn Chikoo Ice Cream Tub") 
        return 149 * quantity;
	
    else if (dessertName == "Grb Kaju Katli") 
        return 280.0 * quantity;
	
    else if (dessertName == "Masqa Gulab Jamun") 
        return 89 * quantity;
	
    else if (dessertName == "Go Desi Desi Meetha Dry Fruit Barfi") 
        return 315 * quantity;
	
    else if (dessertName == "Bikaji Gol-M-Gol(Gulabjamun)") 
        return 200 * quantity;
	
    else if (dessertName == "Grameen Dry Fruit Matka Kulfi") 
        return 300.0 * quantity;
	
    else if (dessertName == "Bikano Panjeeri Laddu By Bikano") 
        return 180 * quantity;
	
    else if (dessertName == "Baskin Robbins Ice Cream Rocks Hazelnut") 
        return 323 * quantity;
	
    else if (dessertName == "Get-A-Way Black Forest Ice Cream Pastry") 
        return 154 * quantity;
	
    else if (dessertName == "Go Desi Classic Peanut Chikki") 
        return 231.0 * quantity;
	
    else if (dessertName == "Go Desi Sesame Chikki") 
        return 209 * quantity;
	
    else if (dessertName == "Kwality Wall's Magnum Almond Ice Cream Stick") 
        return 352 * quantity;
	
    else if (dessertName == "GRB Rasogolla ") 
        return 134 * quantity;
	
    else if (dessertName == "Masqa Rajbhog") 
        return 104.0 * quantity;
	
    else if (dessertName == "London Dairy Double Chocolate Ice Cream Tub") 
        return 500.20 * quantity;
	
    else if (dessertName == "Igp Masqa Desi Ghee Besan Laddoo") 
        return 190 * quantity;
	
    else if (dessertName == "Cream Pot Cookies Cream") 
        return 266.99 * quantity;
	
    else if (dessertName == "Nic Belgian Chocolate") 
        return 456 * quantity;
	
    else if (dessertName == "Ferrero Rocher Moments Chocolate ") 
        return 899.99 * quantity;
	
    else if (dessertName == "Cream Pot Black Currant") 
        return 247.20 * quantity;
	
    else if (dessertName == "Daadi's Ghee Crispy Mysore Pak") 
        return 199.90 * quantity;
	
    else if (dessertName == "Kwality Wall's Alphonso Mango Tub ") 
        return 340.67 * quantity;
	
    else if (dessertName == "Minus 30 Coconut Mini Stick Vegan & Sugar Free") 
        return 124.75 * quantity;
	
    else if (dessertName == "Get- A- Way Blueberry Cheesecake Jar") 
        return 189.0 * quantity;
	
    else if (dessertName == "Kwality Wall'S Shameless Vanillaâ Tub") 
        return 239.99 * quantity;
    else 
        System.out.println("The dessert is not found");

    return 0.0;
}
}

