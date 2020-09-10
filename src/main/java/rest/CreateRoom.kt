package rest

import rest.model.RoomInfo

class CreateRoomReqData(
    var title: String? = null
)

class CreateRoomRespBody(
    var roomInfo: RoomInfo? = null
)