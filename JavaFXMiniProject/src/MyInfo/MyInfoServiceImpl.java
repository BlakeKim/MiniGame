package MyInfo;

import CommonService.CommonService;
import CommonService.CommonServiceImpl;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyInfoServiceImpl implements MyInfoService{
	CommonService comSrv = new CommonServiceImpl();
	
	@Override
	public void setMyInfo() {
		// TODO Auto-generated method stub
		//확인 버튼임
		System.out.println("DB에 내 정보 수정함");
	}

	@Override
	public void openUpdateMyInfoForm() {
		// TODO Auto-generated method stub
		comSrv.showWindow(new Stage(), "../UpdateMyInfo/UpdateMyInfo.fxml");
	}

	@Override
	public void setLabelsToMyInfo(Parent myInfoPage) {
		// TODO Auto-generated method stub
		System.out.println("라벨들의 정보를 내 현재 정보로 변경하는 함수 DB에서 받아옴");
		
		
	}


}
