package models;

public class Students {
    String name;
    int age;
    int[] marks;
    int grade;


    public Students(String name, int age, int[] marks, int grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayReport(){
        int totalMarks = 0;
        for(int x=0;x<6;x++){
            totalMarks += this.marks[x];
        }
        float totalPercent;
        totalPercent = totalMarks/6f;
        String finalGrade;
        if(totalPercent>100){
            finalGrade = "Error";
        } else if (totalPercent>=90) {
            finalGrade = "A+";
        } else if (totalPercent>=80) {
            finalGrade = "A";
        } else if (totalPercent>=70) {
            finalGrade = "B+";
        } else if (totalPercent>=60) {
            finalGrade = "B";
        } else if (totalPercent>=50) {
            finalGrade = "C+";
        } else if (totalPercent>=40) {
            finalGrade = "C";
        } else if (totalPercent>=0) {
            finalGrade = "NG";
        }
        else {
            finalGrade = "Error";
        }
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Grade: "+this.grade);
        System.out.println("Subject \t Marks");
        System.out.println("English \t "+this.marks[0]);
        System.out.println("Nepali \t \t "+this.marks[1]);
        System.out.println("Math \t \t "+this.marks[2]);
        System.out.println("Physics \t "+this.marks[3]);
        System.out.println("Chemistry \t "+this.marks[4]);
        System.out.println("Computer \t "+this.marks[5]);
        System.out.println(" \t \t \t Total: "+totalMarks);
        System.out.println(" \t \t \t Percent: "+totalPercent+" %");
        System.out.println(" \t \t \t Grade: "+finalGrade);
    }
}
