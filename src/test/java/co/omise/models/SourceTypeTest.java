package co.omise.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SourceTypeTest {

    @Test
    public void checkStringValue() {
        assertEquals("internet_banking_bay", SourceType.InternetBankingBay.toString());
        assertEquals("internet_banking_ktb", SourceType.InternetBankingKtb.toString());
        assertEquals("internet_banking_bbl", SourceType.InternetBankingBbl.toString());
        assertEquals("internet_banking_scb", SourceType.InternetBankingScb.toString());
        assertEquals("bill_payment_tesco_lotus", SourceType.BillPaymentTescoLotus.toString());
        assertEquals("alipay", SourceType.Alipay.toString());
        assertEquals("virtual_account_sinarmas", SourceType.VirtualAccountSinarmas.toString());
    }
}
