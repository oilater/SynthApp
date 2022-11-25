package Synthcizer;

import java.util.ArrayList;

public class SynthApplication {

	public static ArrayList<Synth> synthList = new ArrayList<Synth>();

	public static void main(String[] args) {

		dummyData();
		
		showAllSynth();

		// 모델 번호로 찾은 신디의 가격 검색
		Synth synth = findSynth(1001);
		if (synth == null) {
			System.out.println("본 모델명의 신디가 존재하지 않습니다.");
		} else {
			showPriceSynth(synth);
		}

	}

	// 모든 보유 신디 정보 출력
	public static void showAllSynth() {
		System.out.println("===================================  현재 보유 중인 신디 정보  ===================================");
		for (Synth synth : synthList) {
			System.out.println(synth.synthInfo());
		}
	}

	public static Synth findSynth(int modelNumber) {
		Synth resultSynth = null;
		for (Synth synth : synthList) {
			if (synth.getModelNumber() == modelNumber) {
				resultSynth = synth;
				break;
			}
		}
		return resultSynth;
	}

	public static void showPriceSynth(Synth synth) {
		CurrentDateTime date = new CurrentDateTime();

		System.out.println("***********(2022년 11월 25일~ 30일)" + synth.modelName + " 크리스마스 특별 할인가 ***********");
		System.out.println("현재 날짜: " + date.formatedNow);
		System.out.println("제품 원가: " + synth.originPrice(synth.price) + "원");
		System.out.println("크리스마스 세일가: " + synth.calcPrice(synth.price) + "원");

	}
	
	public static void dummyData () {
		Synth synth1 = new Synth("커즈와일 SP2", 1001);
		Synth synth2 = new Synth("엠오디오 AH1", 1002);
		MiddleSynth msynth1 = new MiddleSynth("야마하 MX88", 1003);
		MiddleSynth msynth2 = new MiddleSynth("커즈와일 SP6", 1004);
		HighSynth hsynth1 = new HighSynth("야마하 CP88", 1005);
		HighSynth hsynth2 = new HighSynth("노드 STAGE3", 1006);

		synthList.add(synth1);
		synthList.add(synth2);
		synthList.add(msynth1);
		synthList.add(msynth2);
		synthList.add(hsynth1);
		synthList.add(hsynth2);
	}
	
}