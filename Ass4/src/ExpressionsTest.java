// ID 316044809


import java.util.Map;
import java.util.TreeMap;

/**
 * The class ExpressionsTest.
 */
public class ExpressionsTest {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //(2x) + (sin(4y)) + (e^x).
        Var x = new Var("x");
        Var y = new Var("y");
        Expression e = new Plus(
                new Plus(
                        new Mult(new Num(2), x),
                        new Sin(new Mult(new Num(4), y))
                ),
                new Pow(Const.E, x)
        );
        System.out.println(e);
        //x=2,y=0.25,e=2.71
        Map<String, Double> assign = new TreeMap<>();
        assign.put("x", 2.0);
        assign.put("y", 0.25);
        assign.put("e", 2.71);
        try {
            System.out.println(e.evaluate(assign));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        final Expression diffE = e.differentiate("x");
        System.out.println(diffE);
        try {
            System.out.println(diffE.evaluate(assign));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(diffE.simplify());
    }
}
