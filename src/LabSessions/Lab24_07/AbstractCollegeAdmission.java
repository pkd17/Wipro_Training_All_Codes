package Lab24_07;

abstract class Student {
 String name;
 int rollNo;
 Student(String name, int rollNo) {
     this.name = name;
     this.rollNo = rollNo;
 }
 abstract void getGrade(int marks);
}
class EngineeringStudent extends Student {
 EngineeringStudent(String name, int rollNo) {
     super(name, rollNo);
 }

 void getGrade(int marks) {
     System.out.println("Engineering Student: " + name + ", Roll No: " + rollNo);
     if (marks >= 90) {
         System.out.println("Grade: A+");
     } else if (marks >= 75) {
         System.out.println("Grade: A");
     } else if (marks >= 60) {
         System.out.println("Grade: B");
     } else if (marks >= 50) {
         System.out.println("Grade: C");
     } else {
         System.out.println("Grade: F");
     }
 }
}
class MedicalStudent extends Student {
 MedicalStudent(String name, int rollNo) {
     super(name, rollNo);
 }

 void getGrade(int marks) {
     System.out.println("Medical Student: " + name + ", Roll No: " + rollNo);
     if (marks >= 85) {
         System.out.println("Grade: A+");
     } else if (marks >= 70) {
         System.out.println("Grade: A");
     } else if (marks >= 55) {
         System.out.println("Grade: B");
     } else if (marks >= 45) {
         System.out.println("Grade: C");
     } else {
         System.out.println("Grade: F");
     }
 }
}
public class AbstractCollegeAdmission {
 public static void main(String[] args) {
     Student s1 = new EngineeringStudent("Satyajit", 101);
     Student s2 = new MedicalStudent("Saswat", 202);

     s1.getGrade(78);
     System.out.println();
     s2.getGrade(68);
 }
}

