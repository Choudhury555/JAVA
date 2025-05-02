package BASIC;

public class MultiplicationTable {
    void print(){
        print(5);
    }

    void print(int table){
        print(table,1,10);
    }

    void print(int table,int start,int end){
        for (int i = start; i <=end  ; i++) {
            System.out.printf("%d * %d = %d",table,i,table*i).println();
        }
    }
}
