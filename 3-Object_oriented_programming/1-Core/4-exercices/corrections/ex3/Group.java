import java.util.HashMap;

public class Group {
    private String name;
    private HashMap<String, Integer> members;

    
    public void setName(String name) {
        this.name = name;
    }

    public void printGroupInfo() {
        System.out.println(this.name);
    }


    public void addMember(String name, int age) {
        this.members.put(name, age);
    }

    public int getAge(String name) {
        return this.members.get(name);
    }

    public void printMembers() {
        for (String name : this.members.keySet()) {
            System.out.println(name);
        }
    }


    public Group(String name) {
        this.name = name;
        this.members = new HashMap<String, Integer>();
    }
}
