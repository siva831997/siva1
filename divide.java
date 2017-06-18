class de
{
public static void main(String[] args)
{

int[] a=new int[11];
int b=5,f=0,d=0,e=0;
int r=0,i=0;

for(i=0;i<b;i++)
{
a[i]=Integer.parseInt(args[i]);
 f+=a[i];
}
for(i=0;i<b-1&&r==0;i++)
{
d=(d+a[i])/(i+1);
e=(f-a[i])/(b-1);
if(d==e){
r=i;}
}
if(r==0){
System.out.println("no possible");}
else
{for(i=0;i<=r;i++){
System.out.print(" "+a[i]);
}
System.out.println();
for(i=r+1;i<b;i++){
System.out.print(" "+a[i]);}}
}}
