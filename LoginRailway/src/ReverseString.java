
public class ReverseString {

	public static void main(String[] args) {
		String str="Java Is Very Bad";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);

	}

}
