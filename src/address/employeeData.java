
package address;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class employeeData {
    private String Name;

    private int birthYear;

    private Set<address> addresses = new HashSet<>();

    public Set<address> getAddresses() {
        return addresses;
    }

    public void addAddress(address address) {
        addresses.add(address);
    }

    public void removeAddress(address address) {
        addresses.remove(address);
    }

    public String getName() {
        return Name;

    }

    public void setName(String name) {
        Name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

}