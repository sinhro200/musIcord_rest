package enterRoom

import core.CommonResponse
import model.RoomInfo

class EnterRoomResponse : CommonResponse<EnterRoomResponse.Response>() {
    class Response(
            var roomInfo: RoomInfo? = null
    )
}