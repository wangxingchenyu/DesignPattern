package testAlex;


import java.util.Objects;

public class TestArray {
    public TestArray() {
    }

    public static void main(String[] args) {
        //person1
        Person person = new Person();
        person.setEmail("wangzhilei@jd.com");
        person.setId(1);
        person.setUsername("toy");

        // person2
        Person person2 = new Person();
        person2.setEmail("wangzhilei@jd.com");
        person2.setId(2);
        person2.setUsername("toy");

        System.out.println(person.equals(person2));
    }
}


class Person {
    private Integer id;
    private String username;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return person.id == this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email);
    }
}
