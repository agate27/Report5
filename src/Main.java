public class Main {
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            //例外状況のエラーメッセージを出力
            System.out.println("例外が発生しました。null以外で初期化してください。");
            System.out.println(e.getMessage());
        }
        System.out.println("処理が終了しました"); 
    }
}
