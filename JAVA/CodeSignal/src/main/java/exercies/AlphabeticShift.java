package exercies;


/*
Given a string, your task is to replace each of its characters
by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).
 */

public class AlphabeticShift {

    public static void main(String[] args) {
        System.out.println(alphabeticShift("aaaabbbccd"));

    }

    static String alphabeticShift(String inputString) {

        char[] input = inputString.toCharArray();
        int [] ascii=new int[input.length];

        for(int i=0;i<ascii.length;i++){
            ascii[i]=(int)input[i];

        }

for(int i=0;i<ascii.length;i++){
    if(ascii[i]==122){
        ascii[i]=96;
    }
  ascii[i]+=1;
  input[i]=(char)ascii[i];
}

String result=new String(input);


return  result;
    }


}
