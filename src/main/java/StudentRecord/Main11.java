package StudentRecord;
public class Main11 {
    public static void main(String [] args) {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Vanessa");
        student1.setMathScore(89);
        student1.setSciScore(95);
        student1.setAlgebraScore(78);

        StudentRecord student2 = new StudentRecord();
        student2.setName("Lupe");
        student2.setMathScore(95);
        student2.setSciScore(78);
        student2.setAlgebraScore(89);

        StudentRecord student3 = new StudentRecord();
        student3.setName("Keertika");
        student3.setMathScore(89);
        student3.setSciScore(78);
        student3.setAlgebraScore(95);

        //StudentRecord student = new StudentRecord(name: "Leslie", mathScore: 67, sciScore: 90, algebraScore: 54):
        int numberOfStudents1 = student1.getNumberOfStudents();
        System.out.println(numberOfStudents1);

        double totalScores = student1.getMathScore() + student1.getSciScore() + student1.getAlgebraScore();
        double averageScore = totalScores / 3;
        System.out.printf("Name = " + student1.getName() + " average score = " + averageScore);

    }
}
