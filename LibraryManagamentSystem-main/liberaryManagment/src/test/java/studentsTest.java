import static org.junit.jupiter.api.Assertions.*;

class studentsTest {
students s=new students();
    @org.junit.jupiter.api.Test
    void isStudent() {
        Student s1=new Student("1","John Doe");
        int res=s.isStudent();
        assertEquals(-1,res);
    }
}