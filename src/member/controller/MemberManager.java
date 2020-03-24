package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	Scanner sc = new Scanner(System.in);

	public MemberManager() {}

	public void insertMember() {

			System.out.print("���̵� : ");
			String userId = sc.next();
			System.out.print("�н����� : ");
			String userPwd = sc.next();
			System.out.print("�̸� : ");
			String userName = sc.next();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			char gender = sc.next().charAt(0);
			System.out.print("�̸��� : ");
			String email = sc.next();
			
			System.out.println();

			m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�."); return;
	}

	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(userId == m[i].getUserId()) {
				printOne(m[i]);
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�."); return;
			}
		}

	}

	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ��� : "); 
		String userName = sc.nextLine();
		for(int i = 0; i < 11; i++) {
			if(userName == m[i].getUserName()) {
				System.out.println();
			}
		}
	}

	public void searchEmail() {}

	public void updatePwd() {
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		
		
	}

	public void updateName() {}

	public void updateEmail() {}

	public void deleteOne() {
		System.out.println("Ż���� ȸ���� ���̵� �Է��ϼ��� : "); 
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId() == userId) {
				--ctn;
			} else {
				System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
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
























