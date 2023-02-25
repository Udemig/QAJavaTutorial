package day05;

import java.util.ArrayList;
import java.util.Arrays;


public class ExamExample {

     final int AVARAGE_POINT = 50;
     final int PART_SIZE = 6;
    int studentPhysicAvarage = 0;
    int studentMathAvarage = 0;
    int studentTurkishAvarage = 0;

    ArrayList<Student> students;

    void defineLecturesAndStudents(){
        // Dersler
        Lecture lecture1 = new Lecture("fizik",40,70);
        Lecture lecture2 = new Lecture("turkce",50,80);
        Lecture lecture3 = new Lecture("fizik",46,90);
        Lecture lecture4 = new Lecture("turkce",80,100 );
        Lecture lecture5 = new Lecture("fizik",41,10);
        Lecture lecture6 = new Lecture("turkce",42,20 );
        Lecture lecture7 = new Lecture("matematik",44,30);
        Lecture lecture8 = new Lecture("matematik",47,40 );
        Lecture lecture9 = new Lecture("matematik",70,50 );
        Lecture lecture10 = new Lecture("matematik",50,60 );
        Lecture lecture11 = new Lecture("fizik",20,70 );
        Lecture lecture12 = new Lecture("turkce",10,800);

        //Ogrencilerin dersler
        ArrayList<Lecture> ahmetLectures = new ArrayList<>(Arrays.asList(lecture1, lecture2, lecture7));
        ArrayList<Lecture> mehmetLectures = new ArrayList<>(Arrays.asList(lecture3, lecture6, lecture8));
        ArrayList<Lecture> aliLectures = new ArrayList<>(Arrays.asList(lecture5, lecture4, lecture9));
        ArrayList<Lecture> ayseLectures = new ArrayList<>(Arrays.asList(lecture11, lecture12, lecture10));

        //Ogrenciler
        Student ahmet = new Student("ahmet",2,ahmetLectures);
        Student mehmet = new Student("mehmet",12,mehmetLectures);
        Student ayse = new Student("ayse",3,ayseLectures);
        Student ali = new Student("ahmet",4,aliLectures);

        //tum ogrencileri listeye ekledim
        students = new ArrayList<>(Arrays.asList(ahmet,mehmet,ayse,ali));
    }

    void calcExamAvarageByStudent(){
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).lectures.size(); j++) {
                double examAvg = (students.get(i).lectures.get(j).getFirstExamResult() * 0.4) + (students.get(i).lectures.get(j).getSecondExamResult() * 0.6) ;
                students.get(i).lectures.get(j).setExamAvg((int)examAvg);
            }
        }
    }


    void calcClassAvarage(){
        int studentPhysicAvarageCounter = 0;
        int studentMathAvarageCounter = 0;
        int studentTurkishAvarageCounter = 0;

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).lectures.size(); j++) {
                if ( students.get(i).lectures.get(j).getLessonName() == LectureEnum.turkce.name()){
                    studentTurkishAvarageCounter++;
                    studentTurkishAvarage = studentTurkishAvarage +  students.get(i).lectures.get(j).getExamAvg();
                } else if(students.get(i).lectures.get(j).getLessonName() == LectureEnum.fizik.name()) {
                    studentPhysicAvarageCounter++;
                    studentPhysicAvarage = studentPhysicAvarage +  students.get(i).lectures.get(j).getExamAvg();
                } else {
                    studentMathAvarageCounter++;
                    studentMathAvarage = studentMathAvarage +  students.get(i).lectures.get(j).getExamAvg();
                }
            }
            studentPhysicAvarage  = studentPhysicAvarage / studentPhysicAvarageCounter;
            studentMathAvarage  = studentMathAvarage / studentMathAvarageCounter;
            studentTurkishAvarage  = studentTurkishAvarage / studentTurkishAvarageCounter;
        }
    }

    void approveStudentToPassClass(){
        for (Student item: students) {
             if (item.getNameSurname() == "ahmet"){
                 for (Lecture subItem: item.getLectures()){
                     if (subItem.getLessonName() == LectureEnum.fizik.name()){
                         int spaceBetweenNumbers = studentPhysicAvarage / 6;
                         System.out.println("spaceBetweenNumbers: " + spaceBetweenNumbers);
                         System.out.println("studentPhysicAvarage: " + studentPhysicAvarage);
                         System.out.println("subItem.getExamAvg(): " + subItem.getExamAvg());

                         if (subItem.getExamAvg()<50 || subItem.getExamAvg() < studentPhysicAvarage){
                             System.out.println("Derste kaldiniz");
                         } else {
                             if (subItem.getExamAvg()> studentMathAvarage && subItem.getExamAvg() < (studentMathAvarage +spaceBetweenNumbers)){
                                 System.out.println("DD ile gectin");
                             }else if (subItem.getExamAvg() + spaceBetweenNumbers > studentMathAvarage && subItem.getExamAvg() < (studentMathAvarage +spaceBetweenNumbers*2)){
                                 System.out.println("DC ile gectin");
                             } else if (subItem.getExamAvg() + (spaceBetweenNumbers * 2)> studentMathAvarage && subItem.getExamAvg() < (studentMathAvarage +spaceBetweenNumbers*3)){
                                 System.out.println("CC ile gectin");
                             }else if (subItem.getExamAvg()+ (spaceBetweenNumbers * 3)> studentMathAvarage && subItem.getExamAvg() < (studentMathAvarage +spaceBetweenNumbers*4)){
                                 System.out.println("BC ile gectin");
                             }else if (subItem.getExamAvg() + (spaceBetweenNumbers * 4)> studentMathAvarage && subItem.getExamAvg() < (studentMathAvarage +spaceBetweenNumbers*5)){
                                 System.out.println("BB ile gectin");
                             }else if (subItem.getExamAvg()+ (spaceBetweenNumbers * 5)> studentMathAvarage && subItem.getExamAvg() < (studentMathAvarage +spaceBetweenNumbers*6)){
                                 System.out.println("BA ile gectin");
                             }else {
                                 System.out.println("AA ile gectin");
                             }
                         }
                     }
                }
            }
        }
    }
}
