package session1inclass;

public class assignment6_18test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] crapsWin=new int[22];//name array
		
		
		int i;
		
		for(int counter =1; counter<=1000; counter++){
			
			i=assignment6_18.crapsGame();
			
			if (i==-1){
				i=0;
			}
			crapsWin[i]++; //keeps track of wins and the number.
		}
		//for(int counter =0; counter<crapsWin.length;counter++){
			//System.out.printf("%d\t%d\n", counter,crapsWin[counter]);
		
		printArray(crapsWin);
		}
		
	
	public static void printArray(int [] anyArray){
		for(int index = 0; index < anyArray.length; index++){
			System.out.println(index+"\t"+anyArray [index]);
	
	
	}

	}
}
