package nc.impl.pub.ace;

import nc.bs.ic.transportinvoice.ace.bp.AceIc_invoiceInsertBP;
import nc.bs.ic.transportinvoice.ace.bp.AceIc_invoiceUpdateBP;
import nc.bs.ic.transportinvoice.ace.bp.AceIc_invoiceDeleteBP;
import nc.bs.ic.transportinvoice.ace.bp.AceIc_invoiceSendApproveBP;
import nc.bs.ic.transportinvoice.ace.bp.AceIc_invoiceUnSendApproveBP;
import nc.bs.ic.transportinvoice.ace.bp.AceIc_invoiceApproveBP;
import nc.bs.ic.transportinvoice.ace.bp.AceIc_invoiceUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceIc_invoicePubServiceImpl {
	// ����
	public AggIc_invoice_h[] pubinsertBills(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		try {
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggIc_invoice_h> transferTool = new BillTransferTool<AggIc_invoice_h>(
					clientFullVOs);
			// ����BP
			AceIc_invoiceInsertBP action = new AceIc_invoiceInsertBP();
			AggIc_invoice_h[] retvos = action.insert(clientFullVOs);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		try {
			// ����BP
			new AceIc_invoiceDeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// �޸�
	public AggIc_invoice_h[] pubupdateBills(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggIc_invoice_h> transferTool = new BillTransferTool<AggIc_invoice_h>(
					clientFullVOs);
			AceIc_invoiceUpdateBP bp = new AceIc_invoiceUpdateBP();
			AggIc_invoice_h[] retvos = bp.update(clientFullVOs, originBills);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggIc_invoice_h[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggIc_invoice_h[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggIc_invoice_h> query = new BillLazyQuery<AggIc_invoice_h>(
					AggIc_invoice_h.class);
			bills = query.query(queryScheme, null);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	}

	// �ύ
	public AggIc_invoice_h[] pubsendapprovebills(
			AggIc_invoice_h[] clientFullVOs, AggIc_invoice_h[] originBills)
			throws BusinessException {
		AceIc_invoiceSendApproveBP bp = new AceIc_invoiceSendApproveBP();
		AggIc_invoice_h[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggIc_invoice_h[] pubunsendapprovebills(
			AggIc_invoice_h[] clientFullVOs, AggIc_invoice_h[] originBills)
			throws BusinessException {
		AceIc_invoiceUnSendApproveBP bp = new AceIc_invoiceUnSendApproveBP();
		AggIc_invoice_h[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggIc_invoice_h[] pubapprovebills(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceIc_invoiceApproveBP bp = new AceIc_invoiceApproveBP();
		AggIc_invoice_h[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggIc_invoice_h[] pubunapprovebills(AggIc_invoice_h[] clientFullVOs,
			AggIc_invoice_h[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceIc_invoiceUnApproveBP bp = new AceIc_invoiceUnApproveBP();
		AggIc_invoice_h[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}