import java.util.HashMap;
import java.util.Map;

public class studio {
    public static void main(String[] args) {
        String input = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> countOfCharacters = new HashMap<>();

        //for each Character in input
        //https://education.launchcode.org/java-web-dev-curriculum/control-flow-and-collections/reading/loops/index.html
        for(Character c : input.toLowerCase().toCharArray()){
            //Character is built into java for use
            //https://www.tutorialspoint.com/java/lang/character_isletter.htm
            if(Character.isLetter(c)) {
                if (!countOfCharacters.containsKey(c)) {
                    countOfCharacters.put(c, 1);
                } else {
                    countOfCharacters.put(c, countOfCharacters.get(c) + 1);
                }
            }
        }

        //for each Entry(we call it "character") of countOfCharacters
        //https://education.launchcode.org/java-web-dev-curriculum/control-flow-and-collections/reading/hashmap/index.html
        for (Map.Entry<Character, Integer> character : countOfCharacters.entrySet()) {
            System.out.println(character.getKey()+ " : "+character.getValue());

        }
    }
}
