package Sept_19;
/*
Q: Given a String s consisting of small English letter,find and return the first instance of a non-repeating character in
it.
if there is non such character, return '_'

i/p1: s="abacabad"
i/p2: s="aaabcccdeeef"

o/p1:'c'
o/p2:'b'
 */


public class FirstNonRepChar {
    public static void main(String[] args) {
        String s="aaabcccdeeef";
        FirstNonRepChar fc=new FirstNonRepChar();
        System.out.println(fc.firstNotRepeatingCharacter(s));
    }
    char firstNotRepeatingCharacter(String s){
        for (int i=0;i<s.length();i++){
            boolean seenDuplicate=false;
            for (int j=0;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j) && (i!=j)){
                seenDuplicate=true;
                break;
            }
            }
            if (!seenDuplicate)
                return s.charAt(i);

        }
        return '_';

    }
}
