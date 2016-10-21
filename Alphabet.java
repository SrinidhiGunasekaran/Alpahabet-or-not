import java.lang.*;
import java.io.*;
class Alphabet
{
public static void main(String args[])throws Exception
{
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ch=(char)br.read();
if(((ch>=97)&&(ch<=122))||((ch>=65)&&(ch<=90)))
{
System.out.println("The character is an alphabet");
}
else
{
System.out.println("The character is not an alphabet");
}
}
}
