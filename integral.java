package boy.edu;

public class integral {

	public static void main(String[] args) {
		int x=40;
		int y=45;
		System.out.println("addition "+(x+y));
		if(++x<40 || ++y>45)
		{
			x++;
		}
		else
		{
			y++;
		}
		System.out.println(x+" "+y);

	}

}
