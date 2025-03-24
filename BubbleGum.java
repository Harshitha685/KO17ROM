class BubbleGum
{
  int gumCode;
  String company;
  double weightInGrams;
  boolean isSugarFree;
  
  BubbleGum()
  {
    System.out.println("A new bubble gum variety is launched!");
  }
  
  BubbleGum(int gumCode, String company, double weightInGrams, boolean isSugarFree)
  {
    System.out.println("A new bubble gum variety is launched!");
    this.gumCode = gumCode;
    this.company = company;
    this.weightInGrams = weightInGrams;
    this.isSugarFree = isSugarFree;
  }
}
