public class Counter {


    public char[] transformToChar(String input) {

        char[] transform = input.toCharArray();


        return transform;
    }


    public int countVowels(String input) {
        int nrvowels = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        char[] transform = input.toCharArray();

        for (int i = 0; i < transform.length; i++) {

            for (int j = 0; j < vowels.length - 1; j++) {
                if (transform[i] == vowels[j]) {
                    nrvowels++;
                }
            }
        }

        return nrvowels;

    }

    //Return if a char is or not vowel
//Primary method
    public boolean isVowel(char s) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for(char c: vowels){
            if(s==c){
                return true;
            }
        }

return false;
    }






    //Cu metode din String
   public boolean isVowel_String_Method(char s){
       String vowels = new String("aeiouAEIOU");
return vowels.indexOf(s)!=-1;

   }


   public char [] removeValue(char []  sir){
        char  removedValue='5';

int dimnoua=0;
        for(int i=0;i<sir.length;i++){
            if(sir[i]==removedValue){
             sir[i]='0';
dimnoua++;

            }
        }
       char [] sirnou=new char[dimnoua];

       System.out.println(sir);

        return  sir;

   }




}
