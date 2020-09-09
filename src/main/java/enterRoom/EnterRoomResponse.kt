package enterRoom

import core.CommonResponse
import model.RoomInfo

class EnterRoomResponse : CommonResponse<EnterRoomResponse.ResponseBody>() {
    class ResponseBody(
            var roomInfo: RoomInfo? = null
    )
}