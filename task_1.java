import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class task_1 {

    public static void main(String[] args) {
        //1st exception
        Stack st = new Stack<>();
        System.out.println(getItem(st));

        //2nd exception
//        fileReader("1.txt");

        //3rd exception
        System.out.println(division(1,0));
    }
    public static int division(int a, int b){
        return a/b;
    }

//    public static void fileReader(String fileName){
//        FileReader fr = new FileReader(fileName);
//        System.out.println(fr);
//    }

    public static int getItem (Stack st){
        return (int)st.pop();
    }

}
