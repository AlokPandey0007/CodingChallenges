package stringBased;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String sentence="It is raining today";
		
		String[] stringArr=sentence.split(" ");
		
		String newSentence="";
		for(int i=stringArr.length-1;i>=0;i--)
	 	{
	 		newSentence=newSentence+stringArr[i] +" ";
	 	}
		
		System.out.println("Reversed String is : "+newSentence);
	}

}
