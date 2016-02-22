package com.synisys.trainings.interpreter;

/**
 * Created by emil on 2/22/16.
 */
public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//instantiate the context
		Context ctx = new Context();
		ctx.assign("a", 15);
		ctx.assign("b", 40);
		ctx.assign("c", 30);
		ctx.assign("d", 10);


		calc.setExpression("(a+b)*(c-d)");


		calc.setContext(ctx);


		System.out.println(" Result = " + calc.evaluate());
	}
}
