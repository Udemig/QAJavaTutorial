package day05;

import java.util.ArrayList;

public class Student {
    private String nameSurname;
    private  int no;
    private ArrayList<Lecture> lectures;

    public Student(String nameSurname, int no, ArrayList<Lecture> lectures) {
        this.nameSurname = nameSurname;
        this.no = no;
        this.lectures = lectures;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }
}
