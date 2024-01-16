import java.io.File;
import java.util.Scanner;

class NBA extends Sports{
    private int Rank;
    private String Name;
    private String Team;
    private long Salary;

    public NBA(String name, int rank, String team, long salary) {
        super(name, rank);
        Rank = rank;
        this.Name = name;
        Team = team;
        Salary = salary;
    }


    void playerSalary(int myRank, String myName, String myTeam, long mySalary) {}

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        this.Rank = rank;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = Team;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public String toString(){
        return (getRank() + " " + getName() + " " + getTeam() + " " + getSalary());
    }
    public static void readData() throws Exception {
        File dataFile = new File("playerSalary Data");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t|\n");
        while (dataScanner.hasNext()) {
            int Rank = dataScanner.nextInt();
            String Name = dataScanner.next();
            String Team = dataScanner.next();
            Long Salary = dataScanner.nextLong();
            NBA teamData = new NBA (Name, Rank, Team, Salary);
            System.out.println(teamData);
        }
    }
}