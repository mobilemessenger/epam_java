import java.util.Arrays;

public class optional_1
{
    public static void main(String[] args) {
       String  [] arr={"11","39","41","24","3","4","86","763","5","6226"};
        solve(arr);
    }
    public static void solve(String[]array){
        int min = array[0].length();
        int max = 0;
        for(String element:array){
            if(element.length()>max)max=element.length();
            else if(element.length()<min)min=element.length();
        }
        for(int i = 0;i<array.length;i++){
            if(array[i].length()==max)System.out.println("Max number is "+array[i]+" his length "+array[i].length());
            else if(array[i].length()==min)System.out.println("Min number is "+array[i]+" his length "+array[i].length());
        }
    }
}
