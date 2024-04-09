package cn.mafangui.hotel.controller.worker;

import cn.mafangui.hotel.entity.RoomStatistics;
import cn.mafangui.hotel.response.AjaxResult;
import cn.mafangui.hotel.response.ResponseTool;
import cn.mafangui.hotel.service.IndexStatisticsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jiang
 * @date 2024/3/11 16:17
 */
@RestController
@RequestMapping("/op/indexStatistics")
public class IndexStatisticsController {

    @Resource
    private IndexStatisticsService indexStatisticsService;
    @GetMapping("/getRoomStatistics")
    public AjaxResult getRoomStatistics(){
        List<RoomStatistics> rooms = indexStatisticsService.getRoomStatistics();
        return ResponseTool.success(rooms);
    }
}
