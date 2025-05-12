import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    /*     Scanner scan =new Scanner(System.in);
    Set<Integer> nums=new HashSet<>();
    for(int i=0;i<4;i++)
    {
        System.out.println("Input the num #"+i+1);
        nums.add(scan.nextInt());
    }
    System.out.println(4-nums.size());
    } */
/*     --------------------------------------------------------------------------------------------------------------------------------- */
    /* Qeustion number 2 today 5/2/2024 

    Scanner scan =new Scanner(System.in);
    int a=0;
    int b=0;
    int c=0;
    
    char[] nums;
    for(int i=0;i<3;i++)
    {
        String value=scan.next();
        nums=value.toCharArray();
        if(nums[1]=='>')
        {
            if(nums[0]=='A')
            {
                a++;
            }
            else if (nums[0]=='B') {
                b++;
            }
            else
            {
                c++;
            }
        }
        else
        {
            if(nums[2]=='A')
            {
                a++;
            }
            else if (nums[2]=='B') {
                b++;
            }
            else
            {
                c++;
            }
        }
    }
    if(a==b&&a==c&&b==c)
    {
        System.out.println("IMPOSSIBLE");
    }
    else
    {
    if(a>b&&a>c)
    {
        if(b>c)
        {
            System.out.println("C B A");
        }
        else
        {
            System.out.println("B C A");
        }
    }
    else if(b>c&&b>a)
    {
        if(a>c)
        {
            System.out.println("C A B");
        }
        else
        {
            System.out.println("A C B");
        }
    }else
    {
        if(a>b)
        {
            System.out.println("B A C");
        }
        else{
            System.out.println("A B C");
        }
    }
    }
 */

/*  _________________________________________________________________________________________---
 Question number 2 today 5/2/2024 
    Scanner scan=new Scanner(System.in);
    int size=scan.nextInt();
    char[] words;
    for(int i=0;i<size;i++)
    {
        words=scan.next().toCharArray();
        if(words.length>10)
        {
            System.out.println(words[0]+""+(words.length-2)+words[words.length-1]);
            continue;
        }
        else{
            System.out.println(words);
        }
    } */

/*     ______________________________________________________________________________________________ */
/*     Question number 3 today 5/2/2024 */
    /* System.out.println("Input the number of Events");
    Scanner scan=new Scanner(System.in);
    int Events=scan.nextInt();
    int police=0;
    int issue=0;
    for(int i=0;i<Events;i++)
    {
        int poo=scan.nextInt();
        if(poo==-1)
        {
            if(police==0)
            {
                issue++;
            }else
            {police--;}
        }
        else
        {
            police+=poo;
        }
    }
    System.out.println("Number of criminals "+issue); */

    
}
}

