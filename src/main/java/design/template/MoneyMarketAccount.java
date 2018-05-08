package design.template;
/*  Author: kevin
 *	Date: 2018年5月8日
**/
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        
        return "Money Market";
    }
    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}

