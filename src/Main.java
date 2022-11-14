public class Main {
    public static void main(String[] args) {
//        String phone = "+91232323";
//        phone = phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        if (phone.length() == 10) {
//            phone = "7" + phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException("телефон слишком длинный");
//        } else if (phone.length() <10) {
//            throw new RuntimeException("телефон слишком короткий");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("иноагент");
//        }
//
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79161232323";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("success");
//        } else {
//            System.out.println("fail");
//        }

        // задание 1
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName =  lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // задание 3
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}