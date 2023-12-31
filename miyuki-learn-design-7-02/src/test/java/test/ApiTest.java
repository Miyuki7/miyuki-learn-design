package test;

import com.miyuki.learn.design.pay.channel.Pay;
import com.miyuki.learn.design.pay.channel.WxPay;
import com.miyuki.learn.design.pay.channel.ZfbPay;
import com.miyuki.learn.design.pay.mode.PayFaceMode;
import com.miyuki.learn.design.pay.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_pay() {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));

    }

}
