package java_24;

class Student {
    public static void main(String arguments[]) {
            int studentCount = 6;
            int[][] student = new int[studentCount][studentCount];
            int[] janice = { 90,85,85,75,70,95 };
            int[] mikey = { 95,85,85,70,75,90 };
            int[] nicki = { 85,80,85,95,100,100 };
            int[] bernice = { 80,90,90,80,85,95 };
            int[] ernest = { 75,45,80,95,90,90 };
            int[] bigMike = { 90,90,90,95,70,65 };
            
            student[0] = janice;
            student[1] = mikey;
            student[2] = nicki;
            student[3] = bernice;
            student[4] = ernest;
            student[5] = bigMike;
            
            int gradeSum = 0;
            int[] studentSum = new int[studentCount];
            
            for (int i = 0; i < studentCount; i++) {
                System.out.println("Student #" + i);
                studentSum[i] = 0;
                // Loop through each student's grades
                for (int j = 0; j < studentCount; j++) {
                        gradeSum = gradeSum + student[i][j];
                        studentSum[i] = studentSum[i] + student[i][j];
                }
                System.out.println("  Average grade: "
                        + studentSum[i] / studentCount);
            }
            System.out.println("\nAverage grade of all students: " +
                gradeSum / (studentCount * studentCount));
    }
}
