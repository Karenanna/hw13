public class Main {
    public static void main(String[] args) {
        System.out.println("//Задание 1");
        String firstName = "Ivan";
        System.out.println("Ivan");
        String middleName = "Ivanovich";
        System.out.println("Ivanovich");
        String lastName = "Ivanov";
        System.out.println("Ivanov");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("//Задание 2");

        String name = "Ivanov Ivan Ivanovich";
        String upperFullName = name.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

        System.out.println("// Задание 3");
        String full = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника-" + full.replace("ё", "e"));
    }
}







