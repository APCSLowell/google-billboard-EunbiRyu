

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435"; 

	//Think of main(String[] args) as Java's setup
	public void main(String[] args){
		String digits = e.substring(2,12);
	  	double myNum = Double.parseDouble(digits);
	 	for(int i=2; i < e.length()-10; i++){
			digits = e.substring(i,i+10);
	      		myNum = Double.parseDouble(digits);
	      		if(isPrime(myNum) == true){
				System.out.println(myNum);
	        		break;
	      		}
	  	}
	}
	
	}  
	public static boolean isPrime(double dNum)  
	{
		if(dNum < 2){
			return false;
		}else{
			for(double i=2.0; i<= Math.sqrt(dNum); i++){
				if((dNum%i) == 0){
					return false;
	      			}
	    		}
	  	}
	  	return true;
	}
}



