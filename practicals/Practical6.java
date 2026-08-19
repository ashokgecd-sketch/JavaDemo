import java.util.*;
public class Practical6 { public static void main(String[] a){ Scanner s=new Scanner(System.in); System.out.print("Five-digit integer: "); String n=s.next(); if(!n.matches("\\d{5}")){System.out.println("Enter exactly five digits.");return;} StringBuilder r=new StringBuilder(); for(char c:n.toCharArray())r.append((c-'0'+1)%10); System.out.println("New number: "+r); } }
