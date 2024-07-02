public class Student {
    int rollNumber;
    String name;
    String fatherName;
    String motherName;

    public Student(StudentBuilder studentBuilder){
        this.rollNumber = studentBuilder.getRollNumber();
        this.name = studentBuilder.getName();
        this.fatherName = studentBuilder.getFatherName();
        this.motherName = studentBuilder.getMotherName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}
