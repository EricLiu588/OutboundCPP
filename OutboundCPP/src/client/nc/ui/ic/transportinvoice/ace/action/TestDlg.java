package nc.ui.ic.transportinvoice.ace.action;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import nc.ui.pub.beans.UIButton;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pub.bill.BillEditEvent;
import nc.ui.pub.bill.BillEditListener;

public class TestDlg extends UIDialog implements ActionListener,
		BillEditListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1107687282219215519L;
	private static final int WIDTH = 650;
	private static final int LENGTH = 1280;
	private UIButton btnOk;
	private UIButton btnCancel;

	private void init(){
		this.setLayout(new BorderLayout());
		this.setTitle("");
	}
	
	public TestDlg(Container parent) {
		super(parent);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void afterEdit(BillEditEvent arg0) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void bodyRowChange(BillEditEvent arg0) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������

	}

}
