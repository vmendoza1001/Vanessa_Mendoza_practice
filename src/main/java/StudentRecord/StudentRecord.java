package StudentRecord;
/* Refactor “StudentRecord” class to add multiple constructors
A constructor that takes one argument of “name”
A constructor that takes 2 arguments of “name” and “mathScore”
A constructor that takes 4 arguments of “name”, “mathScore”, “scienceScore”, and “algebraScore”
For the constructors that 2 arguments and 4 arguments, use “this(..)” method appropriately
Refactor “Main” class to use these instructors instead of setter methods when creating “StudentRecord” object instances
(edited)*/

public class StudentRecord {
    private String name;
    private double mathScore;
    private double sciScore;
    private double algebraScore;

    private static int numberOfStudents;

    public StudentRecord() {
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getSciScore() {
        return sciScore;
    }

    public void setSciScore(double sciScore) {
        this.sciScore = sciScore;
    }

    public double getAlgebraScore() {
        return algebraScore;
    }

    public void setAlgebraScore(double algebraScore) {
        this.algebraScore = algebraScore;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        StudentRecord.numberOfStudents = numberOfStudents;
    }
    //public StudentRecord(String name, double mathScore, double sciScore, double algebraScore)
    public void print(double mathScore, double sciScore, double algebraScore) {

    }

    public void print(double averageScore) {

    }
}
