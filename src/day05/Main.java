package day05;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    static int intValue;
    static double doubleBalue;
    static String stringValue;
    static boolean booleanValue;

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

        /*
        System.out.println("stringValue: " + stringValue);
        System.out.println("doubleBalue: " + doubleBalue);
        System.out.println("intValue: " + intValue);
        System.out.println("booleanValue: " + booleanValue);
         */

        /*SORULARRRR
        1
        * Kisilerin listesini tutan bir kitabimiz vardir, her kisinin ad, yas, ve ulkesi bu liste icinde yazmaditir.
        Bunu uygun olan bir program yaziniz
        *  */
        /*

        2
        * Bir mahllede aileler bulunmaktadir aileler adresi, ve hanedeki kisileri barindirir.
        * Hanedeki her kisinin ise ad, yas, ve maasi olmaktadir.
        * Bir mahalleyi temsil eden bir kolleksiyon olusturunuz
        *
        * */


    }
}
