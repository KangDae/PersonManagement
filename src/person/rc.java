package person;

import person.controller.Saram_controller;
import person.model.Person_File;
import person.model.SaramVo;
import person.view.SaramDelete;
import person.view.SaramEdit;
import person.view.SaramListView;
import person.view.SaramView;
import person.view.insertView;
import person.view.menuView;




public class rc {
	public static int no;
	public static SaramVo saramvo;
	public static SaramVo[] saramArr;
	public static Person_File personfile;
	
	
	public static int type = 0;

	
	public static final SaramView menuView = new menuView();
	public static final SaramView insertView = new insertView();
	public static final SaramView saramDelete = new SaramDelete();
	public static final SaramView saramEdit = new SaramEdit();
	public static final SaramView saramListView = new SaramListView();
	

	public static final Saram_controller samramController = new Saram_controller();

}