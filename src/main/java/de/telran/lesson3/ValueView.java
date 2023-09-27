package de.telran.lesson3;

public class ValueView{
    static int classInt; // пишется цифры (..classInt = 22; )-> если неуказонно то будет песатся (..null)
    static String classStr; // пишется слова (...classStr="Lena"; )-> если неуказонно то будет песатся (..null)
    static Integer classIntObj; // пишется цифры (..classIntObj = 200; )-> если неуказонно то будет песатся (..null)

    public static void main(String[] args) {
        int myInt = 120;
        System.out.println(myInt);

        int myInt2;
        myInt2 = 11;
        System.out.println(myInt2);

        String myStr = "Milch"; // "", null
        System.out.println(myStr);

        System.out.println("classStr = " + classStr); // потомушто верху неуказонно (static String classStr..;)
        System.out.println("classIntObj = "+ classIntObj); // потомушто верху неуказонно ( classIntObj..; )

        classIntObj =255;
        System.out.println("classIntObj = "+ classIntObj);

        System.out.println(classInt); // потомушто всамом верху не указоно чесло " = 2;"
        classInt = 200;

       printValue();  // чтобы другой метод начал работал надо дать вызов следошего метода, -> после программа вернётся и начнёт
                        // c classInt =15;

        classInt = 15;
        System.out.println(classInt);
    }

    // 2.Метод лакальная переменная {}

    static void printValue(){
        int myInt = 18;
        System.out.println(myInt);

    }
}
