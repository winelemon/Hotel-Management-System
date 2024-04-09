package cn.mafangui.hotel.service.impl;

import cn.mafangui.hotel.entity.RoomStatistics;
import cn.mafangui.hotel.mapper.IndexStatisticsMapper;
import cn.mafangui.hotel.service.IndexStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jiang
 * @date 2024/3/11 16:21
 */
@Service
public class IndexStatisticsServiceImpl implements IndexStatisticsService {

    @Autowired
    private IndexStatisticsMapper indexStatisticsMapper;
    @Override
    public List<RoomStatistics> getRoomStatistics() {
        return indexStatisticsMapper.getRoomStatistics();
    }
}
