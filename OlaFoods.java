class OlaFoods {
	
public static double foodOrders(String dishes) {
    if (dishes == "Classic Masala Dosa") 
    return 80;

    else if (dishes == "Stuffed Paratha Platter") 
    return 50;

    else if (dishes == "Idli-Vada Combo") 
    return 55;

    else if (dishes == "Pancakes with Maple Syrup") 
        return 45;

    else if (dishes == "Poha with Sev") 
        return 35;

    else if (dishes == "Upma with Coconut Chutney") 
        return 40;

    else if (dishes == "Aloo Puri") 
        return 50;

    else if (dishes == "Chole Bhature") 
        return 60;

    else if (dishes == "Vegetable Sandwich") 
        return 55.0;

    else if (dishes == "Omelette with Toast") 
        return 65;

    else if (dishes == "Classic Moong Dal Khichdi") 
        return 79;

    else if (dishes == "Masala Khichdi") 
        return 86;

    else if (dishes == "Vegetable Loaded Khichdi") 
        return 75;

    else if (dishes == "Mushroom Khichdi") 
        return 100;

    else if (dishes == "Paneer Tikka Khichdi") 
        return 110;

    else if (dishes == "Gobi (Cauliflower) Paratha") 
        return 89.9;

    else if (dishes == "Onion Paratha") 
        return 65.0;

    else if (dishes == "Cheese and Corn Paratha") 
        return 120;

    else if (dishes == "Mixed Vegetable Paratha") 
        return 75;

    else if (dishes == "Methi (Fenugreek) Paratha") 
        return 50;

    else if (dishes == "Paneer (Cottage Cheese) Paratha") 
        return 130.0;

    else if (dishes == "Egg Paratha") 
        return 40;

    else if (dishes == "Hyderabadi Chicken Biryani") 
        return 120;

    else if (dishes == "Vegetable Dum Biryani") 
        return 80;

    else if (dishes == "Egg Biryani") 
        return 85.0;

    else if (dishes == "Paneer Biryani") 
        return 150;

    else if (dishes == "Pav Bhaji Khichdi") 
        return 150;

    else if (dishes == "Paneer Butter Masala Bowl") 
        return 200;

    else if (dishes == "Chole Pulao Bowl") 
        return 65.0;

    else if (dishes == "Lucknowi Mutton Biryani") 
        return 180.20;

    else if (dishes == "Mushroom Paratha") 
        return 90;

    else if (dishes == "Cheese Burst Khichdi") 
        return 88.99;

    else if (dishes == "Dal Makhani with Jeera Rice & Roti") 
        return 150;

    else if (dishes == "Rajma Chawal with Onion Salad") 
        return 89.0;

    else if (dishes == "Mix Veg Curry with Roti & Rice") 
        return 85;

    else if (dishes == "Matar Paneer with Tandoori Roti") 
        return 199;

    else if (dishes == "Sambar Rice with Papad") 
        return 100;

    else if (dishes == "Tomato Rasam with Steamed Rice") 
        return 60;

    else if (dishes == "Andhra Meals") 
        return 180;

    else if (dishes == "bisi bele bath") 
        return 90;

    else {
        System.out.println("The dish is not found");

        return 0.0;

    }
}

public static double foodOrders(String dishes , int quantity){
	
    if (dishes == "Classic Masala Dosa") 
        return 80 * quantity;

	
    else if (dishes == "Stuffed Paratha Platter") 
        return 50 * quantity;
	
    else if (dishes == "Idli-Vada Combo") 
        return 55 * quantity;

	
    else if (dishes == "Pancakes with Maple Syrup") 
        return 45 * quantity;

	
    else if (dishes == "Poha with Sev") 
        return 35 * quantity;

	
    else if (dishes == "Upma with Coconut Chutney") 
        return 40 * quantity;

    else if (dishes == "Aloo Puri") 
        return 50 * quantity;

    else if (dishes == "Chole Bhature") 
        return 60 * quantity;

    else if (dishes == "Vegetable Sandwich") 
        return 55.0 * quantity;

    else if (dishes == "Omelette with Toast") 
        return 65 * quantity;

    else if (dishes == "Classic Moong Dal Khichdi") 
        return 79 * quantity;

    else if (dishes == "Masala Khichdi") 
        return 86 * quantity;

    else if (dishes == "Vegetable Loaded Khichdi") 
        return 75 * quantity;

    else if (dishes == "Mushroom Khichdi") 
        return 100 * quantity;

    else if (dishes == "Paneer Tikka Khichdi") 
        return 110 * quantity;

    else if (dishes == "Gobi (Cauliflower) Paratha") 
        return 89.9 * quantity;

    else if (dishes == "Onion Paratha") 
        return 65.0 * quantity;

    else if (dishes == "Cheese and Corn Paratha") 
        return 120 * quantity;

    else if (dishes == "Mixed Vegetable Paratha") 
        return 75 * quantity;

    else if (dishes == "Methi (Fenugreek) Paratha") 
        return 50 * quantity;

    else if (dishes == "Paneer (Cottage Cheese) Paratha") 
        return 130.0 * quantity;

    else if (dishes == "Egg Paratha") 
        return 40 * quantity;

    else if (dishes == "Hyderabadi Chicken Biryani") 
        return 120 * quantity;

    else if (dishes == "Vegetable Dum Biryani") 
        return 80 * quantity;

    else if (dishes == "Egg Biryani") 
        return 85.0 * quantity;
	
    else if (dishes == "Paneer Biryani") 
        return 150 * quantity;

    else if (dishes == "Pav Bhaji Khichdi") 
        return 150 * quantity;

    else if (dishes == "Paneer Butter Masala Bowl") 
        return 200 * quantity;

    else if (dishes == "Chole Pulao Bowl") 
        return 65.0 * quantity;

    else if (dishes == "Lucknowi Mutton Biryani") 
        return 180.20 * quantity;

    else if (dishes == "Mushroom Paratha") 
        return 90 * quantity;

    else if (dishes == "Cheese Burst Khichdi") 
        return 88.99 * quantity;
	
    else if (dishes == "Dal Makhani with Jeera Rice & Roti") 
        return 150 * quantity;

    else if (dishes == "Rajma Chawal with Onion Salad") 
        return 89.0 * quantity;

    else if (dishes == "Mix Veg Curry with Roti & Rice") 
        return 85 * quantity;

    else if (dishes == "Matar Paneer with Tandoori Roti") 
        return 199 * quantity;

    else if (dishes == "Sambar Rice with Papad") 
        return 100 * quantity;

    else if (dishes == "Tomato Rasam with Steamed Rice") 
        return 60 * quantity;

    else if (dishes == "Andhra Meals") 
        return 180 * quantity;

    else if (dishes == "bisi bele bath") 
        return 90 * quantity;

    else {
        System.out.println("The dish is not found");

        return 0.0;

        }
    }
}
