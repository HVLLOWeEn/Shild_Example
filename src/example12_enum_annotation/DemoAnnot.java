package example12_enum_annotation;

/**
 * Created by romansynovets on 6/15/17.
 */
@interface MyAnno {String str(); int val();}

public class DemoAnnot {
    // аннотирование метода
    @MyAnno(str = "Пример аннотации", val = 10)
    public static void myMeth(String[] args) {
         //.
    }


}
