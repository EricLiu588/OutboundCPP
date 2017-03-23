package nc.itf.ic;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.pub.BusinessException;

public interface IIc_invoiceMaintain {

	public void delete(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException;

	public AggIc_invoice_h[] insert(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException;

	public AggIc_invoice_h[] update(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException;

	public AggIc_invoice_h[] query(IQueryScheme queryScheme)
			throws BusinessException;

	public AggIc_invoice_h[] save(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException;

	public AggIc_invoice_h[] unsave(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException;

	public AggIc_invoice_h[] approve(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException;

	public AggIc_invoice_h[] unapprove(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException;
}
