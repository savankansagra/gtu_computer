/*11.		Define a class Cipher with following data
        Field:
        String  plainText;
        int  key
        Functions:
        Cipher(String plaintext,int key)
        String Encryption( )
        String  Decryption( )

        Read string and key from command prompt and replace every character of string with charcter which is key place down from current character.
        Example
        plainText = “GCET”
        Key = 3
        Encryption function written following String
        “ JFHW”
        Decryption function will convert encrypted string to original form
        “GCET”
*/



public class Cipher {
    String  plainText;
    int  key;
    String encrypted,decrepted;

    Cipher(String plaintext,int key){
         plainText = plaintext;
         this.key = key;
    }

    String Encryption( ){
        encrypted = "";
        for(int i=0;i<plainText.length();i++){
               encrypted += (char)((int)plainText.charAt(i) + key);
        }
        return encrypted;
    }

    String  Decryption( ) {
         decrepted = "";
        for (int i = 0; i < plainText.length(); i++) {
            decrepted += (char)((int)encrypted.charAt(i) - key);
        }
        return decrepted;
    }

    void display(){
        System.out.println(plainText);
    }

    public static void main(String src[]){
        Cipher c1 = new Cipher("abcdef" , 20);
        System.out.println(c1.Encryption());
        System.out.println(c1.Decryption());
        c1.display();
    }


}
