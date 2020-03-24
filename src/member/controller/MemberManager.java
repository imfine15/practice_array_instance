package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {

			System.out.print("아이디 : ");
			String userId = sc.next();
			System.out.print("패스워드 : ");
			String userPwd = sc.next();
			System.out.print("이름 : ");
			String userName = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			System.out.print("이메일 : ");
			String email = sc.next();
			
			System.out.println();

			m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다."); return;
	}

	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(userId == m[i].getUserId()) {
				printOne(m[i]);
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); return;
			}
		}

	}

	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : "); 
		String userName = sc.nextLine();
		for(int i = 0; i < 11; i++) {
			if(userName == m[i].getUserName()) {
				System.out.println();
			}
		}
	}

	public void searchEmail() {}

	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		
		
	}

	public void updateName() {}

	public void updateEmail() {}

	public void deleteOne() {
		System.out.println("탈퇴할 회원의 아이디를 입력하세요 : "); 
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId() == userId) {
				--ctn;
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
			}
		}
			
	}
	public void deleteAll() {
		
		
	}

	public void printAllMember() {}

	public void printOne(Member m) {
		System.out.println(m.getUserId());
	}

}
























