public class Main{

    public static void main(String[] args){
        StudentProfile profileOne = new StudentProfile("Alpha", "Zulu", "Science",
                3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Bravo", "Yankee", "Maths",
                3.45, 2023);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedGraduationYear);
    }
}