import java.util.*;
public class Practical3 { public static void main(String[] a){ Scanner s=new Scanner(System.in); System.out.print("Letter: "); char c=Character.toLowerCase(s.next().charAt(0)); System.out.println("aeiou".indexOf(c)>=0?"Vowel":"Consonant"); } }
