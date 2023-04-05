import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(char ch = 'a'; ch <= 'z'; ch++){
            set.add(ch);
        }
        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(Character.isLetter(ch))
                set.remove(ch);
        }
        return set.size() == 0;
    }
}

