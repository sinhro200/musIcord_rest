package createRoom

import core.CommonResponse
import model.RoomInfo

class CreateRoomResponse : CommonResponse<CreateRoomResponse.Response?>() {
    class Response(
            var roomInfo: RoomInfo? = null
    )
}