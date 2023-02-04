package Day01;

public class LoopExample {

    String[] selamla = {"merhaba","nasilsiniz","ne yaptiniz"};
    String[] arabalar;
    public void runWhileLoop(){
        int i = 1;
        while ( i < 5){
            System.out.println("i " + i);
            i++;
        }
    }

    public void runDoWhileLoop(){
        int j = 1;
        do{
            System.out.println("j " + j);
            j++;
        }while (j < 5);
    }

    public void runForLoop(){
        int k;

        for (k = 0; k<5; k = k +2){
            if (k==2) break;
            System.out.println("k " + k);
        }

        int i;
        for (i = 0; i<5; i++){
            if (i==1) continue;
            System.out.println("i " + i);
        }
    }

    public void runForEachLoop(){
        for (String item: selamla){
            System.out.println(item);
        }
    }
}
