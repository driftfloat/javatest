package design.template;
/*  Author: kevin
 *	Date: 2018年5月8日
**/
public class Client {

    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("活期账号的利息数额为：" + account.calculateInterest());
        
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
        
    }

}
