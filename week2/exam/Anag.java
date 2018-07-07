import java.util.*;
import java.util.Arrays;
class Anag{
	public static boolean check(String s,String t){
		String s1=s.replaceAll("\\s", "");  
        String s2=t.replaceAll("\\s", "");  
        boolean n=true;  
        if (s1.length()!=s2.length()) {  
            n=false;  
        } 
        else {  
            char[] arr1=s1.toLowerCase().toCharArray();  
            char[] arr2=s2.toLowerCase().toCharArray();  
            Arrays.sort(arr1);  
            Arrays.sort(arr2);  
            n=Arrays.equals(arr1,arr2);  
        }  
        if(n) {  
            return true;
        } 
        else {  
             return false;
        }  	
	}
	public static void main(String[] args) {
		String s1="anagram";
		String t1="nagaram";

		String s2="Keep";
		String t2="Peek";

		String s3="Mother In Law";
		String t3="Hitler Woman";

		String s4="School Master";
		String t4="The Classroom";

		String s5="ASTRONOMERS";
		String t5="NO MORE STARS";

		String s6="Toss";
		String t6="Shot";

		String s7="joy";
		String t7="enjoy";

		String s8="Debit Card";
		String t8="Bad Credit";

		String s9="SiLeNt CAT";
		String t9="LisTen AcT";

		String s10="Dormitory";
		String t10="Dirty Room";

		System.out.println(check(s1,t1));
		System.out.println(check(s2,t2));
		System.out.println(check(s3,t3));
		System.out.println(check(s4,t4));
		System.out.println(check(s5,t5));
		System.out.println(check(s6,t6));
		System.out.println(check(s7,t7));
		System.out.println(check(s8,t8));
		System.out.println(check(s9,t9));
		System.out.println(check(s10,t10));
	}
}
