public class Day39{  
public static void main(String args[]){      
for(int i=1; i<=10; i++)  {  
for(int j=1; j<=10-i+1; j++)  {  
System.out.print("*");  
}   
for(int k=1; k<=2*i-2; k++)  {  
System.out.print(" ");  
}   
for(int j=1; j<=10-i+1; j++)  {  
System.out.print("*");  
}   
System.out.println();  
}     
for(int i=9; i>=1; i--)  {  
for(int j=i; j<=10; j++)  {  
System.out.print("*");  
}   
for(int k=1; k<=(2*i)-2; k++)  {  
System.out.print(" ");  
}   
for(int j=i; j<=10; j++)  {  
System.out.print("*");  
}   
System.out.println();  
}  
}   
}  
