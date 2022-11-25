package Synthcizer;

public class HighSynth extends Synth {

	public String recording;
	public String synthcizing;
	public String drumming;
	public int price = 5000000;
	
	public HighSynth(String modelName, int modelNumber) {
		super(modelName, modelNumber);
		this.recording = "녹음 가능";
		this.synthcizing = "음색 합성 가능";
		this.drumming = "드럼 반주 기능";   
		super.width = "300 * 900";
	}

	@Override
	public int calcPrice(int price) {
		price = 5000000;
		super.xmasSaleRatio = 0.1;
		return (int) (price - (price * xmasSaleRatio));
	
	}
	
	@Override
	public int originPrice(int price) {
		return this.price;
	}

	@Override
	public String synthInfo() {
		return "모델명: " + modelName + ", 피아노 등급: " + pianoGrade + ", 크기: " + width + ", 추가 기능: " + recording + ", " + synthcizing + ", " + drumming;
	}
	
	
	
	
	
	
}
