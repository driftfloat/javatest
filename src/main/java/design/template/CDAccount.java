package design.template;
/*  Author: kevin
 *	Date: 2018年5月8日
**/
public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }
    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}

