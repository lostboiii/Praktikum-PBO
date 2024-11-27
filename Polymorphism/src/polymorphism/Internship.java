package polymorphism;

public class Internship extends Employee{
    private int length;

    public Internship(String name, int length) {
        this.name = name;
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "registered as Internship for: "+length+" months";
        return info;
    }
}
