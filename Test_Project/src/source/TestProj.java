package source;

public class TestProj {

	public static void main(String[] args) 

	{
		int []a[][]=new int [2][][];

		System.out.println(a.getClass().getName());
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);

		a[0] = new int [2][3];
		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][0][2] = 30;

		a[0][1][0] = 40;
		a[0][1][1] = 50;
		a[0][1][2] = 60;

		System.out.println(a[0][0][0]);
		System.out.println(a[0][1][2]);

		a[1] = new int [3][2];

		a[1][0][0] = 70;
		a[1][0][1] = 80;

		a[1][1][0] = 90;
		a[1][1][1] = 100;

		a[1][2][0] = 110;
		a[1][2][1] = 120;

		System.out.println(a[1][2][1]);

	}

}
