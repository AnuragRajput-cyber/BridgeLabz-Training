package gcr_codebase;

public class ProfitAndLoss {
	public static void main(String[] args) {
		int costP=129;
		int sellP=191;
		int profitInNum=sellP-costP;
		int profitInPer=(profitInNum*100)/costP;
	    int lossInNum=costP-sellP;
	    int lossInPer=(lossInNum/costP)*100;
	    System.out.println("The Cost Price in INR 129 and selling price in INR 191.");
	    System.out.println("The Profit is INR "+profitInNum+" and the Profit percentage is "+profitInPer);
	    System.out.println("The Loss is INR "+lossInNum+" and the Loss percentage is "+lossInPer);
	  
	}
}
