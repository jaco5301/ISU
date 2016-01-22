
public class Characters implements Comparable{

    private String name, birthplace, sonof; //declaring var
    private int height, weight; //int var

    public Characters(String n, String b, String s, int h, int w) {
        name = n;
        birthplace = b;
        sonof = s;
        height = h;
        weight = w;
    }
    public int compareTo(Object o) { //A comparing function for the characters
        return name.compareTo(((Characters)o).getName());
    }

    public String getName() { //get name function
        return name;
    }

    public String getBirthplace() { //birthplace function
        return birthplace;
    }

    public String toString() { //creation of the info output, also formatting
        String info = "Name:\t" + name + "\n";
        info += "------------------------------------------\n";
        info += "Birth Place:\t" + birthplace + "\n";
        info += "Son of:\t" + sonof + "\n";
        info += "height:\t$" + height + "m\n";
        info += "Weight:\t" + weight + "kg";

        return info;
    }
    
}
