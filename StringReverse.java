

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Akash";
		reverse(str);
	}

	static void reverse(String str)
    {
        if ((str!=null)&&(str.length() >0))
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
	

}
