package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ExamExample {

    private static final int PART_SIZE = 6;
    private int studentPhysicAvarage = 0;
    private int mathMaxPoint = 0;
    private int physicMaxPoint = 0;
    private int turkishMaxPoint = 0;
    private int studentMathAvarage = 0;
    private int studentTurkishAvarage = 0;
    private List<Student> students;

    void defineLecturesAndStudents(){
        // Dersler 170 * 0.4   + 240* 0.6    68  - 144  212  / 4  = 53
        Lecture lecture1 = new Lecture("fizik",40,70);
        Lecture lecture2 = new Lecture("turkce",50,80);
        Lecture lecture3 = new Lecture("fizik",50,90);
        Lecture lecture4 = new Lecture("turkce",80,100 );
        Lecture lecture5 = new Lecture("fizik",60,10);
        Lecture lecture6 = new Lecture("turkce",42,20 );
        Lecture lecture7 = new Lecture("matematik",44,30);
        Lecture lecture8 = new Lecture("matematik",47,40 );
        Lecture lecture9 = new Lecture("matematik",70,50 );
        Lecture lecture10 = new Lecture("matematik",50,60 );
        Lecture lecture11 = new Lecture("fizik",20,70 );
        Lecture lecture12 = new Lecture("turkce",10,80);

        //Ogrencilerin dersler
        ArrayList<Lecture> ahmetLectures = new ArrayList<>(Arrays.asList(lecture1, lecture2, lecture7));
        ArrayList<Lecture> mehmetLectures = new ArrayList<>(Arrays.asList(lecture3, lecture6, lecture8));
        ArrayList<Lecture> aliLectures = new ArrayList<>(Arrays.asList(lecture5, lecture4, lecture9));
        ArrayList<Lecture> ayseLectures = new ArrayList<>(Arrays.asList(lecture11, lecture12, lecture10));

        //Ogrenciler
        Student ahmet = new Student("ahmet",2,ahmetLectures);
        Student mehmet = new Student("mehmet",1,mehmetLectures);
        Student ayse = new Student("ayse",3,ayseLectures);
        Student ali = new Student("ali",4,aliLectures);

        //tum ogrencileri listeye ekledim
        students = new ArrayList<>(Arrays.asList(ahmet,mehmet,ayse,ali));
    }

    void calcExamAvarageByStudent(){
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).getLectures().size(); j++) {
                double examAvg = (students.get(i).getLectures().get(j).getFirstExamResult() * 0.4) + (students.get(i).getLectures().get(j).getSecondExamResult() * 0.6) ;
                students.get(i).getLectures().get(j).setExamAvg((int)examAvg);
                if (students.get(i).getLectures().get(j).getLessonName() == LectureEnum.matematik.name()){
                    int firstExam = students.get(i).getLectures().get(j).getFirstExamResult();
                    int secondExam = students.get(i).getLectures().get(j).getSecondExamResult();
                    if (mathMaxPoint < firstExam|| mathMaxPoint < secondExam){
                        mathMaxPoint = firstExam > secondExam ? firstExam : secondExam;
                    }
                } else if (students.get(i).getLectures().get(j).getLessonName() == LectureEnum.fizik.name()){
                    int firstExam = students.get(i).getLectures().get(j).getFirstExamResult();
                    int secondExam = students.get(i).getLectures().get(j).getSecondExamResult();
                    if (physicMaxPoint < firstExam|| physicMaxPoint < secondExam){
                        physicMaxPoint = firstExam > secondExam ? firstExam : secondExam;
                    }
                }else {
                    int firstExam = students.get(i).getLectures().get(j).getFirstExamResult();
                    int secondExam = students.get(i).getLectures().get(j).getSecondExamResult();
                    if (turkishMaxPoint < firstExam|| turkishMaxPoint < secondExam){
                        turkishMaxPoint = firstExam > secondExam ? firstExam : secondExam;
                    }
                }
            }
        }
    }


    void calcClassAvarage(){
        int studentPhysicAvarageCounter = 0;
        int studentMathAvarageCounter = 0;
        int studentTurkishAvarageCounter = 0;

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).getLectures().size(); j++) {
                if ( students.get(i).getLectures().get(j).getLessonName() == LectureEnum.turkce.name()){
                    studentTurkishAvarageCounter++;
                    studentTurkishAvarage = studentTurkishAvarage +  students.get(i).getLectures().get(j).getExamAvg();
                } else if(students.get(i).getLectures().get(j).getLessonName() == LectureEnum.fizik.name()) {
                    studentPhysicAvarageCounter++;
                    studentPhysicAvarage = studentPhysicAvarage +  students.get(i).getLectures().get(j).getExamAvg();
                } else {
                    studentMathAvarageCounter++;
                    studentMathAvarage = studentMathAvarage +  students.get(i).getLectures().get(j).getExamAvg();
                }
            }
        }

        studentPhysicAvarage  = studentPhysicAvarage / studentPhysicAvarageCounter;
        studentMathAvarage  = studentMathAvarage / studentMathAvarageCounter;
        studentTurkishAvarage  = studentTurkishAvarage / studentTurkishAvarageCounter;

    }

    void approveStudentToPassClass(){
        // 53 - 90 -> 37 / 6 = 6
        for (Student item: students) {
                 for (Lecture subItem: item.getLectures()){
                     if (subItem.getLessonName() == LectureEnum.fizik.name()){
                         int spaceBetweenNumbers = (physicMaxPoint - studentPhysicAvarage) / PART_SIZE;
                         printResults(studentPhysicAvarage, subItem, spaceBetweenNumbers,item);
                     } else  if (subItem.getLessonName() == LectureEnum.turkce.name()){
                         int spaceBetweenNumbers = (turkishMaxPoint - studentTurkishAvarage) / PART_SIZE;
                         printResults(studentTurkishAvarage, subItem, spaceBetweenNumbers,item);
                     }else {
                         int spaceBetweenNumbers = (mathMaxPoint - studentMathAvarage) / PART_SIZE;
                         printResults(studentMathAvarage, subItem, spaceBetweenNumbers,item);
                     }
                }
        }
    }

    void printResults(int examAvarage, Lecture lecture, int spaceBetweenNumbers, Student student){
        if (lecture.getExamAvg()<50 || lecture.getExamAvg() < examAvarage){
            System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                    lecture.getExamAvg() + " genel ortalama: " + examAvarage +" Derste kaldiniz");
        } else {
            if (lecture.getExamAvg()> examAvarage && lecture.getExamAvg() < (examAvarage +spaceBetweenNumbers)){
                System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                        lecture.getExamAvg() + " genel ortalama: " + examAvarage +" DD ile gectin");
            }else if (lecture.getExamAvg() + spaceBetweenNumbers > examAvarage && lecture.getExamAvg() < (examAvarage +spaceBetweenNumbers*2)){
                System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                        lecture.getExamAvg() + " genel ortalama: " + examAvarage +" DC ile gectin");
            } else if (lecture.getExamAvg() + (spaceBetweenNumbers * 2)> examAvarage && lecture.getExamAvg() < (examAvarage +spaceBetweenNumbers*3)){
                System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                        lecture.getExamAvg() + " genel ortalama: " + examAvarage +" CC ile gectin");
            }else if (lecture.getExamAvg()+ (spaceBetweenNumbers * 3)> examAvarage && lecture.getExamAvg() < (examAvarage +spaceBetweenNumbers*4)){
                System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                        lecture.getExamAvg() + " genel ortalama: " + examAvarage +" BC ile gectin");
            }else if (lecture.getExamAvg() + (spaceBetweenNumbers * 4)> examAvarage && lecture.getExamAvg() < (examAvarage +spaceBetweenNumbers*5)){
                System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                        lecture.getExamAvg() + " genel ortalama: " + examAvarage +" BB ile gectin");
            }else if (lecture.getExamAvg()+ (spaceBetweenNumbers * 5)> examAvarage && lecture.getExamAvg() < (examAvarage +spaceBetweenNumbers*6)){
                System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                        lecture.getExamAvg() + " genel ortalama: " + examAvarage +" BA ile gectin");
            }else {
                System.out.println("adin: " + student.getNameSurname() + " ders adi: "+ lecture.getLessonName() + " senin ortalaman: "  +
                        lecture.getExamAvg() + " genel ortalama: " + examAvarage +" AA ile gectin");
            }
        }
    }
}
