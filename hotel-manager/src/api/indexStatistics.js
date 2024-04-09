import request from '@/utils/request'

const URL = 'op/indexStatistics'

export function getRoomStatistics() {
    return request({
      url: URL + '/getRoomStatistics',
      method: 'get',
    })
  }