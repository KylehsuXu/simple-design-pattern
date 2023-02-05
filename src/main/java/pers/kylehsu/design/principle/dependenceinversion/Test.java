package pers.kylehsu.design.principle.dependenceinversion;


/**
 * Created by Kyle
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Kyle k = new Kyle();
//        k.studyJavaCourse();
//        k.studyFECourse();
//    }

    //v2
//    public static void main(String[] args) {
//        Kyle k = new Kyle();
//        k.studyImoocCourse(new JavaCourse());
//        k.studyImoocCourse(new FECourse());
//        k.studyImoocCourse(new PythonCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        Kyle k = new Kyle(new JavaCourse());
//        k.studyImoocCourse();
//    }
    public static void main(String[] args) {
        Kyle k = new Kyle();
        k.setiCourse(new JavaCourse());
        k.studyImoocCourse();

        k.setiCourse(new FECourse());
        k.studyImoocCourse();

    }


}
