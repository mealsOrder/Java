package chap_15_Collection_Data_Structure.secPrac.exam08;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum,String name){
        this.studentNum = studentNum;
        this.name = name;
    }

    // 학번이 같으면 중복 저장 되지 않도록
    // 여기에 정답 작성
    @Override
    public int hashCode(){
        return studentNum;
    }
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Student)) return false;
        Student student = (Student) object;
        if(studentNum != student.studentNum) return false;
        return true;
    }
}
