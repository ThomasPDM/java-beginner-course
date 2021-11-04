import java.util.ArrayList;

public class School {
    private String name;
    private String type;
    private String city;
    private ArrayList<String> domains;


    public void addDomain(String domain) {
        this.domains.add(domain);
    }

    public void printDomains() {
        System.out.print("Domains : ");
        for (String domain : this.domains) {
            System.out.print(domain + " ");
        }
        System.out.println(""); // line return
    }

    public String getName() {
        return this.name;
    }
    
    public String getType() {
        return this.type;
    }

    public String getCity() {
        return this.city;
    }


    public School(String name, String type, String city) {
        this.name = name;
        this.type = type;
        this.city = city;
        this.domains = new ArrayList<String>();
    }
}
