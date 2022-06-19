package org.example;

import java.awt.Color; //导入设置颜色的Color
import java.awt.Font; //导入设置字体的Font
import java.text.NumberFormat; //导入数字格式化的NumberFormat
import javax.swing.JFrame; //导入窗体类
import javax.swing.JLabel; //导入标签类
import javax.swing.JTextField; //导入文本框类

public class App {
    //主方法
    public static void main(String[] args) {
        RandomCalc randomCalc = new RandomCalc();
        randomCalc.initUI();
    }
}

class RandomCalc extends JFrame {
    //将1-10个随机数声明为double类型
    double num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
    //将加减乘除声明为double类型
    double add, sub, mul, div;
    //定义标签
    JLabel number1Label = new JLabel();
    JLabel number2Label = new JLabel();
    JLabel number3Label = new JLabel();
    JLabel number4Label = new JLabel();
    JLabel number5Label = new JLabel();
    JLabel number6Label = new JLabel();
    JLabel number7Label = new JLabel();
    JLabel number8Label = new JLabel();
    JLabel number9Label = new JLabel();
    JLabel number10Label = new JLabel();
    JLabel addLabel = new JLabel();
    JLabel subLabel = new JLabel();
    JLabel mulLabel = new JLabel();
    JLabel divLabel = new JLabel();
    //定义文本框
    JTextField number1Textfield = new JTextField();
    JTextField number2Textfield = new JTextField();
    JTextField number3Textfield = new JTextField();
    JTextField number4Textfield = new JTextField();
    JTextField number5Textfield = new JTextField();
    JTextField number6Textfield = new JTextField();
    JTextField number7Textfield = new JTextField();
    JTextField number8Textfield = new JTextField();
    JTextField number9Textfield = new JTextField();
    JTextField number10Textfield = new JTextField();
    JTextField addTextfield = new JTextField();
    JTextField subTextfield = new JTextField();
    JTextField mulTextfield = new JTextField();
    JTextField divTextfield = new JTextField();

    //定义界面显示的方法
    public void initUI() {
        //设置界面大小
        this.setSize(330, 520);
        //设置标题栏
        this.setTitle("SwingCalc");
        //设置默认关闭动作（在关闭界面后退出）
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        /*
         * 未设置Layout时，Java默认为flowLayout布局的，设置为null即为清空布局管理器，
         * 之后添加组件，常常是设置组件左上角坐标相对于容器左上角（0,0）的x，y值来确定组件的位置，
         * 即使更改容器大小也不会改变位置。这种方式常常用于窗口大小固定的容器里。
         */
        this.setLayout(null);
        //设置不可拉伸
        this.setResizable(false);
        //声明字体
        Font font = new Font("宋体", Font.BOLD, 19);

        number1Label.setBounds(15, 10, 40, 40);
        number1Label.setFont(font);
        number1Label.setText("1:");
        this.add(number1Label);
        number1Textfield.setBounds(60, 15, 90, 27);
        number1Textfield.setFont(font);
        number1Textfield.setEditable(false);
        this.add(number1Textfield);

        number2Label.setBounds(15, 40, 40, 40);
        number2Label.setFont(font);
        number2Label.setText("2:");
        this.add(number2Label);
        number2Textfield.setBounds(60, 45, 90, 27);
        number2Textfield.setFont(font);
        number2Textfield.setEditable(false);
        this.add(number2Textfield);

        number3Label.setBounds(15, 70, 40, 40);
        number3Label.setFont(font);
        number3Label.setText("3:");
        this.add(number3Label);
        number3Textfield.setBounds(60, 75, 90, 27);
        number3Textfield.setFont(font);
        number3Textfield.setEditable(false);
        this.add(number3Textfield);

        number4Label.setBounds(15, 100, 40, 40);
        number4Label.setFont(font);
        number4Label.setText("4:");
        this.add(number4Label);
        number4Textfield.setBounds(60, 105, 90, 27);
        number4Textfield.setFont(font);
        number4Textfield.setEditable(false);
        this.add(number4Textfield);

        number5Label.setBounds(15, 130, 40, 40);
        number5Label.setFont(font);
        number5Label.setText("5:");
        this.add(number5Label);
        number5Textfield.setBounds(60, 135, 90, 27);
        number5Textfield.setFont(font);
        number5Textfield.setEditable(false);
        this.add(number5Textfield);

        number6Label.setBounds(15, 160, 40, 40);
        number6Label.setFont(font);
        number6Label.setText("6:");
        this.add(number6Label);
        number6Textfield.setBounds(60, 165, 90, 27);
        number6Textfield.setFont(font);
        number6Textfield.setEditable(false);
        this.add(number6Textfield);

        number7Label.setBounds(15, 190, 40, 40);
        number7Label.setFont(font);
        number7Label.setText("7:");
        this.add(number7Label);
        number7Textfield.setBounds(60, 195, 90, 27);
        number7Textfield.setFont(font);
        number7Textfield.setEditable(false);
        this.add(number7Textfield);

        number8Label.setBounds(15, 220, 40, 40);
        number8Label.setFont(font);
        number8Label.setText("8:");
        this.add(number8Label);
        number8Textfield.setBounds(60, 225, 90, 27);
        number8Textfield.setFont(font);
        number8Textfield.setEditable(false);
        this.add(number8Textfield);

        number9Label.setBounds(15, 250, 40, 40);
        number9Label.setFont(font);
        number9Label.setText("9:");
        this.add(number9Label);
        number9Textfield.setBounds(60, 255, 90, 27);
        number9Textfield.setFont(font);
        number9Textfield.setEditable(false);
        this.add(number9Textfield);

        number10Label.setBounds(15, 280, 45, 45);
        number10Label.setFont(font);
        number10Label.setText("10:");
        this.add(number10Label);
        number10Textfield.setBounds(60, 285, 90, 27);
        number10Textfield.setFont(font);
        number10Textfield.setEditable(false);
        this.add(number10Textfield);

        addLabel.setBounds(15, 330, 40, 40);
        addLabel.setFont(font);
        addLabel.setText("Add:");
        this.add(addLabel);
        addTextfield.setBounds(60, 335, 90, 27);
        addTextfield.setFont(font);
        addTextfield.setBackground(Color.decode("#FF8000"));
        addTextfield.setEditable(false);
        this.add(addTextfield);

        subLabel.setBounds(15, 360, 45, 45);
        subLabel.setFont(font);
        subLabel.setText("Sub:");
        this.add(subLabel);
        subTextfield.setBounds(60, 365, 90, 27);
        subTextfield.setFont(font);
        subTextfield.setBackground(Color.decode("#00FF00"));
        subTextfield.setEditable(false);
        this.add(subTextfield);

        mulLabel.setBounds(15, 390, 45, 45);
        mulLabel.setFont(font);
        mulLabel.setText("Mul:");
        this.add(mulLabel);
        mulTextfield.setBounds(60, 395, 90, 27);
        mulTextfield.setFont(font);
        mulTextfield.setBackground(Color.decode("#FF8000"));
        mulTextfield.setEditable(false);
        this.add(mulTextfield);

        divLabel.setBounds(15, 420, 45, 45);
        divLabel.setFont(font);
        divLabel.setText("Div:");
        this.add(divLabel);
        divTextfield.setBounds(60, 425, 90, 27);
        divTextfield.setFont(font);
        divTextfield.setBackground(Color.decode("#00FF00"));
        divTextfield.setEditable(false);
        this.add(divTextfield);

        //调用生成随机数方法
        calc();
        this.setVisible(true);
    }

