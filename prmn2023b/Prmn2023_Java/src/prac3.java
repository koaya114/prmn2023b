public class prac3 {
    public static void main(String[] args) {
        String[][] gakuseki = new String[2][5];

        for(int i = 0;i < 5;i++){
            gakuseki[0][i] = "B222000" + i;
        }

        for(int i = 0;i < 5;i++){
            gakuseki[1][i] = "abcd" + i + "efgh";
        }

        Gakuseki2 g2 = new Gakuseki2();

        g2.teigi(gakuseki);

        g2.hantei();
    }
}
