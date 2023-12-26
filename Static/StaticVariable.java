class StaticV{
    static int c=0;
    public StaticV(){
        c++;
        System.out.println("The count value is : "+c);
    }
}
public class Main
{
	public static void main(String[] args) {
		StaticV n1 = new StaticV();
		StaticV n2 = new StaticV();
		StaticV n3 = new StaticV();
	}
}
/*
The count value is : 1
The count value is : 2
The count value is : 3
*/
/*
when static is removed..ouput is:
The count value is : 1
The count value is : 1
The count value is : 1
*/
