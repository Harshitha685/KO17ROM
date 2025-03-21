class Swiggy {

public static double takeOrder(String foodStarters) {

    if (foodStarters == "Gobi Manchurian") 
        return 140.0;
	
    else if (foodStarters == "Veg Spring Roll") 
        return 270.0;
	
    else if (foodStarters == "Tandoori Soya Chop") 
        return 235.0;
	
    else if (foodStarters == "Panner Sholay Kabab") 
        return 270.00;
	
    else if (foodStarters == "Veggi Wingerzz") 
        return 330.09;
	
    else if (foodStarters == "Baby corn manchurian") 
        return 265.0;
	
    else if (foodStarters == "Panner Manchurian") 
        return 250.8;
	
    else if (foodStarters == "Masala papad roasted") 
        return 60.0;
	
    else if (foodStarters == "Special Malai chap") 
        return 259.0;
	
    else if (foodStarters == "Special Punjabi Chaap") 
        return 259;
	
    else if (foodStarters == "Veg Manchurian Bowl") 
        return 129;
	
    else if (foodStarters == "Afghani Chaap") 
        return 299;
	
    else if (foodStarters == "Panner Tikka") 
        return 265.0;
	
    else if (foodStarters == "Extra papad") 
        return 5;
	
    else if (foodStarters == "Gobi Manchurian dry") 
        return 138;
	
    else if (foodStarters == "Masala Chaap") 
        return 299;
	
    else if (foodStarters == "Sweet chilli Potato") 
        return 189.0;
	
    else if (foodStarters == "Panner kebab") 
        return 180;
	
    else if (foodStarters == "Maharaja Malai Chaap") 
        return 279;
	
    else if (foodStarters == "Paneer Tikka Lababdar") 
        return 379;
	
    else if (foodStarters == "Classic Veg Manchurian Combo") 
        return 249.0;
	
    else if (foodStarters == "Harabhara Kebab") 
        return 279;
	
    else if (foodStarters == "Sholey Paneer Tikka") 
        return 389;
	
    else if (foodStarters == "Mushroom Manchurian") 
        return 150;
	
    else if (foodStarters == "Peking Paneer- Starter") 
        return 269.0;
	
    else if (foodStarters == "Crispy Corn- Starter") 
        return 289;
	
    else if (foodStarters == "Honey Chilli Potato- Starter") 
        return 289;
	
    else if (foodStarters == "Wok Tossed Chili Babycorn - Starter") 
        return 178;
	
    else if (foodStarters == "Paneer Tossed In Peking Sauce- Starter") 
        return 279.0;
	
    else if (foodStarters == "Mushroom Pepper Salt - Starter") 
        return 178.20;
	
    else if (foodStarters == "Mushroom Kebab") 
        return 180;
	
    else if (foodStarters == "Crispy Potato - Starter") 
        return 178.99;
	
    else if (foodStarters == "Dragon Potato- Starter") 
        return 178;
	
    else if (foodStarters == "Achari Chaap") 
        return 289.0;
	
    else if (foodStarters == "Dahi kebab") 
        return 295.20;
	
    else if (foodStarters == "Fried Papad (lijjat)") 
        return 40.00;
	
    else if (foodStarters == "Kapoor's Special Veg Kebab") 
        return 330.99;
	
    else if (foodStarters == "Malai Soya Chaap") 
        return 538.00;
	
    else if (foodStarters == "Firecracker Sauce") 
        return 40.0;
	
    else if (foodStarters == "Citrus peri peri") 
        return 450.0;
	
    else {
        System.out.println("The foodStarters is not found");
        return 0.0;
    }
}
    


public static double takeOrder(String foodStarters, int quantity) {

    if (foodStarters == "Gobi Manchurian") 
        return 140.0 * quantity;
	
    else if (foodStarters == "Veg Spring Roll") 
        return 270.0 * quantity;
	
    else if (foodStarters == "Tandoori Soya Chop") 
        return 235.0 * quantity;
	
    else if (foodStarters == "Panner Sholay Kabab") 
        return 270.00 * quantity;
	
    else if (foodStarters == "Veggi Wingerzz") 
        return 330.09 * quantity;
	
    else if (foodStarters == "Baby corn manchurian") 
        return 265.0 * quantity;
	
    else if (foodStarters == "Panner Manchurian") 
        return 250.8 * quantity;
	
    else if (foodStarters == "Masala papad roasted") 
        return 60.0 * quantity;
	
    else if (foodStarters == "Special Malai chap") 
        return 259.0 * quantity;
	
    else if (foodStarters == "Special Punjabi Chaap") 
        return 259 * quantity;
	
    else if (foodStarters == "Veg Manchurian Bowl") 
        return 129 * quantity;
	
    else if (foodStarters == "Afghani Chaap") 
        return 299 * quantity;
	
    else if (foodStarters == "Panner Tikka") 
        return 265.0 * quantity;
	
    else if (foodStarters == "Extra papad") 
        return 5 * quantity;
	
    else if (foodStarters == "Gobi Manchurian dry") 
        return 138 * quantity;
	
    else if (foodStarters == "Masala Chaap") 
        return 299 * quantity;
	
    else if (foodStarters == "Sweet chilli Potato") 
        return 189.0 * quantity;
	
    else if (foodStarters == "Panner kebab") 
        return 180 * quantity;
	
    else if (foodStarters == "Maharaja Malai Chaap") 
        return 279 * quantity;
	
    else if (foodStarters == "Paneer Tikka Lababdar") 
        return 379 * quantity;
	
    else if (foodStarters == "Classic Veg Manchurian Combo") 
        return 249.0 * quantity;
	
    else if (foodStarters == "Harabhara Kebab") 
        return 279 * quantity;
	
    else if (foodStarters == "Sholey Paneer Tikka") 
        return 389 * quantity;
	
    else if (foodStarters == "Mushroom Manchurian") 
        return 150 * quantity;
	
    else if (foodStarters == "Peking Paneer- Starter") 
        return 269.0 * quantity;
	
    else if (foodStarters == "Crispy Corn- Starter") 
        return 289 * quantity;
	
    else if (foodStarters == "Honey Chilli Potato- Starter") 
        return 289 * quantity;
	
    else if (foodStarters == "Wok Tossed Chili Babycorn - Starter") 
        return 178 * quantity;
	
    else if (foodStarters == "Paneer Tossed In Peking Sauce- Starter") 
        return 279.0 * quantity;
	
    else if (foodStarters == "Mushroom Pepper Salt - Starter") 
        return 178.20 * quantity;
	
    else if (foodStarters == "Mushroom Kebab") 
        return 180 * quantity;
	
    else if (foodStarters == "Crispy Potato - Starter") 
        return 178.99 * quantity;
	
    else if (foodStarters == "Dragon Potato- Starter") 
        return 178 * quantity;
	
    else if (foodStarters == "Achari Chaap") 
        return 289.0 * quantity;
	
    else if (foodStarters == "Dahi kebab") 
        return 295.20 * quantity;
	
    else if (foodStarters == "Fried Papad (lijjat)") 
        return 40.00 * quantity;
	
    else if (foodStarters == "Kapoor's Special Veg Kebab") 
        return 330.99 * quantity;
	
    else if (foodStarters == "Malai Soya Chaap") 
        return 538.00 * quantity;
	
    else if (foodStarters == "Firecracker Sauce") 
        return 40.0 * quantity;
	
    else if (foodStarters == "Citrus peri peri") 
        return 450.0 * quantity;
	
    else {
        System.out.println("The foodStarters is not found");
        return 0.0;
    }
    }
}

