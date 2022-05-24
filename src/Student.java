public class Student extends Person{
    
    private int studyCredit;

    public Student(String name, String address) {
        super(name, address);
        this.studyCredit = 0;
    }

    public int credits() {
        return this.studyCredit;
    }

    public void study() {
        studyCredit++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + " Study credits: " + this.studyCredit;
    }
}
