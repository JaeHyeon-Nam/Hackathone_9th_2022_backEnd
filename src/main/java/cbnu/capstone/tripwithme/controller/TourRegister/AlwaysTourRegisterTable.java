package cbnu.capstone.tripwithme.controller.TourRegister;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;
import cbnu.capstone.tripwithme.service.TourRegister.AlwaysTourRegisterService;
import cbnu.capstone.tripwithme.dto.TourRegister.GPS;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/alwaysTourRegister")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class AlwaysTourRegisterTable {
    //상시 등록을 위한 상시테이블 참조

    private final AlwaysTourRegisterService alwaysTourRegisterService;

    @PostMapping("/")
    public List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTableo(HttpServletRequest request)
    {

        GPS gps = new GPS();
        gps.setUp(request.getParameter("up"));
        gps.setDown(request.getParameter("down"));
        return alwaysTourRegisterService.getAlwaysTourRegisterTable(gps);
    }

}
