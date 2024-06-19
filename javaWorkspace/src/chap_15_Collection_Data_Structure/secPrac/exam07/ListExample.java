package chap_15_Collection_Data_Structure.secPrac.exam07;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for(Board o : list){
            System.out.println(o.getTitle()+"-"+o.getContent());
        }
    }
}
