package cbnu.capstone.tripwithme.dto.TourRegister;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeriodicalTourRegisterTableDTO {

    //정기 접수 테이블을 가져올 DTO
    private long periodicalTourRegisterTableId;
    private String tourCode;
    private String userId;
    private String date;
    private String up;
    private String down;
}
