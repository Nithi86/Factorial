package org.factorial;

public class Factorial {
	private void methodOfNew() {
		System.out.println("New Method is Created");

	}
	private void methodOfSecomd() {
		System.out.println("Second Method is Created");


	}
	
	public static void main(String[] args) {
		
int i,n=5, fact=1;
for(i=1;i<=n;i++) {
	fact=fact*i;
}
System.out.println("The Factorial No is:  "+fact);
}
}