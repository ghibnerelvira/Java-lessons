package de.telran.lesson6;

public class Auto {

    // относится к (1.) возможности
    String model;
    public int year;
    int mileage;
    String color;

    // чтобы показать в консоль
    void run(){
        System.out.println(model+" год выпуска "+year+" с пробегом "+mileage+" ЕДЕТ! ");
    }

    void turn() {

        System.out.println(model+" год выпуска "+year+" с пробегом "+mileage+" ПОВЕРНУЛ! ");
    }



    // 1. возможность -> ( по умолчанию -> auto как прописанно в cjnstructorSimple)
    Auto(){                // как инструкция
        model = null;
        year= 0;
        mileage= 0;
    }


    // 2. возможность -> (1 аргумента)
    Auto(String argModel){ // инструкция которая показывает как надо в результате
        model = argModel;
    }

    // 3. возможность -> (2 аргумента)
    Auto(String argModel, int argYear){
        model = argModel;
        year = argYear;
    }


    // 4. возможность конструктора с помошью (this)-> (3 и больше аргумента)
    // принадлежит текушему обьекту
    public Auto(String model, int year, int mileage) {  // параметыр -> вид и количество
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    // public указать чтобы было видно в Lesson 14

    // Для  Lesson 14
    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
