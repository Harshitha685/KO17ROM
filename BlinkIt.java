class BlinkIt {

public static double deliveryOrders(String snacks) {
        
    if (snacks == "Atta Delhi Khari")
        return 100.00;
    
    else if (snacks == "Creme Strawberry Flavoured Wafers")
        return 27.0;
    
    else if (snacks == "Elaichi Rusk")
        return 220.0;
    
    else if (snacks == "Choco Wafer Roll")
        return 100.0;
    
    else if (snacks == "Vanilla Wafer Roll")
        return 300.0;
    
    else if (snacks == "Orion Light & Tasty O'Rice Crackers")
        return 200.0;
    
    else if (snacks == "Choco Hazelnut Spread with Breadsticks")
        return 150.0;
    
    else if (snacks == "Gulab Garlic Toast")
        return 160.0;
    
    else if (snacks == "Strawberry Wafer Cube")
        return 155.0;
    
    else if (snacks == "Almond Biscotti")
        return 225.0;
    
    else if (snacks == "Peanut Butter Wafer Protein Bar")
        return 299.0;
    
    else if (snacks == "Yogurt Berry Nutrition Bar")
        return 124.0;
    
    else if (snacks == "Kurkure Masala Munch Crisps")
        return 100.0;
    
    else if (snacks == "Potato Chips")
        return 50.0;
    
    else if (snacks == "Lay's American Style Cream & Onion Potato Chips")
        return 200.0;
    
    else if (snacks == "Chatpata Masala Stick")
        return 35.0;
    
    else if (snacks == "Bingo Mad Angles")
        return 65.0;
    
    else if (snacks == "Haldiram's Pudina Treat Potato")
        return 50.0;
    
    else if (snacks == "Bingo Tedhe Medhe Masala Tadka Crisps")
        return 100.0;
    
    else if (snacks == "Fun Flips Baked & Crunchy Mocktail Curly Puffs")
        return 50.0;
    
    else if (snacks == "Too Yumm Veggie Stix Sour Cream & Onion")
        return 80.0;
    
    else if (snacks == "Haldiram's Fatafat Bhelpuri")
        return 140.0;
    
    else if (snacks == "Bikaji Bhujia")
        return 200.0;
    
    else if (snacks == "Garlic Bhujia")
        return 240.0;
    
    else if (snacks == "Nimbu Namkeen")
        return 60.0;
    
    else if (snacks == "Sour Cream & Cheese Flavour Popcorn")
        return 150.0;
    
    else if (snacks == "Jumbo Butter Popcorn")
        return 100.0;
    
    else if (snacks == "Microwave Butter Popcorn")
        return 200.0;
    
    else if (snacks == "Classic Salted Family Pack Instant Popcorn")
        return 38.0;
    
    else if (snacks == "Haldiram's Ajwain Khari")
        return 80.20;
    
    else if (snacks == "Chocolate Flavoured Biscuit Sticks")
        return 190.0;
    
    else if (snacks == "Espresso Wafer Biscuit")
        return 266.99;
    
    else if (snacks == "Cake Rusk")
        return 150.0;
    
    else if (snacks == "Cadbury Munch")
        return 30.99;
    
    else if (snacks == "Snicker")
        return 24.20;
    
    else if (snacks == "Kinder Joy")
        return 199.00;
    
    else if (snacks == "Puffs")
        return 50.99;
    
    else if (snacks == "Paneer Puffs")
        return 60.99;
    
    else if (snacks == "Bread Toast")
        return 18.0;
    
    else if (snacks == "Buns")
        return 30.0;
    
    else
        System.out.println("The snack is not found");
    
    return 0.0;
    }


public static double deliveryOrders(String snacks, int quantity) {
        
    if (snacks == "Atta Delhi Khari")
        return 100.00 * quantity;
    
    else if (snacks == "Creme Strawberry Flavoured Wafers")
        return 27.0 * quantity;
    
    else if (snacks == "Elaichi Rusk")
        return 220.0 * quantity;
    
    else if (snacks == "Choco Wafer Roll")
        return 100.0 * quantity;
    
    else if (snacks == "Vanilla Wafer Roll")
        return 300.0 * quantity;
    
    else if (snacks == "Orion Light & Tasty O'Rice Crackers")
        return 200.0 * quantity;
    
    else if (snacks == "Choco Hazelnut Spread with Breadsticks")
        return 150.0 * quantity;
    
    else if (snacks == "Gulab Garlic Toast")
        return 160.0 * quantity;
    
    else if (snacks == "Strawberry Wafer Cube")
        return 155.0 * quantity;
    
    else if (snacks == "Almond Biscotti")
        return 225.0 * quantity;
    
    else if (snacks == "Peanut Butter Wafer Protein Bar")
        return 299.0 * quantity;
    
    else if (snacks == "Yogurt Berry Nutrition Bar")
        return 124.0 * quantity;
    
    else if (snacks == "Kurkure Masala Munch Crisps")
        return 100.0 * quantity;
    
    else if (snacks == "Potato Chips")
        return 50.0 * quantity;
    
    else if (snacks == "Lay's American Style Cream & Onion Potato Chips")
        return 200.0 * quantity;
    
    else if (snacks == "Chatpata Masala Stick")
        return 35.0 * quantity;
    
    else if (snacks == "Bingo Mad Angles")
        return 65.0 * quantity;
    
    else if (snacks == "Haldiram's Pudina Treat Potato")
        return 50.0 * quantity;
    
    else if (snacks == "Bingo Tedhe Medhe Masala Tadka Crisps")
        return 100.0 * quantity;
    
    else if (snacks == "Fun Flips Baked & Crunchy Mocktail Curly Puffs")
        return 50.0 * quantity;
    
    else if (snacks == "Too Yumm Veggie Stix Sour Cream & Onion")
        return 80.0 * quantity;
    
    else if (snacks == "Haldiram's Fatafat Bhelpuri")
        return 140.0 * quantity;
    
    else if (snacks == "Bikaji Bhujia")
        return 200.0 * quantity;
    
    else if (snacks == "Garlic Bhujia")
        return 240.0 * quantity;
    
    else if (snacks == "Nimbu Namkeen")
        return 60.0 * quantity;
    
    else if (snacks == "Sour Cream & Cheese Flavour Popcorn")
        return 150.0 * quantity;
    
    else if (snacks == "Jumbo Butter Popcorn")
        return 100.0 * quantity;
    
    else if (snacks == "Microwave Butter Popcorn")
        return 200.0 * quantity;
    
    else if (snacks == "Classic Salted Family Pack Instant Popcorn")
        return 38.0 * quantity;
    
    else if (snacks == "Haldiram's Ajwain Khari")
        return 80.20 * quantity;
    
    else if (snacks == "Chocolate Flavoured Biscuit Sticks")
        return 190.0 * quantity;
    
    else if (snacks == "Espresso Wafer Biscuit")
        return 266.99 * quantity;
    
    else if (snacks == "Cake Rusk")
        return 150.0 * quantity;
    
    else if (snacks == "Cadbury Munch")
        return 30.99 * quantity;
    
    else if (snacks == "Snicker")
        return 24.20 * quantity;
    
    else if (snacks == "Kinder Joy")
        return 199.00 * quantity;
    
    else if (snacks == "Puffs")
        return 50.99 * quantity;
    
    else if (snacks == "Paneer Puffs")
        return 60.99 * quantity;
    
    else if (snacks == "Bread Toast")
        return 18.0 * quantity;
    
    else if (snacks == "Buns")
        return 30.0 * quantity;
    
    else
        System.out.println("The snack is not found");
    
    return 0.0;
    }
}

