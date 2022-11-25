package Synthcizer;

public class Synth {

	//필드
	public String modelName;
	public String firmName;
	public int modelNumber;
	public int price = 700000;
	public String pianoGrade;
	public String width;
	public double xmasSaleRatio = 0.05;
	
	
	//기본 생성자
	public Synth() {
		initSynth();
	}

	//생성자 - 신디 모델명, 모델 넘버
	public Synth(String modelName, int modelNumber) {
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		initSynth();
	}

	
	//신디 등급, 크기
	public void initSynth() {
		pianoGrade = "보급형";
		width = "200 * 800";
	}

	//가격
	public int calcPrice(int price) {
		return (int) (price - (price * xmasSaleRatio));
	}
	
	public int originPrice (int price) {
		return this.price;
	}
	
	
	//신디 정보
	public String synthInfo() {
		return "모델명: " + modelName + ", 피아노 등급: " + pianoGrade + ", 크기: " + width;
	}

	
	
	
	//getter setter 메소드 
	public String getPianoGrade() {
		return pianoGrade;
	}

	public void setPianoGrade(String pianoGrade) {
		this.pianoGrade = pianoGrade;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
}
