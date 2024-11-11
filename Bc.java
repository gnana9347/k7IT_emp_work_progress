import java.util.Scanner;

class Bc {
    public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		
        Scanner src = new Scanner(System.in);
        int i;
        System.out.println("Enter the i value:");
        i = src.nextInt();
        System.out.println("You entered: " + i);
		int j;
        System.out.println("Enter the j value:");
        j = src.nextInt();
        System.out.println("You entered: " + j);
		int k=i+j;
		System.out.println("sum of i and j is :"+k);
	}
}
