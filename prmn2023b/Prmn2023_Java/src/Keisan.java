public class Keisan {
    int goukei(int[] num){
        int sum = 0;
        for(int i = 0;i < 5;i++){
            sum = sum + num[i];
        }
        return sum;
    }

    void hanbetsu(int n){
        System.out.println("合計値:" + n);
        if(n >= 100){
            System.out.println("great!!");
        }
        else if(n >= 50){
            System.out.println("big");
        }
        else{
            System.out.println("small");
        }
    }
}
