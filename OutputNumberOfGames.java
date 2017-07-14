/**
 * あなたは1対1で戦う競技の大会を開くことにしました。N 人の選手で総当り対戦を行う場合
 * 何回の対戦が行われるか出力して下さい。N 人の総当り戦では N 人がそれぞれ自分自身以外と対戦します。
 *
 *
 */
import java.io.*;
/**
 * 入力されたプレイヤーの数から総当たりの試合数を導くクラスです
 *
 *
 */

public class OutputNumberOfGames {
    /**
     * プレイヤーの人数の入力を促し、総試合数を導く計算を行うメソッド
     *
     *
     */
    public static void main(String[] args) throws IOException {
        System.out.println("数字を一つだけ入力してください");
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        OutputNumberOfGames game = new OutputNumberOfGames();
        boolean isNumber = false;
        String input = null;

        //入力を促し、数字が規定の範囲内に収まっているか確認する、収まっていない場合は入力を繰り返させる
        while (!isNumber) {
            input = bufferedreader.readLine().trim();
            isNumber = game.hasNumber(input);
        }

        int player = Integer.parseInt(input);
        //総試合数を割り出します
        int games = ((player-1) * player);
        int totalgames = games-(games/2);


        System.out.println(player + "人の場合の総試合数は、" + totalgames + "試合です。");
        System.out.println("test");
    }

    /**
     * 数に直すことが可能かチェックするメソッド。
     * 可能であれば,2~100の範囲に収まっているか確認
     *
     * @param String recieve
     * @return 指定の範囲外の場合にfalseを返す
     *
     */
    public boolean hasNumber(String recieve) {
        try {
            //数字に直す
            int player = Integer.parseInt(recieve);
            //playerが2~100の範囲か確認する
            if (2 <= player && player <= 100) {
                return true;
            }
            else {
                System.out.println("入力が不正です");
                return false;
            }
        }
        //数字以外が入力された場合に入る文
        catch (NumberFormatException e) {
            System.out.println("入力が不正です");
            return false;
        }
    }

}
