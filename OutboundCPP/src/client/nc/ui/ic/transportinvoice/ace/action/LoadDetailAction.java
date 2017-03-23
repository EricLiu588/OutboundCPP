package nc.ui.ic.transportinvoice.ace.action;

import java.awt.Container;
import java.awt.event.ActionEvent;

import nc.ui.pub.beans.MessageDialog;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.model.BillManageModel;
import nc.vo.ic.ic_invoice.AggIc_invoice_h;
import nc.vo.ic.ic_invoice.Ic_invoice_h;

public class LoadDetailAction extends NCAction {

	private static final long serialVersionUID = -1310742230003968737L;
	private static final String code = "loadDetailAction";
	private static final String btnName = "查询物流信息";
	private BillManageModel model;
			
	public BillManageModel getModel() {
		return model;
	}

	public void setModel(BillManageModel model) {
		this.model = model;
		this.model.addAppEventListener(this);
	}

	public LoadDetailAction() {
		this.setCode(code);
		this.setBtnName(btnName);
	}
	
	@Override
	protected boolean isActionEnable() {
		// TODO 自动生成的方法存根
		boolean flag = false;
		if(null != this.model.getSelectedData()){
			AggIc_invoice_h vo = (AggIc_invoice_h)this.model.getSelectedData();
			if(vo.getParentVO().getAttributeValue("def1").toString().equals("0")){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		MessageDialog.showOkCancelDlg(null, "物流详情", "确定关闭？");
		
	}

}
