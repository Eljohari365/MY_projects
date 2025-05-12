import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class test  {
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    Set<Integer> nums=new HashSet<>();
    for(int i=0;i<4;i++)
    {
        nums.add(scan.nextInt());
    }
    System.out.println(4-nums.size());
}
}
