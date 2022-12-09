public class Customer
{
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String n)
    {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public String billNotice(double amount)
    {
        String str = name + ", account number " + currAccNum + ", please pay $" + amount;
        return str;
    }

    public static int getNextAccNum()
    {
        return nextAccNum;
    }

    public void updateName(String newName)
    {
        name = newName;
    }

}