import java.util.*;


public class S2 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
			System.out.println("characters without repetation");
			System.out.println(hs);
		}
		

	}

}
