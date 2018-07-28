/*Define class StringData  conatain  following data
        Field:
        String data;
        int len;
        Functions:
        StringData();
        StringData(String a);
        String reverse();
        Boolean palindrome(String a);
        int findSubstring(String subString) ; //Count the number of times one string is found in another.
        int countWord();
        int countCharacter();
        int find(String substring)   //find substring in main String and return index of first occurance of substring in main String
        String replace(String find, String replace) //replace find with replace string

*/

import java.lang.String;
import java.security.PublicKey;

public class StringData {
    String data;
    int len;

    StringData() {}

    StringData(String a) {
        data = a;
        len = a.length();
    }

    String reverse() {
        String reverse = "";
        for (int i = len - 1; i > -1; i--) {
            char temp = data.charAt(i);
            reverse += temp;
        }
        return reverse;
    }


    Boolean palindrome(String a) {
        String b = reverse();
        return a.equals(b);
    }


    int findSubstring(String subString) {
        int abcd = 0;
        for (int i = 0; i < len - subString.length(); i++) {
            String temp = data.substring(i, i + subString.length() - 1);
            if (subString.equals(temp))
                abcd =i;
        }
        return abcd;
    }


    int countWord() {
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            char temp = data.charAt(i);
            if (temp == ' ')
            count++;
        }
        return count + 1;
    }


    int countCharacter() {
        int temp = countWord();
        return len - temp;
    }

    int find(String substring) {
        int abcd = 0;
        for (int i = 0; i < len - substring.length(); i++) {
            String temp = data.substring(i, i + substring.length());
            if (data.equals(temp))
                abcd = i;
        }
        return abcd;
    }


    String replace(String find, String replace) {
        String answer = " ";
        for (int i = 0; i < len - find.length(); i++) {
            String temp = data.substring(i, i + find.length());
            if (find.equals(temp)) {
                answer += data.substring(0, i );
                answer += replace;
                answer += data.substring(i + find.length(), len );
                break;
            }
        }
        return answer;
    }
}

class Demo_1{
    public static void main(String arg[]){
        StringData d1 = new StringData("savan kansagra");
        System.out.println("reverse :" +d1.reverse());
        System.out.println("palindrome :" +d1.palindrome("savan"));
        System.out.println("find savan :" + d1.find("savan"));
        System.out.println("count character :" + d1.countCharacter());
        System.out.println("count word :" + d1.countWord());
        System.out.println("replace string  :" + d1.replace("savan","SAVAN"));
    }
}
