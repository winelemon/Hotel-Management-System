/**
 * @author Jiang
 * @date 2024/3/11 16:32
 */
package cn.mafangui.hotel.mapper;

import cn.mafangui.hotel.entity.RoomStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IndexStatisticsMapper {
    List<RoomStatistics> getRoomStatistics();
}
