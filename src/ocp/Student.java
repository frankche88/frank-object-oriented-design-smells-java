package ocp;

public class Student {
    private String name;
    private StudentType type;

    public Student(String name, StudentType type) {
        this.name = name;
        this.type = type;
    }

    public void saySomething() {
        switch (this.type) {
            case Undergraduate :
                System.out.println(name + " says Party!");
                break;
            case MasterStudent :
                System.out.println(name + " says Thesis!!!");
                break;
            case PhDStudent :
                System.out.println(name + " says Hard Research!");
                break;
        }
    }

    public String toString() {
        return String.format("%s : %s", type.name(), name);
    }
}
