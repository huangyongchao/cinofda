package com.adfonic.adserver.financial;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.adfonic.domain.AdAction;

public class ManagedCPC_NONrtbTest {

    ManagedCPC_NONrtb testObj = new ManagedCPC_NONrtb();
    private double accuracy = 1e-10;

    @Test 
    public void unknownAction() {
        Input input = new Input();
        input.adAction = AdAction.BID_FAILED;
        
        // act
        Output out = testObj.calculate(input);
        
        Assert.assertEquals(0, out.payout, accuracy);
        Assert.assertEquals(0, out.buyer_premium, accuracy);
        Assert.assertEquals(0, out.direct_cost, accuracy);
        Assert.assertEquals(0, out.tech_fee, accuracy);
        Assert.assertEquals(0, out.data_fee, accuracy);
        Assert.assertEquals(0, out.third_pas_fee, accuracy);
        Assert.assertEquals(0, out.dsp_margin, accuracy);
        Assert.assertEquals(0, out.cust_margin, accuracy);
        Assert.assertEquals(0, out.campaign_discount, accuracy);
        Assert.assertEquals(0, out.accounting_cost, accuracy);
    }
    
    @Test
    public void testAdServed37() {

        Input input = new Input();
        input.adAction = AdAction.AD_SERVED;
        input.settlementPrice = null;
         input. publisherRevShare =0.30;
         input. buyerPremium = 0.0;
         input. directCost =0.0;
         input. mediaCostMarkup = 0.0;
        input.marginShareDSP = 1.0;
        input.dataFee = 0.0;
        input. richMediaFee = 0.0;
        input.campaignDiscount = 0.0;
        input.bidAmout = 0.05;

        // act
        Output out = testObj.adServed(input);

        Assert.assertEquals(0, out.payout, accuracy);
        Assert.assertEquals(0, out.buyer_premium, accuracy);
        Assert.assertEquals(0, out.direct_cost, accuracy);
        Assert.assertEquals(0, out.tech_fee, accuracy);
        Assert.assertEquals(0, out.data_fee, accuracy);
        Assert.assertEquals(0, out.third_pas_fee, accuracy);
        Assert.assertEquals(0, out.dsp_margin, accuracy);
        Assert.assertEquals(0, out.cust_margin, accuracy);
        Assert.assertEquals(0, out.campaign_discount, accuracy);
        Assert.assertEquals(0, out.accounting_cost, accuracy);
    }

  
    //------------------------------------------------------------
    @Test
    public void testClick46() {
        
        Input input = new Input();
        input.adAction = AdAction.CLICK;
        input.settlementPrice = null;
        input. publisherRevShare = 0.30;
        input. buyerPremium = 0.0;
        input. directCost = 0.0;
        input. mediaCostMarkup = 0.0;
        input.marginShareDSP = 1.0;
        input.dataFee = 0.0;
        input. richMediaFee = 0.0;
        input.campaignDiscount = 0.0;
        input.bidAmout = 0.05;
        
        // act
        Output out = testObj.click(input);
        
        Assert.assertEquals(0.015, out.payout, accuracy);
        Assert.assertEquals(0, out.buyer_premium, accuracy);
        Assert.assertEquals(0, out.direct_cost, accuracy);
        Assert.assertEquals(0, out.tech_fee, accuracy);
        Assert.assertEquals(0, out.data_fee, accuracy);
        Assert.assertEquals(0, out.third_pas_fee, accuracy);
        Assert.assertEquals(0.035, out.dsp_margin, accuracy);
        Assert.assertEquals(0, out.cust_margin, accuracy);
        Assert.assertEquals(0, out.campaign_discount, accuracy);
        Assert.assertEquals(0.05, out.accounting_cost, accuracy);
    }
    
  //------------------------------------------------------------
    
    @Test
    public void csvAdServed() throws IOException{
        new TestHelper().testCSV(testObj, "Managed CPC on NonRTB-AD_SERVED.csv", AdAction.AD_SERVED);
    }
    
    @Test
    public void csvClick() throws IOException{
        new TestHelper().testCSV(testObj,"Managed CPC on NonRTB-CLICK.csv", AdAction.CLICK);
    }
    

}