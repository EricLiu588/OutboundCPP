DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000000M4DNV';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000000M4DNV';
DELETE FROM pub_function WHERE pk_billtype = 'OCPP';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000000M4DNV';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'OCPP';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000000M4DNV';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000M4DNW';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000M4DNX';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000M4DNY';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000M4DNZ';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000M4DO0';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000M4DO1';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000M4DO2';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000M4DO3';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000M4DO4';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000M4DO5';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000M4DO6';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000M4DO7';
