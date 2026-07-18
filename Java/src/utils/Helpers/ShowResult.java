package utils.Helpers;

public class ShowResult {
    public static void showResult(boolean isValid,String type){
        System.out.println(
                ( isValid ? "✔" : "❌") + type + (isValid ? " hợp lệ!" : " không hợp lệ!")
        );
    }
}
