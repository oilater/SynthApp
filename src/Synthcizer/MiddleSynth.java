package Synthcizer;

public class MiddleSynth extends Synth {

	public String recording;
	public String synthcizing;
	public int price = 1200000;
	
	public MiddleSynth(String modelName, int modelNumber) {
		super(modelName, modelNumber);
		this.recording = "녹음 가능";
		this.synthcizing = "음색 합성 가능";
		super.width = "250 * 850";
	}

	@Override
	public int calcPrice(int price) {
		price = 1200000;
		super.xmasSaleRatio = 0.07;
		return (int) (price - (price * xmasSaleRatio));
	}

	
	@Override
	public int originPrice(int price) {
		return this.price;
	}

	@Override
	public String synthInfo() {
		return "모델명: " + modelName + ", 피아노 등급: " + pianoGrade + ", 크기: " + width + ", 추가 기능: " + recording + ", " + synthcizing;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
