package usage

import auth.AuthResponse
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import core.CommonRequest
import createRoom.CreateRoomResponse
import register.RegistrationRequest

class Main {
    private fun test() {
        val mapper = ObjectMapper()
        val on: ObjectNode = mapper.createObjectNode()
        val commonRequest: CommonRequest<*> = CommonRequest<Any?>()
        val jsonNode: JsonNode = mapper.valueToTree(commonRequest)
//        on.set<>() .set("response", jsonNode)
        System.out.println(on.toString())
    }

    fun test2() {
        val crr = CreateRoomResponse()
        val rr = RegistrationRequest()
        val ae = AuthResponse()
        ae.response = AuthResponse.Response()
        //        rr.sas();
//        crr.response = new CreateRoomResponse.Resp();
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Main().test()
        }
    }
}