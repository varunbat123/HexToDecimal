
public class HexDecimal {
	public  static int hexToDec(String s){
		int result = 0;
		for (int i = s.length()- 1,  count =0; i >=0; count++,i--){
			if( Character.isLetter(s.charAt(i))){
				if(s.charAt(i)== 'A'){
					result+= + 10*Math.pow(16, count);
				}
				else if(s.charAt(i)== 'B'){
					result+=  + 11*Math.pow(16, count);
				}
				else if(s.charAt(i)== 'C'){
					result+=  12*Math.pow(16, count);
				}
				else if(s.charAt(i)== 'D'){
					result+=  13*Math.pow(16, count);
				}
				else if(s.charAt(i)== 'E'){
					result+=  14*Math.pow(16, count);
				}
				else if(s.charAt(i)== 'F'){
					result+=  15*Math.pow(16, count);
				}
				
			}
			
			if(Character.isDigit(s.charAt(i))){
				result+=  ((int)s.charAt(i)-48)* Math.pow(16, count);
			}
			
		}
return result;
	
}


	
		
		
		
		


	public static void main(String[] args) {
	System.out.println(hexToDec("F12"));

	}

}
