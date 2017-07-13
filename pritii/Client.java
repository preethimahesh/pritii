 class AccountCreation {
 
    private static AccountCreation instance;
 
    private AccountCreation(){
       //Private Constructor
    }
 
    public  static AccountCreation getInstance()
    {
           if (instance==null)
           {
              instance = new AccountCreation();
              System.out.println("AccountCreation Class Object creatred...!!!");
           }
          else{
              System.out.println("AccountCreation Class Object not Creatred just returned Created one...!!!");
          }
              return instance;
       }
 
       public void create(int no)
       {
          System.out.println("Account Created Successfully, with Number:" +no);
       }
 
}
 class Client {
 
  public static void main(String[] args)
  {
 
      AccountCreation tc = AccountCreation.getInstance();
      AccountCreation tc1 = AccountCreation.getInstance();
 
      tc.create(12345);
      tc1.create(67891);
 
  }
}