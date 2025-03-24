class  FoodPanda { 

public static double dineIn(String food) {

	if (food == "NASI AYAM")  
            return 2.5;
		
    else if (food == "Cucur Udang")  
         return 27;
	 
    else if (food == "Bihun Sup")  
          return 22;
	  
    else if (food == "Sup Kosong")  
          return 10.0;
	  
    else if (food == "Nasi Putih Daging Goreng Kunyit")  
        return 30.00;
	
    else if (food == "Char Kuey Teow Udang")  
        return 20.0;
	
    else if (food == "Sup Ayam")  
        return 15.0;
	
    else if (food == "Nasi Putih")  
        return 2.5;
	
    else if (food == "Nasi Goreng Kampung")  
        return 15.0;
	
    else if (food == "Nasi Bujang")  
        return 22.5;
	
    else if (food == "Goreng Ayam")  
        return 29.0;
	
    else if (food == "Goreng Pattaya")  
        return 11;
	
    else if (food == "Kuey Teow Kerang Biasa")  
        return 10.0;
	
    else if (food == "Gulai Kawah Daging Cincang Sebungkus")  
        return 5.0;
	
    else if (food == "Tomyam Ayam")  
        return 20.0;
	
    else if (food == "Tomyam Sayur")  
        return 35;
	
    else if (food == "Tomyam Sotong")  
        return 15.0;
	
    else if (food == "Tomyam Daging")  
        return 13.0;
	
    else if (food == "Seafood")  
        return 10.0;
	
    else if (food == "Sup Sayur")  
        return 10;
	
    else if (food == "Kailan Ikan Masin")  
        return 10.0;
	
    else if (food == "Kangkung Belacan")  
        return 9;
	
    else if (food == "Mee Bandung")  
        return 2.0;
	
    else if (food == "Mee Rebus")  
        return 2.4;
	
    else if (food == "Teh Ais")  
        return 6.0;
	
    else if (food == "Goreng Kampung")  
        return 7.0;
	
    else if (food == "Soto Ayam")  
        return 10.0;
	
    else if (food == "Bihun Goreng")  
        return 6;
	
    else if (food == "Bihun Sup")  
        return 18.0;
	
    else if (food == "Limau Ais")  
        return 2.20;
	
    else if (food == "Ayam Kunyit")  
        return 11.0;
	
    else if (food == "Nasi Goreng Cina")  
        return 26.0;
	
    else if (food == "Paprik Daging")  
        return 10;
	
    else if (food == "Merah")  
        return 30.0;
	
    else if (food == "Mee Hailam")  
        return 10;
	
    else if (food == "Kuey Teow Kungfu Biasa")  
        return 11.5;
	
    else if (food == "Telur Dada")  
        return 5.0;
	
    else if (food == "Telur Mata")  
        return 6.0;
	
    else if (food == "Sirap Ais")  
        return 1.8;
	
    else if (food == "Sirap Bandung")  
        return 3.0;
	
	else
    System.out.println("The food is not found");  
    return 0.0;
    
}

public static double dineIn(String food , int quantity){
	
	if (food == "NASI AYAM")  
            return 2.5 * quantity;
		
    else if (food == "Cucur Udang")  
         return 27 * quantity;
	 
    else if (food == "Bihun Sup")  
          return 22 * quantity;
	  
    else if (food == "Sup Kosong")  
          return 10.0 * quantity;
	  
    else if (food == "Nasi Putih Daging Goreng Kunyit")  
        return 30.00 * quantity;
	
    else if (food == "Char Kuey Teow Udang")  
        return 20.0 * quantity;
	
    else if (food == "Sup Ayam")  
        return 15.0 * quantity;
	
    else if (food == "Nasi Putih")  
        return 2.5 * quantity;
	
    else if (food == "Nasi Goreng Kampung")  
        return 15.0 * quantity;
	
    else if (food == "Nasi Bujang")  
        return 22.5 * quantity;
	
    else if (food == "Goreng Ayam")  
        return 29.0 * quantity;
	
    else if (food == "Goreng Pattaya")  
        return 11 * quantity;
	
    else if (food == "Kuey Teow Kerang Biasa")  
        return 10.0 * quantity;
	
    else if (food == "Gulai Kawah Daging Cincang Sebungkus")  
        return 5.0 * quantity;
	
    else if (food == "Tomyam Ayam")  
        return 20.0 * quantity;
	
    else if (food == "Tomyam Sayur")  
        return 35 * quantity;
	
    else if (food == "Tomyam Sotong")  
        return 15.0 * quantity;
	
    else if (food == "Tomyam Daging")  
        return 13.0 * quantity;
	
    else if (food == "Seafood")  
        return 10.0 * quantity;
	
    else if (food == "Sup Sayur")  
        return 10 * quantity;
	
    else if (food == "Kailan Ikan Masin")  
        return 10.0 * quantity;
	
    else if (food == "Kangkung Belacan")  
        return 9 * quantity;
	
    else if (food == "Mee Bandung")  
        return 2.0 * quantity;
	
    else if (food == "Mee Rebus")  
        return 2.4 * quantity;
	
    else if (food == "Teh Ais")  
        return 6.0 * quantity;
	
    else if (food == "Goreng Kampung")  
        return 7.0 * quantity;
	
    else if (food == "Soto Ayam")  
        return 10.0 * quantity;
	
    else if (food == "Bihun Goreng")  
        return 6 * quantity;
	
    else if (food == "Bihun Sup")  
        return 18.0 * quantity;
	
    else if (food == "Limau Ais")  
        return 2.20 * quantity;
	
    else if (food == "Ayam Kunyit")  
        return 11.0 * quantity;
	
    else if (food == "Nasi Goreng Cina")  
        return 26.0 * quantity;
	
    else if (food == "Paprik Daging")  
        return 10 * quantity;
	
    else if (food == "Merah")  
        return 30.0 * quantity;
	
    else if (food == "Mee Hailam")  
        return 10 * quantity;
	
    else if (food == "Kuey Teow Kungfu Biasa")  
        return 11.5 * quantity;
	
    else if (food == "Telur Dada")  
        return 5.0 * quantity;
	
    else if (food == "Telur Mata")  
        return 6.0 * quantity;
	
    else if (food == "Sirap Ais")  
        return 1.8 * quantity;
	
    else if (food == "Sirap Bandung")  
        return 3.0 * quantity;
	else
    System.out.println("The food is not found");  
    return 0.0;
	
}
	
}
