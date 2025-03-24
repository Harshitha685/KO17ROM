class Dominos {
	
public static double userOrders(String pizzaName) {
	
    if (pizzaName == "Peppy Paneer") {
        return 344.90;
		
    } else if (pizzaName == "FarmHouse") {
        return 334.0;
		
    } else if (pizzaName == "Veggie Paradise") {
        return 344.99;
		
    } else if (pizzaName == "Margherita") {
        return 184.90;
		
    } else if (pizzaName == "Corn and Cheese Volcano") {
        return 299.0;
		
    } else if (pizzaName == "Indi Tandoori Paneer") {
        return 319.12;
		
    } else if (pizzaName == "Veg Extravaganza") {
        return 309.99;
		
    } else if (pizzaName == "Mexican Greenwave") {
        return 269.0;
		
    } else if (pizzaName == "Fresh veggie") {
        return 219.0;
		
    } else if (pizzaName == "Cheese Overload") {
        return 299.0;
		
    } else if (pizzaName == "Blazing Onion and Paprika") {
        return 199.0;
    } else if (pizzaName == "Spicy Boneless Thighs") {
        return 149.0;
		
    } else if (pizzaName == "Grilled Wings Southern spice") {
        return 149.0;
		
    } else if (pizzaName == "Onion") {
        return 69.0;
		
    } else if (pizzaName == "Golden Corn") {
        return 89.0;
		
    } else if (pizzaName == "Classic") {
        return 49.0;
		
    } else if (pizzaName == "Capsicum and Red Paprika") {
        return 89.0;
		
    } else if (pizzaName == "Pepper Barbecue Chicken") {
        return 119.0;
		
    } else if (pizzaName == "Non-veg Loaded") {
        return 199.0;
		
    } else if (pizzaName == "Chicken Keema and Onion Sauce") {
        return 149.0;
		
    } else if (pizzaName == "Paneer and Capsicum with Videshi hot Sauce") {
        return 109.0;
		
    } else if (pizzaName == "Paneer, Onion and Capsicum with Desi Makhani") {
        return 129.0;
		
    } else if (pizzaName == "Cheese Volcano BBQ Chicken") {
        return 349.0;
		
    } else if (pizzaName == "Cheese Volcano Chicken Delight") {
        return 349.0;
		
    } else if (pizzaName == "Cheese Volcano Blazing Chicken") {
        return 349.0;
		
    } else if (pizzaName == "Cheese Volcano Double Chicken") {
        return 289.0;
		
    } else if (pizzaName == "Chicken Dominator") {
        return 369.0;
		
    } else if (pizzaName == "Spiced Double Chicken") {
        return 329.0;
		
    } else if (pizzaName == "Chicken Keema Paratha Pizza") {
        return 249.0;
		
    } else if (pizzaName == "The 5 Chicken Feast Pizza") {
        return 399.20;
		
    } else if (pizzaName == "Indi Chicken Tikka") {
        return 389.0;
		
    } else if (pizzaName == "Chicken Pepperoni") {
        return 378.99;
		
    } else if (pizzaName == "Non-veg Supreme") {
        return 399.0;
		
    } else if (pizzaName == "Big-big 6 in 1 pizza") {
        return 899.0;
		
    } else if (pizzaName == "Double Cheese Margherita") {
        return 209.20;
		
    } else if (pizzaName == "Achari Do Papyza") {
        return 199.3;
		
    } else if (pizzaName == "Paneer Spice Supreme") {
        return 299.8;
		
    } else if (pizzaName == "Veg-Delux Combo") {
        return 1459.09;
		
    } else if (pizzaName == "Work from home Veg Treat") {
        return 239.0;
		
    } else if (pizzaName == "Work from home Non-veg Treat") {
        return 239.0;
		
    } else {
        System.out.println("The pizza name is not found!");
        return 0.0;
    }
}


public static double userOrders(String pizzaName, int quantity) {
    if (pizzaName == "Peppy Paneer") {
        return 344.90 * quantity;
		
    } else if (pizzaName == "FarmHouse") {
        return 334.0 * quantity;
		
    } else if (pizzaName == "Veggie Paradise") {
        return 344.99 * quantity;
		
    } else if (pizzaName == "Margherita") {
        return 184.90 * quantity;
		
    } else if (pizzaName == "Corn and Cheese Volcano") {
        return 299.0 * quantity;
		
    } else if (pizzaName == "Indi Tandoori Paneer") {
        return 319.12 * quantity;
		
    } else if (pizzaName == "Veg Extravaganza") {
        return 309.99 * quantity;
		
    } else if (pizzaName == "Mexican Greenwave") {
        return 269.0 * quantity;
		
    } else if (pizzaName == "Fresh veggie") {
        return 219.0 * quantity;
		
    } else if (pizzaName == "Cheese Overload") {
        return 299.0 * quantity;
		
    } else if (pizzaName == "Blazing Onion and Paprika") {
        return 199.0 * quantity;
		
    } else if (pizzaName == "Spicy Boneless Thighs") {
        return 149.0 * quantity;
		
    } else if (pizzaName == "Grilled Wings Southern spice") {
        return 149.0 * quantity;
		
    } else if (pizzaName == "Onion") {
        return 69.0 * quantity;
		
    } else if (pizzaName == "Golden Corn") {
        return 89.0 * quantity;
		
    } else if (pizzaName == "Classic") {
        return 49.0 * quantity;
		
    } else if (pizzaName == "Capsicum and Red Paprika") {
        return 89.0 * quantity;
		
    } else if (pizzaName == "Pepper Barbecue Chicken") {
        return 119.0 * quantity;
		
    } else if (pizzaName == "Non-veg Loaded") {
        return 199.0 * quantity;
		
    } else if (pizzaName == "Chicken Keema and Onion Sauce") {
        return 149.0 * quantity;
		
    } else if (pizzaName == "Paneer and Capsicum with Videshi hot Sauce") {
        return 109.0 * quantity;
		
    } else if (pizzaName == "Paneer, Onion and Capsicum with Desi Makhani") {
        return 129.0 * quantity;
		
    } else if (pizzaName == "Cheese Volcano BBQ Chicken") {
        return 349.0 * quantity;
		
    } else if (pizzaName == "Cheese Volcano Chicken Delight") {
        return 349.0 * quantity;
		
    } else if (pizzaName == "Cheese Volcano Blazing Chicken") {
        return 349.0 * quantity;
		
    } else if (pizzaName == "Cheese Volcano Double Chicken") {
        return 289.0 * quantity;
		
    } else if (pizzaName == "Chicken Dominator") {
        return 369.0 * quantity;
		
    } else if (pizzaName == "Spiced Double Chicken") {
        return 329.0 * quantity;
		
    } else if (pizzaName == "Chicken Keema Paratha Pizza") {
        return 249.0 * quantity;
		
    } else if (pizzaName == "The 5 Chicken Feast Pizza") {
        return 399.20 * quantity;
		
    } else if (pizzaName == "Indi Chicken Tikka") {
        return 389.0 * quantity;
		
    } else if (pizzaName == "Chicken Pepperoni") {
        return 378.99 * quantity;
		
    } else if (pizzaName == "Non-veg Supreme") {
        return 399.0 * quantity;
		
    } else if (pizzaName == "Big-big 6 in 1 pizza") {
        return 899.0 * quantity;
		
    } else if (pizzaName == "Double Cheese Margherita") {
        return 209.20 * quantity;
		
    } else if (pizzaName == "Achari Do Papyza") {
        return 199.3 * quantity;
		
    } else if (pizzaName == "Paneer Spice Supreme") {
        return 299.8 * quantity;
		
    } else if (pizzaName == "Veg-Delux Combo") {
        return 1459.09 * quantity;
		
    } else if (pizzaName == "Work from home Veg Treat") {
        return 239.0 * quantity;
		
    } else if (pizzaName == "Work from home Non-veg Treat") {
        return 239.0 * quantity;
		
    } else {
        System.out.println("The pizza name is not found!");
        return 0.0;
    }
    
}
}