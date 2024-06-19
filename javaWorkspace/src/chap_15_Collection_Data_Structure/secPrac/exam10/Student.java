package chap_15_Collection_Data_Structure.secPrac.exam10;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score){
        this.id = id;
        this.score = score;
    }

    // Student 의 score필드값 기준을 자동 정렬되게
    // TreeSet 의 last() 메소드를 호출했을 때 가장 높은 score의 id가 리턴 되도록
    @Override
    public int compareTo(Student o){
        if(score < o.score) return -1;
        else if(score == o.score) return 0;
        else return 1;

    }
}
