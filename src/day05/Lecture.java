package day05;

public class Lecture {
    private String lessonName;
    private int firstExamResult;
    private int secondExamResult;
    private int examAvg;

    public Lecture(String lessonName, int firstExamResult, int secondExamResult) {
        this.lessonName = lessonName;
        this.firstExamResult = firstExamResult;
        this.secondExamResult = secondExamResult;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getFirstExamResult() {
        return firstExamResult;
    }

    public void setFirstExamResult(int firstExamResult) {
        this.firstExamResult = firstExamResult;
    }

    public int getSecondExamResult() {
        return secondExamResult;
    }

    public void setSecondExamResult(int secondExamResult) {
        this.secondExamResult = secondExamResult;
    }

    public int getExamAvg() {
        return examAvg;
    }

    public void setExamAvg(int examAvg) {
        this.examAvg = examAvg;
    }
}
