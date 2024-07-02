public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder.setMotherName("Mom").setFatherName("father").setRollNumber(1).build();
        System.out.println(student.toString());
    }
}