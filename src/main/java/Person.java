public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = 0;
    }

    public void setName(String name) {
        this.name = "";
    }

    public void setAge(int age){
        if (age < 0){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return "";
    }

    public int getAge() {
        return 0;
    }

    public String reverseName(String name){
        return "";
        //return new StringBuilder(name).reverse().toString();
    }
}
