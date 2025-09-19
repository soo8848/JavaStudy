/**김재욱
 * 요구사항: 자동차 구매
 * 고급 모델 - 기본 모델 + 썬루프
 * 최고급 모델 - 고급모델 + 지도서비스
 * */
public class SwitchTest {
	public static void main(String[] args) {
		String baseModel="자동차";
		
		String sunroof=" 썬루프";
		String navigation=" 지도 서비스";
		
		String basicModel = baseModel;
		String premiumModel = basicModel + sunroof;
		String topModel = basicModel + sunroof + navigation;
		
		String selectedModel = topModel;
		String carResult = "";

		switch (selectedModel) {
		case "자동차":
			carResult = "기본 모델";
			break;
		case "자동차 썬루프":
			carResult = "고급 모델";
			break;
		case "자동차 썬루프 지도 서비스":
			carResult = "최고급 모델";
			break;
		}
		
        System.out.println("선택한 모델 구성: " + selectedModel);
        System.out.println("모델 선택 결과: " + carResult);
	}
}
