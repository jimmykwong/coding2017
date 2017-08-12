package com.coderising.ood.payroll.method;

import com.coderising.ood.payroll.Paycheck;
import com.coderising.ood.payroll.db.MockDB;

/**
 * @author nvarchar
 *         date 2017/7/10
 */
public class HoldMethod implements PaymentMethod {

    @Override
    public void pay(Paycheck pc, int employId) {
        //hold the paycheck
        System.out.println("hold paycheck " + employId);
        MockDB.put(employId, pc);
    }
}
