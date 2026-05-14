public class student {
    public String Name;
    public String MatNo;
    public String Phone;
    
    public student(String name, String matNo, String phone) {
        this.Name = name;
        this.MatNo = matNo;
        this.Phone = phone;
    }
    
    public void Greet() {
        System.out.println("Hello, my name is " + Name);
    }
    
    public void TakeExam() {
        System.out.println(Name + " is taking an exam");
    }
    
    public static void main(String[] args) {
        student s = new student("Joseph Abel", "EDU2509276 ", "09056424816");
        s.Greet();
        s.TakeExam();
    }
}
