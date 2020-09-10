package rest

import rest.model.RoomInfo
import rest.model.UserInfo

class EnterRoomReqData(
        var inviteCode: String? = null
)

class EnterRoomRespBody(
        var roomInfo: RoomInfo? = null
)