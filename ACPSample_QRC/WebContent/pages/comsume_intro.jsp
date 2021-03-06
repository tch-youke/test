<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div style="font-size: 13px" >

<br>
<b>
被扫场景交易流程：获取二维码qrNo（测试环境可从<a href="https://open.unionpay.com/ajweb/help/qrcodeFormPage" target="_blank">二维码仿真</a>获取）发起二维码消费，消费成功后可以做后续的退货，撤销交易<br><br>
主扫场景交易流程：调用申请二维码交易获取qrCode，（测试环境可以将申请到的二维码qrCode在<a href="https://open.unionpay.com/ajweb/help/qrcodeFormPage" target="_blank">二维码仿真</a>发起付款交易，付款完成后才能测试后续的退货，撤销等交易） <br><br>
支付成功后，后续可以做退货，消费撤销，对账文件下载交易；为了确认消费，退货，消费撤销交易是否成功也可以开发交易状态查询交易<br><br>
</b>

<a href="https://open.unionpay.com/ajweb/help/faq/list?id=154&level=0&from=1" target="_blank">二维码支付问题点这里</a><br><br>

【重要提醒】<br>
请注意消费，退货和消费撤销是异步接口，同步应答respCode=00仅代表受理成功，需用查询接口的origRespCode和通知接口的respCode判断。<br>
<br>
交易状态查询说明：<br>
origrespcode=00成功，03、04、05重新查询，其他为失败。<br><br>


<a href="https://open.unionpay.com/ajweb/help/faq/list?id=9&level=0&from=0" target="_blank">消费撤销和退货有什么区别？</a><br>
<a href="https://open.unionpay.com/ajweb/help/faq/list?id=120&level=0&from=0" target="_blank">退款类交易的手续费如何收取？</a><br>
<br>
对账文件什么时候能下载？<br>
一般早上9点后出，文件内包含的交易的时间范围是23:00-23:00。<br><br>
对账文件获取后会落地成一个zip文件，zip文件中的ZM，ZME文件各个字段的拆分解析可以参考DemoBase.java中的parseZMFile parseZMEFile 方法。<br>

</div>
<br>
<br>