package itmo.java.basics.lab3.task1;

/*
    1 - Дописать в класс «Study» конструктор,
        принимающий один параметр и устанавливающий значение этого параметра в поле «course».
    2 - Создать объект класса «Study».
    3 - В качестве значения для поля «course» установить текст: «Изучение Java - это просто!».
    4 - Обратиться к методу «printCourse» для вывода значения поля «course».
*/

class Study {

    private String course;

    //TODO
    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        //TODO
        Study study = new Study("Изучение Java - это просто! (нет)");
        System.out.println(study.printCourse());
    }
}
