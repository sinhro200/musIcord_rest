package createRoom

import core.CommonResponse
import model.RoomInfo

class CreateRoomResponse : CommonResponse<CreateRoomResponse.ResponseBody>() {
    class ResponseBody(
            var roomInfo: RoomInfo? = null
    )
}