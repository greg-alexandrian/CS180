public class Invoice {//declare class

	String partNumber;// declare instance variables
	String partDescription;
	int quantityPurchased; 
	double pricePerItem;
	double invoice;

	public Invoice(String prtNmbr, String prtDscrptn, int qtPrchsd, double prcPrItm){
		partNumber = prtNmbr;//initialize four instance variables 
		partDescription = prtDscrptn;
		quantityPurchased = qtPrchsd;
		pricePerItem = prcPrItm;
		
	}
//provide a set and get method for each instance variable 
		public String getPartNumber(){
			return partNumber;
		}											//set and get for partNumbers
		public void setPartNumber(String prtNmbr){
			partNumber = prtNmbr;
		}
	
		public String getPartDescription(){
			return partDescription;
		}											// set and get for partDescription
	public void setPartDescription(String prtDscrptn){
			partDescription = prtDscrptn;
	}
	public int getQuantityPurchased(){
		return quantityPurchased;
}													//set and get for quantityPurchased
	public void setQuantityPurchased(int qtPrchsd){
		if (qtPrchsd <0);
		quantityPurchased = 0;
		if(qtPrchsd>0);
		quantityPurchased = 0 + qtPrchsd;
	}
	public double getPricePerItem(){
		return pricePerItem;
	}												//set and get for pricePerItem
	public void setPricePerItem(double prcPrItm){
		if (prcPrItm >0.0)
		pricePerItem = prcPrItm; 
		if(prcPrItm<0)
			pricePerItem = 0.0;
	}

	public double getInvoiceAmount(){
	invoice = invoice + (quantityPurchased*pricePerItem);
		return invoice;
	
	}

}

/*

 (Invoice Class ) Create a class  called Invoice that a hardware store  might use to represent an invoice for an item sold at the store .
  An Invoice should include four pieces of information as instance variables -a part number (type  String ), a part description (type  String ),
   a quantity of the item being purchased (type  int ) and a price per item (double ). Your class  should have a constructor  that initializes  the 
   four instance variables . Provide a set and a get method  for each instance variable . In addition, provide a method  named  getInvoiceAmount that 
   calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double  value . 
   If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test app named
     InvoiceTest that demonstrates class  Invoice's capabilities by taking in appropriate stdin and prints to stdout the complete state of the object 
     
      each time the state of the object  is changed.

**/