package demo;




import java.util.regex.*;
class player {
public static void main(String[] args) {
Pattern p = Pattern.compile(args[0]);
Matcher m = p.matcher(args[1]);
boolean b = false;
while(b = m.find()) {
System.out.print(m.start() + m.group());
}
}
//And the command line:
//java player ""\d*"" ab34ef
//What is the result?"

