import java.util.Scanner;
public class Teaching {
public static double w1;
public static double w2;
public static double w3;
public static double c=0.01;
public static double feedforward(int []inputs)
{
System.out.println("feed");
double sum=0;
sum=w1*inputs[0]+w2*inputs[1]+w3*inputs[2];
return sum;
}
public static void learning(int [][]inputs,int []outputs)
{
for(int i=0;i<3;i++)
{
double guess=feedforward(inputs[i]);
System.out.println(guess);
double error=outputs[i]-guess;
System.out.println(error);
if(error<=0||error>=0.1)
{
w1+=c*error*inputs[i][0];
w2+=c*error*inputs[i][1];
w3+=c*error*inputs[i][2];
}
else break;
}
}
public static void activation(double sum)
{
System.out.println("activation");
if( Math.round(sum)==1)
System.out.println("Bad");
else if( Math.round(sum)==2)
System.out.println("Good");
else if( Math.round(sum)==3)
System.out.println("Excellent");
else
System.out.println(sum);
}
public static void main(String[] args) {
w1=Math.random();
w2=Math.random();
w3=Math.random();
int[][] inputs = new int[][]{{0,2,0},{1,5,1},{1,3,1}};
int []outputs=new int[]{1,2,3};
learning(inputs,outputs);
Scanner dd = new Scanner(System.in);
int[] inputs1 = new int[3];
System.out.println("Enter teachers speaking ability,average student ratings,punctuality");
for(int i = 0; i < 3; i++) {
inputs1[i]= dd.nextInt();

}
double sum=feedforward(inputs1);
activation(sum);
}
}