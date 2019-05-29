package strings;

public class Characters {
	String input;
	 
	public Characters() {
		
	}
    Characters(String input){
   	 this.input = input;
    }
    public int stringLength(String input) {
    	return input.length();
    	
    }
    public String atEvenIndex(String input) {
    	String chars = "";
   	 for ( int i = 0; i < input.length(); i++) {
   		 if ( i % 2 == 0) {
   			chars += input.charAt(i);
   		 }
   	 }
   	 return chars;
    }
    public  String atOddIndex(String input) {
    	String chars = "";
   	  for ( int i = 0; i < input.length(); i++) {
   		 if ( i % 2 != 0) {
   			 chars += input.charAt(i);
   		 }
   	 }
   	   return chars;
    }
    public  int numberOfUpperCase(String input){
   	 int count = 0;
   	 for ( int i = 0; i < input.length(); i++) {
   		 if(Character.isUpperCase(input.charAt(i))) {
   			 count++;
   		 }
   	 }
   	  return count;
    }
    public  int numberOfLowerCase(String input) {
   	 int count = 0;
   	 for ( int i = 0; i < input.length(); i++) {
   		 if(Character.isLowerCase(input.charAt(i))) {
   			 count++;
   		 }
   	 } return count;
   	
    }
    public  String notChars(String input) {
    String notChars = "";
	 for ( int i = 0; i < input.length(); i++) {
		 if(!Character.isLetter(input.charAt(i))) {
			notChars += input.charAt(i);
		 }
	 }   return notChars;
	
}

}


