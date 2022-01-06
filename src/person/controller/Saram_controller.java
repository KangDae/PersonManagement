package person.controller;

import java.io.File;
import java.io.IOException;

import person.ViewCoantainer;
import person.rc;
import person.model.Person_File;
import person.model.SaramDao;

public class Saram_controller {
	
	private ViewCoantainer vc = new ViewCoantainer();
	private SaramDao dao = new SaramDao();
	

	public void action() throws IOException {
		if (rc.no == 0) {
			vc.run(rc.menuView); // 
		}
		switch (rc.no) {
		case 1://입력
			dao.insert(rc.insertView.display());
			Person_File.writeFile(dao.getInfoList());
			break;
		case 2://출력       		
			vc.run(rc.saramListView);	
			dao.setInfoList(Person_File.readFile(new File(Person_File.filepath, Person_File.filename)));
			dao.showperson();
			break;
		case 3://수정
			vc.run(rc.saramEdit);
			dao.update(rc.insertView.display());	
			Person_File.writeFile(dao.getInfoList());
			break;
		case 4://삭제			
			vc.run(rc.saramDelete);
			dao.delete();
			break;
		case 5://종료
			System.out.println("---------종료---------");
			System.exit(0);
			break;
		default:
			System.out.println("없는 번호입니다.");
		}
		rc.no = 0;
		action();
	}

}
