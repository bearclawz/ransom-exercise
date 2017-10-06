
package ransom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//@author Admin

public class WordCheck {

    private Scanner reader;
    private List<String> magazine;
    private List<String> ransom;

    public WordCheck(int magwords, int ransomwords, String magtext, String ransomtext) {
        this.magazine = stringToArray(magtext, magazine);
        this.ransom = stringToArray(ransomtext, ransom);
    }

    public List stringToArray(String string, List<String> list) {
        reader = new Scanner(string);
        list = new ArrayList<String>();
        while (reader.hasNext()) {
            list.add(reader.next());
        }
        return list;
    }

    public String result() {
        if (enoughWords() == false) {
            return "No";
        }
        int count = 0;
        for (int i = 0; i < ransom.size(); i++) {
            if (magazine.contains(ransom.get(i))) {
                int w = magazine.indexOf(ransom.get(i));
                magazine.remove(w);
                count++;
            }
        }
        if (count == ransom.size()) {
            return "Yes";
        }
        return "No";
    } 

    public boolean enoughWords() {
        return (magazine.size() >= ransom.size());
    }
}
