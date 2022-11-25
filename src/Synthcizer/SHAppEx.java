package Synthcizer;

import java.util.Scanner;

public class SHAppEx {

	public static void main(String[] args) {
		System.out.println("---------------------------");
		System.out.println("Welcome to 'SH Piano Shop' ");
		System.out.println("---------------------------");
		System.out.println("번호를 입력해주세요");
		System.out.println("1. 모든 신디사이저 정보 보기 | 2. 모델번호로 제품 찾기 | 3. 제품별 가격 확인");
		System.out.println("번호 입력 >>");

		Scanner a = new Scanner(System.in);

		SynthApplication sa = new SynthApplication();
		SynthRoom sr = new SynthRoom(); 

		int userNumberInput = a.nextInt();

		while (userNumberInput <= 4) {
			//1번 누를 시 전체 제품 정보 보여주기
			if (userNumberInput == 1) {
				sa.dummyData();
				sa.showAllSynth();
				break;
			//2번 누를 시 모델번호로 제품명 찾기
			} else if (userNumberInput == 2) {
				System.out.println("찾으시는 제품의 모델번호를 입력해주세요: "); //배열 만들어서 for 문으로 돌릴 순 없나? 너무 복잡함
				int userNumberInput2 = a.nextInt();
				if(userNumberInput2 == sr.synth1.modelNumber) {
					System.out.println(sr.synth1.modelName);
					break;
				} else if (userNumberInput2 == sr.synth2.modelNumber) {
					System.out.println(sr.synth2.modelName);
					break;
				} else if (userNumberInput2 == sr.msynth1.modelNumber){
					System.out.println(sr.msynth1.modelName);
				} else if (userNumberInput2 == sr.msynth2.modelNumber){
					System.out.println(sr.msynth2.modelName);
				} else if (userNumberInput2 == sr.hsynth1.modelNumber){
					System.out.println(sr.hsynth1.modelName);
				} else if (userNumberInput2 == sr.hsynth2.modelNumber){
					System.out.println(sr.hsynth2.modelName);
				}
				break;
			}

//		System.out.println("----------------------------");
//		System.out.println("1. 이전 화면으로 돌아가기");

		}

	}

}
