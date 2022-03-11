This file contains all Queries solved in March
 
public class who_Likes_It_384_394 {

	public static void main(String[] args) {
		
		String exp = "no one likes this";
		String[] input = {};
		String output = whoLikesIt(input);
		System.out.println(output);
		if(exp.equals(output))
			System.out.println("correct");
		else
			System.out.println("wrong");
		
		
		
		String exp1 = "Peter likes this";
		String[] input1 = {"Peter"};
		String output1 = whoLikesIt(input1);
		System.out.println(output1);
		if(exp1.equals(output1))
			System.out.println("correct");
		else
			System.out.println("wrong");
		
		
		
		String exp2 = "Jacob and Alex like this";
		String[] input2 = {"Jacob", "Alex"};
		String output2 = whoLikesIt(input2);
		System.out.println(output2);
		if(exp2.equals(output2))
			System.out.println("correct");
		else
			System.out.println("wrong");
		
		//"Max", "John", "Mark"
		String[] input3 = {"Max", "John", "Mark"};
		String output3 = whoLikesIt(input3);
		System.out.println(output3);
		//"Alex", "Jacob", "Mark", "Max"
		String[] input4 = {"Alex", "Jacob", "Mark", "Max"};
		String output4 = whoLikesIt(input4);
		System.out.println(output4);
	}
	
	public static String whoLikesIt(String... names) {
		
		switch (names.length)
		{
		case 0:return "no one likes this";
		
		case 1: return names[0]+" likes this";
		
		case 2: return names[0]+" and "+names[1]+" like this";
		
		case 3: return names[0]+", "+names[1]+" and "+names[2]+" like this";
			
			
		default:
			return String.format("%s, %s and %d others like this", names[0],names[1],names.length-2);
		}
		
		

	}
}
