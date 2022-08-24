package arc;

import java.sql.Connection;
import java.util.Scanner;

import arc.domain.arc.Arc;
import arc.domain.arc.ArcDao;
import arc.service.DBserviceImpl;
import product.db.DBconnection;

public class MainAppArc {

	public static void main(String[] args) {
		int userInsert;
		int id;
		String Itemname;
		int itemqty;
		String itemfrom;
		String space;

		Connection conn = DBconnection.connection();

		ArcDao arcDao = new ArcDao(conn);
		DBserviceImpl s = new DBserviceImpl(conn, arcDao);
		Scanner scan = new Scanner(System.in);
		종료: while (true) {
			System.out.println();
			System.out.println(" 1. 아이템 사용 데이터 추가 ");
			System.out.println(" 2. 아이템 사용 데이터 수정 ");
			System.out.println(" 3. 아이템 사용 데이터 삭제 ");
			System.out.println(" 4. 아이템 사용 데이터 한건 보기");
			System.out.println(" 5. 아이템 사용 데이터 전체 보기 ");
			System.out.println(" 6. 종료");
			System.out.print(">");

			userInsert = scan.nextInt();
			System.out.println();
			switch (userInsert) {

			case 1:
				space = scan.nextLine();
				System.out.print("아이템 이름 : ");
				Itemname = scan.nextLine();
				System.out.print("갯수 : ");
				itemqty = scan.nextInt();
				space = scan.nextLine();
				System.out.print("아이템 위치 : ");
				itemfrom = scan.nextLine();

				Arc arcinsert = new Arc(Itemname, itemqty, itemfrom);

				s.추가(arcinsert);

				break;

			case 2:

				System.out.print("뭐 수정할까 : ");
				id = scan.nextInt();
				space = scan.nextLine();
				System.out.print("아이템 이름 : ");
				Itemname = scan.nextLine();
				System.out.print("갯수 : ");
				itemqty = scan.nextInt();
				space = scan.nextLine();
				System.out.print("아이템 위치 : ");
				itemfrom = scan.next();

				Arc arcUpdate = new Arc(Itemname, itemqty, itemfrom);
				s.수정(id, arcUpdate);

				break;

			case 3:

				System.out.print("뭐 지워줄까 : ");
				id = scan.nextInt();

				s.삭제(id);

				break;

			case 4:

				System.out.print(" 몇번 보여줄까 : ");
				id = scan.nextInt();

				s.한개검색(id);
				break;

			case 5:

				s.전부검색();
				break;

			case 6:

				break 종료;

			default:
				System.out.println("있는거만 시켜라 ");
			}
		}
		System.out.println("ㅅㄱ");
	}
}
