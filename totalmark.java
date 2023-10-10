package boy.edu;

public class totalmark {

	public static void main(String[] args) {
		int maths =85;
		int iot =80;
		int nosql =85;
		int english =90;
		int hindi =97;
		int management =70;
		int totalmark =maths+iot+nosql+english+hindi+management;
		float mark =totalmark*100;
		float percentage =mark/600;
		System.out.println("Total mark = "+totalmark);
        System.out.println("percentage  = "+percentage);
	}

}
