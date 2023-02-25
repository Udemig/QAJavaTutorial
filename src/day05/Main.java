package day05;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        /*
        FilesExample filesExample = new FilesExample();
        filesExample.createFile();
        filesExample.writeToFile();
        filesExample.readFile();
        filesExample.deleteFile();


        Examples examples = new Examples();
        examples.reverseString();
         */

        ExamExample examExample = new ExamExample();
        examExample.defineLecturesAndStudents();
        examExample.calcExamAvarageByStudent();
        examExample.calcClassAvarage();
        examExample.approveStudentToPassClass();



    }
}
