package nc.bs.ic.transportinvoice.ace.bp;

import nc.bs.ic.transportinvoice.plugin.bpplugin.Ic_invoicePluginPoint;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;

import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;


/**
 * 标准单据删除BP
 */
public class AceIc_invoiceDeleteBP {

	public void delete(AggIc_invoice_h[] bills) {

		DeleteBPTemplate<AggIc_invoice_h> bp = new DeleteBPTemplate<AggIc_invoice_h>(
				Ic_invoicePluginPoint.DELETE);
		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggIc_invoice_h> processer) {
		// TODO 前规则
		IRule<AggIc_invoice_h> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
		processer.addBeforeRule(rule);
	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggIc_invoice_h> processer) {
		// TODO 后规则

	}
}
