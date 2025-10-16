package rab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author b1 = new Author("Boba","hivahiau@fwnngo",'M');
        System.out.println(b1);

        //String name = b1.getName();
        //System.out.println("Имя: " + name);
        //или
        //System.out.println("Имя: " + b1.getName());

        //b1.setEmail("new_anna@yandex.ru");
        //System.out.println("Новый email: " +b1.getEmail());
    }
}