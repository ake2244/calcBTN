package com.calcBTN.calcBTN;

import java.util.Objects;

public class Greeting {

    private int num1, num2, num3;
    private String content;

    public int getNum1() {
            return num1;
        }

    public int getNum2() {
        return num2;
    }

    public String getContent() {
        return content;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNum3() {
        try {
            if (Objects.equals(content, "-")) {
                return num3 = num1 - num2;
            } else if (Objects.equals(content, "+")) {
                return num3 = num1 + num2;
            } else if (Objects.equals(content, "*")) {
                return num3 = num1 * num2;
            } else if (Objects.equals(content, "/")) {
                return num3 = num1 / num2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}