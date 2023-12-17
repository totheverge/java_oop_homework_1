import models.Students;

public class Main {
    public static void main(String[] args) {
        int[] student1Marks = {90,90,90,90,90,100};
        int[] student2Marks = {40,50,60,20,30,10};
        int[] student3Marks = {60,70,30,50,30,50};
        Students student1 = new Students("Mandip Lal Joshi", 18, student1Marks, 12);
        student1.displayReport();
        Students student2 = new Students("Shyam Prakash", 19, student2Marks, 12);
        student2.displayReport();
        Students student3 = new Students("Hari KC", 20, student3Marks, 12);
        student3.displayReport();

    }
}