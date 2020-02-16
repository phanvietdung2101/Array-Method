public class Main {
    public static void main(String[] args) {
        String str = new String("abcxyzcdg dasbasjdh asdasd");
        char character = 'a';

        int countCharacterAppear = 0;
        int totalCharacterOfAString = str.length();

        for(int i = 0; i < totalCharacterOfAString; i++){
            char currentCharacter = str.charAt(i);
            if(currentCharacter == character){
                countCharacterAppear++;
            }
        }

        System.out.printf("So lan xuat hien cua %c trong chuoi la %d lan",character,countCharacterAppear);
    }
}
