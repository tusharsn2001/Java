import java.util.*;
class vow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        word = sc.nextLine();
        int vowel=0;
        int cons=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                vowel += 1;
            }
            else{
                cons += 1;
            }
        }
        System.out.print(vowel+" "+cons);
    }
}