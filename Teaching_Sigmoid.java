import java.util.Scanner;
public class Teaching_Sigmoid {
public static double w[]={Math.random(),Math.random(),Math.random()};
public static double c=0.01;
public static double feedforward(int []inputs)
{
System.out.println("feed");
double sum=0;
for(int i=0;i<3;i++)
{
sum+=(1/(1+(Math.exp(-inputs[i]*w[i]))));
System.out.println("Sum"+sum);
}
return sum;
}
public static void learning(int [][]inputs,double []outputs)
{
for(int i=0;i<3;i++)
{
double guess=feedforward(inputs[i]);
System.out.println("Guess "+i+" "+guess);
double error=outputs[i]-guess;
System.out.println(error);
if(error<=0||error>=0.1)
{
w[0]+=0.25+c*error*inputs[i][0];
w[1]+=0.5+c*error*inputs[i][1];
w[2]+=0.25+c*error*inputs[i][2];
}
else break;
}
}
public static void activation(double sum)
{
sum=sum*10;
int x=(int)sum;
System.out.println("activation");
if((x)<19)
System.out.println("Bad "+x);
else if(x==19)
System.out.println("Good "+x);
else if( x>=20)
System.out.println("Excellent "+x);
else
System.out.println(x);
}
public static void main(String[] args) {
int[][] inputs = new int[][]{{0,2,0},{1,5,1},{1,3,1}};
double []outputs=new double[]{1.0,3.0,2.0};
learning(inputs,outputs);
Scanner dd = new Scanner(System.in);
int[] inputs1 = new int[3];
System.out.println("Enter number of inputs");
int n=dd.nextInt();
for(int j=0;j<n;j++)
{
System.out.println("Enter teachers speaking ability,average student ratings,punctuality");
for(int i = 0; i < 3; i++) {

inputs1[i]= dd.nextInt();
}
double sum=feedforward(inputs1);
activation(sum);
}
}
}