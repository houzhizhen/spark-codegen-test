package com.baidu.spark.codegen;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;

import java.lang.reflect.InvocationTargetException;

public class ScriptTest {
  public static void main(String[] args) throws CompileException, InvocationTargetException {
    ScriptEvaluator se = new ScriptEvaluator();
    se.cook(
        new StringBuilder()
            .append("static void method1() {\n")
            .append("     System.out.println(1);\n")
            .append("}\n")
            .append("method1();\n")
            .append("method2();\n")
            .append("\n")
            .append("static void method2() {\n")
            .append("     System.out.println(2);\n")
            .append("}\n")
            .toString()
        );
    se.evaluate(new Object[0]);
  }
}
