package nc.impl.ic;

import nc.impl.pub.ace.AceIc_invoicePubServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.itf.ic.IIc_invoiceMaintain;
import nc.vo.pub.BusinessException;

public class Ic_invoiceMaintainImpl extends AceIc_invoicePubServiceImpl
		implements IIc_invoiceMaintain {

	@Override
	public void delete(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public AggIc_invoice_h[] insert(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggIc_invoice_h[] update(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public AggIc_invoice_h[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggIc_invoice_h[] save(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggIc_invoice_h[] unsave(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggIc_invoice_h[] approve(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggIc_invoice_h[] unapprove(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

}
