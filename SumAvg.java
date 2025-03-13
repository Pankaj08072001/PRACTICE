class SumAvg{
public static void main (String args[])
{
int a[] = {21,22,34,20,55,44,63,54};
int sum = 0;
for(int i = 0; i < a.length; i++){
sum = sum + a[i];
}
System.out.println("Average is the array : "+(sum/a.length));
System.out.println("Sum is the array :" +sum);


}


}