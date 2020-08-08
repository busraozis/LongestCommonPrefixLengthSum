package main;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class CommonPrefixLengthSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("input.txt"); 
		BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 
		
		//First line contains the number of test case.
		String line = buf.readLine();
		int testCase = Integer.parseInt(line);
		
		FileWriter writer = new FileWriter("output.txt");
	      
		for(int i = 0; i < testCase; i++){
			String word = buf.readLine();
			int sum = sumOfPrefixes(word);
			writer.write(Integer.toString(sum));
			writer.write("\n");
		}
		
		buf.close();
		writer.close();
	}
	
	public static int sumOfPrefixes(String s){
		int suffixNumber = 0;
		int sum = 0;
		
		while(suffixNumber < s.length()){
			int i = 0;
			int j = suffixNumber;
			
			while(j < s.length()){
				if(s.charAt(i) == s.charAt(j)) sum++;
				else break;			
				i++;
				j++;
			}
			suffixNumber++;
		}
		return sum;
	}
}
