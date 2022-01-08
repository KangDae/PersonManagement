package person;

import person.controller.Person_controller;
import person.model.Person_File;
import person.model.PersonVo;
import person.view.PersonDelete;
import person.view.PersonEdit;
import person.view.PersonListView;
import person.view.PersonView;
import person.view.insertView;
import person.view.menuView;




public class rc {
	public static int no;
	public static int fileno =0;
	public static Person_File personfile = new Person_File();
		
	public static final PersonView menuView = new menuView();
	public static final PersonView insertView = new insertView();
	public static final PersonView PersonDelete = new PersonDelete();
	public static final PersonView PersonEdit = new PersonEdit();
	public static final PersonView PersonListView = new PersonListView();
	

	public static final Person_controller PersonController = new Person_controller();

}