class Dmart{
 static String alcohols[] = {"Black&white","Kingfisher","OMR"};
public static void main(String dmat[]){


String fruits[] = {"Apple", "Banana", "Grapes", "Custard Apple", "Mango","Dragon Fruit", "Papaya"};
String vegetables[] = {"Carrot","Cucumber","Brinjal","Beans"};
String alcohols[] = {"Black&white","Kingfisher","OMR"};
String dairyProducts[] = {"Icecream","Butter","Milk","Cheese"};

//System.out.println("Total no of dairyProducts available"  +dairyProducts.length);
//System.out.println(dairyProducts[0] + " "+ dairyProducts[1]+" " +dairyProducts[2]+ " "+dairyProducts[3]);


//System.out.println("Total no of alcohols available" +alcohols.length);
//System.out.println(alcohols[0] + " "+ alcohols[1]+" " +alcohols[2]);

//System.out.println("The vegetables available are:"+vegetables.length);
//System.out.println(vegetables[0]+" "+vegetables[1]+ " "+vegetables[2]+" "+vegetables[3]);

//System.out.println("The fruits that are available in Dmart is:" +fruits.length);
//System.out.println(fruits[0] +" " + fruits[1] + " "+ fruits[2] + " "+ fruits[3]+ " "+fruits[4]+" "+fruits[5] + " "+fruits[6]);

//external referencing

for(String fruit: fruits){
	System.out.println(fruit);
}
	
for(String vegetable: vegetables){
	System.out.println(vegetable);

	
}
}
}