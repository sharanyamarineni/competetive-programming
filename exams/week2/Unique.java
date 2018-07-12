import java.util.*;
class UniqueMorse{
	public static int word(String arr[]){
		int count=0;
		ArrayList<String> al=new ArrayList<String>();
		for (int i=0;i<arr.length ; i++) {
			String str=arr[i];
			String s="";
			
			for (int j=0;j<str.length() ;j++ ) {
				
				char n=str.charAt(j);

				if(n=='a'){
					s+=".-";
				}
				else if(n=='b')
					s+="-...";
				else if(n=='c')
					s+="-.-.";
				else if(n=='d')
					s+="-..";
				else if(n=='e')
					s+=".";
				else if(n=='f')
					s+="..-.";
				else if(n=='g')
					s+="--.";

				else if(n=='h')
					s+="....";
				else if(n=='i')
					s+="..";
				else if(n=='j')
					s+=".---";
				else if(n=='k')
					s+="-.-";
				else if(n=='l')
					s+=".-..";
				else if(n=='m')
					s+="--";

				else if(n=='n')
					s+="-.";
				else if(n=='o')
					s+="---";
				else if(n=='p')
					s+=".--.";
				else if(n=='q')
					s+="--.-";
				else if(n=='r')
					s+=".-.";
				else if(n=='s')
					s+="...";

				else if(n=='t')
					s+="-";
				else if(n=='u')
					s+="..-";
				else if(n=='v')
					s+="...-";
				else if(n=='w')
					s+=".--";
				else if(n=='x')
					s+="-..-";
				else if(n=='y')
					s+="-.--";

				else if(n=='z')
					s+="--..";

				
			}
			if(!al.contains(s)){
				count++;
			}
			al.add(s);	
		}
		return count;
	}
	public static void main(String[] args) {
		String arr1[]={"gin","zen","gig","msg"};
		String arr2[]={"a","z","g","m"};
		String arr3[]={"bhi","vsv","sgh","vbi"};
		String arr4[]={"a","b","c","d"};
		String arr5[]={"hig","sip","pot"};
		System.out.println(word(arr1));
		System.out.println(word(arr2));
		System.out.println(word(arr3));
		System.out.println(word(arr4));
		System.out.println(word(arr5));
	}
}