    //声明一个生成随机数方法
    public void calc() {
        //声明最大值和最小值
        double max = 1.5, min = 0.95;

        //声明结果取小数点后2位
        NumberFormat numberFormat2 = NumberFormat.getNumberInstance();
        numberFormat2.setMaximumFractionDigits(2);

        //生成随机数
        num1 = Math.random() * (max - min) + min;
        num2 = Math.random() * (max - min) + min;
        num3 = Math.random() * (max - min) + min;
        num4 = Math.random() * (max - min) + min;
        num5 = Math.random() * (max - min) + min;
        num6 = Math.random() * (max - min) + min;
        num7 = Math.random() * (max - min) + min;
        num8 = Math.random() * (max - min) + min;
        num9 = Math.random() * (max - min) + min;
        num10 = Math.random() * (max - min) + min;

        //将生成的随机数取小数点后2位
        num1 = Double.parseDouble(numberFormat2.format(num1));
        num2 = Double.parseDouble(numberFormat2.format(num2));
        num3 = Double.parseDouble(numberFormat2.format(num3));
        num4 = Double.parseDouble(numberFormat2.format(num4));
        num5 = Double.parseDouble(numberFormat2.format(num5));
        num6 = Double.parseDouble(numberFormat2.format(num6));
        num7 = Double.parseDouble(numberFormat2.format(num7));
        num8 = Double.parseDouble(numberFormat2.format(num8));
        num9 = Double.parseDouble(numberFormat2.format(num9));
        num10 = Double.parseDouble(numberFormat2.format(num10));

        //计算加减乘除
        add = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        sub = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;
        mul = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
        div = num1 / num2 / num3 / num4 / num5 / num6 / num7 / num8 / num9 / num10;

        //将结果取小数点后2位
        add = Double.parseDouble(numberFormat2.format(add));
        sub = Double.parseDouble(numberFormat2.format(sub));
        mul = Double.parseDouble(numberFormat2.format(mul));
        div = Double.parseDouble(numberFormat2.format(div));

        //将结果显示到窗体里
        number1Textfield.setText(String.valueOf(num1));
        number2Textfield.setText(String.valueOf(num2));
        number3Textfield.setText(String.valueOf(num3));
        number4Textfield.setText(String.valueOf(num4));
        number5Textfield.setText(String.valueOf(num5));
        number6Textfield.setText(String.valueOf(num6));
        number7Textfield.setText(String.valueOf(num7));
        number8Textfield.setText(String.valueOf(num8));
        number9Textfield.setText(String.valueOf(num9));
        number10Textfield.setText(String.valueOf(num10));
        addTextfield.setText(String.valueOf(add));
        subTextfield.setText(String.valueOf(sub));
        mulTextfield.setText(String.valueOf(mul));
        divTextfield.setText(String.valueOf(div));
    }
}
