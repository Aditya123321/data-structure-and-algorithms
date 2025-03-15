package practice.java.backtracking;

public class MazePath {

    public static void main(String[] args) {
        int n =3;
        int m =3;
        printPath(0,0,n-1,m-1,"");
    }
    /*
    * cr - current row
    * cc - current column
    * er - end row
    * ec - end column
    * */
    public static void printPath(int cr, int cc, int er, int ec, String ans) {
        if(cr == er && cc ==ec){
            System.out.println(ans);
            return;
        }
        if(cc>ec || cr>er) {
            return;
        }
        printPath(cr,cc+1,er,ec, ans+"H");
        printPath(cr+1,cc,er,ec, ans+"V");
    }
}
