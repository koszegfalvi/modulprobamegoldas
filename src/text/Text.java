package text;

import java.util.List;

public class Text {
    public static void modifyStringList(List<String> strings){
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length()>25){
                strings.set(i,strings.get(i).substring(0,20) +"...");
            }

        }
    }

}