package person.view;


import person.model.PersonVo;

public class insertView extends PersonView {
	
	@Override
	public PersonVo display() {
		
	System.out.println(":::::사람 정보::::");	
	
     PersonVo person = new PersonVo();
     
     System.out.print("이름: ");
     person.setName(scan.next()); 
     System.out.println();

     System.out.print("전화 번호: ");
     person.setPhone(scan.next());
     System.out.println();

     System.out.print("email  : ");
     person.setEmail(scan.next());

     System.out.println();

 
	System.out.println("입력완료");
	
	
	
	return person;
	}

	

}
