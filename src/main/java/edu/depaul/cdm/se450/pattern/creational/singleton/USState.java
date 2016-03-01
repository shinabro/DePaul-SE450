package edu.depaul.cdm.se450.pattern.creational.singleton;

public class USState {
    private String abbr;
    private String name;

    public USState(String abbr, String name) {
        this.abbr = abbr;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }

    @Override
    public String toString() {
        return "USState{" +
                "abbr='" + abbr + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof USState)) return false;

        USState usState = (USState) o;

        if (abbr != null ? !abbr.equals(usState.abbr) : usState.abbr != null) return false;
        return name != null ? name.equals(usState.name) : usState.name == null;

    }

    @Override
    public int hashCode() {
        int result = abbr != null ? abbr.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
