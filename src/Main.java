
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите строку:\n");
        Scanner in = new Scanner(System.in);
        String tmpStr = new String(in.nextLine());

        int length = tmpStr.length();
        char[] myString = new char[length];
        for (int i = 0; i < length; i++)
            myString[i] = tmpStr.charAt(i);

        int symbols = length;

        while (symbols > 0) {

            int sCount = 0;
            char symbol = '\u0000';
            for (int i = 0; i < length; i++) {
                //Символ сравниваем с незначенным символом, если значимый символ не равен незначенному, то символ равен значенному
                if (symbol == '\u0000' && myString[i] != '\u0000')
                    symbol = myString[i];
                // символ не равен незначемому символу,а символ в массиве равен значемому искомому
                if (symbol != '\u0000' && myString[i] == symbol) {
                    myString[i] = '\u0000';
                    symbols--;
                    sCount++;
                }
            }
            if (symbol != '\u0000')
                System.out.printf("Символ %c встречается %d раз\n", symbol, sCount);
        }
    }
}
