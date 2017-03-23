package nc.vo.ic.ic_invoice;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�����۵�������Ϣ
 * </p>
 *  ��������:2017-3-17
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class Ic_invoice_b extends SuperVO {
	
/**
*�����������ӱ�����
*/
public String pk_invoice_b;
/**
*�к�
*/
public String rowno;
/**
*���ϻ�������
*/
public String pk_marbasclass;
/**
*���κ�
*/
public String batchnumber;
/**
*������
*/
public String mainquantity;
/**
*������
*/
public String auxiliaryquantity;
/**
*����Ҫ��
*/
public String specialrequirements;
/**
*�����ӿڷ�ʽ
*/
public String interfacetype;
/**
*�������䵥��
*/
public String transportnumber;
/**
*���������Ӻ�
*/
public String transportnumber_li;
/**
*�Զ�����1
*/
public String def1;
/**
*�Զ�����2
*/
public String def2;
/**
*�Զ�����3
*/
public String def3;
/**
*�Զ�����4
*/
public String def4;
/**
*�Զ�����5
*/
public String def5;
/**
*�Զ�����6
*/
public String def6;
/**
*�Զ�����7
*/
public String def7;
/**
*�Զ�����8
*/
public String def8;
/**
*�Զ�����9
*/
public String def9;
/**
*�Զ�����10
*/
public String def10;
/**
*�Զ�����11
*/
public String def11;
/**
*�Զ�����12
*/
public String def12;
/**
*�Զ�����13
*/
public String def13;
/**
*�Զ�����14
*/
public String def14;
/**
*�Զ�����15
*/
public String def15;
/**
*�Զ�����16
*/
public String def16;
/**
*�Զ�����17
*/
public String def17;
/**
*�Զ�����18
*/
public String def18;
/**
*�Զ�����19
*/
public String def19;
/**
*�Զ�����20
*/
public String def20;
/**
*���䷽ʽ
*/
public String ctransporttypeid;
/**
*�ϲ㵥������
*/
public String pk_invoice_h;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_invoice_b��Getter����.�������������������ӱ�����
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getPk_invoice_b() {
return this.pk_invoice_b;
} 

/**
* ����pk_invoice_b��Setter����.�������������������ӱ�����
* ��������:2017-3-17
* @param newPk_invoice_b java.lang.String
*/
public void setPk_invoice_b ( String pk_invoice_b) {
this.pk_invoice_b=pk_invoice_b;
} 
 
/**
* ���� rowno��Getter����.���������к�
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getRowno() {
return this.rowno;
} 

/**
* ����rowno��Setter����.���������к�
* ��������:2017-3-17
* @param newRowno java.lang.String
*/
public void setRowno ( String rowno) {
this.rowno=rowno;
} 
 
/**
* ���� pk_marbasclass��Getter����.�����������ϻ�������
*  ��������:2017-3-17
* @return nc.vo.bd.material.marbasclass.MarBasClassVO
*/
public String getPk_marbasclass() {
return this.pk_marbasclass;
} 

/**
* ����pk_marbasclass��Setter����.�����������ϻ�������
* ��������:2017-3-17
* @param newPk_marbasclass nc.vo.bd.material.marbasclass.MarBasClassVO
*/
public void setPk_marbasclass ( String pk_marbasclass) {
this.pk_marbasclass=pk_marbasclass;
} 
 
/**
* ���� batchnumber��Getter����.�����������κ�
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getBatchnumber() {
return this.batchnumber;
} 

/**
* ����batchnumber��Setter����.�����������κ�
* ��������:2017-3-17
* @param newBatchnumber java.lang.String
*/
public void setBatchnumber ( String batchnumber) {
this.batchnumber=batchnumber;
} 
 
/**
* ���� mainquantity��Getter����.��������������
*  ��������:2017-3-17
* @return nc.vo.pub.lang.UFDouble
*/
public String getMainquantity() {
return this.mainquantity;
} 

/**
* ����mainquantity��Setter����.��������������
* ��������:2017-3-17
* @param newMainquantity nc.vo.pub.lang.UFDouble
*/
public void setMainquantity ( String mainquantity) {
this.mainquantity=mainquantity;
} 
 
/**
* ���� auxiliaryquantity��Getter����.��������������
*  ��������:2017-3-17
* @return nc.vo.pub.lang.UFDouble
*/
public String getAuxiliaryquantity() {
return this.auxiliaryquantity;
} 

/**
* ����auxiliaryquantity��Setter����.��������������
* ��������:2017-3-17
* @param newAuxiliaryquantity nc.vo.pub.lang.UFDouble
*/
public void setAuxiliaryquantity ( String auxiliaryquantity) {
this.auxiliaryquantity=auxiliaryquantity;
} 
 
/**
* ���� specialrequirements��Getter����.������������Ҫ��
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getSpecialrequirements() {
return this.specialrequirements;
} 

/**
* ����specialrequirements��Setter����.������������Ҫ��
* ��������:2017-3-17
* @param newSpecialrequirements java.lang.String
*/
public void setSpecialrequirements ( String specialrequirements) {
this.specialrequirements=specialrequirements;
} 
 
/**
* ���� interfacetype��Getter����.�������������ӿڷ�ʽ
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getInterfacetype() {
return this.interfacetype;
} 

/**
* ����interfacetype��Setter����.�������������ӿڷ�ʽ
* ��������:2017-3-17
* @param newInterfacetype java.lang.String
*/
public void setInterfacetype ( String interfacetype) {
this.interfacetype=interfacetype;
} 
 
/**
* ���� transportnumber��Getter����.���������������䵥��
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getTransportnumber() {
return this.transportnumber;
} 

/**
* ����transportnumber��Setter����.���������������䵥��
* ��������:2017-3-17
* @param newTransportnumber java.lang.String
*/
public void setTransportnumber ( String transportnumber) {
this.transportnumber=transportnumber;
} 
 
/**
* ���� transportnumber_li��Getter����.�����������������Ӻ�
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getTransportnumber_li() {
return this.transportnumber_li;
} 

/**
* ����transportnumber_li��Setter����.�����������������Ӻ�
* ��������:2017-3-17
* @param newTransportnumber_li java.lang.String
*/
public void setTransportnumber_li ( String transportnumber_li) {
this.transportnumber_li=transportnumber_li;
} 
 
/**
* ���� def1��Getter����.���������Զ�����1
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef1() {
return this.def1;
} 

/**
* ����def1��Setter����.���������Զ�����1
* ��������:2017-3-17
* @param newDef1 java.lang.String
*/
public void setDef1 ( String def1) {
this.def1=def1;
} 
 
/**
* ���� def2��Getter����.���������Զ�����2
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef2() {
return this.def2;
} 

/**
* ����def2��Setter����.���������Զ�����2
* ��������:2017-3-17
* @param newDef2 java.lang.String
*/
public void setDef2 ( String def2) {
this.def2=def2;
} 
 
/**
* ���� def3��Getter����.���������Զ�����3
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef3() {
return this.def3;
} 

/**
* ����def3��Setter����.���������Զ�����3
* ��������:2017-3-17
* @param newDef3 java.lang.String
*/
public void setDef3 ( String def3) {
this.def3=def3;
} 
 
/**
* ���� def4��Getter����.���������Զ�����4
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef4() {
return this.def4;
} 

/**
* ����def4��Setter����.���������Զ�����4
* ��������:2017-3-17
* @param newDef4 java.lang.String
*/
public void setDef4 ( String def4) {
this.def4=def4;
} 
 
/**
* ���� def5��Getter����.���������Զ�����5
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef5() {
return this.def5;
} 

/**
* ����def5��Setter����.���������Զ�����5
* ��������:2017-3-17
* @param newDef5 java.lang.String
*/
public void setDef5 ( String def5) {
this.def5=def5;
} 
 
/**
* ���� def6��Getter����.���������Զ�����6
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef6() {
return this.def6;
} 

/**
* ����def6��Setter����.���������Զ�����6
* ��������:2017-3-17
* @param newDef6 java.lang.String
*/
public void setDef6 ( String def6) {
this.def6=def6;
} 
 
/**
* ���� def7��Getter����.���������Զ�����7
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef7() {
return this.def7;
} 

/**
* ����def7��Setter����.���������Զ�����7
* ��������:2017-3-17
* @param newDef7 java.lang.String
*/
public void setDef7 ( String def7) {
this.def7=def7;
} 
 
/**
* ���� def8��Getter����.���������Զ�����8
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef8() {
return this.def8;
} 

/**
* ����def8��Setter����.���������Զ�����8
* ��������:2017-3-17
* @param newDef8 java.lang.String
*/
public void setDef8 ( String def8) {
this.def8=def8;
} 
 
/**
* ���� def9��Getter����.���������Զ�����9
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef9() {
return this.def9;
} 

/**
* ����def9��Setter����.���������Զ�����9
* ��������:2017-3-17
* @param newDef9 java.lang.String
*/
public void setDef9 ( String def9) {
this.def9=def9;
} 
 
/**
* ���� def10��Getter����.���������Զ�����10
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef10() {
return this.def10;
} 

/**
* ����def10��Setter����.���������Զ�����10
* ��������:2017-3-17
* @param newDef10 java.lang.String
*/
public void setDef10 ( String def10) {
this.def10=def10;
} 
 
/**
* ���� def11��Getter����.���������Զ�����11
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef11() {
return this.def11;
} 

/**
* ����def11��Setter����.���������Զ�����11
* ��������:2017-3-17
* @param newDef11 java.lang.String
*/
public void setDef11 ( String def11) {
this.def11=def11;
} 
 
/**
* ���� def12��Getter����.���������Զ�����12
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef12() {
return this.def12;
} 

/**
* ����def12��Setter����.���������Զ�����12
* ��������:2017-3-17
* @param newDef12 java.lang.String
*/
public void setDef12 ( String def12) {
this.def12=def12;
} 
 
/**
* ���� def13��Getter����.���������Զ�����13
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef13() {
return this.def13;
} 

/**
* ����def13��Setter����.���������Զ�����13
* ��������:2017-3-17
* @param newDef13 java.lang.String
*/
public void setDef13 ( String def13) {
this.def13=def13;
} 
 
/**
* ���� def14��Getter����.���������Զ�����14
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef14() {
return this.def14;
} 

/**
* ����def14��Setter����.���������Զ�����14
* ��������:2017-3-17
* @param newDef14 java.lang.String
*/
public void setDef14 ( String def14) {
this.def14=def14;
} 
 
/**
* ���� def15��Getter����.���������Զ�����15
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef15() {
return this.def15;
} 

/**
* ����def15��Setter����.���������Զ�����15
* ��������:2017-3-17
* @param newDef15 java.lang.String
*/
public void setDef15 ( String def15) {
this.def15=def15;
} 
 
/**
* ���� def16��Getter����.���������Զ�����16
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef16() {
return this.def16;
} 

/**
* ����def16��Setter����.���������Զ�����16
* ��������:2017-3-17
* @param newDef16 java.lang.String
*/
public void setDef16 ( String def16) {
this.def16=def16;
} 
 
/**
* ���� def17��Getter����.���������Զ�����17
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef17() {
return this.def17;
} 

/**
* ����def17��Setter����.���������Զ�����17
* ��������:2017-3-17
* @param newDef17 java.lang.String
*/
public void setDef17 ( String def17) {
this.def17=def17;
} 
 
/**
* ���� def18��Getter����.���������Զ�����18
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef18() {
return this.def18;
} 

/**
* ����def18��Setter����.���������Զ�����18
* ��������:2017-3-17
* @param newDef18 java.lang.String
*/
public void setDef18 ( String def18) {
this.def18=def18;
} 
 
/**
* ���� def19��Getter����.���������Զ�����19
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef19() {
return this.def19;
} 

/**
* ����def19��Setter����.���������Զ�����19
* ��������:2017-3-17
* @param newDef19 java.lang.String
*/
public void setDef19 ( String def19) {
this.def19=def19;
} 
 
/**
* ���� def20��Getter����.���������Զ�����20
*  ��������:2017-3-17
* @return java.lang.String
*/
public String getDef20() {
return this.def20;
} 

/**
* ����def20��Setter����.���������Զ�����20
* ��������:2017-3-17
* @param newDef20 java.lang.String
*/
public void setDef20 ( String def20) {
this.def20=def20;
} 
 
/**
* ���� ctransporttypeid��Getter����.�����������䷽ʽ
*  ��������:2017-3-17
* @return nc.vo.bd.transporttype.TransportTypeVO
*/
public String getCtransporttypeid() {
return this.ctransporttypeid;
} 

/**
* ����ctransporttypeid��Setter����.�����������䷽ʽ
* ��������:2017-3-17
* @param newCtransporttypeid nc.vo.bd.transporttype.TransportTypeVO
*/
public void setCtransporttypeid ( String ctransporttypeid) {
this.ctransporttypeid=ctransporttypeid;
} 
 
/**
* ���� �����ϲ�������Getter����.���������ϲ�����
*  ��������:2017-3-17
* @return String
*/
public String getPk_invoice_h(){
return this.pk_invoice_h;
}
/**
* ���������ϲ�������Setter����.���������ϲ�����
* ��������:2017-3-17
* @param newPk_invoice_h String
*/
public void setPk_invoice_h(String pk_invoice_h){
this.pk_invoice_h=pk_invoice_h;
} 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2017-3-17
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2017-3-17
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("ic.ic_invoice_b");
    }
   }
    