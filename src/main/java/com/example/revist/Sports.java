import java.util.ArrayList;

public class Sports {

    private String Name;

    private int rank;

private static ArrayList<Sports> Sports = new ArrayList<>();

 public Sports(String Name, int rank) {
    this.Name= Name;
    this.rank= rank;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    public static ArrayList<Sports> getSports() {
        return Sports;
    }

    public static void setSports(ArrayList<Sports> sports) {
        Sports = sports;
    }
}