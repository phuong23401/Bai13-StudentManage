public class Student {
    private int id;
    private String name, address;
    private Class aClass;
    private String priorityLevel;

    public Student(int id, String name, String address, Class aClass, String priorityLevel) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.aClass = aClass;
        this.priorityLevel = priorityLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", aClass=" + aClass +
                ", priorityLevel='" + priorityLevel + '\'' +
                '}';
    }
}
