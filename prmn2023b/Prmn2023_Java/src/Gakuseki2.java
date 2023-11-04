import java.util.Scanner;

public class Gakuseki2 {

    String[][] id = new String[2][5];

    void teigi(String[][] array){
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 5;j++){
                id[i][j] = array[i][j];
            }
        }
    }

    void hantei(){
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください:");
        String s = scan.next();
        for(int i = 0;i < 5;i++){
            if(id[0][i].equals(s)){
                System.out.print("パスワードを入力してください:");
                String number = scan.next();
                if(id[1][i].equals(number)){
                    System.out.println("ログイン完了");
                    System.exit(0);
                }
                else{
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }




}
