package com.baidu.spark.codegen;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ExpressionEvaluator;

import java.lang.reflect.InvocationTargetException;

public class ExpressionTest {
  public static void main(String[] args) throws CompileException, InvocationTargetException {
    ExpressionEvaluator ee = new ExpressionEvaluator();
    ee.setParameters(new String[]{"a", "b"}, new Class[]{int.class, int.class});
    ee.setExpressionType(int.class);
    ee.cook("a + b");
    int result = (Integer) ee.evaluate(new Object[]{19, 23});
    System.out.println(result);
  }
}
