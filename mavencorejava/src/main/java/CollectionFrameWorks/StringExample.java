package CollectionFrameWorks;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "corejava";
		String str2 = "Interview";

		int length = str1.length();
		System.out.println("Lemgth og String 1: " + length);

		String result = str1.concat("," + str2);
		System.out.println(result);

		String subString = result.substring(4, 8);
		System.out.println("SubString of index(4,8) :" + subString);

		int find = result.indexOf('v');
		System.out.println("find the char by using index value: " + find);

		boolean value = str1.equals(str2);
		System.out.println(value);
	}
}
