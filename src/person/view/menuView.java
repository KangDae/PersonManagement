package person.view;

import person.rc;
import person.model.PersonVo;

public class menuView extends PersonView {

	 
	@Override
	public PersonVo display() {
		System.out.println(":::::메뉴:::::");
		
		int no;
		while (true) {
			try {
				System.out.println("1.입력(Create) 2.출력(Read) 3.수정(Update) 4.삭제(delete) 5.종료");
				System.out.print("����:");
				 no = scan.nextInt();

				while (no > 5 || no < 1) {
					System.out.println("범위를 넘었습니다.");
					System.out.println("입력:");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				scan.next();
				continue;
			}
		}

		rc.no = no;
		return null;
	}

}
